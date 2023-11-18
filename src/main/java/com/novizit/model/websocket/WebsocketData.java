package com.novizit.model.websocket;

import com.novizit.enums.WS_EVENT;

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
public class WebsocketData {

	protected WS_EVENT type;
}
