/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 08:31:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findIdForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/css/login.css\">\r\n");
      out.write("\r\n");
      out.write("<form name=\"findIdForm\" id=\"findIdForm\">\r\n");
      out.write("<div id=\"main-container\">\r\n");
      out.write("	<div id=\"main-wrap\">\r\n");
      out.write("		<section>\r\n");
      out.write("			<div id=\"findId-select-wrap\">\r\n");
      out.write("				<h3>????????? ??????</h3>\r\n");
      out.write("				<p>????????? ?????? ????????? ???????????????</p>\r\n");
      out.write("				<ul class=\"nav\">\r\n");
      out.write("					<li class=\"nav-item selectBtn\"><button type=\"button\" id=\"select-question-button\"><span>???????????? ??????</span></button></li>\r\n");
      out.write("					<li class=\"nav-item\"><button type=\"button\" id=\"select-email-button\"><span>???????????? ??????</span></button></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- ???????????? ?????? ?????? ???????????? ????????? -->\r\n");
      out.write("			<div id=\"findId-question-wrap\">\r\n");
      out.write("				<select class=\"form-select form-select-lg\">\r\n");
      out.write("					<option style=\"text-align: center;\">------- ????????? ??????????????? ------- </option>\r\n");
      out.write("					<option value=\"????????? ??????\">????????? ?????? ????????? ??????????</option>\r\n");
      out.write("					<option value=\"?????????\">????????? ?????? ?????????????</option>\r\n");
      out.write("					<option value=\"??????\">????????? ?????? 1???????</option>\r\n");
      out.write("					<option value=\"?????????\">?????? ????????? ?????? ????????? ??????????</option>\r\n");
      out.write("					<option value=\"??????\">????????? ?????? ??? ????????? ?????? ????????? ??????????</option>\r\n");
      out.write("					<option value=\"??????\">???????????? ?????? ???????????? ?????? ??????????</option>\r\n");
      out.write("					<option value=\"???\">?????? ?????? ?????? ??? ??????????</option>\r\n");
      out.write("					<option value=\"?????????\">?????? ???????????? ?????????????</option>\r\n");
      out.write("				</select>\r\n");
      out.write("				\r\n");
      out.write("				<div id=\"findId-question-input-wrap\">	\r\n");
      out.write("					<input type=\"text\" id=\"findId-question-input\" name=\"findId-question-input\" placeholder=\"????????? ?????? ?????? ???????????????\"></input>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div id=\"findId-button-wrap\">\r\n");
      out.write("					<button type=\"button\" id=\"findId-button1\" class=\"btn\">????????? ??????</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"result1-div\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- ???????????? ?????? ?????? ???????????? ????????? -->\r\n");
      out.write("			<div id=\"findId-email-wrap\">\r\n");
      out.write("				<p>???????????? ???????????????</p>\r\n");
      out.write("				<div id=\"findId-email-input-wrap\">\r\n");
      out.write("					<input type=\"email\" id=\"findId-email-input1\" name=\"email1\"> @\r\n");
      out.write("					<input type=\"email\" id=\"findId-email-input2\" name=\"email2\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div id=\"check-email-button-wrap\">\r\n");
      out.write("					<button type=\"button\" id=\"check-email-button\" class=\"btn\">???????????? ??????</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"checkEmailInput\" class=\"checkEmailInputHide\">\r\n");
      out.write("					<p>??????????????? ???????????????</p>\r\n");
      out.write("					<div id=\"check-email-input-wrap\">\r\n");
      out.write("						<input type=\"text\" id=\"check-email-input\" name=\"check-email-input\">\r\n");
      out.write("					</div>\r\n");
      out.write("	\r\n");
      out.write("					<div id=\"check-number-button-wrap\">\r\n");
      out.write("						<button type=\"button\" id=\"check-number-button\" class=\"btn\">???????????? ??????</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"result2-div\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/milkyWayForest/js/login.js\"></script>");
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
