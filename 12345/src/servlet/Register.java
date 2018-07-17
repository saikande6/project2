package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Bean1;
import dao.Dao1;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		Bean1 a=new Bean1();
		a.setFirstname(request.getParameter("firstname"));
		a.setLastname(request.getParameter("lastname"));
		a.setEmailid(request.getParameter("emailid"));
		a.setPassword(request.getParameter("password"));
		a.setConfirmpassword(request.getParameter("confirmpassword"));
		a.setDesignation(request.getParameter("designation"));
		a.setGender(request.getParameter("gender"));
		a.setDateofbirth(request.getParameter("dateofbirth"));
		a.setMobilenumber(request.getParameter("mobilenumber"));
		a.setCurrentaddress(request.getParameter("currentaddress"));
		a.setPeramanentaddress(request.getParameter("peramanentaddress"));
		a.setState(request.getParameter("state"));
		a.setNationality(request.getParameter("nationality"));
		Dao1 c=new Dao1();
		c.register(a);
		request.getRequestDispatcher("registration1.jsp").forward(request, response);
	}

}
