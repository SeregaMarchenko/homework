package homework_5.Task_1;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(new Dentist(), new Surgeon(), new Therapist());
        Patient patient = new Patient(2);
        clinic.getTherapist().prescribeTreatment(patient);
        patient.getDoctor().treat();
    }
}
