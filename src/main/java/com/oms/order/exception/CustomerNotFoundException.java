package com.oms.order.exception;

public class CustomerNotFoundException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5253221637462707949L;

	public CustomerNotFoundException(String message) {
        super(message);
    }
}
