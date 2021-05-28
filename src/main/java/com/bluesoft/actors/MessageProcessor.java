package com.bluesoft.actors;


import com.bluesoft.common.Result;

public interface MessageProcessor<T> {

  void process(T t, Result<Actor<T>> sender);
}
