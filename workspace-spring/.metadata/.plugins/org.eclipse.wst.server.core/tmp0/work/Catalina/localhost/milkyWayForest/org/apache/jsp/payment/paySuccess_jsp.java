/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 06:40:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.payment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paySuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/css/payment.css\">\r\n");
      out.write("<style>\r\n");
      out.write("#paySuccess {\r\n");
      out.write("margin: 120px auto 80px auto;\r\n");
      out.write("}\r\n");
      out.write("#paySuccess #homeBtn,\r\n");
      out.write("#paySuccess #mypageBtn{\r\n");
      out.write("	width: 130px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("	background: #154520;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 7px 20px;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    box-shadow: none;\r\n");
      out.write("}\r\n");
      out.write("#paySuccess #paymentInfoDivWrap {\r\n");
      out.write("	width:100%;\r\n");
      out.write("	display:flex;\r\n");
      out.write("	flex-direction:column;\r\n");
      out.write("	align-items:center;\r\n");
      out.write("}\r\n");
      out.write("#paySuccess #paymentInfoDiv {\r\n");
      out.write("	padding-top: 60px;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("#paySuccess #paymentInfoDiv h2{\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("#paySuccess #paymentInfoDiv h3{\r\n");
      out.write("	font-size: 17px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("#paySuccess #paymentInfoDiv p{\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	margin-top: 13px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form id=\"paySuccess\">\r\n");
      out.write("	<div id=\"paymentInfoDivWrap\">\r\n");
      out.write("		<div id=\"paymentInfoDiv\">\r\n");
      out.write("			<h2>결제완료</h2>\r\n");
      out.write("			<h3>구매가 정상적으로 완료되었습니다.</h3>\r\n");
      out.write("			<p>주문번호<br><span id=\"paymentCode\"></span></p>\r\n");
      out.write("			<p>적립금<br><span id=\"savedMoney\"></span></p>\r\n");
      out.write("			<p>총 결제금액<br><span id=\"totalPayPrice\"></span></p>\r\n");
      out.write("			\r\n");
      out.write("			<div id=\"buttonWrap\">\r\n");
      out.write("				<input type=\"button\" id=\"homeBtn\" class=\"btn\" value=\"메인화면으로\">\r\n");
      out.write("				<input type=\"button\" id=\"mypageBtn\" class=\"btn\" value=\"구매내역확인\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/payment/getPayInfo',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		data: 'paymentCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paymentCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			$('#paymentCode').text('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paymentCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("			$('#savedMoney').text(data.newSavedMoney.toLocaleString()+\" 원\");\r\n");
      out.write("			$('#totalPayPrice').text(data.payPrice.toLocaleString()+\" 원\");\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err) {\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("$('#paySuccess #homeBtn').click(function(){\r\n");
      out.write("	location.href='/milkyWayForest/index.jsp';\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$('#paySuccess #mypageBtn').click(function(){\r\n");
      out.write("	location.href='/milkyWayForest/mypage/mypageMain';\r\n");
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
