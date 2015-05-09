package org.simondean.vertx.async.unit.fakes;

import org.vertx.java.core.AsyncResultHandler;
import org.vertx.java.core.impl.DefaultFutureResult;

public class FakeFailingTask<T> extends FakeTask<T> {
  private final Throwable cause;

  public FakeFailingTask(Throwable cause) {
    this.cause = cause;
  }

  @Override
  public void accept(AsyncResultHandler<T> handler) {
    incrementRunCount();
    handler.handle(new DefaultFutureResult<>(cause));
  }

  public Throwable cause() {
    return cause;
  }
}