/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servelet;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 *
 * @author natnaelgetachew
 */
public class FirstNea extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response)throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
	Enumeration e=request.getParameterNames();
	while (e.hasMoreElements()){
		String pname=(String) e.nextElement();
		pw.print(pname);
		String pvalue=request.getParameter(pname);
		pw.println(pvalue);
	}
	pw.close();
	}
}
