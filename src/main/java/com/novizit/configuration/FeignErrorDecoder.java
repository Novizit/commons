package com.novizit.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.novizit.exception.ApiRequestException;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		// TODO Auto-generated method stub
		if(response.status() >= 400 && response.status() <= 499) {
			log.info("Feign exception with messageKey {}",methodKey);
			return new ApiRequestException(methodKey, HttpStatus.resolve(response.status()));
		}
		return new Exception();
	}

}