/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 05:21:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypageShpMngModifyForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/css/mypage.css\">\r\n");
      out.write("\r\n");
      out.write("<form id=\"mypageShpMngModifyForm\" action=\"/milkyWayForest/mypage/mypageShpMngWrite\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"shipCode\" id=\"shipCode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.shipCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	<div id=\"myBasicInfo-wrapper\" class=\"item\">\r\n");
      out.write("		<div id=\"myBasicInfo-title\" class=\"navbar navbar-light\"style=\"text-align: center\">\r\n");
      out.write("			<span class=\"mb-0\" style=\"text-align: center\">배송지 관리</span>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div id=\"myBasicInfo-state\" style=\"padding-top:40px;padding-left:50px;padding-right:50px;\">		\r\n");
      out.write("			<table>\r\n");
      out.write("				<tbody>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td id=\"shipNicknameLabel\" style=\"width:90px; padding-bottom:20px;\">배송지명</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div style=\"padding-bottom:20px;\"><input type=\"text\" id=\"shipNickname\" name=\"shipNickname\" class=\"form-control bg-white border\" style=\"width:170px;\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td style=\"padding-bottom:20px;\">수령인</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div style=\"padding-bottom:20px;\"><input type=\"text\" id=\"shipReceiver\" name=\"shipReceiver\" class=\"form-control bg-white border\" placeholder=\"150자 이내로 입력\" style=\"width:170px;\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td style=\"padding-bottom:20px;\">주소</td>\r\n");
      out.write("						<td style=\"padding-bottom:20px;\">\r\n");
      out.write("							<div id=\"dd\" class=\"input-group\" style=\"padding-bottom:10px;\">\r\n");
      out.write("								<input type=\"text\" id=\"shipZipcode\" name=\"shipZipcode\" class=\"form-control bg-white border\" size=\"5\" readonly>\r\n");
      out.write("								<input type=\"button\" class=\"btn\" value=\"주소검색\" id=\"zipcodeBtn\" onclick=\"sample6_execDaumPostcode()\" >\r\n");
      out.write("							</div>\r\n");
      out.write("							<div id=\"dd1\" class=\"input-group\"style=\"padding-bottom:10px;\">\r\n");
      out.write("								<input type=\"text\" id=\"shipAddr1\" name=\"shipAddr1\" class=\"form-control bg-white border\" readonly>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div id=\"dd2\" class=\"input-group\">\r\n");
      out.write("								<input type=\"text\" id=\"shipAddr2\" name=\"shipAddr2\" class=\"form-control bg-white border\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td style=\"padding-bottom:10px;\">연락처</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div id=\"tel-input-wrapper\" class=\"input-group mb-3\">\r\n");
      out.write("								<input type=\"text\" id=\"shipTel1\" name=\"shipTel1\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">-</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"text\" id=\"shipTel2\" name=\"shipTel2\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("								<div class=\"input-group-prepend\">\r\n");
      out.write("									<span class=\"input-group-text bg-white border-0\">-</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<input type=\"text\" id=\"shipTel3\" name=\"shipTel3\" class=\"form-control bg-white border rounded\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>기본배송지</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div style=\"padding-left:50px;\"><input type=\"checkbox\" name=\"baseShip\" value=\"1\">&nbsp;기본 배송지로 설정</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td colspan=\"2\" style=\"padding-top:20px;\">입력 / 수정하신 배송지는 배송 목록에 저장됩니다.</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("			<div id=\"result-div\"></div>\r\n");
      out.write("			\r\n");
      out.write("			<div align=\"center\" id=\"button-wrap\" style=\"padding-top:70px;\">\r\n");
      out.write("				<button type=\"button\" id=\"modifyCloseBtn\" class=\"btn\" onclick=\"javascript:window.close(); return false;\">닫기</button>\r\n");
      out.write("				<button type=\"button\" id=\"modifySaveBtn\" class=\"btn\">저장</button>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function sample6_execDaumPostcode() {\r\n");
      out.write("    new daum.Postcode({\r\n");
      out.write("        oncomplete: function(data) {\r\n");
      out.write("            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("            // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("            var addr = ''; // 주소 변수\r\n");
      out.write("            var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                addr = data.roadAddress;\r\n");
      out.write("            } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                addr = data.jibunAddress;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("           /*  // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("            if(data.userSelectedType === 'R'){\r\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                    extraAddr += data.bname;\r\n");
      out.write("                }\r\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                }\r\n");
      out.write("                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                if(extraAddr !== ''){\r\n");
      out.write("                    extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                }\r\n");
      out.write("                // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById(\"sample6_extraAddress\").value = extraAddr;\r\n");
      out.write("            \r\n");
      out.write("            } else {\r\n");
      out.write("                document.getElementById(\"sample6_extraAddress\").value = '';\r\n");
      out.write("            } */\r\n");
      out.write("\r\n");
      out.write("            // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("            document.getElementById('shipZipcode').value = data.zonecode;\r\n");
      out.write("            document.getElementById(\"shipAddr1\").value = addr;\r\n");
      out.write("            // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("            document.getElementById(\"shipAddr2\").focus();\r\n");
      out.write("        }\r\n");
      out.write("    }).open();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$('#mypageShpMngWriteForm #saveBtn').click(function(){\r\n");
      out.write("	\r\n");
      out.write("	var telForm = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;\r\n");
      out.write("	var tel1 = $('#mypageShpMngWriteForm #shipTel1').val();\r\n");
      out.write("	var tel2 = $('#mypageShpMngWriteForm #shipTel2').val();\r\n");
      out.write("	var tel3 = $('#mypageShpMngWriteForm #shipTel3').val();\r\n");
      out.write("	var tel = tel1 + \"-\" +  tel2 + \"-\" + tel3;\r\n");
      out.write("	\r\n");
      out.write("	if($('#mypageShpMngWriteForm #payShipReceiver').val() == ''){\r\n");
      out.write("		alert(\"수령인을 다시 입력해주세요.\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}else if($('#mypageShpMngWriteForm #zipcodeBtn').val() == ''){\r\n");
      out.write("		alert(\"우편번호를 다시 확인해주세요.\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}else if($('#mypageShpMngWriteForm #shipAddr2').val() == ''){\r\n");
      out.write("		alert(\"상세 주소를 입력해주세요\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}else if(!telForm.test(tel)){\r\n");
      out.write("		alert(\"연락처를 정확히 입력해주세요.\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}else{\r\n");
      out.write(" 		$.ajax({\r\n");
      out.write("			url:'/milkyWayForest/mypage/mypageShpMngWrite',\r\n");
      out.write("			type:'post',\r\n");
      out.write("			data:$('#mypageShpMngWriteForm').serialize(),\r\n");
      out.write("			success: function(){\r\n");
      out.write("\r\n");
      out.write("				alert('저장 되었습니다.');\r\n");
      out.write("				opener.parent.location.reload();\r\n");
      out.write("				window.close();\r\n");
      out.write("			},\r\n");
      out.write("			error:function(err){\r\n");
      out.write("				console.log(err);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	//$('#mypageShpMngWriteForm').submit();\r\n");
      out.write("	//alert(\"저장되었습니다\");\r\n");
      out.write("	//opener.parent.location.reload();\r\n");
      out.write("	//window.close(); \r\n");
      out.write("	}\r\n");
      out.write("});\r\n");
      out.write("$('#mypageShpMngModifyForm').ready(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url:'/milkyWayForest/mypage/getShpMngModify',\r\n");
      out.write("		type:'post',\r\n");
      out.write("		data:{'shipCode' : $('#mypageShpMngModifyForm #shipCode').val()},\r\n");
      out.write("		datatype:'json',\r\n");
      out.write("		success: function(data){\r\n");
      out.write("			console.log(JSON.stringify(data));\r\n");
      out.write("			\r\n");
      out.write("			if(data.shipNickname != null){\r\n");
      out.write("				$('#shipNickname').val(data.shipNickname);\r\n");
      out.write("			}\r\n");
      out.write("			if(data.shipReceiver != null){\r\n");
      out.write("				$('#shipReceiver').val(data.shipReceiver);\r\n");
      out.write("			}\r\n");
      out.write("			if(data.shipZipcode != null){\r\n");
      out.write("				$('#shipZipcode').val(data.shipZipcode);\r\n");
      out.write("				$('#shipAddr1').val(data.shipAddr1);\r\n");
      out.write("				$('#shipAddr2').val(data.shipAddr2);		\r\n");
      out.write("			}\r\n");
      out.write("			if(data.shipTel1 != null){\r\n");
      out.write("				$('#shipTel1').val(data.shipTel1);\r\n");
      out.write("				$('#shipTel2').val(data.shipTel2);\r\n");
      out.write("				$('#shipTel3').val(data.shipTel3);\r\n");
      out.write("			}\r\n");
      out.write("		},\r\n");
      out.write("		error:function(Err){\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$('#mypageShpMngModifyForm #modifySaveBtn').click(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/mypage/updateShpMng?shipCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shipCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("		type: 'get',\r\n");
      out.write("		data: $('#mypageShpMngModifyForm').serialize(),\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			alert('글이 수정되었습니다.');\r\n");
      out.write("			opener.parent.location.reload();\r\n");
      out.write("			window.close();\r\n");
      out.write("		},\r\n");
      out.write("		error: function(err) {\r\n");
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
