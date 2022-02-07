package inven.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import inven.bean.InvenDTO;

public class InvenDAO {

	private Connection conn=null;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private DataSource ds;
	
	private static InvenDAO instance = null;
	
	public static InvenDAO getInstance() {
		if(instance == null) {
			synchronized (InvenDAO.class) {
				instance = new InvenDAO();
			}
		}
		
		return instance;
	}
	public InvenDAO() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public void write(InvenDTO invenDTO) {
		String sql = "insert into invenmember values(?,?,?,?,?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, invenDTO.getName());
			pstmt.setString(2, invenDTO.getId());
			pstmt.setString(3, invenDTO.getPwd());
			pstmt.setString(4, invenDTO.getEmail1());
			pstmt.setString(5, invenDTO.getEmail2());
			
			pstmt.executeUpdate();
		
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String login(String id, String pwd) {
		String name=null;
		String sql = "select * from invenmember where id=? and pwd=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) name = rs.getString("name");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return name;
	}
}
