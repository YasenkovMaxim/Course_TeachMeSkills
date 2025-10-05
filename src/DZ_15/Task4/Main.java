package DZ_15.Task4;

public class Main {
    public static void main(String[] args) {
    /*  Задача *:
      Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
      работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
      основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
      классов(т.е. это generic).
      Предусмотреть операции(методы):
      1. добавления элемента
      2. удаления элемента
      3. получение элемента по индексу
      4. проверка есть ли элемент в коллекции
      5. очистка всей коллекции
      Предусмотреть конструктор без параметров - создает массив размером
      по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
      массива. Предусмотреть возможность автоматического расширения коллекции при
      добавлении элемента в том случае, когда коллекция уже заполнена*/
        MyCollection myCollection = new MyCollection();
        myCollection.add(5);
        myCollection.add(6);
        myCollection.add(7);
        myCollection.add(8);
        System.out.println(myCollection.contains(7));
        System.out.println(myCollection.contains(9));
        System.out.println(myCollection.get(1));
        System.out.println(myCollection.get(8));
        myCollection.remove(0);
        myCollection.clear();

    }
}
