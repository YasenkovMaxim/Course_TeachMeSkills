package DZ_8.Task_1;

public class Main {
    public static void main(String[] args) {
       /** Задача 1:
        Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
        Переопределить методы voice(), eat(String food) чтобы они выводили верную
        информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
        туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
        или другую строку то он будет недоволен */

Dog dog = new Dog("Гав-гав");
Rabbit rabbit = new Rabbit("говорит по кроличьи");
Tiger tiger = new Tiger("Ppp-рр");

dog.voice();
dog.eat("Meat");

rabbit.voice();
rabbit.eat("Grass");

tiger.voice();
tiger.eat("Beans");


    }
}
