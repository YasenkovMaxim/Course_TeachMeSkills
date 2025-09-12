package DZ_9.Task_2;

public class Rectangle extends Figure {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    Integer square() {
        int result = sideA * sideB;
        return result;
    }

    @Override
    Integer perimeter() {
        int result = (sideA * 2) + (sideB * 2);
        return result;
    }
}
