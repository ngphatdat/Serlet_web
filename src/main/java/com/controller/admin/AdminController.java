package com.controller.admin;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.impl.ICategorySevice;
@WebServlet(urlPatterns={"/admin-home"})
public class AdminController extends HttpServlet {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 2488128762836626533L;
	@Inject
	private ICategorySevice CategoryService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("categoties", CategoryService.findAll());
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/home.jsp");
		rd.forward(req, resp);
	}
}