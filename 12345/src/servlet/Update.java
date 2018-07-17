package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Bean;
import bean.Bean1;
import dao.Dao1;
import dao.Dao2;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		Bean1 c=new Bean1();
		c.setFirstname(request.getParameter("firstname"));
		c.setLastname(request.getParameter("lastname"));
		c.setEmailid(request.getParameter("emailid"));
		c.setPassword(request.getParameter("password"));
		c.setConfirmpassword(request.getParameter("confirmpassword"));
		c.setDesignation(request.getParameter("designation"));
		c.setGender(request.getParameter("gender"));
		c.setDateofbirth(request.getParameter("dateofbirth"));
		c.setMobilenumber(request.getParameter("mobilenumber"));
		c.setCurrentaddress(request.getParameter("currentaddress"));
		c.setPeramanentaddress(request.getParameter("peramanentaddress"));
		c.setState(request.getParameter("state"));
		c.setNationality(request.getParameter("nationality"));
		Dao2 d=new Dao2();
		d.update(c);
		request.getRequestDispatcher("update1.jsp").forward(request, response);
	}
	}


