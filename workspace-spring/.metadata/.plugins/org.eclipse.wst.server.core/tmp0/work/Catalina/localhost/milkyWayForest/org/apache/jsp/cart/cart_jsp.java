/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-15 06:21:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"/milkyWayForest/css/cart.css\">\r\n");
      out.write("<form id=\"cartForm\">\r\n");
      out.write("\r\n");
      out.write("	<legend>장바구니</legend>\r\n");
      out.write("	<br>\r\n");
      out.write("	<div id=\"cartBody\">\r\n");
      out.write("		<div id=\"cartTableDiv\">\r\n");
      out.write("			<ul id=\"cartNotice\">\r\n");
      out.write("				<li>장바구니 상품은 최대 30일간 저장됩니다.</li>\r\n");
      out.write("				<li>가격, 옵션 등 정보가 변경된 경우 주문이 불가할 수 있습니다.</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<br>\r\n");
      out.write("			\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<!-- <input type=\"hidden\" name=\"id\"  id=\"id\" value=\"yun\"> -->\r\n");
      out.write("			<input type=\"hidden\" id=\"newSavedMoney\" name=\"newSavedMoney\">\r\n");
      out.write("			\r\n");
      out.write("			<table id=\"cartTable\" class=\"table\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th width=\"50\"><input type=\"checkbox\" class=\"cartProductCheck\"></th>\r\n");
      out.write("					<th width=\"500\" colspan=\"2\" style=\"padding-right: 40px;\">상품정보</th>\r\n");
      out.write("					<th style=\"text-align: left;\">구매수량</th>\r\n");
      out.write("					<th>옵션</th>\r\n");
      out.write("					<th width=\"200\">상품금액</th>\r\n");
      out.write("					\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<input type=\"button\" id=\"cartAllDeleteBtn\" class=\"btn btn-outline-secondary\" value=\"전체상품 삭제\">\r\n");
      out.write("			<input type=\"submit\" id=\"cartSelectDeleteBtn\" class=\"btn btn-outline-secondary\" value=\"선택상품 삭제\">\r\n");
      out.write("			<input type=\"button\" id=\"cartSelectOrderBtn\" class=\"btn btn-outline-success\" value=\"선택상품 주문\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"cartTotalDiv\" class=\"cartTotal\">\r\n");
      out.write("			<div id=\"cartOrderDetail\">\r\n");
      out.write("				<!-- 상품금액, 할인예상금액, 배송비 -->\r\n");
      out.write("				총 상품금액 <span id=\"totalProductPrice\"></span><br>\r\n");
      out.write("				총 할인금액 <span id=\"totalSalePrice\"></span><br>\r\n");
      out.write("				배송비 <span id=\"shipPay\"></span>\r\n");
      out.write("					<input type=\"hidden\" id=\"shipPay1\" name=\"shipPay\"><br>\r\n");
      out.write("			\r\n");
      out.write("			</div> <!-- cartOrderDetail -->\r\n");
      out.write("			<div id=\"cartOrderTotal\"> \r\n");
      out.write("			\r\n");
      out.write("				<p>결제예상금액<span id=\"totalPayPrice\"></span></p>\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("				<input type=\"button\" id=\"cartAllOrderBtn\" class=\"btn\" value=\"전체상품 주문하기\">\r\n");
      out.write("				<input type=\"button\" id=\"shoppingBtn\" class=\"btn\" value=\"계속 쇼핑하기\"><br>\r\n");
      out.write("			\r\n");
      out.write("		</div> <!-- cartTotalDiv -->\r\n");
      out.write("	</div>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: '/milkyWayForest/cart/cartSelect',\r\n");
      out.write("		type: 'post',\r\n");
      out.write("		\r\n");
      out.write("		dataType: 'json',\r\n");
      out.write("		success: function(data) {\r\n");
      out.write("			//alert(\"떠라.\"); \r\n");
      out.write("			console.log(JSON.stringify(data)); \r\n");
      out.write("			\r\n");
      out.write("			var totalPrice = 0;\r\n");
      out.write("			var totalSalePrice = 0;\r\n");
      out.write("			var allPrice = 0;\r\n");
      out.write("			\r\n");
      out.write("			if(data.length == 0) {\r\n");
      out.write("				$('<tr>').append($('<td>',{\r\n");
      out.write("					colspan: '6',\r\n");
      out.write("					text: '장바구니가 비어있습니다! 상품을 담아주세요.',\r\n");
      out.write("					align: 'center',\r\n");
      out.write("					style: 'font-size:14px; padding: 57px;'\r\n");
      out.write("				})).appendTo($('#cartTable'));\r\n");
      out.write("				$('<tr>').append($('<td>',{\r\n");
      out.write("					colspan: '6',\r\n");
      out.write("					html:'&emsp;'\r\n");
      out.write("				})).appendTo($('#cartTable'));\r\n");
      out.write("			}\r\n");
      out.write("			 \r\n");
      out.write("			 $.each(data, function(index,items){\r\n");
      out.write("				 $('<tr>').append($('<td>',{ \r\n");
      out.write("					 class: 'checkboxGroup',\r\n");
      out.write("					 align: 'center'\r\n");
      out.write("				})\r\n");
      out.write("				.append($('<input>', {\r\n");
      out.write("					type:'checkbox',\r\n");
      out.write("					name: 'check',\r\n");
      out.write("					class: 'check',\r\n");
      out.write("					value: items.cartCode\r\n");
      out.write("					\r\n");
      out.write("				}))).append($('<td>', {\r\n");
      out.write("					style: 'width: 70px; padding: 0 10px 0 30px;'\r\n");
      out.write("				}).append($('<img>',{\r\n");
      out.write("					src: '/milkyWayForest/productImage/'+items.productImageName,\r\n");
      out.write("					style: 'height: 70px; margin: 0;'\r\n");
      out.write("				}))).append($('<td>' , {\r\n");
      out.write("					text: items.productName \r\n");
      out.write("				\r\n");
      out.write("				})).append($('<td>' \r\n");
      out.write("				\r\n");
      out.write("					).append($('<div>' , {\r\n");
      out.write("						class: 'length',\r\n");
      out.write("						style: 'position: relative; border: 1px solid  #ccc; width: 70px; height: 32px;'\r\n");
      out.write("						\r\n");
      out.write("					}) .append($('<input>', {\r\n");
      out.write("					\r\n");
      out.write("						type: 'text',\r\n");
      out.write("						value: items.cartQty,\r\n");
      out.write("						style: 'text-align:center; width: 47px; height: 29px; border: none; border-right:1px solid #c6c6c6;',\r\n");
      out.write("						id:'qty'+index\r\n");
      out.write("						\r\n");
      out.write("						})).append($('<a>', {\r\n");
      out.write("							id:'plus'+index\r\n");
      out.write("							\r\n");
      out.write("						})).append($('<a>' , {\r\n");
      out.write("							id:'minus'+index\r\n");
      out.write("						\r\n");
      out.write("				})))).append($('<td>', {\r\n");
      out.write("					text: items.cartOption,\r\n");
      out.write("					align: 'center'\r\n");
      out.write("					\r\n");
      out.write("				})).append($('<td>', {\r\n");
      out.write("					id: 'total'+index,\r\n");
      out.write("					text: (items.productUnit*items.cartQty).toLocaleString()+\" 원\",\r\n");
      out.write("					align: 'center'\r\n");
      out.write("					\r\n");
      out.write("				}))\r\n");
      out.write("				.appendTo($('#cartTable')); \r\n");
      out.write("			\r\n");
      out.write("			//수량디비(에이작스를 새로 만들기) 카트코드랑 상품수량 가져가서 수정해줘라\r\n");
      out.write("			$('#plus'+index).click(function(){  //인덱스를 안걸면 전체품목이 플러스가 되어버려서!\r\n");
      out.write("				$('#qty'+index).val(parseInt($('#qty'+index).val())+1); \r\n");
      out.write("				$('#total'+index).text(((items.productUnit)*parseInt($('#qty'+index).val())).toLocaleString()+\" 원\");\r\n");
      out.write("				$.ajax({\r\n");
      out.write("			 		url: '/milkyWayForest/cart/cartQty',\r\n");
      out.write("			 		type: 'post',\r\n");
      out.write("					data:  'cartCode='+items.cartCode+'&cartQty='+$('#qty'+index).val(),  //주소  'cartCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' 이러면 문자열로 넘어가버림\r\n");
      out.write("						 \r\n");
      out.write("					success: function() {\r\n");
      out.write("						//alert(\"해보쟈\");\r\n");
      out.write("						\r\n");
      out.write("						//스티키 안에 채우기(위에 var 로 0 줌)\r\n");
      out.write("						   var totalProductPrice = items.productUnit*1*(1-items.productRate/100);  //itmes.productRate 가 안먹는듯\r\n");
      out.write("								totalPrice += items.productUnit*1;\r\n");
      out.write("								totalSalePrice += items.productUnit*1*items.productRate;  //itmes.productRate 가 안먹는듯\r\n");
      out.write("								allPrice += totalProductPrice;\r\n");
      out.write("\r\n");
      out.write("							$('#totalProductPrice').text(totalPrice.toLocaleString()+'원');\r\n");
      out.write("							$('#totalSalePrice').text(totalSalePrice.toLocaleString()+'원');\r\n");
      out.write("							\r\n");
      out.write("							$('#totalPayPrice').text(allPrice.toLocaleString()+'원'); \r\n");
      out.write("							\r\n");
      out.write("							var shipPay = 0;\r\n");
      out.write("\r\n");
      out.write("							$('#totalProductPrice').text(totalPrice.toLocaleString()+'원');\r\n");
      out.write("							$('#totalSalePrice').text(totalSalePrice.toLocaleString()+'원');\r\n");
      out.write("							if((totalPrice-totalSalePrice) >= 50000) {\r\n");
      out.write("								$('#shipPay').text('0원');\r\n");
      out.write("								shipPay=0;\r\n");
      out.write("							} else {\r\n");
      out.write("								$('#shipPay').text('2,500원')\r\n");
      out.write("								shipPay = 2500;\r\n");
      out.write("							}\r\n");
      out.write("								//alert(allPrice+\"   \"+ shipPay);\r\n");
      out.write("							allPrice += shipPay;\r\n");
      out.write("							$('#shipPay1').val(shipPay);\r\n");
      out.write("							$('#totalPayPrice').text(allPrice.toLocaleString()+'원');  \r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("					},\r\n");
      out.write("					\r\n");
      out.write("					error:function(err){\r\n");
      out.write("						console.log(err);\r\n");
      out.write("					}\r\n");
      out.write("			 		\r\n");
      out.write("			 	}); \r\n");
      out.write("				 \r\n");
      out.write("			});	//plus\r\n");
      out.write("				 \r\n");
      out.write("			$('#minus'+index).click(function(){\r\n");
      out.write("				\r\n");
      out.write("				$('#qty'+index).val(parseInt($('#qty'+index).val())-1);\r\n");
      out.write("				if($('#qty'+index).val() < 1) {\r\n");
      out.write("					$('#qty'+index).val(1);\r\n");
      out.write("				}else{\r\n");
      out.write("\r\n");
      out.write("					//스티키 안에 채우기(위에 var 로 0 줌)\r\n");
      out.write("					   var totalProductPrice = items.productUnit*(-1)*(1-items.productRate/100);  //itmes.productRate 가 안먹는듯\r\n");
      out.write("							totalPrice += items.productUnit*(-1);  //수량이 줄었으니까 -1을 해라. 밑에 Qty 로 이용해서 그 값에서 -1\r\n");
      out.write("							totalSalePrice += items.productUnit*(-1)*items.productRate;  //itmes.productRate 가 안먹는듯\r\n");
      out.write("							allPrice += totalProductPrice;\r\n");
      out.write("\r\n");
      out.write("						$('#totalProductPrice').text(totalPrice.toLocaleString()+'원');\r\n");
      out.write("						$('#totalSalePrice').text(totalSalePrice.toLocaleString()+'원');\r\n");
      out.write("						\r\n");
      out.write("						$('#totalPayPrice').text(allPrice.toLocaleString()+'원'); \r\n");
      out.write("					\r\n");
      out.write("				}\r\n");
      out.write("				$('#total'+index).text(((items.productUnit)*parseInt($('#qty'+index).val())).toLocaleString()+\" 원\");\r\n");
      out.write("				\r\n");
      out.write("				$.ajax({\r\n");
      out.write("			 		url: '/milkyWayForest/cart/cartQty',\r\n");
      out.write("			 		type: 'post',\r\n");
      out.write("					data:  'cartCode='+items.cartCode+'&cartQty='+$('#qty'+index).val(),  //주소  'cartCode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' 이러면 문자열로 넘어가버림\r\n");
      out.write("						 \r\n");
      out.write("					success: function() {\r\n");
      out.write("						//alert(\"해보쟈\");\r\n");
      out.write("						var shipPay = 0;\r\n");
      out.write("\r\n");
      out.write("						$('#totalProductPrice').text(totalPrice.toLocaleString()+'원');\r\n");
      out.write("						$('#totalSalePrice').text(totalSalePrice.toLocaleString()+'원');\r\n");
      out.write("						if((totalPrice-totalSalePrice) >= 50000) {\r\n");
      out.write("							$('#shipPay').text('0원');\r\n");
      out.write("							shipPay=0;\r\n");
      out.write("						} else {\r\n");
      out.write("							$('#shipPay').text('2,500원')\r\n");
      out.write("							shipPay = 2500;\r\n");
      out.write("						}\r\n");
      out.write("							//alert(allPrice+\"   \"+ shipPay);\r\n");
      out.write("						allPrice += shipPay;\r\n");
      out.write("						$('#shipPay1').val(shipPay);\r\n");
      out.write("						$('#totalPayPrice').text(allPrice.toLocaleString()+'원');  \r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("					},\r\n");
      out.write("					\r\n");
      out.write("					error:function(err){\r\n");
      out.write("						console.log(err);\r\n");
      out.write("					}\r\n");
      out.write("			 		\r\n");
      out.write("			 	}); \r\n");
      out.write("				 \r\n");
      out.write("			});	//minus \r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			$('input').prop('readonly', true); \r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("			//스티키 안에 채우기(위에 var 로 0 줌)\r\n");
      out.write("		   var totalProductPrice = items.productUnit*items.cartQty*(1-items.productRate/100);  //itmes.productRate 가 안먹는듯\r\n");
      out.write("				totalPrice += items.productUnit*items.cartQty;\r\n");
      out.write("				totalSalePrice += items.productUnit*items.cartQty*items.productRate;  //itmes.productRate 가 안먹는듯\r\n");
      out.write("				allPrice += totalProductPrice;\r\n");
      out.write(" \r\n");
      out.write("			\r\n");
      out.write("				\r\n");
      out.write("			});//each \r\n");
      out.write("			\r\n");
      out.write("			if(data.length != 0) {\r\n");
      out.write("				$('<tr>').append($('<td>',{\r\n");
      out.write("					colspan: '6',\r\n");
      out.write("					html: '&emsp;'\r\n");
      out.write("				})).appendTo($('#cartTable'));\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			 var shipPay = 0;\r\n");
      out.write("\r\n");
      out.write("				$('#totalProductPrice').text(totalPrice.toLocaleString()+'원');\r\n");
      out.write("				$('#totalSalePrice').text(totalSalePrice.toLocaleString()+'원');\r\n");
      out.write("				if((totalPrice-totalSalePrice) >= 50000) {\r\n");
      out.write("					$('#shipPay').text('0원');\r\n");
      out.write("					shipPay=0;\r\n");
      out.write("				} else {\r\n");
      out.write("					$('#shipPay').text('2,500원')\r\n");
      out.write("					shipPay = 2500;\r\n");
      out.write("				}\r\n");
      out.write("					//alert(allPrice+\"   \"+ shipPay);\r\n");
      out.write("				allPrice += shipPay;\r\n");
      out.write("				$('#shipPay1').val(shipPay);\r\n");
      out.write("				$('#totalPayPrice').text(allPrice.toLocaleString()+'원');  \r\n");
      out.write("				\r\n");
      out.write("			\r\n");
      out.write("		 /* (시도) 장바구니 배송비 문제.. X	 \r\n");
      out.write("			\r\n");
      out.write("			 $('#totalProductPrice').text(totalPrice.toLocaleString()+'원');\r\n");
      out.write("			 $('#totalSalePrice').text(totalSalePrice.toLocaleString()+'원');\r\n");
      out.write("			\r\n");
      out.write("			 $(document).on('click', '#plus'+index , function(){ \r\n");
      out.write("				 $('#qty'+index).val(parseInt($('#qty'+index).val())+1); \r\n");
      out.write("				 if((totalPrice-totalSalePrice) >= 50000) {\r\n");
      out.write("						$('#shipPay').text('0원');\r\n");
      out.write("						shipPay=0;\r\n");
      out.write("					} else {\r\n");
      out.write("						$('#shipPay').text('2,500원')\r\n");
      out.write("						shipPay = 2500;\r\n");
      out.write("					}\r\n");
      out.write("				 allPrice += shipPay;\r\n");
      out.write("					$('#shipPay1').val(shipPay);\r\n");
      out.write("					$('#totalPayPrice').text(allPrice.toLocaleString()+'원'); \r\n");
      out.write("				 \r\n");
      out.write("			 });\r\n");
      out.write("			 \r\n");
      out.write("			 \r\n");
      out.write("			\r\n");
      out.write("			$(document).on('click', '#minus'+index, function(){\r\n");
      out.write("				\r\n");
      out.write("				$('#qty'+index).val(parseInt($('#qty'+index).val())-1);\r\n");
      out.write("				if($('#qty'+index).val() < 1) {\r\n");
      out.write("					$('#qty'+index).val(1);\r\n");
      out.write("				}else{\r\n");
      out.write("					\r\n");
      out.write("					if((totalPrice-totalSalePrice) >= 50000) {\r\n");
      out.write("						$('#shipPay').text('0원');\r\n");
      out.write("						shipPay=0;\r\n");
      out.write("					} else {\r\n");
      out.write("						$('#shipPay').text('2,500원')\r\n");
      out.write("						shipPay = 2500;\r\n");
      out.write("					}\r\n");
      out.write("					allPrice += shipPay;\r\n");
      out.write("					$('#shipPay1').val(shipPay);\r\n");
      out.write("					$('#totalPayPrice').text(allPrice.toLocaleString()+'원'); \r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("			});   */\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		},\r\n");
      out.write("		\r\n");
      out.write("		error:function(err){\r\n");
      out.write("			console.log(err);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	});//cartSelect_ajax(장바구니로 오면 바로 데이터 뿌리기)\r\n");
      out.write("	\r\n");
      out.write("		//전체선택,해제\r\n");
      out.write("		$('.cartProductCheck').click(function(){\r\n");
      out.write("			if($('.cartProductCheck').prop(\"checked\")) {  //체\r\n");
      out.write("				$('.check').prop(\"checked\",true);\r\n");
      out.write("				\r\n");
      out.write("			}else{\r\n");
      out.write("				$('.check').prop(\"checked\", false);\r\n");
      out.write("				\r\n");
      out.write("			}	\r\n");
      out.write("		}); \r\n");
      out.write("	\r\n");
      out.write("		//선택해제시 맨위 체크박스 체크 해제\r\n");
      out.write("		$(document).on('click', '.check', function(){  //on은 나중에 들어오는 체크박스 때문에 그래서 온으로 써주는것.\r\n");
      out.write("			//alert(\"11\");\r\n");
      out.write("			\r\n");
      out.write("			if($('.check:checked').length < $('.check').length)  //체크박스가 선택해제인지 알아보는게 is, ! 부정하는것. 폴스가 오면 이프문이 거짓으로 인식하니까 그래서 느낌표로 바꾼것.\r\n");
      out.write("				$('.cartProductCheck').prop('checked',false); \r\n");
      out.write("			// 이프문에 조건은 트루가 되어야 수행을 하는데\r\n");
      out.write("			// 내가 체크박스를 체크해제 하면 조건이 false 가 되어버리는데 그러면 그 폴스가 된게 참이되어야만 if문 아래에 있는\r\n");
      out.write("			//$('.cartProductCheck').prop('checked',false);  문장을 수행할수 있음\r\n");
      out.write("			//그래서 이프문을 위와같이 참으로 만들고 그런 다음 .cartProductCheck 에 체크드를 해제하라 라는 문장이 완성됨\r\n");
      out.write("			\r\n");
      out.write("			if($('.check:checked').length == $('.check').length)\r\n");
      out.write("				$('.cartProductCheck').prop('checked', true);\r\n");
      out.write("		}); \r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		//전체상품 삭제\r\n");
      out.write("		$('#cartAllDeleteBtn').click(function(){		\r\n");
      out.write("		 	$.ajax({\r\n");
      out.write("		 		url: '/milkyWayForest/cart/cartAllDelete',\r\n");
      out.write("		 		type: 'post',\r\n");
      out.write("				\r\n");
      out.write("				success: function() {\r\n");
      out.write("					if(confirm(\"전체삭제 하시겠습니까?\")==true){\r\n");
      out.write("						location.href= \"/milkyWayForest/cart\";\r\n");
      out.write("						\r\n");
      out.write("					}else {\r\n");
      out.write("					\r\n");
      out.write("						return;\r\n");
      out.write("					}\r\n");
      out.write("				 	\r\n");
      out.write("				},\r\n");
      out.write("				\r\n");
      out.write("				error:function(err){\r\n");
      out.write("					console.log(err);\r\n");
      out.write("				}	\r\n");
      out.write("			});	 \r\n");
      out.write("		});	\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("		//선택삭제\r\n");
      out.write("		$('#cartSelectDeleteBtn').click(function(){\r\n");
      out.write("			$('#cartForm').submit(function(){  //폼.서브밋\r\n");
      out.write("				var count =$('.check:checked').length;\r\n");
      out.write("					//alert(count);\r\n");
      out.write("				\r\n");
      out.write("				if(count==0)\r\n");
      out.write("					alert('삭제 할 항목을 선택하세요');\r\n");
      out.write("				else { \r\n");
      out.write("					if(confirm('정말 삭제하시겠습니까?') ==true) {\r\n");
      out.write("						 $.ajax({\r\n");
      out.write("							url: '/milkyWayForest/cart/cartSelectDelete',\r\n");
      out.write("							type: 'post',\r\n");
      out.write("							data: $('#cartForm').serialize(),  //체크박스에서는 특징이 선택한애들만 네임값을 넘겨준다.대신이렇게 하려면 서브밋을 걸어야 한다 버튼은 안됨(서브밋의 특징!!)\r\n");
      out.write("							success: function() {\r\n");
      out.write("								alert(\"삭제되었습니다.\")\r\n");
      out.write("								console.log(JSON.stringify(data)); \r\n");
      out.write("							\r\n");
      out.write("							},\r\n");
      out.write("							error:function(err){\r\n");
      out.write("								console.log(err);\r\n");
      out.write("							}	\r\n");
      out.write("							\r\n");
      out.write("						});	  \r\n");
      out.write("					}else {\r\n");
      out.write("							\r\n");
      out.write("							return;\r\n");
      out.write("						}\r\n");
      out.write("					\r\n");
      out.write("					  }\r\n");
      out.write("				});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//계속쇼핑하기 버튼\r\n");
      out.write("		$('#cartForm #shoppingBtn').click(function(){\r\n");
      out.write("			location.href='/milkyWayForest/shopping';\r\n");
      out.write("			\r\n");
      out.write("		});	\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		// 전체상품 주문하기\r\n");
      out.write("		$('#cartAllOrderBtn').click(function(){\r\n");
      out.write("			$('.check').prop('checked', 'true');\r\n");
      out.write("			if($('.check:checked').length == 0) {\r\n");
      out.write("				alert('장바구니에 주문할 상품이 없습니다.');\r\n");
      out.write("			} else {\r\n");
      out.write("				$('.check').attr('name','cartCode');\r\n");
      out.write("				$('#cartForm').attr('action', '/milkyWayForest/payment').submit();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 선택상품 주문하기\r\n");
      out.write("		$('#cartSelectOrderBtn').click(function(){\r\n");
      out.write("			if($('.check:checked').length == 0) {\r\n");
      out.write("				alert('선택된 상품이 없습니다. 상품을 선택해주세요.');\r\n");
      out.write("			} else {\r\n");
      out.write("				$('.check').attr('name','cartCode');\r\n");
      out.write("				$('#cartForm').attr('action', '/milkyWayForest/payment').submit();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("});//큰 function\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
