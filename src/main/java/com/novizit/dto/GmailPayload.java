package com.novizit.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class GmailPayload implements Serializable{

	private static final long serialVersionUID = -5471257521186371691L;
	private String from;
	private String to;
	private String subject;
	private String content;
}
