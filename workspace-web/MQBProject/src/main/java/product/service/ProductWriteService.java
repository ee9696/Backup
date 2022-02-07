package product.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import product.bean.ProductDTO;
import product.dao.ProductDAO;

public class ProductWriteService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//실제폴더
		String realFolder = request.getServletContext().getRealPath("/storage");
		System.out.println(realFolder);
		
		//업로드
		MultipartRequest multi = new MultipartRequest(request
													, realFolder
													, 5*1024*1024 //5MB, 최대용량
													, "UTF-8"
													, new DefaultFileRenamePolicy());  //같은 파일이 들어올때 파일명 뒤에 1,2,3 .. 숫자가 붙는다
															
		//데이터
		String productImage = multi.getParameter("productImage");
		String productName = multi.getParameter("productName");
		int productUnit = Integer.parseInt(multi.getParameter("productUnit"));
		int productQty = Integer.parseInt(multi.getParameter("productQty"));
		int productTotal = Integer.parseInt(multi.getParameter("productTotal"));
		int productRate = Integer.parseInt(multi.getParameter("productRate"));
		int productDiscount = Integer.parseInt(multi.getParameter("productDiscount"));
		int productPrice = Integer.parseInt(multi.getParameter("productPrice"));

		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductImage(productImage);
		productDTO.setProductName(productName);
		productDTO.setProductUnit(productUnit);
		productDTO.setProductQty(productQty);
		productDTO.setProductTotal(productTotal);
		productDTO.setProductRate(productRate);
		productDTO.setProductDiscount(productDiscount);
		productDTO.setProductPrice(productPrice);
		
		//DB
		ProductDAO productDAO = ProductDAO.getInstance();
		ProductDAO.productWrite(productDTO);
		
		//응답
		request.setAttribute("display", "/product/productWrite.jsp");
		return "/index.jsp";

	}

}