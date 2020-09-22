package com.codewithmosh;

public class Search {
  public int linearSearch(int[] array, int target) {
    for (var i = 0; i < array.length; i++) {
      if (array[i] == target)
        return i;
    }
    return -1;
  }

  public int binarySearch(int[] array, int target) {
//    return binarySearchRecursive(array, 0, array.length - 1, target);
    return binarySearchIterate(array, 0, array.length - 1, target);
  }

  private int binarySearchRecursive(int[] array, int start, int end, int target) {
    if (start > end)
      return -1;

    int middle = (start + end) / 2;
    if (target == array[middle])
      return middle;

    if (target < array[middle])
      return binarySearchRecursive(array, start, middle - 1, target);

    return binarySearchRecursive(array, middle + 1, end, target);
  }

  private int binarySearchIterate(int[] array, int start, int end, int target) {
    while (start <= end) {
      int middle = (start + end) / 2;
      if (target == array[middle]) {
        return middle;
      }

      if (target < array[middle]) {
        end = middle - 1;
      } else {
        start = middle + 1;
      }
    }
    return -1;
  }

  public int ternarySearch(int[] array, int target) {
    return ternarySearch(array, 0, array.length - 1, target);
  }

  private int ternarySearch(int[] array, int start, int end, int target) {
    if(start > end)
      return -1;

    var partitionSize = (end - start) / 3;
    var mid1 = start + partitionSize;
    var mid2 = end - partitionSize;

    if(target == array[mid1])
      return mid1;
    if(target == array[mid2])
      return mid2;

    if(target < array[mid1])
      return ternarySearch(array, start, mid1 - 1, target);

    if(target > array[mid2])
      return ternarySearch(array, mid2 + 1, end, target);

    return ternarySearch(array, mid1 + 1, mid2 - 1, target);
  }

  public int jumpSearch(int[] array, int target) {
    int blockSize = (int) Math.sqrt(array.length);
    int start = 0;
    int next = blockSize;

    while (start < array.length && array[next - 1] < target) {
      start = next;

      next += blockSize;
      if(next > array.length)
        next = array.length;
    }

    for(int i = start; i < next; i++) {
      if(target == array[i])
        return i;
    }

    return -1;
  }

  public int exponentialSearch(int[]array, int target) {
    int bound = 1;

    while (bound < array.length && array[bound] < target)
      bound *= 2;

    bound = Math.min(bound, array.length - 1);

    return binarySearchRecursive(array, bound / 2, bound, target);
  }
}
