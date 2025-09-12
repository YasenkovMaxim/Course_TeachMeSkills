package Lesson8.Tack_1;

public class Shape {
    void drow(){
        System.out.println("I am drow " + this.getClass().getSimpleName());
    }

    void erase(){
        System.out.println("I am erase " + this.getClass().getSimpleName());
    }
}
