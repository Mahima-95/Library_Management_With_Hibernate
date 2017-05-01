package com.hibernate.library.response;

public class LibraryResponse {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LibraryResponse [message=" + message + "]";
	}

	public LibraryResponse(String message) {
		super();
		this.message = message;
	}

}
