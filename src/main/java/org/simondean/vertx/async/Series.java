package org.simondean.vertx.async;

import io.vertx.core.AsyncResultHandler;

import java.util.List;
import java.util.function.Consumer;

public interface Series<T> {
  Series<T> task(Consumer<AsyncResultHandler<T>> task);

  void run(AsyncResultHandler<List<T>> handler);
}