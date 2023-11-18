package com.novizit.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest implements Serializable{

	private static final long serialVersionUID = -3273582557086767140L;
	private String fullName;
	private String email;
	private Long userId;
	private String profilePic;
	private String contactNumber;
}
