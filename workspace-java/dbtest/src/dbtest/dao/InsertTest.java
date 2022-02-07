package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
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
			System.out.println("���� ����");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	public void insertArticle() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		System.out.print("���� �Է� : ");
		int age = scan.nextInt();
		System.out.print("Ű �Է� : ");
		double height = scan.nextDouble();
		
		try {
			this.getConnection(); //����
			
			String sql = "insert into dbtest values(?, ?, ?, sysdate)";
			pstmt = conn.prepareStatement(sql); //����
			//?�� ������ ����
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
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
	
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.insertArticle();
	}
}
