package DZ_15.Task2;

public class Main {
    public static void main(String[] args) {
        // Задача 2:
        // Создать класс, который будет хранить в себе коллекцию с названиями животных.
        // Реализовать методы удаления и добавления животных по следующим правилам:
        // добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
        // объекта этого класса в main методе другого класса.
Animals animals = new Animals();
animals.addAnimal("Horse");
animals.addAnimal("Owl");
animals.addAnimal("Bear");
animals.delete();
animals.seeCollection();
    }
}
