package com.test.omdb.data.network.exceptions;

import java.io.IOException;

/**
 * Indicates a server response that is not successful, typically something outside the 2xx range.
 */
public class NonSuccessfulResponseCodeException extends IOException {

    private final int code;

    public NonSuccessfulResponseCodeException(int code) {
        this.code = code;
    }

    public NonSuccessfulResponseCodeException(int code, String s) {
        super(s);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public boolean is5xx() {
        return code >= 500 && code < 600;
    }
}
