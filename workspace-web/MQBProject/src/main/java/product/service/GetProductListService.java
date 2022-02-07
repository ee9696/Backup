package product.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.control.CommandProcess;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import product.bean.ProductDTO;
import product.dao.ProductDAO;

public class GetProductListService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
	

		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		ProductDAO productDAO = ProductDAO.getInstance();
		List<ProductDTO> list = productDAO.getProductList(map);
		
		//세션
		HttpSession session = request.getSession();
		String memId = (String)session.getAttribute("memId");
		
		
		//list -> JSON 변환
		JSONObject json = new JSONObject();
		if(list != null) {
			JSONArray array = new JSONArray();
			
			for(ProductDTO productDTO : list) {
				JSONObject temp = new JSONObject();
				temp.put("seq", productDTO.getSeq());
				temp.put("productImage", productDTO.getProductImage());
				temp.put("productName", productDTO.getProductName());
				temp.put("productUnit", productDTO.getProductUnit());
				temp.put("productQty", productDTO.getProductQty());
				temp.put("productTotal", productDTO.getProductTotal());
				temp.put("productRate", productDTO.getProductRate());
				temp.put("productDiscount", productDTO.getProductDiscount());
				temp.put("productPrice", productDTO.getProductPrice());
				
				array.add(temp);
			
			} //for
			
			json.put("list", array);
			
			//세션 -> JSON 변환
			json.put("memId", memId);
			
		}//if		
		
		request.setAttribute("list",  json);
		return "/imageboard/getImageboardList.jsp";
		
	}

}
