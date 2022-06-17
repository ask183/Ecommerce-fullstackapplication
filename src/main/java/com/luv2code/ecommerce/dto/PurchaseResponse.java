package com.luv2code.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;

	public PurchaseResponse(String orderTrackingNumber2) {
		this.orderTrackingNumber = "";
		// TODO Auto-generated constructor stub
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}

}
