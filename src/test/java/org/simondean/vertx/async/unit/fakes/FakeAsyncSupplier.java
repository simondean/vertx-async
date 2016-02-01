package org.simondean.vertx.async.unit.fakes;

import io.vertx.core.AsyncResultHandler;

import java.util.function.Consumer;

public abstract class FakeAsyncSupplier<T> implements Consumer<AsyncResultHandler<T>> {
  private int runCount = 0;

  protected void incrementRunCount() {
    runCount++;
  }

  public int runCount() {
    return runCount;
  }
}
