package com.cydeo;

public class Apple {

    private int weight;
    private Color color;

    public Apple(Color color, int wait) {
        this.color = color;
        this.weight = wait;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int wait) {
        this.weight = wait;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", wait=" + weight +
                '}';
    }
}
