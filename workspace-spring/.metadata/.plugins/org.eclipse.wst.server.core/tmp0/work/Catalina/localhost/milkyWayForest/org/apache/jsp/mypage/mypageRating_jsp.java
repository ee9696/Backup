/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 06:21:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypageRating_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("#mypageMyinfo #contents{\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<form id=\"mypageShpMngListForm\" name=\"mypageMyInfo\">\r\n");
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
      out.write("	<div class=\"customer_grade\">\r\n");
      out.write("		<input type=\"hidden\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"grade_box family_type\" style=\"padding:56px 96px 55px;border:1px solid #e9e9e9;display:block; width:820px; margin-top: 60px;\">\r\n");
      out.write("        <div class=\"grade_summury\" style=\"min-height:64px; padding-bottom:20px; border-bottom:1px solid #e9e9e9; color:#999; font-size:16px; line-height:28px; letter-spacing:-1px;\">\r\n");
      out.write("            <div id=\"sp_mytmall_grade ico_grade\"></div>\r\n");
      out.write("            <div class=\"grade_inner\">\r\n");
      out.write("                <p class=\"txt\" style=\"display:inline-block;font-weight:bold; font-size:24px; line-height:36px; color: #000; vertical-align:middle;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" ???????????? <em class=\"txt_grade\" style=\"color:#05cfb5;font-style:normal;\"></em> ???????????????.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"grade_state\">\r\n");
      out.write("            <div class=\"grade_state_top\" style=\"text-align:center;position:relative;padding:24px 0 12px;line-height:28px;margin:0;display:block;\">\r\n");
      out.write("                <strong class=\"tit\"><span id=\"memberRating\"style=\"color:#05cfb5;font-style:normal;\"></span><span id=\"memberRating1\"></span></strong>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"grade_state_info\"style=\"border-bottom:1px solid #e9e9e9; font-size:0; list-style:none;margin:0;padding:0;display:block;margin-block-start:1em;margin-block-end:1em;margin-inline-start:0px;margin:inline-end:0px;text-align:center\">\r\n");
      out.write("                <li style=\"margin:0; padding-bottom:24px;list-style:none; display:list-item;text-align:center;font-size:0;\">\r\n");
      out.write("                    <div class=\"info\">	\r\n");
      out.write("                        <strong class=\"txt_num\" style=\"display:inline-block; font-size:16px; vertical-align:top;margin:0;padding:0;font-weight:bold;color:#333;line-height:28px;letter-spacing:-1px;list-style:none;text-align:center;\"><span id=\"amount\"></span><span class=\"skip\"> ??? ?????????  /&nbsp;&nbsp;</span></strong>\r\n");
      out.write("                        <span id=\"rmnngAmnt\" style=\"display:inline-block; margin-left:8px; font-size:14px; vertical-align:top;margin:0;padding:0;color:#333;line-height:28px;letter-spacing:-1px;list-style:none;text-align:center;\"></span>\r\n");
      out.write("                        <span class=\"purpose\" style=\"position:relative;top:0;right:0;font-size:12px;color:#999;margin:0;padding-left:20px;line-height:28px;letter-spacing:-1px;list-style:none;text-align:center;\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"grade_state_bar\" align=\"center\">\r\n");
      out.write("                        <!-- <span class=\"grade_percent\" style=\"width:50%;background:#05cfb5; position:absolute; top:0;left:0;height:6px;margin:0;padding:0;list-style:none;\"></span> -->\r\n");
      out.write("                        <progress style=\"width:400px; height:30px;\" id=\"targetAmount\"></progress>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"grade_benefit_info\" style=\"padding:55px 96px; border:1px solid #e9e9e9; width:820px;border-top:0;display:block;\">\r\n");
      out.write("        <h3 class=\"tit\" style=\"font-size:18px; line-height:36px;padding:0;margin:0;display:block;margin-block-start:1em;margin-block-end:1em;margin-inline-start:0px;margin-inline-end:0px;font-weight:bold;\">?????? ??????</h3>\r\n");
      out.write("        <pre id=\"contentTxt\"></pre>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//???????????? ???????????? \r\n");
      out.write("$(function(){\r\n");
      out.write("	var paidTotal=0;\r\n");
      out.write("	var remainingAmount = '70000'- paidTotal;\r\n");
      out.write("	var remainingAmount1 = '150000' - paidTotal;\r\n");
      out.write("\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/mypage/getPaymentInfo',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		success: function(data){\r\n");
      out.write("			console.log(JSON.stringify(data));\r\n");
      out.write("			\r\n");
      out.write("			if(data.paymentList == ''){\r\n");
      out.write("				$('#amount').html('0');\r\n");
      out.write("				\r\n");
      out.write("			}else{\r\n");
      out.write("				$.each(data.paymentList, function(index, items) {\r\n");
      out.write("					console.log(items.payPrice);\r\n");
      out.write("					var payQty = items.payQty*1;\r\n");
      out.write("					var payPrice = items.payPrice*1;\r\n");
      out.write("					var payRate = items.payRate*1;\r\n");
      out.write("					\r\n");
      out.write("					paidTotal += payQty*payPrice*(1-payRate/100);\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				//paidTotal = paidTotal.toLocaleString(); ????????? , ???????????? ???????????? ???????????????\r\n");
      out.write("				$('#amount').html(paidTotal);\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: '/milkyWayForest/mypage/getMypageRating',\r\n");
      out.write("				type: 'post',\r\n");
      out.write("				data: {'id' : $('#id').val()},\r\n");
      out.write("				success: function(data){\r\n");
      out.write("					console.log(JSON.stringify(data));\r\n");
      out.write("					\r\n");
      out.write("					$('.txt_grade').html(data.memberGrade);	\r\n");
      out.write("					$('#contentTxt').html(data.gradeBenefit);\r\n");
      out.write("					\r\n");
      out.write("					if(data.memberGrade == 'welcome'){\r\n");
      out.write("						$('#memberRating1').html(' ?????? ????????? ?????? ?????? ??????');\r\n");
      out.write("						$('#memberRating').html('green');\r\n");
      out.write("						$('.purpose').html('?????? 7??????');\r\n");
      out.write("						document.getElementById('targetAmount').max = '70000';\r\n");
      out.write("						document.getElementById('targetAmount').value = paidTotal;\r\n");
      out.write("						$('#rmnngAmnt').html(remainingAmount+\" ??? ??????\");\r\n");
      out.write("						\r\n");
      out.write("					}else if(data.memberGrade == 'green'){\r\n");
      out.write("						$('#memberRating1').html(' ?????? ????????? ?????? ?????? ??????');\r\n");
      out.write("						$('#memberRating').html('gold');\r\n");
      out.write("						$('.purpose').html('?????? 15??????');\r\n");
      out.write("						document.getElementById('targetAmount').max = '150000';\r\n");
      out.write("						document.getElementById('targetAmount').value = paidTotal;\r\n");
      out.write("						$('#rmnngAmnt').html(remainingAmount1+\" ??? ??????\");\r\n");
      out.write("					}else if(data.memberGrade == 'gold'){\r\n");
      out.write("		/* 				$('#memberRating').html('gold');\r\n");
      out.write("						$('.purpose').html('?????? 15??????'); */\r\n");
      out.write("						document.getElementById('targetAmount').max = '150000';\r\n");
      out.write("						document.getElementById('targetAmount').value = paidTotal;\r\n");
      out.write("						$('#rmnngAmnt').html(remainingAmount1+\" ???\");\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("				},\r\n");
      out.write("				error: function(err){\r\n");
      out.write("					console.log(err);\r\n");
      out.write("				}\r\n");
      out.write("			});//getMypageRating\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err){\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});//getPaymentInfo\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</form>");
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
