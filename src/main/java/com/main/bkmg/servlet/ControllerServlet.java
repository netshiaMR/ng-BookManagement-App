package com.main.bkmg.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.main.bkmg.model.BookDAO;

public class ControllerServlet extends HttpServlet {
	private BookDAO bookBAO;

	public void init() {
		String urlString = getServletContext().getInitParameter("url");
		String username = getServletContext().getInitParameter("username");
		String password = getServletContext().getInitParameter("password");

		bookBAO = new BookDAO(urlString, password, username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			if (action.equalsIgnoreCase("/new")) {

			} else if (action.equalsIgnoreCase("/inert")) {

			} else if (action.equalsIgnoreCase("/delete")) {

			} else if (action.equalsIgnoreCase("/edit")) {

			} else if (action.equalsIgnoreCase("/update")) {

			}

		} catch (SQLException e) {
			throw new ServletException(e);

		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
