/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 07:21:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypageOrderCancel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/css/mypage.css\">\r\n");
      out.write("\r\n");
      out.write("<form id=\"myOrderCancel\">\r\n");
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
      out.write("	<input type=\"hidden\" id=\"paymentCode\" name=\"paymentCode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paymentCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" id=\"request\" name=\"request\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"myOrderCancel-wrapper\" class=\"item\">\r\n");
      out.write("		<div id=\"myOrderView1\">\r\n");
      out.write("			<div class=\"navbar navbar-light\">\r\n");
      out.write("				<span class=\"mb-0\">?????? ????????????</span>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<table class=\"table\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>????????????</td>\r\n");
      out.write("						<td id=\"payDate\"></td>\r\n");
      out.write("						<td>????????????</td>\r\n");
      out.write("						<td id=\"paymentCode\"></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<table class=\"table\" id=\"productInfoTable\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th scope=\"col\">????????????</th>\r\n");
      out.write("						<th scope=\"col\">????????????</th>\r\n");
      out.write("						<th scope=\"col\" width=\"200px;\">????????????</th>\r\n");
      out.write("						<th scope=\"col\">????????????(??????)</th>\r\n");
      out.write("						<th scope=\"col\">?????????</th>\r\n");
      out.write("						<th scope=\"col\">????????????</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("		<table id=\"myOrderCancelTable\" class=\"table\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>??????/??????/?????? ??????</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<select id=\"reason\" name=\"reason\">\r\n");
      out.write("						<option>?????? ??????</option>\r\n");
      out.write("						<option value=\"??????????????????\">??????????????????</option>\r\n");
      out.write("						<option value=\"?????? ??? ????????? ??????\">?????? ??? ????????? ??????</option>\r\n");
      out.write("						<option value=\"?????? ?????? ?????? ??????\">?????? ?????? ?????? ??????</option>\r\n");
      out.write("						<option value=\"????????? ??? ?????? ?????????\">????????? ??? ?????? ?????????</option>\r\n");
      out.write("						<option value=\"?????? ??????\">?????? ??????</option>\r\n");
      out.write("						<option value=\"?????? ??????\">?????? ??????</option>\r\n");
      out.write("						<option value=\"?????? ??????\">?????? ??????</option>\r\n");
      out.write("						<option value=\"?????? ??????\">?????? ??????</option>\r\n");
      out.write("						<option value=\"?????? ?????? ??????\">?????? ?????? ??????</option>\r\n");
      out.write("						<option value=\"?????????\">?????????</option>\r\n");
      out.write("						<option value=\"?????? ?????? ?????? ????????? ?????? ??????\">?????? ?????? ?????? ????????? ?????? ??????</option>\r\n");
      out.write("						<option value=\"???????????? ???????????? ?????? ????????????\">???????????? ???????????? ?????? ????????????</option>\r\n");
      out.write("					</select>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>????????????</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<textarea id=\"detailReason\" name=\"detailReason\" rows=\"17\"></textarea>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td></td>\r\n");
      out.write("				<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<div id=\"myOrderCancelBtnDiv\" align=\"center\">\r\n");
      out.write("			<input type=\"button\" value=\" ?????? \" id=\"myOrderCancelBtn\" class=\"btn\">\r\n");
      out.write("			<input type=\"button\" value=\" ?????? \" id=\"cancelBtn\" onclick=\"history.back()\" class=\"btn\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("</div><!-- main-wrapper -->\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/milkyWayForest/js/mypage.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("	//???????????? ????????????\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/mypage/getMyOrderInfo?paymentCode='+$('#paymentCode').val(),\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		success: function(data){\r\n");
      out.write("			console.log(JSON.stringify(data));\r\n");
      out.write("			if(data.paymentList != ''){\r\n");
      out.write("				$.each(data.paymentList, function(index, items) {\r\n");
      out.write("					$('#myOrderView1 #payDate').html(items.payDate);\r\n");
      out.write("					$('#myOrderView1 #paymentCode').html(items.paymentCode);\r\n");
      out.write("\r\n");
      out.write("					$('<tr>').append($('<td>',{\r\n");
      out.write("						text: items.productCode\r\n");
      out.write("					})).append($('<td>',{}).append($('<img>',{\r\n");
      out.write("						id: 'productImageName'+index,\r\n");
      out.write("						src: '/milkyWayForest/productImage/'+items.productImageName,\r\n");
      out.write("						width: '100px',\r\n");
      out.write("						heigiht: '100px'\r\n");
      out.write("					}))).append($('<td>',{\r\n");
      out.write("						text: items.productName\r\n");
      out.write("					})).append($('<td>',{\r\n");
      out.write("						text: items.payPrice+' ('+items.payQty+'???)'\r\n");
      out.write("					})).append($('<td>',{\r\n");
      out.write("						text: items.shipPay\r\n");
      out.write("					})).append($('<td>',{\r\n");
      out.write("						text: items.deliveryInfo\r\n");
      out.write("					})).appendTo($('#productInfoTable'));\r\n");
      out.write("					\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				$('#productInfoTable').rowspan(4);\r\n");
      out.write("				$('#productInfoTable').rowspan(5);\r\n");
      out.write("				\r\n");
      out.write("			}	\r\n");
      out.write("\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err){\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$('#myOrderCancel #myOrderCancelBtn').click(function(){\r\n");
      out.write("	if($('#request').val()=='??????'){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: '/milkyWayForest/mypage/updateMyOrderCancel',\r\n");
      out.write("			type: 'post',\r\n");
      out.write("			data: $('#myOrderCancel').serialize(),\r\n");
      out.write("			success: function(data) {\r\n");
      out.write("				alert('???????????? ????????? ?????????????????????.');\r\n");
      out.write("				location.href='/milkyWayForest/mypage/mypageCancelList?pg=1';\r\n");
      out.write("			},\r\n");
      out.write("			error: function(err) {\r\n");
      out.write("				console.log(err);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	}else if($('#request').val()=='??????'){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: '/milkyWayForest/mypage/updateMyOrderExchange',\r\n");
      out.write("			type: 'post',\r\n");
      out.write("			data: $('#myOrderCancel').serialize(),\r\n");
      out.write("			success: function(data) {\r\n");
      out.write("				alert('???????????? ????????? ?????????????????????.');\r\n");
      out.write("				location.href='/milkyWayForest/mypage/mypageCancelList?pg=1';\r\n");
      out.write("			},\r\n");
      out.write("			error: function(err) {\r\n");
      out.write("				console.log(err);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	}else if($('#request').val()=='??????'){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: '/milkyWayForest/mypage/updateMyOrderReturn',\r\n");
      out.write("			type: 'post',\r\n");
      out.write("			data: $('#myOrderCancel').serialize(),\r\n");
      out.write("			success: function(data) {\r\n");
      out.write("				alert('???????????? ????????? ?????????????????????.');\r\n");
      out.write("				location.href='/milkyWayForest/mypage/mypageCancelList?pg=1';\r\n");
      out.write("			},\r\n");
      out.write("			error: function(err) {\r\n");
      out.write("				console.log(err);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$.fn.colspan = function(rowIdx) {\r\n");
      out.write("	return this.each(function(){\r\n");
      out.write("		\r\n");
      out.write("		var that;\r\n");
      out.write("		$('tr', this).filter(\":eq(\"+rowIdx+\")\").each(function(row) {\r\n");
      out.write("			$(this).find('th').filter(':visible').each(function(col) {\r\n");
      out.write("				if ($(this).html() == $(that).html()) {\r\n");
      out.write("					colspan = $(that).attr(\"colSpan\") || 1;\r\n");
      out.write("					colspan = Number(colspan)+1;\r\n");
      out.write("					\r\n");
      out.write("					$(that).attr(\"colSpan\",colspan);\r\n");
      out.write("					$(this).hide(); // .remove();\r\n");
      out.write("				} else {\r\n");
      out.write("					that = this;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				// set the that if not already set\r\n");
      out.write("				that = (that == null) ? this : that;\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("};\r\n");
      out.write("$.fn.rowspan = function(colIdx, isStats) {       \r\n");
      out.write("	return this.each(function(){      \r\n");
      out.write("		var that;     \r\n");
      out.write("		$('tr', this).each(function(row) {      \r\n");
      out.write("			$('td:eq('+colIdx+')', this).filter(':visible').each(function(col) {\r\n");
      out.write("				\r\n");
      out.write("				if ($(this).html() == $(that).html()\r\n");
      out.write("					&& (!isStats \r\n");
      out.write("							|| isStats && $(this).prev().html() == $(that).prev().html()\r\n");
      out.write("							)\r\n");
      out.write("					) {            \r\n");
      out.write("					rowspan = $(that).attr(\"rowspan\") || 1;\r\n");
      out.write("					rowspan = Number(rowspan)+1;\r\n");
      out.write("\r\n");
      out.write("					$(that).attr(\"rowspan\",rowspan);\r\n");
      out.write("					\r\n");
      out.write("					// do your action for the colspan cell here            \r\n");
      out.write("					$(this).hide();\r\n");
      out.write("					\r\n");
      out.write("					//$(this).remove(); \r\n");
      out.write("					// do your action for the old cell here\r\n");
      out.write("					\r\n");
      out.write("				} else {            \r\n");
      out.write("					that = this;         \r\n");
      out.write("				}          \r\n");
      out.write("				\r\n");
      out.write("				// set the that if not already set\r\n");
      out.write("				that = (that == null) ? this : that;      \r\n");
      out.write("			});     \r\n");
      out.write("		});    \r\n");
      out.write("	});  \r\n");
      out.write("}; \r\n");
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
