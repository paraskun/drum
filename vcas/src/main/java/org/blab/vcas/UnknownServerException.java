package org.blab.vcas;

public class UnknownServerException extends ServerException {
  public UnknownServerException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnknownServerException(Throwable cause) {
    super(cause);
  }
}
