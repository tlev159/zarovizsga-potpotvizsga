package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

  private String name;
  private int weight;
  private String color;
  protected boolean memoryLoss = false;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public String status() {
    return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
  }

  public void feed(int plusWeight) {
    weight += plusWeight;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  public String getColor() {
    return color;
  }

  public boolean hasMemoryLoss() {
    return memoryLoss;
  }

  public abstract void feed();
}
