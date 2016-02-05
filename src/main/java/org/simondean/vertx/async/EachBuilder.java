package org.simondean.vertx.async;

import io.vertx.core.AsyncResultHandler;
import io.vertx.core.Vertx;

public interface EachBuilder {
  void run(Vertx vertx, AsyncResultHandler<Void> handler);
}
