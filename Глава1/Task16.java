package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Task16", value = "/Task16")
public class Task16 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int points = Integer.parseInt(request.getParameter("points"));
        String mark = "invalid";
        if (points > 89) {
            mark = "A";
        } else if (points >= 75 && points <= 89) {
            mark = "B";
        } else if (points >= 60 && points <= 74) {
            mark = "C";
        } else if (points >= 50 && points <= 59) {
            mark = "D";
        } else if (points < 59) {
            mark = "F";
        }
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.print("<h1>" + name + " got \"" +mark + "\" for exam!  <h1>");
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
