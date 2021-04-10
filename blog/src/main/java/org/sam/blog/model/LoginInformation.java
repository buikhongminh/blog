package org.sam.blog.model;

import lombok.Data;

@Data
public class LoginInformation {
    private String accessToken;
    private String tokenType = "Bearer";

    public LoginInformation(String accessToken) {
        this.accessToken = accessToken;
    }

    public LoginInformation(String accessToken, String tokenType) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }
}
