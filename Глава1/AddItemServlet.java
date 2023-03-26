//package Servlets.db;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;
//
//import java.io.IOException;
//
//@WebServlet(value = "/add")
//public class AddItemServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("item_name");
//        int price = Integer.parseInt(request.getParameter("item_price"));
//        int amount = Integer.parseInt(request.getParameter("item_amount"));
//        Items item= new Items();
//        item.setName(name);
//        item.setPrice(price);
//        item.setAmount(amount);
//        DbManager.addItem(item);
//        response.sendRedirect("/index");
//    }
//}
