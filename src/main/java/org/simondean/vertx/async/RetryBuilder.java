package org.simondean.vertx.async;

import io.vertx.core.AsyncResultHandler;

import java.util.function.Consumer;

public interface RetryBuilder {
  <T> RetryTimesBuilder<T> task(Consumer<AsyncResultHandler<T>> task);
}
