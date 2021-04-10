package org.sam.blog.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String userName;
    private  String passWord;
}
