package com.javacourse.lection8.generics;

public interface Holder<T> {
  void put(T t);

  T get();
}