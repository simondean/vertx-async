package org.simondean.vertx.async;

import io.vertx.core.AsyncResultHandler;

public interface Retry<T> {
  void run(AsyncResultHandler<T> handler);
}
