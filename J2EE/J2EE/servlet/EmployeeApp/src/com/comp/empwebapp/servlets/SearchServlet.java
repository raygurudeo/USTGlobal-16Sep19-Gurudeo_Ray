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

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session == null) {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		} else {
			
			int id = Integer.parseInt(req.getParameter("id"));
			
			EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
			EmployeeInfo info = dao.searchEmployee(id);
			
			if(info != null) {
				
//				session.setAttribute("id", info.getId());
//				session.setAttribute("name", info.getName());
//				session.setAttribute("email", info.getEmail());
				
				req.setAttribute("info", info);

				RequestDispatcher dispatcher = req.getRequestDispatcher("/employeedetail.jsp");
				dispatcher.forward(req, resp); 
			} else {
				
				int isEmployee = 0;
				req.setAttribute("isEmployee", isEmployee);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
				dispatcher.forward(req, resp); 
			}
			
		}
		
	} // end of doGet()
	
} // end of SearchServlet
