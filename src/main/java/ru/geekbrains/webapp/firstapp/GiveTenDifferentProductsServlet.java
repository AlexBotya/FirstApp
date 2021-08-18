package ru.geekbrains.webapp.firstapp;


import java.io.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "productList", value = "/productList-servlet")
public class GiveTenDifferentProductsServlet extends HttpServlet {
    private ArrayList<Product> productList = new ArrayList<>();;

    public void init() {
        productList.add(new Product(1, "Skoda", 20000d));
        productList.add(new Product(2, "Lada", 10000d));
        productList.add(new Product(3, "BMW", 50000d));
        productList.add(new Product(4, "AUDI", 450000d));
        productList.add(new Product(5, "Mercedes", 70000d));
        productList.add(new Product(6, "Skoda", 18000d));

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (Product product:productList){
            out.println(product.toString() + "<br>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

