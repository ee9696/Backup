package product.bean;

import lombok.Data;

@Data
public class ProductDTO {
	private int seq;
	private String productImage;
	private String productName;
	private int productUnit;
	private int productQty;
	private int productTotal;
	private int productRate;
	private int productDiscount;
	private int productPrice;
	
}
