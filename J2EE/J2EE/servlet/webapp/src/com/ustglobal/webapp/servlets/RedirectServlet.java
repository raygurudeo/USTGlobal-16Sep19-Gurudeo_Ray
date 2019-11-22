package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String google = "google";
		String yahoo = "yahoo";
		String bing = "bing";
		String searchValue = req.getParameter("search");
		String radioValue = req.getParameter("radio");
		if(radioValue.equals(google)) {
			resp.sendRedirect("https://www.google.com/search?q="+searchValue);
		}
		if(radioValue.equals(yahoo)) {
			resp.sendRedirect("https://in.search.yahoo.com/search?p="+searchValue);
		}
		if(radioValue.equals(bing)) {
			resp.sendRedirect("https://www.bing.com/search?q="+searchValue);
		}
		
	} // end od doGet()
} // end os class
