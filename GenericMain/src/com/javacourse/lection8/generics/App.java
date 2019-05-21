package com.javacourse.lection8.generics;

import java.time.LocalTime;
import java.util.Random;

public class App
{
  public static void main(String[] args)
  {
    Random rnd = new Random();

    Heap<Integer> intHeap = new Heap<>(rnd.nextInt(Integer.MAX_VALUE));
    Heap<LocalTime> timeHeap = new Heap<>(LocalTime.of(rnd.nextInt(24), rnd.nextInt(60), rnd.nextInt(60)));
    Heap<LongHolder> longHolderHeap = new Heap<>(new LongHolder(rnd.nextLong()));

    for (int i = 0; i <= 5; i++) {
      Integer newInt = rnd.nextInt(Integer.MAX_VALUE);
      System.out.println("New Integer added to heap: " + newInt);
      intHeap.add(newInt);

      LocalTime newTime = LocalTime.of(rnd.nextInt(24), rnd.nextInt(60), rnd.nextInt(60));
      System.out.println("New LocalTime added to heap: " + newTime);
      timeHeap.add(newTime);

      LongHolder newLongHolder = new LongHolder(rnd.nextLong());
      System.out.println("New LongHolder added to heap: " + newLongHolder);
      longHolderHeap.add(newLongHolder);
    }

    System.out.println("Min and max from all heaps:");
    System.out.println("Integer heap: min = " + intHeap.getMin() + ", max = " + intHeap.getMax());
    System.out.println("LocalTime heap: min = " + timeHeap.getMin() + ", max = " + timeHeap.getMax());
    System.out.println("LongHolder heap: min = " + longHolderHeap.getMin() + ", max = " + longHolderHeap.getMax());
  }
}
