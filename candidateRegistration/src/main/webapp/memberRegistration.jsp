<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body bgcolor=#ADD8E6>
<form action="Register" method="post">
<h1 style="color:red" align="center">Candidate Registration Form</h1>
<table align="center" cellspacing="8" cellpadding="8" width=50%>
<tr><td style="color:black">Email</td><td><input type="text" name="email"></td></tr>
<tr><td style="color:black">Phone number</td><td><input type="text" name="pnumber"></td></tr>
<tr><td style="color:black">First name</td><td><input type="text" name="fname"></td></tr>
<tr><td style="color:black">Last name</td><td><input type="text" name="lname"></td></tr>
<tr><td style="color:black">College Full Name</td><td><input type="text" name="cname"></td></tr>
<tr><td style="color:black">Residential Address</td><td><input type="text" name="raddress"></td></tr>
<tr><td style="color:black">City</td><td><input type="text" name="city"></td></tr>
<tr><td style="color:black">Postal code</td><td><input type="text" name="pcode"></td></tr>
<tr><td style="color:black">State/Region</td><td><input type="text" name="state"></td></tr>
<tr><td style="color:black">Date Of Birth</td><td><input type="date" name="dob"></td></tr>
<tr><td style="color:black">Highest Education</td><td><input type="text" name="heducation"></td></tr>
<tr><td style="color:black">Photo Id and Address Proof</td><td><input type="file" name="pid"></td></tr>
<tr><td style="color:black">Student Id/Bonafide Certificate/Admission Letter</td><td><input type="file" name="sid"></td></tr>
<tr><td style="color:black">Previous Semester Marksheet</td><td><input type="file" name="msheet"></td></tr>
<tr><td style="color:black">IAC Mentor Name</td><td><input type="text" name="mname"></td></tr>
<tr><td></td><td><input type="submit" name="Submit"></td></tr>
</table>
</form>
</body>
</html>