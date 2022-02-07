package user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;
import user.dao.UserDAOMybatis;

public class UserSearchService implements UserService {
	@Setter
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 1.이름 입력");
		System.out.println(" 2.아이디 입력");
		System.out.print(" 번호 입력 : ");
		int num = scan.nextInt();
		
		String columnName = null;
		String value = null;
		
		if(num==1) {
			System.out.print("이름 입력 : ");
			value = scan.next();
			columnName = "name";
			
		}else if(num==2) {
			System.out.print("아이디 입력 : ");
			value = scan.next();
			columnName = "id";
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("columnName", columnName);
		map.put("value", value);
		
		//UserDAO userDAO = UserDAOMybatis.getInstance();
		List<UserDTO> list = userDAO.search(map);
		
		for(UserDTO userDTO : list) {
			System.out.println(userDTO.getName()+"\t"+userDTO.getId()+"\t"+userDTO.getPwd());
		}
	}

}
