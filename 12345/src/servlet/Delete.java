package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Bean1;
import dao.Dao2;
import dao.Dao3;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		Bean1 f=new Bean1();
		f.setFirstname(request.getParameter("firstname"));
		f.setLastname(request.getParameter("lastname"));
		f.setEmailid(request.getParameter("emailid"));
		f.setPassword(request.getParameter("password"));
		f.setConfirmpassword(request.getParameter("confirmpassword"));
		f.setDesignation(request.getParameter("designation"));
		f.setGender(request.getParameter("gender"));
		f.setDateofbirth(request.getParameter("dateofbirth"));
		f.setMobilenumber(request.getParameter("mobilenumber"));
		f.setCurrentaddress(request.getParameter("currentaddress"));
		f.setPeramanentaddress(request.getParameter("peramanentaddress"));
		f.setState(request.getParameter("state"));
		f.setNationality(request.getParameter("nationality"));
		Dao3 g=new Dao3();
		g.delete(f);
		request.getRequestDispatcher("delete1.jsp").forward(request, response);
	}

}
