/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web.controller;

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
public class DollarToRandServlet extends HttpServlet {

    @EJB
   private CurrencyConverterSBLocal sb;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         Double dollar = Double.valueOf(request.getParameter("dollar"));
         Double rand  = sb.dollarToRand(dollar);
         
         request.setAttribute("dollar", dollar);
         request.setAttribute("rand",rand);
         
         RequestDispatcher disp = request.getRequestDispatcher("dollar_to_rand_outcome.jsp");
         disp.forward(request, response);
         
    }

   

}
