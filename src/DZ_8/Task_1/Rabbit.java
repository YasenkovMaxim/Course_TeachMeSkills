package DZ_8.Task_1;

public class Rabbit extends Animal{
    public Rabbit(String voice) {
        super(voice);
    }

    @Override
    void voice() {
        super.voice();
    }

    @Override
    void eat(String food) {
        super.eat(food);

        if (food == "Grass") {
            System.out.println(this.getClass().getSimpleName() + " любит травку");
        } else {
            System.out.println(this.getClass().getSimpleName() + " недоволен, он такое не ест");
        }
    }
}
