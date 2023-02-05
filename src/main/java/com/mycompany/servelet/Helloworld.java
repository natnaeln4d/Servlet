package com.mycompany.servelet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Helloworld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");
        pw.print("<html><body>");
        pw.print("<p>hello</P>");
        pw.print("</body></html>");
    }

}
