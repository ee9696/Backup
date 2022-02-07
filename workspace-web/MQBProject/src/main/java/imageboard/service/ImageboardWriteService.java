package imageboard.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import imageboard.bean.ImageboardDTO;
import imageboard.dao.ImageboardDAO;

public class ImageboardWriteService implements CommandProcess {

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
		String imageId = multi.getParameter("imageId");
		String imageName = multi.getParameter("imageName");
		int imagePrice = Integer.parseInt(multi.getParameter("imagePrice"));
		int imageQty = Integer.parseInt(multi.getParameter("imageQty"));
		String imageContent = multi.getParameter("imageContent");
		String image1 = multi.getOriginalFileName("image1");  //원래이름
		//String image1 = multi.getFilesystemName("image1");  //변경된 이름
		
		ImageboardDTO imageboardDTO = new ImageboardDTO();
		imageboardDTO.setImageId(imageId);
		imageboardDTO.setImageName(imageName);
		imageboardDTO.setImagePrice(imagePrice);
		imageboardDTO.setImageQty(imageQty);
		imageboardDTO.setImageContent(imageContent);
		imageboardDTO.setImage1(image1); //파일명
		
		//DB
		ImageboardDAO imageboardDAO = ImageboardDAO.getInstance();
		ImageboardDAO.imageboardWrite(imageboardDTO);
		
		//응답
		request.setAttribute("display", "/imageboard/imageboardWrite.jsp");
		return "/index.jsp";

	}

}


