package com.novizit.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ApiRequestException extends RuntimeException {
	private static final long serialVersionUID = 43711419347476479L;
	private final HttpStatus status;
	private final Object apiPayload;
	
	public ApiRequestException() {
		this.status = null;
		this.apiPayload = null;
	}
 
    public ApiRequestException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.apiPayload = null;
    }
    
    public ApiRequestException(String message, HttpStatus status,Object payload) {
        super(message);
        this.status = status;
        this.apiPayload = payload;
    }
}
