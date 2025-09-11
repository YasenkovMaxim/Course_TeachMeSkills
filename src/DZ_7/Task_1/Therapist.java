package DZ_7.Task_1;

public class Therapist extends Doctor {

    @Override
    void treat() {
        super.treat();
        System.out.println("план лечения терапевта");
    }
    public static void assignDoctor(Patient patient, int plan) {
        switch (plan) {
            case 1:
                patient.setDoctor(new Surgeon());
                break;
            case 2:
                patient.setDoctor(new Dentist());
                break;
            default:
                patient.setDoctor(new Therapist());
                break;
        }
        System.out.println("Врач назначен согласно плану: " + plan);
    }

}
