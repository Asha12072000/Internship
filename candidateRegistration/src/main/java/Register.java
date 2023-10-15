

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
        super();
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
		
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("pnumber");
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String collegename = request.getParameter("cname");
		String residentialaddress = request.getParameter("raddress");
		String city = request.getParameter("city");
		String postalcode = request.getParameter("pcode");
		String state_region = request.getParameter("state");
		String dob = request.getParameter("dob");
		String highestedution = request.getParameter("heducation");
		String photoid = request.getParameter("pid");
		String studentid = request.getParameter("sid");
		String marksheet = request.getParameter("msheet");
		String mentorname = request.getParameter("mname");
		
		Member member = new Member(email, phonenumber, firstname, lastname, collegename, residentialaddress, city, postalcode, state_region, dob, highestedution, photoid, studentid, marksheet, mentorname);
		
		registerDao rd = new registerDao();
		String result = "Registration Successful";
		try {
			result = rd.insert(member);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().print(result);
		
	}

}
