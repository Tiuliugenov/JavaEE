package Servlets.db;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/AddFootballer")
public class AddFootballer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String surname=request.getParameter("surname");
        int salary=Integer.parseInt(request.getParameter("salary"));
        String club=request.getParameter("club");
        int transferPrice=Integer.parseInt(request.getParameter("transfer_price"));
        Footballer footballer= new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setSalary(salary);
        footballer.setClub(club);
        footballer.setTransferPrice(transferPrice);
        DbManager.addFootballer(footballer);
        response.sendRedirect("/Footballer");
    }
}
