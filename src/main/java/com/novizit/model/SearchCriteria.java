package com.novizit.model;

import java.io.Serializable;

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
public class SearchCriteria implements Serializable{
	private static final long serialVersionUID = -2415776499670516518L;
	private String filterKey;
	private Object value;
	private String operation;
	private String dataOption;

}
