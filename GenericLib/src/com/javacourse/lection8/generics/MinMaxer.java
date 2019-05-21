package com.javacourse.lection8.generics;

public class MinMaxer<T extends Comparable<T>>
{
  public T min(T o1, T o2) {
    if (o1 == null || o2 == null) {
      return null;
    }

    if (o1.compareTo(o2) <= 0) {
      return o1;
    } else {
      return o2;
    }
  }

  public T max(T o1, T o2) {
    if (o1 == null && o2 == null) return null;
    if (o1 == null || o2 == null) {
      return o1 == null ? o2 : o1;
    }

    if (o1.compareTo(o2) >= 0) {
      return o1;
    } else {
      return o2;
    }
  }
}