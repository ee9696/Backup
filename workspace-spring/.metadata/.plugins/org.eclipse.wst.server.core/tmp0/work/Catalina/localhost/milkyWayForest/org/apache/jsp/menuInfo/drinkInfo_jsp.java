/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-01-09 21:49:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.menuInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class drinkInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/milkyWayForest/css/menuInfo.css\">\r\n");
      out.write("\r\n");
      out.write("<form id=\"drinkInfoForm\" name=\"drinkInfoForm\">\r\n");
      out.write("	<h1>음료</h1>\r\n");
      out.write("		\r\n");
      out.write("			<div id=\"drinkInfoNav\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<a href=\"/milkyWayForest\"><img src=\"/milkyWayForest/image/icon_home.png\" alt=\"홈\"></a> > \r\n");
      out.write("					<a href=\"/milkyWayForest/menuInfo\">Menu</a> > \r\n");
      out.write("					<a href=\"\">음료</a>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("			<div id =\"drinkInfoMenu\">\r\n");
      out.write("				<div id =\"drinkInfoMenuSubject\">음료</div>\r\n");
      out.write("				<ul>\r\n");
      out.write("		            <li>\r\n");
      out.write("						<a href=\"/milkyWayForest/menuInfo/menuInfo?category=차&menuCode=T&pg=1\">차</a>&nbsp; &nbsp;\r\n");
      out.write("		         	    <a href=\"/milkyWayForest/menuInfo/menuInfo?category=커피&menuCode=C&pg=1\">커피</a>&nbsp; &nbsp;\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		<div id=\"teaInfoMenuDiv\">차</div>\r\n");
      out.write("		<div id=\"teaMenuDiv\"></div>\r\n");
      out.write("		<br><br><br>\r\n");
      out.write("		\r\n");
      out.write("		<div id=\"coffeeInfoMenuDiv\">커피</div>\r\n");
      out.write("		<div id=\"coffeeMenuDiv\"></div>\r\n");
      out.write("		<br><br><br>\r\n");
      out.write("	\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/menuInfo/getTea',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			//alert(JSON.stringify(data));\r\n");
      out.write("			\r\n");
      out.write("			$.each(data, function(index, items) {\r\n");
      out.write("				\r\n");
      out.write("				$('<div>').append($('<a>',{\r\n");
      out.write("					href: '/milkyWayForest/menuInfo/menuDetail?category=음료&menuCode='+items.menuCode\r\n");
      out.write("				}).append($('<div>',{\r\n");
      out.write("					width: '70%',\r\n");
      out.write("					height: '300px',\r\n");
      out.write("					style: 'cursor: pointer; overflow:hidden;',\r\n");
      out.write("					position: 'relative'\r\n");
      out.write("				}).append($('<img>',{\r\n");
      out.write("					src: items.menuImg,\r\n");
      out.write("					position: 'absolute',\r\n");
      out.write("					width: '100%',\r\n");
      out.write("					height: '100%',\r\n");
      out.write("					class: 'imgClick'\r\n");
      out.write("				}).append($('<input>',{\r\n");
      out.write("					type: 'hidden',\r\n");
      out.write("					id: 'menuCode'+index,\r\n");
      out.write("					value: items.menuCode\r\n");
      out.write("				}))))).append($('<div>',{\r\n");
      out.write("					width: '50%',\r\n");
      out.write("					align: 'center',\r\n");
      out.write("					style : 'padding-bottom: 10px; margin-top: 15px; color: black; border-bottom: 1px solid gainsboro; font-size: 15px;',\r\n");
      out.write("					text: items.menuName\r\n");
      out.write("				})).append($('<div>',{\r\n");
      out.write("					text: items.menuEngName,\r\n");
      out.write("					align: 'center',\r\n");
      out.write("					style: 'margin: 5px 5px 40px 5px; color: #999; font-size: 9pt'\r\n");
      out.write("				})).appendTo($('#teaMenuDiv'));\r\n");
      out.write("			});\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err) {\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	}); // 음료 온로드\r\n");
      out.write("	\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/menuInfo/getCoffee',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			//alert(JSON.stringify(data));\r\n");
      out.write("			$.each(data, function(index, items) {\r\n");
      out.write("				$('<div>').append($('<a>',{\r\n");
      out.write("					href: '/milkyWayForest/menuInfo/menuDetail?category=음료&menuCode='+items.menuCode\r\n");
      out.write("				}).append($('<div>',{\r\n");
      out.write("					width: '70%',\r\n");
      out.write("					height: '300px',\r\n");
      out.write("					style: 'cursor: pointer; overflow:hidden;',\r\n");
      out.write("					position: 'relative'\r\n");
      out.write("				}).append($('<img>',{\r\n");
      out.write("					src: items.menuImg,\r\n");
      out.write("					position: 'absolute',\r\n");
      out.write("					width: '100%',\r\n");
      out.write("					height: '100%',\r\n");
      out.write("					class: 'imgClick'\r\n");
      out.write("				}).append($('<input>',{\r\n");
      out.write("					type: 'hidden',\r\n");
      out.write("					id: 'menuCode'+index,\r\n");
      out.write("					value: items.menuCode\r\n");
      out.write("				}))))).append($('<div>',{\r\n");
      out.write("					width: '50%',\r\n");
      out.write("					align: 'center',\r\n");
      out.write("					style : 'padding-bottom: 10px; margin-top: 15px; color: black; border-bottom: 1px solid gainsboro; font-size: 15px;',\r\n");
      out.write("					text: items.menuName\r\n");
      out.write("				})).append($('<div>',{\r\n");
      out.write("					text: items.menuEngName,\r\n");
      out.write("					align: 'center',\r\n");
      out.write("					style: 'margin: 5px 5px 40px 5px; color: #999; font-size: 9pt'\r\n");
      out.write("				})).appendTo($('#coffeeMenuDiv'));\r\n");
      out.write("			});\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err) {\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("})\r\n");
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
