public class Veggie {

    public static void main(String[] args) {
        Corn corn = new Corn();
        Carrot carrot = new Carrot();
        Squash squash = new Squash();
        squash.color = ("Green");

        System.out.println("Names: " + corn.name + ", " + carrot.name + ", " + squash.name + " and the color of Squash is " + squash.color);
    }
}

class Corn extends Vegetable {
    public Corn() {
        super("Corn");
    }
}

class Squash extends Vegetable {
    String color;
    public Squash() {
        super("Squash");
    }
    public Squash(String color) {
        super("Squash");
        this.color = color;
    }
}

class Carrot extends Vegetable {
    public Carrot() {
        super("Carrot");
    }
}

abstract class Vegetable {
    String name;

    public Vegetable(String name) {
        this.name = name;
    }
}

