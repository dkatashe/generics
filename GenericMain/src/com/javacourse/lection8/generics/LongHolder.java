package com.javacourse.lection8.generics;

public class LongHolder implements Holder<Long>, Comparable<LongHolder>
{
  private Long value;

  @Override public void put(Long value)
  {
    this.value = value;
    System.out.println(this.value);
  }

  @Override public Long get()
  {
    return value;
  }

  @Override public int compareTo(LongHolder anotherLong)
  {
    return value.compareTo(anotherLong.get());
  }

  public String toString()
  {
    return value.toString();
  }

  public LongHolder(Long value) {
    put(value);
  }
}
