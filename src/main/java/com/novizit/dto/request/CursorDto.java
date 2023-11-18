package com.novizit.dto.request;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CursorDto implements Serializable{

	private static final long serialVersionUID = -6184527418231507502L;
	private Date createdAt;
	private Long id;
}
