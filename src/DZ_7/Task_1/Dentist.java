package DZ_7.Task_1;

public class Dentist extends Doctor{

    @Override
    void treat() {
        super.treat();
        System.out.println("план лечения дантиста");
    }
}
