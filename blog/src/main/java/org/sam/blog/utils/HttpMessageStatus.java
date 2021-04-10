package org.sam.blog.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class HttpMessageStatus {
    private int code;
    private HttpStatus httpStatus;
    private String message;
    private Object data;

    public HttpMessageStatus(int code, HttpStatus httpStatus, String message, Object data) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.message = message;
        this.data = data;
    }
}
