package com.maryanto.dimas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/halo")
public class BelajarServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// http request, digunakan untuk kita (server) menambil permintaan dari si browser
		String nama = req.getParameter("nama");
		String nik = req.getParameter("nik");

		// http response, digunakan untuk kita (server) mengeluarkan / menghasilkan html
		resp.getWriter().append("halo nama saya dari method get " + nama + 
				" dan niknya adalah " + nik);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String nama = req.getParameter("nama");
		String nik = req.getParameter("nik");

		req.setAttribute("outputNama", nama);
		req.setAttribute("outputNik", nik);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/info.jsp");
		rd.forward(req, resp);
		
	}

}
