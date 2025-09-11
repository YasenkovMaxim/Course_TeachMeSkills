package DZ_7.Task_1;

public class Patient {
    int treatmentPlan;
    Doctor doctor;
    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void treatPatient() {
        if (doctor != null) {
            doctor.treat();
        } else {
            System.out.println("Такое не лечится");
        }
    }
}

