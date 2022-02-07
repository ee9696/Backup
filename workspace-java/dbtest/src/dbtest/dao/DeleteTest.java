package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {
   private Connection conn=null;
   private PreparedStatement pstmt;
   
   private String driver = "oracle.jdbc.driver.OracleDriver";
   private String url = "jdbc:oracle:thin:@localhost:1521:xe";
   private String username = "c##java";
   private String password = "bit";
   
   public DeleteTest() {
      try {
         Class.forName(driver);
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }
   }
   
   public void getConnection() {
      try {
         conn = DriverManager.getConnection(url, username, password);
      }catch(SQLException e) {
         e.printStackTrace();
      }
   }
   
   public void updateArticle() {
      Scanner scan = new Scanner(System.in);
      System.out.print("������ ���ϴ� �̸� �Է� : ");
      String name = scan.next();
      
      //---------------
      String sql = "delete from dbtest where name = ?;";
      this.getConnection();//����
      
      try {
         pstmt = conn.prepareStatement(sql);//����
         pstmt.setString(1, name);
         
         int su = pstmt.executeUpdate();//����
         
         System.out.println(su+"���� ���� �����Ǿ����ϴ�");
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
    	  try {
    		  if(pstmt != null) pstmt.close();
    		  if(conn != null) conn.close();
    	  } catch (SQLException e) {
    		  e.printStackTrace();
    	  }
      }
   }

   public static void main(String[] args) {
      UpdateTest ut = new UpdateTest();
      ut.updateArticle();
   }
}