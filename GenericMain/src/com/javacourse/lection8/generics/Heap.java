package com.javacourse.lection8.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Heap<T extends Comparable<T>>
{
  private T[] list;

  public Heap(T firstEl)
  {
    list = (T[]) Array.newInstance(firstEl.getClass(), 1);
    list[0] = firstEl;
  }

  public T getMin() {
    MinMaxer<T> minMaxer = new MinMaxer<>();
    T min = list[0];

    for (int i = 1; i < list.length; i++) {
      min = minMaxer.min(list[i], min);
    }

    return min;
  }

  public T getMax() {
    MinMaxer<T> minMaxer = new MinMaxer<>();
    T max = null;

    for (T t : list)
    {
      max=minMaxer.max(t, max);
    }

    return max;
  }

  public void add(T val)
  {
    list = Arrays.copyOf(list, list.length + 1);
    list[list.length - 1] = val;
  }

  public void setMin(Holder<T> h) {
    h.put(getMin());
  }
}