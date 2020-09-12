package tagpack;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import javax.servlet.jsp.*;
public class TagCode3 extends SimpleTagSupport
{
	private String val;
	
	public String getVal() {
		return val;
	}

	public void setVal(final String val) {
		this.val = val;
	}

	public void doTag()throws JspException,IOException
	{
		final JspContext context = getJspContext();
        String finals = "";
        final String str1 = this.getVal();
        for (int i = 0; i < str1.length(); ++i) {
            char letter = str1.charAt(i);
            if (Character.isUpperCase(str1.charAt(i))) {
                letter = Character.toLowerCase(letter);
                finals = String.valueOf(finals) + letter;
            }
            else if (Character.isLowerCase(str1.charAt(i))) {
                letter = Character.toUpperCase(letter);
                finals = String.valueOf(finals) + letter;
            }
        }
        context.getOut().write(finals);	
	}
}




