package com.codewithmosh;

public class MaxHeap {
  public static void heapify(int[] array) {
    for (int i = 0; i < array.length; i++) {
      heapify(array, i);
    }
  }

  private static void heapify(int[] array, int index) {
    var largeIndex = index;

    var leftIndex = index * 2 + 1;
    if (leftIndex < array.length && array[leftIndex] > array[largeIndex]) {
      largeIndex = leftIndex;
    }

    var rightIndex = index * 2 + 2;
    if (rightIndex < array.length && array[rightIndex] > array[largeIndex]) {
      largeIndex = rightIndex;
    }

    if(index == largeIndex)
      return;

    swap(array, index, largeIndex);
    heapify(array, largeIndex);

  }

  private static void swap(int[] array, int first, int second) {
    var tmp = array[first];
    array[first] = array[second];
    array[second] = tmp;
  }
}
