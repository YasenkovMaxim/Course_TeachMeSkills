package DZ_9.Task_2;

public class Circle extends Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    Integer square() {
        int result = (int)(Math.PI * Math.pow(radius, 2));
        return 0;
    }

    @Override
    Integer perimeter() {
        int result = (int)(Math.PI*(radius*2));
        return result;
    }
}
