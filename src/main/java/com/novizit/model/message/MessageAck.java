package com.novizit.model.message;

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
public class MessageAck implements Serializable{

	private static final long serialVersionUID = 4147822402451738365L;
	private Long chatId;
	private List<Long> messageIds;
	private Status status;
	private Long userId;
	private Long senderId;
	private boolean groupMessage;
}
