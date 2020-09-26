package com.codewithmosh;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackUtils {
  // 判断括号是否相对应

  public static boolean isBracketsMatch(String brackets) {
    if(brackets == null) {
      throw  new IllegalArgumentException();
    }

    Stack<Character> s = new Stack<>();
    Map<Character, Character> map = new HashMap<>();
    map.put('{', '}');
    map.put('[', ']');
    map.put('(', ')');

    for (var bracket : brackets.toCharArray()) {
      if (map.containsKey(bracket)) {
        s.push(bracket);
        continue;
      }
      if (s.isEmpty()) {
        return false;
      }
      var topBracket = s.pop();
      if (map.get(topBracket) != bracket) {
        return false;
      }
    }

    return s.isEmpty();
  }
  // 实现了功能，但是代码欠缺可读性。参考Expression.java
}
