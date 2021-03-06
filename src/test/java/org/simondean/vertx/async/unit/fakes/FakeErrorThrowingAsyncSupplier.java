package org.simondean.vertx.async.unit.fakes;

import org.vertx.java.core.AsyncResultHandler;

public class FakeErrorThrowingAsyncSupplier<T> extends FakeAsyncSupplier<T> {
  private final Error cause;

  public FakeErrorThrowingAsyncSupplier(Error cause) {
    this.cause = cause;
  }

  @Override
  public void accept(AsyncResultHandler<T> handler) {
    incrementRunCount();
    throw cause;
  }

  public Error cause() {
    return cause;
  }
}
