package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import ws.BanqueService;
import ws.BanqueWSLocator;

/**
 * Servlet implementation class ConversionServlet
 */
@WebServlet("/ConversionServlet")
public class ConversionServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	
	
	
		
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		BanqueService banqueservice = new BanqueWSLocator().getBanqueServicePort();
		double montant = Double.parseDouble(request.getParameter("montant"));
		double conversion = banqueservice.conversionED(montant);
		request.setAttribute("conversion", conversion);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
