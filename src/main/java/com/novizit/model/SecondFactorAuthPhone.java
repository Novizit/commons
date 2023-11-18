package com.novizit.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class SecondFactorAuthPhone implements Serializable{

	private static final long serialVersionUID = -806084752070308985L;

	@JsonProperty("phone_number")
	private String phoneNumber;
	
	@JsonProperty("user_name")
	private String userName;
	
	@JsonProperty("password")
	private String password;
	
	@JsonProperty("auth_header")
	private String authHeader;
	
	@JsonProperty("carrier_id")
	private int carrierId;
}
