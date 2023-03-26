package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/Task15")
public class Task15 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String gender = request.getParameter("gender");
        int age = Integer.parseInt(request.getParameter("age"));

        String result = "Invalid input";
        if (age >= 18 && gender.equals("male")) {
            result = "Hello, Dear Mr. " + name + " " + surname;
        } else if (age >= 18 && gender.equals("women")) {
            result = "Hello,Dear  Missis. " + name + " " + surname;
        } else if (age < 18 && gender.equals("women")) {
            result = "Hello, Dude Missis. " + name + " " + surname;
        } else if (age < 18 && gender.equals("male")) {
            result = "Hello, Dude Mr. " + name + " " + surname;
        }
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.print("<h1>" + result + "<h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
