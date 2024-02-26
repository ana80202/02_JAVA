package edu.kh.shopping.model.dto;

import java.io.Serializable;

public class Shopping implements Serializable {

	private String product; //상품
	private String detail; //상품 설명
	private boolean wish; //찜하기
	
	//기본 생성자
	public Shopping(){}

	//매개변수생성자
	public Shopping(String product, String detail, boolean wish) {
		super();
		this.product = product;
		this.detail = detail;
		this.wish = wish;
	}

	//getter,setter
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public boolean isWish() {
		return wish;
	}

	public void setWish(boolean wish) {
		this.wish = wish;
	}

	@Override
	public String toString() {
		return "Shopping [product=" + product + ", detail=" + detail + ", wish=" + wish + "]";
	}
	
	
	

}
