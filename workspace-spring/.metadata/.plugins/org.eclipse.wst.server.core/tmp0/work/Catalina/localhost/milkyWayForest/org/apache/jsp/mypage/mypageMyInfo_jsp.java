/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 05:43:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypageMyInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/css/mypage.css\">\r\n");
      out.write("\r\n");
      out.write("<form id=\"mypageMyInfo\" name=\"mypageMyInfo\">\r\n");
      out.write("<div id=\"h1Div\"><h1 style=\"font-size: 35px;\">???????????????</h1></div>\r\n");
      out.write("<div id=\"main-wrapper\">\r\n");
      out.write("	<div id=\"main-sideNav\" class=\"item\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mypageSideNav.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"main-topNav\" class=\"item\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mypageTopNav.jsp", out, false);
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"myBasicInfo-wrapper\" class=\"item\">\r\n");
      out.write("		<div id=\"myBasicInfo-title\" class=\"navbar navbar-light\">\r\n");
      out.write("			<span class=\"mb-0\">?????? ??????</span>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div id=\"myBasicInfo-state\">		\r\n");
      out.write("			<table class=\"table border-bottom\">\r\n");
      out.write("				<tbody>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td id=\"td-id\">????????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control shadow-none bg-white border-0\" readonly>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>???????????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"password\" id=\"pwd\" name=\"pwd\" class=\"form-control bg-white border\" placeholder=\"??????,??????,???????????? ?????? 8~16???\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>???????????? ?????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"password\" id=\"repwd\" class=\"form-control bg-white border\" placeholder=\"???????????? ??????\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>?????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" id=\"name\" name=\"name\" class=\"form-control shadow-none bg-white border-0\" readonly>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>????????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" id=\"nickname\" name=\"nickname\" class=\"form-control bg-white border\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>??????/???</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div id=\"idPwdQuestion-wrapper\" class=\"input-group mb-3\">\r\n");
      out.write("								<select class=\"custom-select\" id=\"idPwdQuestion\" name=\"idPwdQuestion\">\r\n");
      out.write("									<option value=\"false\" selected>---????????? ???????????????---</option>\r\n");
      out.write("								    <option value=\"????????? ??????\">????????? ?????? ????????? ??????????</option>\r\n");
      out.write("								    <option value=\"?????????\">????????? ?????? ?????????????</option>\r\n");
      out.write("								    <option value=\"??????\">????????? ?????? 1???????</option>\r\n");
      out.write("								    <option value=\"?????????\">?????? ????????? ?????? ????????? ??????????</option>\r\n");
      out.write("								    <option value=\"??????\">????????? ?????? ??? ????????? ?????? ????????? ??????????</option>\r\n");
      out.write("								    <option value=\"??????\">???????????? ?????? ???????????? ?????? ??????????</option>\r\n");
      out.write("								    <option value=\"???\">?????? ?????? ?????? ??? ??????????</option>\r\n");
      out.write("								    <option value=\"?????????\">?????? ???????????? ?????????????</option>\r\n");
      out.write("								</select>\r\n");
      out.write("								<div class=\"input-group-append\">\r\n");
      out.write("									<input type=\"text\" id=\"idPwdAnswer\" name=\"idPwdAnswer\" class=\"form-control\" placeholder=\"???\">\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>?????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" id=\"gender\" name=\"gender\" class=\"form-control shadow-none bg-white border-0\" readonly>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>????????? ?????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div id=\"tel-input-wrapper\" class=\"input-group mb-3\">\r\n");
      out.write("								<input type=\"text\" id=\"tel1\" name=\"tel1\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">-</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"text\" id=\"tel2\" name=\"tel2\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">-</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"text\" id=\"tel3\" name=\"tel3\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>???????????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div id=\"birthday-input-wrapper\" class=\"input-group mb-3\">\r\n");
      out.write("								<input type=\"text\" id=\"yy\" name=\"yy\" class=\"form-control shadow-none bg-white border-0\" readonly>\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">???</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"text\" id=\"mm\" name=\"mm\" class=\"form-control shadow-none bg-white border-0\" readonly>\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">???</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"text\" id=\"dd\" name=\"dd\" class=\"form-control shadow-none bg-white border-0\" readonly>\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">???</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>????????? ?????? *</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div id=\"email-input-wrapper\" class=\"input-group mb-3\">\r\n");
      out.write("								<input type=\"text\" id=\"email1\" name=\"email1\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("								<input type=\"hidden\" id=\"reEmail1\" class=\"form-control bg-white border-0\">\r\n");
      out.write("								\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">@</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"text\" id=\"email2\" name=\"email2\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("								\r\n");
      out.write("								<input type=\"hidden\" id=\"reEmail2\" class=\"form-control bg-white border-0\">\r\n");
      out.write("								<button type=\"button\" id=\"email-send-button\" class=\"btn\">???????????????</button>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div id=\"email-number-wrapper\" class=\"input-group\">\r\n");
      out.write("								<input type=\"text\" id=\"emailNum\" name=\"emailNum\" class=\"form-control bg-white border rounded\" disabled>\r\n");
      out.write("								<button type=\"button\" id=\"email-number-button\" class=\"btn\" disabled>??????????????????</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("			<div id=\"result-div\"></div>\r\n");
      out.write("			\r\n");
      out.write("			<div align=\"center\" id=\"button-wrap\">\r\n");
      out.write("				<button type=\"button\" id=\"Update-button\" class=\"btn\">??????????????????</button>\r\n");
      out.write("				<button type=\"button\" id=\"Delete-button\" class=\"btn\" onclick=\"location.href='/milkyWayForest/mypage/mypagePwdForm2'\">????????????</button>\r\n");
      out.write("				<button type=\"reset\" id=\"reset-button\" class=\"btn\">??????</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("</div><!-- main-wrapper -->\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/milkyWayForest/js/mypage.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//???????????? ???????????? \r\n");
      out.write("$('#mypageMyInfo').ready(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/mypage/getMypageMyInfo',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		data: {'id' : $('#mypageMyInfo #id').val()},\r\n");
      out.write("		success: function(data){\r\n");
      out.write("			console.log(JSON.stringify(data));\r\n");
      out.write("			\r\n");
      out.write("			if(data.name != null){\r\n");
      out.write("				$('#name').val(data.name);	\r\n");
      out.write("				\r\n");
      out.write("			}if(data.nickname != null){\r\n");
      out.write("				$('#nickname').val(data.nickname);	\r\n");
      out.write("				\r\n");
      out.write("			}if(data.idPwdQuestion != null && data.idPwdQuestion != 'false'){\r\n");
      out.write("				$('#idPwdQuestion').val(data.idPwdQuestion);\r\n");
      out.write("				$('#idPwdAnswer').val(data.idPwdAnswer);\r\n");
      out.write("				\r\n");
      out.write("			}if(data.gender != null){\r\n");
      out.write("				$('#gender').val(data.gender);	\r\n");
      out.write("				\r\n");
      out.write("			}if(data.tel1 != null){\r\n");
      out.write("				$('#tel1').val(data.tel1);\r\n");
      out.write("				$('#tel2').val(data.tel2);\r\n");
      out.write("				$('#tel3').val(data.tel3);\r\n");
      out.write("				\r\n");
      out.write("			}if(data.yy != null){\r\n");
      out.write("				$('#yy').val(data.yy);\r\n");
      out.write("				\r\n");
      out.write("			}if(data.mm != null && data.mm != 0){\r\n");
      out.write("				$('#mm').val(data.mm);\r\n");
      out.write("				$('#dd').val(data.dd);\r\n");
      out.write("				\r\n");
      out.write("			}if(data.email1 != null && data.email1 != 'false'){\r\n");
      out.write("				$('#email1').val(data.email1);\r\n");
      out.write("				$('#email2').val(data.email2);\r\n");
      out.write("				$('#reEmail1').val(data.email1);\r\n");
      out.write("				$('#reEmail2').val(data.email2);\r\n");
      out.write("			}\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err){\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
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
