import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class registerDao {	
	
	public String insert(Member member) throws ClassNotFoundException 
	{
		String result = "Registration Successful";
		

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:7070/internship","root","1996");  
			
			String sql = "Insert into registration(email, phonenumber, firstname, lastname, collegename, residentialaddress, city, postalcode, state_region, dob, highesteduction, photoid, studentid, marksheet, mentorname) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getPhonenumber());
			ps.setString(3, member.getFirstname());
			ps.setString(4, member.getLastname());
			ps.setString(5, member.getCollegename());
			ps.setString(6, member.getResidentialaddress());
			ps.setString(7, member.getCity());
			ps.setString(8, member.getPostalcode());
			ps.setString(9, member.getState_region());
			ps.setString(10, member.getDob());
			ps.setString(11, member.getHighesteduation());
			ps.setString(12, member.getPhotoid());
			ps.setString(13, member.getStudentid());
			ps.setString(14, member.getMarksheet());
			ps.setString(15, member.getMentorname());
			ps.execute();
			con.close();  
			}catch(Exception e){ System.out.println(e);	
			
			}
		return result;
		
			}  
	}
