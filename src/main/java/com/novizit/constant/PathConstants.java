package com.novizit.constant;

public class PathConstants {
    public static final String AUTH_USER_ID_HEADER = "X-auth-user-id";
    public static final String UPLOAD = "/upload";
    public static final String MEDIA = "/media";
    public static final String V1 = "/v1";
    public static final String API = "/api";
    public static final String API_V1 = API + V1;

    public static final String WEBSOCKET = "/websocket";
    public static final String WS_SEND_MESSAGE = "/send/message";
    
    public static final String APP_MESSAGE = API_V1 + "/novizit";
    public static final String MUTE = "/mute";
    public static final String CHAT = "/chat";
    public static final String LIST = "/list";
    public static final String GROUP = "/group";
    public static final String CHAT_ID = "/{chatId}";
    public static final String AUTHOR_ID = "/{authorId}";
    public static final String PARTICIPANT = "/participant";
    public static final String ADD = "/add";
    public static final String REMOVE = "/remove";
    
    //Messages
    public static final String MESSAGE = "/message";
    public static final String ACK = "/ack";
    public static final String REPLY = "/reply";
    public static final String MESSAGE_ID = "/{messageId}";
    public static final String FORWARD = "/forward";
    
    public static final String COMPANY = "/company";
    public static final String COMPANY_ID = "/{companyId}";
    public static final String NUMBER = "/number";
    public static final String UPDATE = "/update";
    public static final String UPDATE_COUNT = UPDATE + "/count";
    public static final String COUNT_PLACEHOLDER = "/{count}";
    
    // USERS
    public static final String USERS = "/users";
    public static final String USER = "/user";
    public static final String API_V1_USER = API_V1 + USERS;
    public static final String DETAILS = "/details"; 
    public static final String USER_ID = "/{userId}"; 
    public static final String SEARCH = "/search";
    public static final String EMAIL = "/email";
    public static final String EMAIL_PLACEHOLDER = "/{email}";
    public static final String EMAIL_EXISTS = "/exists";
    public static final String UI_ACCESS = "/ui-access";
    public static final String ACCESS = "/{access}";
    
    // Websockets.....
    public static final String API_V1_WEBSOCKET = API_V1 + WEBSOCKET;
    public static final String STATUS = "/status";
    public static final String USER_ONLINE_STATUS = USER_ID + STATUS;
    public static final String USER_OFFLINE_STATUS = USER_ID + STATUS + "/offline";
    
    //Notifications
    public static final String NOTIFICATIONS = "/notifications";
    public static final String API_V1_NOTIFICATION = API_V1 + NOTIFICATIONS;
    public static final String SEND = "/send";
    
    // MEDIA
    public static final String API_V1_MEDIA = API_V1 + MEDIA;
    
}
