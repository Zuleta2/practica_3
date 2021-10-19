
package com.emergentes.practica_3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RegistroLibroServlet", urlPatterns = {"/RegistroLibroServlet"})
public class RegistroLibroServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Recibo datos del formulario
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String medio = request.getParameter("medio");
        
        // Instanciar un objeto  a partir de la clase Libros
        Libros li = new Libros();
        
        // encapsular datos recibidos en e objeto li
        li.setTitulo(titulo);
        li.setAutor(autor);
        li.setResumen(resumen);
        li.setMedio(medio);
        
        // Colocar a li como atributo de request
        request.setAttribute("Libros", li);
        
        //derivamos el control a salidalibros.jsp incluye al objeto request
        request.getRequestDispatcher("SalidaLibros.jsp").forward(request, response);
        
    
    }

}
