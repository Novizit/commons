package com.novizit.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.novizit.constant.NotificationType;

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
@Builder
@ToString
public class Notification implements Serializable{
   	
	private static final long serialVersionUID = -7353611332571446054L;
	private List<String> recipients;
    private String template;
    private NotificationType type;
    private String subject;
    private Map<String,Object> attributes;
    private Map<String,Object> credentials;
}
