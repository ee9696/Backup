/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 01:03:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#menu__toggle {\r\n");
      out.write("  opacity: 1; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu__toggle:checked ~ .menu__btn > span {\r\n");
      out.write("  transform: rotate(45deg);\r\n");
      out.write("}\r\n");
      out.write("#menu__toggle:checked ~ .menu__btn > span::before {\r\n");
      out.write("  top: 0;\r\n");
      out.write("  transform: rotate(0);\r\n");
      out.write("}\r\n");
      out.write("#menu__toggle:checked ~ .menu__btn > span::after {\r\n");
      out.write("  top: 0;\r\n");
      out.write("  transform: rotate(90deg);\r\n");
      out.write("}\r\n");
      out.write("#menu__toggle:checked ~ .menu__box {\r\n");
      out.write("  visibility: visible;\r\n");
      out.write("  left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu__btn {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 20px;\r\n");
      out.write("  left: 20px;\r\n");
      out.write("\r\n");
      out.write("  width: 26px;\r\n");
      out.write("  height: 26px;\r\n");
      out.write("\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu__btn > span,\r\n");
      out.write(".menu__btn > span::before,\r\n");
      out.write(".menu__btn > span::after {\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 2px;\r\n");
      out.write("\r\n");
      out.write("  background-color: #616161;\r\n");
      out.write("\r\n");
      out.write("  transition-duration: .25s;\r\n");
      out.write("}\r\n");
      out.write(".menu__btn > span::before {\r\n");
      out.write("  content: '';\r\n");
      out.write("  top: -8px;\r\n");
      out.write("}\r\n");
      out.write(".menu__btn > span::after {\r\n");
      out.write("  content: '';\r\n");
      out.write("  top: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu__box {\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  visibility: hidden;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: -100%;\r\n");
      out.write("\r\n");
      out.write("  width: 300px;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 80px 0;\r\n");
      out.write("\r\n");
      out.write("  list-style: none;\r\n");
      out.write("\r\n");
      out.write("  background-color: #ECEFF1;\r\n");
      out.write("  box-shadow: 1px 0px 6px rgba(0, 0, 0, .2);\r\n");
      out.write("\r\n");
      out.write("  transition-duration: .25s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu__item {\r\n");
      out.write("  display: block;\r\n");
      out.write("  padding: 12px 24px;\r\n");
      out.write("\r\n");
      out.write("  color: #333;\r\n");
      out.write("\r\n");
      out.write("  font-family: 'Roboto', sans-serif;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("\r\n");
      out.write("  transition-duration: .25s;\r\n");
      out.write("}\r\n");
      out.write(".menu__item:hover {\r\n");
      out.write("  background-color: #CFD8DC;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"hamburger-menu\">\r\n");
      out.write("    <input id=\"menu__toggle\" type=\"checkbox\" autocomplete=\"off\" />\r\n");
      out.write("    <label class=\"menu__btn\" for=\"menu__toggle\">\r\n");
      out.write("      <span></span>\r\n");
      out.write("    </label>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"menu__box\">\r\n");
      out.write("      	<li><a class=\"menu__item\" href=\"#\">메뉴1</a></li>\r\n");
      out.write("		<li><a class=\"menu__item\" href=\"#\">메뉴2</a></li>\r\n");
      out.write("		<li><a class=\"menu__item\" href=\"#\">메뉴3</a></li>\r\n");
      out.write("		<li><a class=\"menu__item\" href=\"#\">메뉴4</a></li>\r\n");
      out.write("		<li><a class=\"menu__item\" href=\"#\">메뉴5</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("<!--     <script>\r\n");
      out.write("  function uncheck(){\r\n");
      out.write("  	$(':checkbox:checked').prop('checked',false);\r\n");
      out.write("  };\r\n");
      out.write("  </script> -->\r\n");
      out.write("  <body onLoad=\"uncheck()\">\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<!--   <script type=\"text/javascript\" src=\"../js/test.js\"></script> -->\r\n");
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
