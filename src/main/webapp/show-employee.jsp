<!DOCTYPE html>
<html>
<body>

<h2>Add Employee Details</h2>

<form action="/add-employee" method="post">
  <label for="fname">First name: ${employeeDetails.first_name}</label><br>
  
  <label for="lname">Last name: ${employeeDetails.last_name}</label><br>

  <label for="email_address">Emai Address: ${employeeDetails.email_address}</label><br>

  <label for="lname">Phone: ${employeeDetails.phone}</label><br>

  <label for="lname">Street Address: ${employeeDetails.street_address_1}</label><br>

</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "/action_page.php".</p>

</body>
</html>