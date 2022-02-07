package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
	InsertTest it = new InsertTest();
	SelectTest st = new SelectTest();
	DeleteTest dt = new DeleteTest();
	Scanner scan = new Scanner(System.in);
	int num, code, num1;
	String name, value, name1;
	
	
	
	public void menu() {
		while(true) {
			System.out.println("************");
			System.out.println("   ��   ��   ");
			System.out.println("************");
			System.out.println("  1. �Է� ");
			System.out.println("  2. �˻� ");
			System.out.println("  3. ���� ");
			System.out.println("  4. ���� ");
			System.out.println("************");
			System.out.print(" ��ȣ���� : ");
			num = scan.nextInt();
			if(num==4) break;
			if(num==1) it.insertArticle();
			if(num==2) st.selectArticle();
			if(num==3) dt.deleteArticle();
		}
	}
	class InsertTest {
		
		
		private Connection conn=null;
		private PreparedStatement pstmt;
		
		private String driver = "oracle.jdbc.driver.OracleDriver";
		private String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private String username = "c##java";
		private String password = "bit";
		
		public InsertTest() {
			try {
				//driver loading
				Class.forName(driver); //���ϸ��� �ָ� Class���� �������ְڴ�
				System.out.println("����̹� �ε� ����");
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace(); //���� ������ ���
			}
		}
		

		public void getConnection() {
			try {
				conn = DriverManager.getConnection(url, username, password);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
			
		public void insertArticle() {
			while(true) {
			System.out.println("************");
			System.out.println("  1. �л� ");
			System.out.println("  2. ���� ");
			System.out.println("  3. ������ ");
			System.out.println("  4. �����޴� ");
			System.out.println("************");
			System.out.print(" ��ȣ���� : ");
			code = scan.nextInt();
			if(code==1) {
				System.out.print("�̸� �Է� : ");
				name = scan.next();
				System.out.print("�й� �Է� : ");
				value = scan.next();
				
			}if(code==2) {
				System.out.print("�̸� �Է� : ");
				name = scan.next();
				System.out.print("���� �Է� : ");
				value = scan.next();
				
			}if(code==3) {
				System.out.print("�̸� �Է� : ");
				name = scan.next();
				System.out.print("�μ� �Է� : ");
				value = scan.next();
				
			}if(code==4) {
				return;
			}
			
			
			try {
				this.getConnection(); //����
				
				String sql = "insert into student values(?, ?, ?)";
				pstmt = conn.prepareStatement(sql); //����
				//?�� ������ ����
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, code);
				
				int su = pstmt.executeUpdate(); //���� - ���� ����
				
				System.out.println(su+"���� ���� ����������ϴ�");
		
			}catch(SQLException e ) {
				e.printStackTrace();
			}finally {
				//������ �ְ� ���� ������ �����Ѵ�.
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
			}
		}
	}
	class SelectTest {
		private Connection conn=null;
		private PreparedStatement pstmt;
		private ResultSet rs;
		String sql ;
		   
		private String driver = "oracle.jdbc.driver.OracleDriver";
		private String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private String username = "c##java";
		private String password = "bit";
		
		
		public SelectTest() {
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
		
		public void selectArticle() {
			while(true) {
			System.out.println("************");
			System.out.println("  1. �̸� �˻� ");
			System.out.println("  2. ��ü �˻� ");
			System.out.println("  3. �����޴� ");
			System.out.println("************");
			System.out.print(" ��ȣ���� : ");
			num1 = scan.nextInt();
			if(num1 == 1) {
				System.out.print("�˻��� �̸� �Է� : ");
				name1= scan.next();
				 sql = "select * from student where name like ?";
			}if(num1 == 2) {
				 sql = "select * from student";
			}if(num1 == 3) {
				return;
			}
			
				getConnection();
			
			
				try {
					if(num1==1) {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, "%"+name1+"%");
						rs = pstmt.executeQuery();//����
									
					}					
					if(num1==2) {
						pstmt = conn.prepareStatement(sql);
						rs = pstmt.executeQuery();//����
					}
					while(rs.next()) {
						if(rs.getInt("code")==1)
						System.out.println("�̸� : " + rs.getString("name") + "\t"
										 + "�й� : " + rs.getString("value"));
						if(rs.getInt("code")==2)
						System.out.println("�̸� : " + rs.getString("name") + "\t"
										 + "���� : " + rs.getString("value"));
						if(rs.getInt("code")==3)
						System.out.println("�̸� : " + rs.getString("name") + "\t"
										 + "�μ� : " + rs.getString("value"));
					}
					
				}catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(rs != null) rs.close();
						if(pstmt != null) pstmt.close();
						if(conn != null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}		
				
	}
	class DeleteTest {
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
		   
		   public void deleteArticle() {
		      System.out.print("������ ���ϴ� �̸� �Է� : ");
		      String name = scan.next();
		      
		      //---------------
		      String sql = "delete from student where name = ?";
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
	}
			
	public static void main(String[] args) {
		Student student = new Student();
		student.menu();
		System.out.println("���α׷� �����մϴ�");
	} 
}		

/*
package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
   private Connection conn;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   private String driver = "oracle.jdbc.driver.OracleDriver";
   private String url = "jdbc:oracle:thin:@localhost:1521:xe";
   private String username = "c##java";
   private String password = "bit";
   
   Scanner scan = new Scanner(System.in);
   
   public Student() {
      try {
         Class.forName(driver);
      } catch (ClassNotFoundException e) {
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
   
   public void menu() {
      int num=0;
      
      while(true) {
         System.out.println();
         System.out.println("***************");
         System.out.println("   ����");
         System.out.println("***************");
         System.out.println("   1. �Է�");
         System.out.println("   2. �˻�");
         System.out.println("   3. ����");
         System.out.println("   4. ����");
         System.out.println("***************");
         System.out.print("��ȣ ���� : ");
         num = scan.nextInt();
         
         if(num==4) break;
         if(num==1) insertArticle();
         else if(num==2) selectArticle();
         else if(num==3) deleteArticle();
      }//while
   }//menu()

   private void deleteArticle() {
      System.out.print("���� �� �̸� �Է� : ");
      String name = scan.next();
      
      //DB
      String sql = "delete student where name=?";
      this.getConnection();
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         
         int su = pstmt.executeUpdate();
         System.out.println(su+"���� ���� �����Ǿ����ϴ�");
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null) pstmt.close();
            if(conn!=null) conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
   }
   }//deleteArticle()

   private void selectArticle() {
      int num;
      String name=null;
      
      while(true) {
         System.out.println();
         System.out.println("*************");
         System.out.println("1. �̸��˻�");
         System.out.println("2. ��ü�˻�");
         System.out.println("3. �����޴�");
         System.out.println("*************");
         System.out.print("��ȣ ���� : ");
         num = scan.nextInt();
         if(num==3) break;
         
         if(num==1) {
            System.out.print("�˻��� �̸� �Է� : ");
            name = scan.next();
         }
         
         //DB
         String sql=null;
         if(num==1) {
            sql = "select * from student where name like ?";
         }else if(num==2) {
            sql = "select * from student";
         }
         
         this.getConnection();
         
         try {
            pstmt = conn.prepareStatement(sql);
            if(num==1) pstmt.setString(1, "%"+name+"%");
            
            rs = pstmt.executeQuery();//����
            
            while(rs.next()) {
               System.out.print("�̸� = " + rs.getString("name")+"\t\t");
               if(rs.getInt("code") == 1)
                  System.out.println("�й� = " + rs.getString("value"));
               else if(rs.getInt("code") == 2)
                  System.out.println("���� = " + rs.getString("value"));
               else if(rs.getInt("code") == 3)
                  System.out.println("�μ� = " + rs.getString("value"));
            }//while
         } catch (SQLException e) {
            e.printStackTrace();
         }finally {
               try {
                     if(rs != null) rs.close();
                     if(pstmt != null) pstmt.close();
                     if(conn != null) conn.close();
                  } catch (SQLException e) {
                     e.printStackTrace();
                  }
               }
      }//while   
   }//selectArticle()

   public void insertArticle() {
      int num;
      String name;
      String value=null;
      int code=0;
      
      while(true) {
         System.out.println();
         System.out.println("****************");
         System.out.println("   1. �л�");
         System.out.println("   2. ����");
         System.out.println("   3. ������");
         System.out.println("   4. �����޴�");
         System.out.println("****************");
         System.out.print("��ȣ ���� : ");
         num = scan.nextInt();
         if(num==4) break;
         
         //������ �Է�
         System.out.print("�̸� �Է� : ");
         name = scan.next();
         if(num==1) {
            System.out.print("�й� �Է� : ");
            value = scan.next();
            code=1;
         }
         else if(num==2) {
            System.out.print("���� �Է� : ");
            value = scan.next();
            code=2;
         }
         else if(num==3) {
            System.out.print("�μ� �Է� : ");
            value = scan.next();
            code=3;
         }
         
         //DB
         String sql = "insert into student values(?, ?, ?)";
         this.getConnection();//����
         try {
            pstmt = conn.prepareStatement(sql); //����
            pstmt.setString(1, name);
            pstmt.setString(2, value);
            pstmt.setInt(3, code);
            
            int su = pstmt.executeUpdate();//����
            System.out.println(su+"���� ���� ����������ϴ�");
            
         } catch (SQLException e) {
            e.printStackTrace();
         }finally {
            try {
               if(pstmt!=null)pstmt.close();
               if(conn!=null)conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
      }//while
   }//insertArticle()

   public static void main(String[] args) {
      Student sd = new Student();
      sd.menu();
      System.out.println("���α׷��� �����մϴ�.");

   }

}
*/