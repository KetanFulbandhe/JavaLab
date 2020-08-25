**1)** define a class "Order" with

	enum Type
	{
	  BUY,SELL;
 	}
  	private int quantity;
   	private double price;
    private Type type;
 
 define setter and getter methods for all the fields. *create 5 objects of this class and stored them inside list. **using stream api:***
 
 1) count how many orders are for "SELL"
   hint:- use "filter" method of stream to check whether type is SELL and "count" method to count.

 2) calculate sum of all the prices  hint:- use "mapToDouble" method of stream to convert price of each and every object and "sum" method to calculate total of all the prices.
 
 3) calculate sum of all the quantities.  hint:- use "mapToInt" method of stream to convert qty of each and every object and "sum" method to calculate total of all the quantities.
-------------------------
**2)** define a class Student

	rollno 
	name 
	age 
	marks 
  
  parameterized constructor  getter methods *create 5 objects and store them inside list.* using **java8 stream api:**
   1) find out **name starts** with *'s'*  
   hint:- use **"filter"** to check names start with "s" and **"forEach" method** to display all those names.
 
 2) how many **students got more than 70** 
  hint: use **"filter" and "count"** 

 3) how many **students in between age 22 and 25**  
 hint: use **"filter" and "count"**
-------------------------
**3)** define a class Player  with

  	int playerid  
  	String name
	int runs  
	String countryname  

define   parameterized constructor and getter methods *create 10 players and store them inside a list. using java8 stream api*: 
1) display all the players representing **"India"**.

	 hint:- use **"filter"** to *check players representing * **"India"** and **"forEach"** method in order to *print them.*

2) find out how many ***players** have **scored more than 5000** runs*. 

	hint:- use **"filter"** to check players scored more than 5000 runs and **"count"** method to count them.