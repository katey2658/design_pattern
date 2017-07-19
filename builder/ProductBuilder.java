package com.busyzero.builder;

/**
 * 产品构建着
 * @author 11456
 *
 */
public class ProductBuilder implements Builder {
	
	private String productName;
	
	private float productPrice;
	
	private String productSource;
	
	public ProductBuilder(){
		this.productName="";
		this.productPrice=0.0f;
		this.productSource="";
	}
	
	public void setProductName(String productName){
		this.productName=productName;
	}
	
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductSource(String productSource) {
		this.productSource = productSource;
	}

	public Product create(){
		return new Product(this.productName,this.productPrice,this.productSource);
	}		
}
