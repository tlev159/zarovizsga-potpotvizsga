package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

  private List<Fish> fishList = new ArrayList<>();

  public void addFish(Fish fish) {
    fishList.add(fish);
  }

  public List<String> getStatus() {
    List<String> result = new ArrayList<>();
    for (Fish f : fishList) {
      result.add(f.status());
    }
    return result;
  }

  public void feed() {
    for (Fish fish : fishList) {
      fish.feed();
    }
  }

  public void removeFish() {
    Iterator<Fish> it = fishList.iterator();
    while (it.hasNext()) {
      Fish fish = it.next();
      if (fish.getWeight() >= 11) {
        it.remove();
      }
    }
  }

}
