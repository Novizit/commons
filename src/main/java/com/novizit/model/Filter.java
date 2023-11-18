package com.novizit.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
public class Filter implements Serializable{

	private static final long serialVersionUID = -3093040486789286926L;
	private String field;
	private String operator;
	private String value;
	private List<String> values;// Used in case of IN operator
	private Date start;
	private Date end;
}
