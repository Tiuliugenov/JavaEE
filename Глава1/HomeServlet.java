package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.*;
import java.util.ArrayList;import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String team = request.getParameter("name_team");
        String points = request.getParameter("points");
        System.out.println(team + "got"+ points);
    }

        @Override

        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String name = request.getParameter("user_name");
            String surname = request.getParameter("user_surname");
            int age = Integer.parseInt(request.getParameter("user_age"));
            String result = "You are " + name + " " + surname + " " + age;
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.print("<h1 style='color:red; '>" +result+ "</h1>");
            out.print("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROTVZnFmYY36uknnLWlnc3q5i05pYCBe9YffTpHyurQA&s'>");
//            response.setContentType("text/html");
//            PrintWriter out = response.getWriter();
//            List<User> users = new ArrayList<>();
//            users.add(new User("Kuat", "Abylay", "IT", 200000));
//            users.add(new User("Kuat1", "Abylay1", "IT1", 210000));
//            users.add(new User("Kuat2", "Abylay2", "IT2", 220000));
//            users.add(new User("Kuat3", "Abylay3", "IT3", 230000));
//            users.add(new User("Kuat4", "Abylay4", "IT4", 240000));
//            users.add(new User("Kuat5", "Abylay5", "IT5", 250000));
//            out.print("<table cellpadding='10px' border='1'>>");
//            out.print("<thead>");
//            out.print("<th>NAME</th>");
//            out.print("<th>SURNAME</th>");
//            out.print("<th>DEPARTMENT</th>");
//            out.print("<th>SALARY</th>");
//            out.print("</thead>");
//            out.print("<tbody>");
//            for (User user : users) {
//                out.print("<tr>");
//                out.print("<td>"+user.getName()+"</td>");
//                out.print("<td>"+user.getSurname()+"</td>");
//                out.print("<td>"+user.getDepartment()+"</td>");
//                out.print("<td>"+user.getSalary()+"</td>");
//                out.print("</tr>");
//            }
//            out.print("</tbody>");
//            out.print("</table>");
    }
}

