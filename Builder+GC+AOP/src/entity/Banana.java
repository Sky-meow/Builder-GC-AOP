package entity;

public class Banana extends Fruit {
    public Banana() {
    }
    public Banana(String color) {
        this.color=color;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "color='" + color + '\'' +
                '}';
    }
}
