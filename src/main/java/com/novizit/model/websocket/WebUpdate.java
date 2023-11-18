package com.novizit.model.websocket;

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
public class WebUpdate extends WebsocketData implements Serializable{

	private static final long serialVersionUID = 6907233663457157405L;
	private int version;
}
