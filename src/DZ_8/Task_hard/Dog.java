package DZ_8.Task_hard;

public class Dog extends Animal {
   private Dog() {
    }

    static void voice() {
        System.out.println("Гав-гав");
    }

   static void eat(String food) {
        if (food == "Meat") {
            System.out.println("Собака любит мясо");
        } else {
            System.out.println("Собака недовольна, он такое не ест");
        }
    }
}
