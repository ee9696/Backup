/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 08:05:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pGradeBenefit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/css/admin.css\">\r\n");
      out.write("<div class=\"card\" id=\"pGradeBenefitDiv\">\r\n");
      out.write("	<form id=\"gradeBenefitForm\">\r\n");
      out.write("		<div id=\"gradeBenefitWrap\">\r\n");
      out.write("			<div><br>WELCOME<br><br></div>\r\n");
      out.write("			<div><br>GREEN<br><br></div>\r\n");
      out.write("			<div><br>GOLD<br><br></div>\r\n");
      out.write("			\r\n");
      out.write("			<div>\r\n");
      out.write("				<textarea id=\"welcomeBenefit\" name=\"welcome\" rows=\"8\"></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<textarea id=\"greenBenefit\" name=\"green\" rows=\"8\"></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<textarea id=\"goldBenefit\" name=\"gold\" rows=\"8\"></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("		<div id=\"gradeBenefitBtnWrap\">\r\n");
      out.write("			<input type=\"button\" id=\"benefitUpdateBtn\" class=\"btn btn-secondary\" value=\"수정\" disabled>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/admin/getGradeBenefit',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			$.each(data, function(index, items){\r\n");
      out.write("				if(index == 0)\r\n");
      out.write("					$('#welcomeBenefit').val(items.gradeBenefit);\r\n");
      out.write("				else if(index == 1)\r\n");
      out.write("					$('#greenBenefit').val(items.gradeBenefit);\r\n");
      out.write("				else $('#goldBenefit').val(items.gradeBenefit);\r\n");
      out.write("			});\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err) {\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$('#gradeBenefitWrap').change(function(){\r\n");
      out.write("		$('#benefitUpdateBtn').attr('disabled',false);\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$('#benefitUpdateBtn').click(function(){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: '/milkyWayForest/admin/updateGradeBenefit',\r\n");
      out.write("			type: 'post',\r\n");
      out.write("			data: $('#gradeBenefitForm').serialize(),\r\n");
      out.write("			success: function(data){\r\n");
      out.write("				alert('수정되었습니다.');\r\n");
      out.write("			},\r\n");
      out.write("			error: function(err){\r\n");
      out.write("				console.log(err);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>");
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