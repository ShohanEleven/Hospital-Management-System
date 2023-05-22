package HMS;

import java.util.ArrayList;

public class Managment implements ManagementSystem  {
    ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    public void addDoctor( Doctor doctor) {
        doctors.add(doctor);
    }
    public Doctor getDoctor(int index){
        return doctors.get(index);
    }
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    
    ArrayList<Patient> patients = new ArrayList<Patient>();
    public void addPatient( Patient patient) {
        patients.add(patient);
    }
    public Patient getPatient(int index) {
        return patients.get(index);
    }
    public ArrayList<Patient> getPatients() {
        return patients;
    }

}
