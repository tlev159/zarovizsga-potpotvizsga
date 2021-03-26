package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

  public List<Character> uniqueChars(String chars) {
    List<Character> result = new ArrayList<>();
    if (chars == null) {
      throw new IllegalArgumentException("String must be not null!");
    }
    for (char c:chars.toCharArray()) {
      boolean isInList = proofIfCharInTheList(result, c);
      if (!isInList) {
        result.add(c);
      }
    }
    return result;
  }

  private boolean proofIfCharInTheList(List<Character> result, char c) {
    boolean isInList = false;
    for (Character cl: result) {
      if (cl == c) {
        isInList = true;
      }
    }
    return isInList;
  }
}
