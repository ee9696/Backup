/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-09 01:07:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"boardViewForm\">\r\n");
      out.write("<input type=\"text\" name=\"seq\" id=\"seq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.seq }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<input type=\"text\" name=\"pg\" id=\"pg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"450\" border=\"1\" cellspacing=\"0\" cellpadding=\"5\" frame=\"hsides\" rules=\"rows\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"3\"><h3><span id=\"subjectSpan\"></span></h3></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td width=\"150\">????????? : <span id=\"seqSpan\"></span></td>\r\n");
      out.write("		<td width=\"150\">????????? : <span id=\"idSpan\"></span></td>\r\n");
      out.write("		<td width=\"150\">????????? : <span id=\"hitSpan\"></span></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<!-- \r\n");
      out.write("	????????? ????????? ?????? ????????? ?????? ??? ??????\r\n");
      out.write("	????????? ?????? ?????? ?????? ????????? ?????? ??? ?????? \r\n");
      out.write("	-->\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"3\" height=\"200\" valign=\"top\">\r\n");
      out.write("			<pre style=\"white-space:pre-line; word-break:break-all;\"><span id=\"contentSpan\"></span></pre>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" id=\"boardListBtn\" value=\"??????\" \r\n");
      out.write("	   onclick=\"location.href='/MQBProject/board/boardList.do?pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("\r\n");
      out.write("<span id=\"boardViewSpan\">\r\n");
      out.write("	<input type=\"button\" value=\"?????????\" onclick=\"mode(1)\">\r\n");
      out.write("	<input type=\"button\" value=\"?????????\" onclick=\"mode(2)\">\r\n");
      out.write("</span>\r\n");
      out.write("<input type=\"button\" value=\"??????\" \r\n");
      out.write("	   onclick=\"location.href='/MQBProject/board/boardReplyForm.do?seq=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">	   \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url:'/MQBProject/board/getBoardView.do',\r\n");
      out.write("		type:'post',\r\n");
      out.write("		data:{'seq': $('#seq').val()},\r\n");
      out.write("		dataType:'json',\r\n");
      out.write("		success:function(data){\r\n");
      out.write("			//console.log(JSON.stringify(data));\r\n");
      out.write("			//alert(JSON.stringify(data));\r\n");
      out.write("			\r\n");
      out.write("			$('#subjectSpan').text(data.subject);\r\n");
      out.write("			$('#seqSpan').text(data.seq);\r\n");
      out.write("			$('#idSpan').text(data.id);\r\n");
      out.write("			$('#logtimeSpan').text(data.logtime);\r\n");
      out.write("			$('#contentSpan').text(data.content);\r\n");
      out.write("			\r\n");
      out.write("			//????????? ???????????? ?????????, ????????? ???????????????\r\n");
      out.write("			if(data.memId == data.id) \r\n");
      out.write("				$('#boardViewSpan').show();\r\n");
      out.write("			else\r\n");
      out.write("				$('#boardViewSpan').hide();\r\n");
      out.write("		},\r\n");
      out.write("		error:function(err){\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function mode(num){\r\n");
      out.write("	if(num==1) { \r\n");
      out.write("		document.getElementById('boardViewForm').method = 'post';\r\n");
      out.write("		document.getElementById('boardViewForm').action = '/MQBProject/board/boardModifyForm.do';\r\n");
      out.write("		document.getElementById('boardViewForm').submit();\r\n");
      out.write("	}else if(num==2) {\r\n");
      out.write("		document.getElementById('boardViewForm').method = 'post';\r\n");
      out.write("		document.getElementById('boardViewForm').action = '/MQBProject/board/boardDelete.do';\r\n");
      out.write("		document.getElementById('boardViewForm').submit();\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
