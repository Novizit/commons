package com.novizit.model;

import java.io.Serializable;
import java.util.HashMap;

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
public class WebsocketPayload implements Serializable{

	private static final long serialVersionUID = 2406871743669937662L;
	private HashMap<String,Object> payload;
	private String type;
}
