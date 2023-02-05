package com.mycompany.servelet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Home implements Servlet {
    ServletConfig config=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
        System.out.println("servlet initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter pw=servletResponse.getWriter();
        pw.print("<html><body>");
        pw.print("<p>hello</P>");
        pw.print("</body></html>");


    }

    @Override
    public String getServletInfo() {
        return "copy right @natnaeln4d";
    }

    @Override
    public void destroy() {
        System.out.println("servlet is destroyed");
    }
}
