package com.tongwei.sso.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class StaticTag extends TagSupport {

	private static final long serialVersionUID = 1977225350330714103L;
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		String contextPath = request.getContextPath();
		try {
			out.write(contextPath+"/static");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
}
