package com.novizit.dto.response;

import java.io.Serializable;
import java.util.Date;

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
public class ChatParticipantUserResponse implements Serializable{

	private static final long serialVersionUID = -6945958956416255004L;
	private Long userId;
	private String email;
	private String fullName;
	private String profilePic;
	private String contactNumber;
	private Date time;
}
