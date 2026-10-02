package Doctor.Doctor;

public class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

}

class Patient {
    String name;
    Doctor d;

    Patient(String name, Doctor d) {
        this.name = name;
        this.d = d;
    }

    void display() {
        System.out.println("Doctor:" + d.name);
        System.out.println("Patient:" + name);

    }
}

class Main {
    public static void main(String args[]) {
        Doctor d = new Doctor("navya");
        Patient p = new Patient("sri durga", d);
        p.display();
    }
}
