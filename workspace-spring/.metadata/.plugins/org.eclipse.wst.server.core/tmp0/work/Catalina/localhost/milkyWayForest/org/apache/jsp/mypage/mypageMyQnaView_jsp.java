/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 03:41:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypageMyQnaView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form id=\"mypageMyQnaView\">\r\n");
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
      out.write("	<input type=\"hidden\" id=\"qnaCode\" name=\"qnaCode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qnaCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" id=\"pg\" name=\"pg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"myQnaView-wrapper\" class=\"item\">\r\n");
      out.write("		<div id=\"myQnaView-state\">		\r\n");
      out.write("			<div id=\"qnaSubject\">\r\n");
      out.write("				<p id=\"qnaDate\"></p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"qnaContent\">\r\n");
      out.write("				<img id=\"qnaImage1\">\r\n");
      out.write("				<img id=\"qnaImage2\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"qnaComment\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"myQnaListBtnDiv\">\r\n");
      out.write("				<input type=\"button\" class=\"btn\" id=\"myQnaListBtn\" value=\"??????\">\r\n");
      out.write("				<input type=\"button\" class=\"btn\" id=\"updateBtn\" value=\"??????\">				\r\n");
      out.write("				<input type=\"button\" class=\"btn\" id=\"deleteBtn\" value=\"??????\">\r\n");
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
      out.write("$(function(){\r\n");
      out.write("	//????????? ????????????\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/mypage/getMyQnaView',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		data: 'qnaCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qnaCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			$('#mypageMyQnaView #qnaSubject').html(data.qnaSubject);\r\n");
      out.write("			$('<p>',{\r\n");
      out.write("				text: data.qnaDate,\r\n");
      out.write("				id: 'qnaDate'\r\n");
      out.write("			}).appendTo($('#mypageMyQnaView #qnaSubject'));\r\n");
      out.write("			$('#mypageMyQnaView #qnaContent').html(data.qnaContent);\r\n");
      out.write("			\r\n");
      out.write("			if(data.qnaImage1 != null) {\r\n");
      out.write("				$('<p>').append($('<img>',{\r\n");
      out.write("					src: '/milkyWayForest/storage/'+data.qnaImage1,\r\n");
      out.write("					alt: data.qnaImage1,\r\n");
      out.write("					width: '100%'\r\n");
      out.write("				})).appendTo($('#mypageMyQnaView #qnaContent'));\r\n");
      out.write("				\r\n");
      out.write("			}\r\n");
      out.write("			if(data.qnaImage2 != null) {\r\n");
      out.write("				$('<p>').append($('<img>',{\r\n");
      out.write("					src: '/milkyWayForest/storage/'+data.qnaImage2,\r\n");
      out.write("					alt: data.qnaImage2,\r\n");
      out.write("					width: '100%'\r\n");
      out.write("				})).appendTo($('#mypageMyQnaView #qnaContent'));\r\n");
      out.write("			}\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err) {\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	//?????? ????????????\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/mypage/getMyQnaComment',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		data: 'qnaCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qnaCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			\r\n");
      out.write("			$.each(data, function(index, items){\r\n");
      out.write("				$('#mypageMyQnaView #qnaComment').append($('<p>',{\r\n");
      out.write("					text: 'comments'\r\n");
      out.write("				})).append($('<p>',{\r\n");
      out.write("					class: 'commentContent'\r\n");
      out.write("				}).append($('<span>', {\r\n");
      out.write("					text: items.id,\r\n");
      out.write("					style: 'margin: 0 10px;'\r\n");
      out.write("				})).append($('<p>', {\r\n");
      out.write("					text: items.commentContent\r\n");
      out.write("				})));\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err) {\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$('#mypageMyQnaView #myQnaListBtn').click(function(){\r\n");
      out.write("		location.href='/milkyWayForest/mypage/mypageMyPost?pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$('#mypageMyQnaView #updateBtn').click(function(){\r\n");
      out.write("		location.href='/milkyWayForest/mypage/updateMyQnaViewForm?qnaCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qnaCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$('#mypageMyQnaView #deleteBtn').click(function(){\r\n");
      out.write("		if(confirm('?????????????????????????')){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: '/milkyWayForest/mypage/deleteMyQnaView?qnaCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qnaCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("				type: 'get',\r\n");
      out.write("				success: function(data) {\r\n");
      out.write("					alert('?????? ?????????????????????.');\r\n");
      out.write("					location.href='/milkyWayForest/mypage/mypageMyPost?pg=1';\r\n");
      out.write("				},\r\n");
      out.write("				error: function(err) {\r\n");
      out.write("					console.log(err);\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
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
