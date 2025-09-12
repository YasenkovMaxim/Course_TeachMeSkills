package DZ_9.Task_1;

public class Main {
    public static void main(String[] args) {
        /** Задача 1:
         Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
         который печатает название должности и имплементировать этот метод в созданные
         классы. */
        Бухгалтер accountant = new Бухгалтер("Accountant");
        Рабочий worker = new Рабочий("Worker");
        Директор director = new Директор("Director");
        accountant.printJobTitle();
        worker.printJobTitle();
        director.printJobTitle();
    }
}
