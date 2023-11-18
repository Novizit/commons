package com.novizit.constant;

import static com.novizit.constant.PathConstants.COMPANY;

public class WebsocketConstants {
	public static final String TOPIC = "/topic";
	public static final String TOPIC_USER_STATUS = TOPIC + "/user/status/";
	public static final String TOPIC_TEST = TOPIC + "/test";
    public static final String TOPIC_NOTIFICATIONS = TOPIC + "/notifications/";
    public static final String TOPIC_CHAT = TOPIC + "/chat/";
    public static final String TOPIC_COMPANY = TOPIC + COMPANY + "/%d";
}