	package user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import user.bean.UserDTO;

public class UserDAOMybatis implements UserDAO {
	@Setter
	private SqlSession sqlSession;
	@Setter
	private static UserDAOMybatis instance = null;

//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}

	@Transactional
	@Override
	public void write(UserDTO userDTO) {
		sqlSession.insert("userSQL.write", userDTO);
	}
	
	@Transactional
	@Override
	public List<UserDTO> getUserList() {
		return sqlSession.selectList("userSQL.getUserList");
	}
	
	@Transactional
	@Override
	public UserDTO getUser(String id) {
		return sqlSession.selectOne("userSQL.getUser", id);
	}
	
	@Transactional
	@Override
	public void update(Map<String, String> map) {
		sqlSession.update("userSQL.update", map);
		
	}
	
	@Transactional
	@Override
	public void delete(String id) {
		sqlSession.delete("userSQL.delete", id);
	}
	
	@Transactional
	@Override
	public List<UserDTO> search(Map<String, String> map) {
		return sqlSession.selectList("userSQL.search", map);
	}

	
}
