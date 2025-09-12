package DZ_8.Task_1;

public class Tiger extends Animal {
    public Tiger(String voice) {
        super(voice);
    }

    @Override
    void voice() {
        super.voice();
    }

    @Override
    void eat(String food) {
        super.eat(food);

        if (food == "Meat") {
            System.out.println(this.getClass().getSimpleName() + " любит мясо");
        } else {
            System.out.println(this.getClass().getSimpleName() + " недоволен, он такое не ест");
        }
    }
}
