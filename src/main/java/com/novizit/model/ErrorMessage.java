package com.novizit.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage implements Serializable {

	private static final long serialVersionUID = 7705362239949104393L;
	private String message;
    private int code;
}
