package entity;

public class Apple extends Fruit {
    public Apple() {
    }

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
}
