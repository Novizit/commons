package com.novizit.model;

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
@Builder
@ToString
public class NotificationSound implements Serializable {

	private static final long serialVersionUID = -7084518790700559254L;
	private String name;
	private boolean custom;
	private String sourceUrl;
	private boolean enabled;
}
