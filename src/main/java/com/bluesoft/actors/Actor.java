package com.bluesoft.actors;


import com.bluesoft.common.Result;


public interface Actor<T> {

  static <T> Result<Actor<T>> noSender() {
    return Result.empty();
  }

  Result<Actor<T>> self();

  ActorContext<T> getContext();

  default void tell(T message) {
    tell(message, self());
  }

  void tell(T message, Result<Actor<T>> sender);

  void shutdown();

  default void tell(T message, Actor<T> sender) {
    tell(message, Result.of(sender));
  }

  enum Type {SERIAL, PARALLEL} // <7>
}
