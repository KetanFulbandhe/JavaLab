define an Entity "Login" with three member variables:

	private int id;  [ primary key ]
	private String uname,password;

create "Login.jsp" which will accept 
	*uname and password* from user and with the help of *"LoginController"* add the *record inside database.*

validations:

	uname should contain characters only
	uname should not exceed 6 characters.

	password must contain characters as well as digits.
	password must be of minimum 4 and maximum 7 characters.

create necessary DAO interface and implementation.
	
for uname

    @NotEmpty(message="name can not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
	@Size(max = 6)



for password

    @NotEmpty(message="password can not be empty")
	@Pattern(regexp = "^[A-Za-z]+[0-9]+$", message = "password must contain characters as well as digits")
	@Size(min=4,max = 7)	