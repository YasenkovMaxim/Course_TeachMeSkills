package DZ_7.Task_1;

public class Surgeon extends Doctor{

    @Override
    void treat() {
        super.treat();
        System.out.println("план лечения хирурга");
    }
}
