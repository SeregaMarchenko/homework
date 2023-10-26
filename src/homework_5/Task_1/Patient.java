package homework_5.Task_1;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient(int treatmentPlan, Doctor doctor) {
        this.treatmentPlan = treatmentPlan;
        this.doctor = doctor;
    }
}
