package com.codewithmosh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {7,3,8,8,9,10};
    var sorter = new QuickSort();
    sorter.sort(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}

