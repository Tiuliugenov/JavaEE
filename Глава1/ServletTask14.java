package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/Task1-4")
public class ServletTask14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name = request.getParameter("name");
String surname = request.getParameter("surname");
String food = request.getParameter("food");
String result = name + " " + surname + " ordered " + food;
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.print("<h1>"+ result + "<h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
