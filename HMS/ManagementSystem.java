package HMS;

import java.util.ArrayList;

public interface ManagementSystem {
     
        public void addDoctor( Doctor doctor);
        public Doctor getDoctor(int index);
        public ArrayList<Doctor> getDoctors();
        public void addPatient( Patient patient);
        public Patient getPatient(int index);
        public ArrayList<Patient> getPatients();
     
     
}
