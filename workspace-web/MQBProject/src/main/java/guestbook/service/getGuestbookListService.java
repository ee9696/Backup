package guestbook.service;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

import guestbook.bean.GuestbookDTO;
import guestbook.dao.GuestbookDAO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class getGuestbookListService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		//데이터
		int pg = Integer.parseInt(request.getParameter("pg"));
		
		//DB 1페이지당 3개씩
		
		int endNum = pg * 3;
		int startNum = endNum -2;
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
		
		GuestbookDAO guestbookDAO = GuestbookDAO.getInstance();
		List<GuestbookDTO> list = guestbookDAO.getGuestBookList(map);
		
		JSONObject json = new JSONObject();
			if(list != null) {
				JSONArray array = new JSONArray();
				
				for(GuestbookDTO guestbookDTO : list) {
					JSONObject temp = new JSONObject();
					temp.put("seq", guestbookDTO.getSeq());
					temp.put("name", guestbookDTO.getName());
					temp.put("email", guestbookDTO.getEmail());
					temp.put("subject", guestbookDTO.getSubject());
					temp.put("content",  guestbookDTO.getContent());
					temp.put("logtime", sdf.format(guestbookDTO.getLogtime()));
					
					array.add(temp);
				}
				
				json.put("list", array);
			}
			
			request.setAttribute("list", json);
			return "/guestbook/getGuestbookList.jsp";

	}
}
