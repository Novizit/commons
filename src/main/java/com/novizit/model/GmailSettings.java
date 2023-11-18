package com.novizit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class GmailSettings {

    
    private int port;
    
    private String host;
    
    private String gmail;
    
    private String appPassword;

}
