package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserDeleteService implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 아이디 입력 : ");
		String id = scan.next();
		
		UserDTO userDTO = userDAO.getUser(id);
		
		//Map<String, String> map = new HashMap<String, String>();
		//map.put("id", id);
		//UserDTO userDTO = userDAO.getUser(map);
		
		if(userDTO == null) {
			System.out.println("수정할 아이디가 없습니다");
			return;
		}
		
		userDAO.delete(id);
		System.out.println("데이터를 DB에서 삭제하였습니다");
	}

}
