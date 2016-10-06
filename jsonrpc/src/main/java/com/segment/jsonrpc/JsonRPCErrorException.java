package com.segment.jsonrpc;

import java.io.IOException;

public class JsonRPCErrorException extends IOException {
    public Object getError() {
        return error;
    }

    private Object error;

    public JsonRPCErrorException(Object error) {
        super("JSONRPC error occurred");
        this.error = error;
    }
}
