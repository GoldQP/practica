package com.acme.center.platform.sales.domain.exceptions;

public class EMailException extends RuntimeException {
    public EMailException(String message) {
      super(message);
    }
}
