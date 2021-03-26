package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

  public static final String REGEX = "01x";

  public int encode(String file, char c) {
    if (!REGEX.contains(Character.toString(c))) {
      throw new IllegalArgumentException("Character must be '0', '1' or 'x'!");
    }
    try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
      String line;
      int count = 0;
      while ((line = reader.readLine()) != null) {
        count = getCount(c, line, count);
      }
      return count;
    }
    catch (IOException ioe) {
      throw new IllegalArgumentException("Can not read file!", ioe);
    }
  }

  private int getCount(char c, String line, int count) {
    for (char c2 : line.toCharArray()) {
      if (c2 == c) {
        count++;
      }
    }
    return count;
  }

}
