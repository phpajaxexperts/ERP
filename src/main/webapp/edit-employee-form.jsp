<!DOCTYPE html>
<html>
<body>

<h2>Update Employee Details</h2>

<form action="/add-employee" method="post">
  <label for="fname">Employee ID:</label><br>
  <input type="text" id="id" name="id" value="${employeeDetails.id}"><br>
  <label for="fname">First name:</label><br>
  <input type="text" id="first_name" name="first_name" value="${employeeDetails.first_name}"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="last_name" name="last_name" value="${employeeDetails.last_name}"><br><br>
  <label for="lname">Email Address:</label><br>
  <input type="text" id="email_address" name="email_address" value="${employeeDetails.email_address}"><br><br>
  <label for="lname">Phone:</label><br>
  <input type="text" id="phone" name="phone" value="${employeeDetails.phone}"><br><br>
  <label for="lname">Street Address 1:</label><br>
  <input type="text" id="street_address_1" name="street_address_1" value="${employeeDetails.street_address_1}"><br><br>
  <input type="submit" value="Submit">
</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "/action_page.php".</p>

</body>
</html>