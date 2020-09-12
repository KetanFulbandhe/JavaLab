package tagpack;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.*;
import javax.servlet.jsp.*;
public class TagCode1 extends SimpleTagSupport
{
	private int first;
	private int second;

	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void doTag()throws JspException,IOException
	{
		/*JspContext context=getJspContext();
		int x = getFirst();
		int y= getSecond();
		int r=x-y;
		context.getOut().write("Difference is :"+r);*/
		
		 int sum=getFirst()-getSecond();
			//getJspContext().getOut().print( LocalDate.now());
			getJspContext().getOut().print(sum+"hello");

	}
}