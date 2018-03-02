package com.abouzidi.gof;

public class PurchaseServiceFacade {

	private InventoryService inventoryService = new InventoryService();
	private PaymentService paymentService = new PaymentService();
	private ShippingService shippingService = new ShippingService();

	public void purchase() {
		inventoryService.isValidMobile();
		paymentService.makePayment();
		shippingService.shipMobile();
	}

}
