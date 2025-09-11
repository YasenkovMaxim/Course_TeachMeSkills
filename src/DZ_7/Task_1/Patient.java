package DZ_7.Task_1;

public class Patient {
    int healthPlan;
    String doctorSpecialization;

    public Patient(int healthPlan, String doctorSpecialization) {
        this.healthPlan = healthPlan;
        this.doctorSpecialization = doctorSpecialization;
    }

    public int getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(int healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }
}
