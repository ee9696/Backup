/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-13 03:22:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<form name=\"loginForm\" id=\"loginForm\">\r\n");
      out.write("<div id=\"headerBackground\"> </div>\r\n");
      out.write("<div id=\"main-container\">\r\n");
      out.write("	<h1>로그인</h1>\r\n");
      out.write("	<div id=\"main-wrap\">\r\n");
      out.write("		<div id=\"welcomdeLogin\">\r\n");
      out.write("			<span>Welcome! </span> 은하숲에 오신 것을 환영합니다.\r\n");
      out.write("		</div>\r\n");
      out.write("		<section id=\"login-input-wrap\">\r\n");
      out.write("			<div id=\"id-input-wrap\">	\r\n");
      out.write("				<input type=\"text\" id=\"id-input\" name=\"id\" placeholder=\"아이디\"></input>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"pwd-input-wrap\">	\r\n");
      out.write("				<input type=\"password\" id=\"pwd-input\" name=\"pwd\" placeholder=\"비밀번호\"></input>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"login-button-wrap\">\r\n");
      out.write("				<button type=\"button\" id=\"login-button\"  class=\"btn\">로그인</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		\r\n");
      out.write("		<section id=\"easy-login-wrap\">\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li>\r\n");
      out.write("					<button type=\"button\" id=\"kakao-login-btn\" class=\"btn\">\r\n");
      out.write("						<img src=\"/milkyWayForest/image/kakao.png\" alt=\"kakao\">\r\n");
      out.write("						<span>카카오 로그인</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</li>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			<div id=\"result-div\"> </div>\r\n");
      out.write("			<div id=\"find-write\">\r\n");
      out.write("				<p><a href=\"/milkyWayForest/login/findId\">아이디 찾기</a></p> | \r\n");
      out.write("				<p><a href=\"/milkyWayForest/login/findPwd\">비밀번호 찾기</a></p> | \r\n");
      out.write("				<p><a href=\"/milkyWayForest/write/memberWrite\">회원가입</a></p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/milkyWayForest/js/login.js\"></script>\r\n");
      out.write("<script src=\"https://developers.kakao.com/sdk/js/kakao.js\"></script>\r\n");
      out.write("<script src=\"https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.2.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
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
