package com.novizit.model;

import java.io.Serializable;
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
public class MessageSearchDto implements Serializable{

    private static final long serialVersionUID = 708615696517472153L;
	private List<SearchCriteria> searchCriteriaList;
    private String dataOption;
    
}
