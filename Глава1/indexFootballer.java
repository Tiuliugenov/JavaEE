package Servlets.db;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
@WebServlet(value = "/Footballer")
public class indexFootballer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ArrayList<Footballer>footballers=DbManager.getFootballers();
        PrintWriter out= response.getWriter();
        out.println("<h1>Footballers</h1>");
        for(Footballer it: footballers){

        out.println("<h3 style='color:green; front-size:larger'>" + it.getName()+ "</h3>"+"<h4 style='color:blue'>Club: "+
                it.getClub() + "<h4 style='color:red'>Salary: " +it.getSalary() + "<br>Transfer price: " +it.getTransferPrice()
                + "</br> </h4>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
