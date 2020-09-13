package com.codewithmosh;

public class BubbleSort {
  public void sort(int[] array) {
    boolean isSorted;
    for(var i = 0; i < array.length; i++) {
      isSorted = true;
      for(var j = 1; j < array.length - 1; j++)
        if(array[j] < array[j - 1]) {
          swap(array, j, j - 1);
          isSorted = false;
        }
      if(isSorted)
        return;
    }
  }

  private void swap(int[] array, int index1, int index2) {
    var tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
}
