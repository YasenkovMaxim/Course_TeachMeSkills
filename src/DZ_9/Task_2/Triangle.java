package DZ_9.Task_2;

public class Triangle extends Figure {
    int height;
    int baseTriangle;
    int sideB;
    int sideC;

    public Triangle(int height, int baseTriangle, int sideB, int sideC) {
        this.height = height;
        this.baseTriangle = baseTriangle;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    Integer square() {
        int result = (height * baseTriangle) / 2;
        return result;
    }

    @Override
    Integer perimeter() {
        int result = baseTriangle + sideB + sideC;
        return result;
    }
}
