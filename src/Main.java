abstract class Shape {
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;

    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String penColor, String fillColor) {
        super(1, penColor, fillColor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
        System.out.println("Pen color: " + penColor);
        System.out.println("Fill color: " + fillColor);
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength, String penColor, String fillColor) {
        super(4, penColor, fillColor);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side length: " + sideLength);
        System.out.println("Pen color: " + penColor);
        System.out.println("Fill color: " + fillColor);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String penColor, String fillColor) {
        super(3, penColor, fillColor);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base: " + base + " and height: " + height);
        System.out.println("Pen color: " + penColor);
        System.out.println("Fill color: " + fillColor);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", "Yellow");
        circle.draw();

        System.out.println();

        Square square = new Square(10.0, "Blue", "Green");
        square.draw();

        System.out.println();

        Triangle triangle = new Triangle(8.0, 6.0, "Black", "White");
        triangle.draw();
    }
}