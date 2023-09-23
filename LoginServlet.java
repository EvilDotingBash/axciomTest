package org.axciom.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.axciom.dao.UserDao;
import org.axciom.model.User;

@WebServlet("/userlogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("userpass");

	    UserDao userDao = new UserDao();
	    User user = userDao.getUserById(userid);
	    System.out.println(user);
	    if (user != null && (user.getEmail().equals(userid)) &&(user.getPassword().equals(password))) {
	    	System.out.println("hiii");
	        response.sendRedirect("userWelcome.jsp");
	    } else {
	        request.setAttribute("error", "Invalid username or password");
	        request.getRequestDispatcher("login.jsp").forward(request, response);
	    }

		/*
		 * try (Connection connection = DatabaseConnection.getConnection()) { String
		 * query = "SELECT * FROM users WHERE username = ? AND password = ?";
		 * PreparedStatement preparedStatement = connection.prepareStatement(query);
		 * preparedStatement.setString(1, username); preparedStatement.setString(2,
		 * password);
		 * 
		 * ResultSet resultSet = preparedStatement.executeQuery();
		 * 
		 * if (resultSet.next()) { // Successful login
		 * request.getRequestDispatcher("welcome.jsp").forward(request, response); }
		 * else { // Invalid login request.setAttribute("error",
		 * "Invalid username or password");
		 * request.getRequestDispatcher("login.jsp").forward(request, response); } }
		 * catch (SQLException e) { e.printStackTrace(); // Handle database connection
		 * or query errors }
		 */
		/*
		 * // Perform validation (replace with your authentication logic) if
		 * ("your_username".equals(username) && "your_password".equals(password)) { //
		 * Successful login request.getRequestDispatcher("welcome.jsp").forward(request,
		 * response); } else { // Invalid login request.setAttribute("error",
		 * "Invalid username or password");
		 * request.getRequestDispatcher("UserLogin.jsp").forward(request, response); }
		 */
	}

}
