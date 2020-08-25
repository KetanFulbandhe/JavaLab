1)Create a customer class with following attributes
	
    custid
	custname
	address
	age
create one *instance* of it and *store it in a file.*(Serialization).
now open a file, *read the object* and read its contents . (Deserialization)

2)Person class *implements Serializable* with.
    
    private String name
    private int age

getters and setters
parameterized constructor.

Student extends Person

   	private int rollno
getter and setters
	*parameterized constructor accepting name,age and rollno*
			pass *name and age to the super constructor*

Demo class with main
	create one object of Student, write it inside file and then read.