package homework_5.Task_1;

public class Clinic {
    private Dentist dentist;
    private Surgeon surgeon;
    private Therapist therapist;

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public void setSurgeon(Surgeon surgeon) {
        this.surgeon = surgeon;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public Surgeon getSurgeon() {
        return surgeon;
    }

    public Therapist getTherapist() {
        return therapist;
    }

    public Clinic(Dentist dentist, Surgeon surgeon, Therapist therapist) {
        this.dentist = dentist;
        this.surgeon = surgeon;
        this.therapist = therapist;
        if (therapist.getClinic() == null) {
            therapist.setClinic(this);
        }
    }
}
