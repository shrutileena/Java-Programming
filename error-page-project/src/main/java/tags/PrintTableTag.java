package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTableTag extends TagSupport {

	public int number;
	public String color;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
 	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		
		try {
			JspWriter out = pageContext.getOut();
			
			out.print("<br>");
			for(int i=0; i<10; i++) {
				out.println("<h3 style='color:"+color+";'>"+i*number+"</h3>");
				out.print("<br>");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return SKIP_BODY;
	}
}
