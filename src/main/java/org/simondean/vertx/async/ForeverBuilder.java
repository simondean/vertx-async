package org.simondean.vertx.async;

import io.vertx.core.AsyncResultHandler;

import java.util.function.Consumer;

public interface ForeverBuilder {
  Forever task(Consumer<AsyncResultHandler<Void>> task);
}
