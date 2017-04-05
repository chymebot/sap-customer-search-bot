package com.chyme.customer.utils;

@SuppressWarnings("serial")
public class CustomError extends Error {
	public CustomError(String msg) {
		super(msg);
	}
}
