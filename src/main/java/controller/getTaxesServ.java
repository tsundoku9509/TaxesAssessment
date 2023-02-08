package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Taxes;

/**
 * Servlet implementation class getTaxes
 */
@WebServlet("/getTaxesServ")
public class getTaxesServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTaxesServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String yearlySal = request.getParameter("yearlySal");
		Taxes tax = new Taxes(Double.parseDouble(yearlySal));
		PrintWriter writer = response.getWriter();
		writer.println("Your yearly taxes are: " + tax.toString());
		writer.close();
		request.setAttribute("userTaxRate", tax);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println(userCoins.toString());
		//writer.close();
		
	}

}
