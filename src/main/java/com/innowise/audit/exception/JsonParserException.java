package com.innowise.audit.exception;

public class JsonParserException extends RuntimeException {
    public JsonParserException(String message) {
        super(message);
    }
    //    public JsonParserException(HttpStatus status) {
//        super(status);
//    }
//
//    public JsonParserException(HttpStatus status, String reason) {
//        super(status, reason);
//    }
//
//    public JsonParserException(HttpStatus status, String reason, Throwable cause) {
//        super(status, reason, cause);
//    }
//
//    public JsonParserException(int rawStatusCode, String reason, Throwable cause) {
//        super(rawStatusCode, reason, cause);
//    }
}
