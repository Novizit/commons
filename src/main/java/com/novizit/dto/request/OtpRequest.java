package com.novizit.dto.request;

import java.io.Serializable;

import com.novizit.constant.OTPOption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OtpRequest implements Serializable{
	 
	private static final long serialVersionUID = -3342754575087695215L;
	private String token;
	private Long otp;
	private OTPOption options;
	private String phoneNumber;
	private String emailAddress;
}
