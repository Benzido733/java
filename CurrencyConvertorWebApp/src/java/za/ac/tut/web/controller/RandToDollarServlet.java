package za.ac.tut.web.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.CurrencyConverterSBLocal;

/**
 *
 * @author Owethu
 */
public class RandToDollarServlet extends HttpServlet {
   @EJB
   private CurrencyConverterSBLocal sb;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Double rand = Double.valueOf(request.getParameter("rand"));
        Double dollar = sb.randToDollar(rand);
        
        request.setAttribute("rand",rand);
        request.setAttribute("dollar",dollar);
        
        RequestDispatcher disp = request.getRequestDispatcher("rand_to_dollar_outcome.jsp");
        disp.forward(request, response);
    }

   

}
