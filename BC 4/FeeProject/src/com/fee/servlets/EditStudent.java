package com.fee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fee.beans.StudentBean;
import com.fee.dao.StudentDao;
@WebServlet("/EditStudent")
public class EditStudent extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String rollno=request.getParameter("rollno");
		String name=request.getParameter("name");
	 	String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String course=request.getParameter("course");
		int fee=Integer.parseInt(request.getParameter("fee"));
		int paid=Integer.parseInt(request.getParameter("paid"));
		int due=Integer.parseInt(request.getParameter("due"));
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		StudentBean bean=new StudentBean(rollno,name, email, gender, course, fee, paid, due, address, contact);
		int status=StudentDao.update(bean);
		response.sendRedirect("ViewStudent");
		
		out.close();
	}

}
