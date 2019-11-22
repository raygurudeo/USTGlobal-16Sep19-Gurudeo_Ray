package com.comp.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.comp.empwebapp.dao.EmployeeDAO;
import com.comp.empwebapp.dto.EmployeeInfo;
import com.comp.empwebapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			
			String pass = req.getParameter("password");
			String confirmPass = req.getParameter("confirmpassword");
			
			if(pass.equals(confirmPass)) {
				
				EmployeeInfo info = (EmployeeInfo)session.getAttribute("id");
				EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(info.getId(), pass);
				
				int isPasswordMatch = 1;
				req.setAttribute("isPasswordMatch", isPasswordMatch);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
				dispatcher.forward(req, resp);
			} else {
				
				Integer isPasswordMatch = 0;
				req.setAttribute("isPasswordMatch", isPasswordMatch);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.jsp");
				dispatcher.forward(req, resp); 
			}
			
			
		} else {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
	} // end of doPost()
} // end of ChangePasswordServlet
