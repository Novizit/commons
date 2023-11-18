package com.novizit.constant;

@SuppressWarnings("unused")
public class AppConstants{
    private static final String ALLOWED_HEADERS = "x-requested-with, authorization, Content-Type, Content-Length, Authorization, credential, X-XSRF-TOKEN,Cache-Control";
    private static final String ALLOWED_METHODS = "GET, PUT, POST, DELETE, OPTIONS, PATCH";
    private static final String ALLOWED_ORIGIN = "*";
    
    private static final String MAX_AGE = "7200"; //2 hours (2 * 60 * 60)
    public static final long JWT_TOKEN_VALIDITY = 864000000;
    
    /// Excel , csv file
    public static final String TYPE_EXCEL = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    public static final String HTML_TYPE = "text/html";
    public static final String JSON_TYPE = "application/json";
    public static final String XML_TYPE = "application/xml";
    public static final String XML_TYPE_TEXT = "text/xml";
    public static final String PLAIN_TEXT = "text/plain";
    public static final String CSV = "text/csv";
    public static final String ZIP = "application/zip";
    public static final String ZIP_COMPRESSED = "application/x-zip-compressed";
    
    public static final String TYPE_IMG_JPG = "image/jpg";
    public static final String TYPE_IMG_JPEG = "image/jpeg";
    public static final String JPEG = "jpeg";
    public static final String JPG = "jpg";
    public static final String PNG = "png";
    public static final String TYPE_IMG_PNG = "image/png";
    
    public static final String WHEN_EMAIL_NOT_EXISTS = "We don't recognize this email address. Please create an account.";
    public static final String WHEN_CODE_NOT_GENERATED= "something went wrong, currently we are not able to proceed your request. Please try later";
    public static final String WHEN_CODE_GENERATED= "We have mailed you the reset password code. Please check your email";
    public static final String WHEN_CODE_WRONG = "Reset code is not valid.";
    
    public static final long MILLI_SECOND_TO_MINUTES_DIVISOR = 60000;
    public static final long MINUTES_TO_MILLI_SECONDS = 10000;

    
    public static final int MAX_FAILED_ATTEMPTS = 3;
    
    public static final long LOCK_TIME_DURATION = 24 * 60 * 60 * 1000; // 24 hours
    
    public static final String LOCK_MESSAGE = "Your account has been locked due to 3 failed attempts. It will be unlocked after 24 hours.";
    public static final String LOCK_WARNING_MESSAGE = 
            "You have reached max login attempt limits. One more wrong attempt will lock your account.";
    
}