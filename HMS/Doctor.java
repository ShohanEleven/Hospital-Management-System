package HMS;
import java.io.*;

public class Doctor extends Hospital {
    String doctorName;
    int doctorId;
    String designation;
    double salary;
    static int uniqueId = 200000;
   public Doctor(String doctorName, String designation, String chember, double salary) {
       this.doctorId = uniqueId++;
       this.doctorName = doctorName;
       this.designation = designation;
       this.salary = salary;
       setChemberNo(chember);
       addDoctorFile();
    }
    public String doctorInfo() {
        return  "Doctor ID: "+ doctorId +"\tDoctor Name: "+ doctorName  + "\tDesignation: "+ designation+
        "\tSalary: "+  salary + "\tChewmber NO: "+ getChemberNo() + "\n";
    }
    private void  addDoctorFile() {
        try {
            File myObj = new File("Doctor.txt");
            FileWriter myWriter = new FileWriter(myObj, true);
            myWriter.write(doctorInfo());
            myWriter.close();
            System.out.println("Successfully added doctor!.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    

}
