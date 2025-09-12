package DZ_9.Task_2;

public class Main {
    public static void main(String[] args) {
        /** Задача 2:
         Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
         функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
         абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
         периметра всех фигур в массиве */
        Triangle triangle = new Triangle(3, 4, 3, 5);
        Rectangle rectangle1 = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(3, 4);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Figure[] figures = {triangle, rectangle1, rectangle2, circle1, circle2};
        int allPerimeter = 0;
        for (Figure i : figures) {
            allPerimeter = allPerimeter + i.perimeter();
        }
        System.out.println("Сумма периметров всех фигур в массиве: " + allPerimeter);
    }
}
