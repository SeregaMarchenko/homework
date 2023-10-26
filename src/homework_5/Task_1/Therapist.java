package homework_5.Task_1;

public class Therapist extends Doctor {
    Clinic clinic;

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public Therapist(Clinic clinic) {
        this.clinic = clinic;
    }

    public Therapist() {
    }

    @Override
    public void treat() {
        System.out.println("I am a therapist and I help you");
    }

    public void prescribeTreatment(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1 -> patient.setDoctor(clinic.getSurgeon());
            case 2 -> patient.setDoctor(clinic.getDentist());
            default -> patient.setDoctor(clinic.getTherapist());
        }
    }
}
