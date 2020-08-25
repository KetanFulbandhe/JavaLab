
1)Define an interface “First” with 
	One abstract method and one default method.
Now define a class “Sub”, which implements “First”.
From main function, create an instance of Sub and invoke both the methods of interface.

2)Define two interfaces
        Interface A with “default void fun()” and interface B with “default void fun()” methods.
Now define a class C which implements both A and B.
Observe what happens here. Provide the solution in case of any problem.

3)Define an interface “Second” with 
	One abstract method and one default method.
Now define a class “Sub1”, which implements “Second” and override the default method of interface “Second”. Also invoke default method of Second from the overriding method.
From main function, create an instance of Sub1 and invoke the methods.

4)Define a class “Base” with  “public void disp()” and interface “MyInterface” with default method “public void disp()”.
Now define a child class “Sub2 extends Base implements MyInterface”
Inside main function create an instance of “Sub2” and invoke “disp()”.
Observe what happens.

5)Define an interface “MyAlgo” with static methods

    static int sqr(int k)
    Static int add(int a,int b)
    Static int product(int a,int b)

From main function invoke all the static methods of “MyAlgo”.

6)Given

    interface Alpha
    {
    	void perform();
    }

And

    Public class Demo
    {
    	Public static void main(String args[])
    	{
    		Alpha a=MyClass.getAlpha();
	    	a.perform();
	    }
    }

Above code is incomplete. You have to complete it. It means you have to write “MyClass”.
Complete the entire code, compile and run.



7)Given

    interface Base
    {
    	int product(int a,int b);
    }

Write a **lambda expression and invoke product method**.

8)Define a thread which displays 1 to 10 values. 
	*Use lambda to pass Runnable implementation* to Thread class constructor.
9)Given

    interface MyInterface
    {
    	void fun(char a,int b);
    }
And

    class SomeClass
    {
	    void disp(char a,int b)
	    {
	    	S.o.p(a,b);
	    }
    }

Write a lambda expression as well as method reference and invoke disp() method of SomeClass.
