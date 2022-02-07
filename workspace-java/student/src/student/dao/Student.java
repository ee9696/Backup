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
			System.out.println("   관   리   ");
			System.out.println("************");
			System.out.println("  1. 입력 ");
			System.out.println("  2. 검색 ");
			System.out.println("  3. 삭제 ");
			System.out.println("  4. 종료 ");
			System.out.println("************");
			System.out.print(" 번호선택 : ");
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
				Class.forName(driver); //파일명을 주면 Class으로 생성해주겠다
				System.out.println("드라이버 로딩 성공");
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace(); //에러 내용을 출력
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
			System.out.println("  1. 학생 ");
			System.out.println("  2. 교수 ");
			System.out.println("  3. 관리자 ");
			System.out.println("  4. 이전메뉴 ");
			System.out.println("************");
			System.out.print(" 번호선택 : ");
			code = scan.nextInt();
			if(code==1) {
				System.out.print("이름 입력 : ");
				name = scan.next();
				System.out.print("학번 입력 : ");
				value = scan.next();
				
			}if(code==2) {
				System.out.print("이름 입력 : ");
				name = scan.next();
				System.out.print("과목 입력 : ");
				value = scan.next();
				
			}if(code==3) {
				System.out.print("이름 입력 : ");
				name = scan.next();
				System.out.print("부서 입력 : ");
				value = scan.next();
				
			}if(code==4) {
				return;
			}
			
			
			try {
				this.getConnection(); //접속
				
				String sql = "insert into student values(?, ?, ?)";
				pstmt = conn.prepareStatement(sql); //생성
				//?에 데이터 매핑
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, code);
				
				int su = pstmt.executeUpdate(); //실행 - 개수 리턴
				
				System.out.println(su+"개의 행이 만들어졌습니다");
		
			}catch(SQLException e ) {
				e.printStackTrace();
			}finally {
				//에러가 있건 없건 무조건 실행한다.
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
			System.out.println("  1. 이름 검색 ");
			System.out.println("  2. 전체 검색 ");
			System.out.println("  3. 이전메뉴 ");
			System.out.println("************");
			System.out.print(" 번호선택 : ");
			num1 = scan.nextInt();
			if(num1 == 1) {
				System.out.print("검색할 이름 입력 : ");
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
						rs = pstmt.executeQuery();//실행
									
					}					
					if(num1==2) {
						pstmt = conn.prepareStatement(sql);
						rs = pstmt.executeQuery();//실행
					}
					while(rs.next()) {
						if(rs.getInt("code")==1)
						System.out.println("이름 : " + rs.getString("name") + "\t"
										 + "학번 : " + rs.getString("value"));
						if(rs.getInt("code")==2)
						System.out.println("이름 : " + rs.getString("name") + "\t"
										 + "과목 : " + rs.getString("value"));
						if(rs.getInt("code")==3)
						System.out.println("이름 : " + rs.getString("name") + "\t"
										 + "부서 : " + rs.getString("value"));
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
		      System.out.print("삭제를 원하는 이름 입력 : ");
		      String name = scan.next();
		      
		      //---------------
		      String sql = "delete from student where name = ?";
		      this.getConnection();//접속
		      
		      try {
		         pstmt = conn.prepareStatement(sql);//생성
		         pstmt.setString(1, name);
		         
		         int su = pstmt.executeUpdate();//실행
		         
		         System.out.println(su+"개의 행이 삭제되었습니다");
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
		System.out.println("프로그램 종료합니다");
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
         System.out.println("   관리");
         System.out.println("***************");
         System.out.println("   1. 입력");
         System.out.println("   2. 검색");
         System.out.println("   3. 삭제");
         System.out.println("   4. 종료");
         System.out.println("***************");
         System.out.print("번호 선택 : ");
         num = scan.nextInt();
         
         if(num==4) break;
         if(num==1) insertArticle();
         else if(num==2) selectArticle();
         else if(num==3) deleteArticle();
      }//while
   }//menu()

   private void deleteArticle() {
      System.out.print("삭제 할 이름 입력 : ");
      String name = scan.next();
      
      //DB
      String sql = "delete student where name=?";
      this.getConnection();
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         
         int su = pstmt.executeUpdate();
         System.out.println(su+"개의 행이 삭제되었습니다");
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
         System.out.println("1. 이름검색");
         System.out.println("2. 전체검색");
         System.out.println("3. 이전메뉴");
         System.out.println("*************");
         System.out.print("번호 선택 : ");
         num = scan.nextInt();
         if(num==3) break;
         
         if(num==1) {
            System.out.print("검색할 이름 입력 : ");
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
            
            rs = pstmt.executeQuery();//실행
            
            while(rs.next()) {
               System.out.print("이름 = " + rs.getString("name")+"\t\t");
               if(rs.getInt("code") == 1)
                  System.out.println("학번 = " + rs.getString("value"));
               else if(rs.getInt("code") == 2)
                  System.out.println("과목 = " + rs.getString("value"));
               else if(rs.getInt("code") == 3)
                  System.out.println("부서 = " + rs.getString("value"));
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
         System.out.println("   1. 학생");
         System.out.println("   2. 교수");
         System.out.println("   3. 관리자");
         System.out.println("   4. 이전메뉴");
         System.out.println("****************");
         System.out.print("번호 선택 : ");
         num = scan.nextInt();
         if(num==4) break;
         
         //데이터 입력
         System.out.print("이름 입력 : ");
         name = scan.next();
         if(num==1) {
            System.out.print("학번 입력 : ");
            value = scan.next();
            code=1;
         }
         else if(num==2) {
            System.out.print("과목 입력 : ");
            value = scan.next();
            code=2;
         }
         else if(num==3) {
            System.out.print("부서 입력 : ");
            value = scan.next();
            code=3;
         }
         
         //DB
         String sql = "insert into student values(?, ?, ?)";
         this.getConnection();//접속
         try {
            pstmt = conn.prepareStatement(sql); //생성
            pstmt.setString(1, name);
            pstmt.setString(2, value);
            pstmt.setInt(3, code);
            
            int su = pstmt.executeUpdate();//실행
            System.out.println(su+"개의 행이 만들어졌습니다");
            
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
      System.out.println("프로그램을 종료합니다.");

   }

}
*/