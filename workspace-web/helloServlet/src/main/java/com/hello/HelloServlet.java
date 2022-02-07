package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloServlet") web.xml에 같은 내용이 있으니까 주석!
public class HelloServlet extends HttpServlet {
   //  extends HttpServlet : 결과를 콘솔창 아니고 웹에 표시한다.
   // 제일 먼저 찾는 것 : init 메소드(처음에 딱 한 번만 실행)
   private static final long serialVersionUID = 1L;
       
   @Override
   public void init() throws ServletException {
      System.out.println("실행하자마자 제일 먼저 호출되는 함수 - init");
      // system.out : 콘솔창에 찍어라      
   }
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      System.out.println("클라이언트 요청이 있을 때마다 실행된다 - service()");
      // 클라이언트 요청이 있을 때마다 호출되는 함수.
      
      response.setContentType("text/html"); // 이제부터 쓰는 내용은 html형식으로 인식해라!
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("</head>");
      out.println("<body>");
      out.println("Hello Servlet!!");
      out.println("</body>");
      out.println("</html>");
      
   }
   
   @Override
   public void destroy() {
      System.out.println("서블릿이 종료될 때 호출된다 - destroy()");
   }
}