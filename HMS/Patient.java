package HMS;
import java.io.*;
public class Patient extends Hospital{
    String paitentName;
    int paitentId;
    String disease;
    double fees;
    static int uniqueId = 4000;
    String bedNo;
   public  Patient(String patientName, String disease, double fees, String bed) {
       this.paitentId = uniqueId++;
       this.paitentName = patientName;
       this.disease = disease;
       this.fees = fees;
    
        setBedNo(bed);
        addDoctorFile();
    }

    public String paitentInfo() {
        return  "Patient ID: "+ paitentId +"\tPatient Name: "+ paitentName  + "\tDisease: "+ disease+
        "\tFees: "+  fees + "\tBed NO: "+ getBedNo() + "\n";
    }
    private void  addDoctorFile() {
        try {
            File myObj = new File("Patient.txt");
            FileWriter myWriter = new FileWriter(myObj, true);
            myWriter.write(paitentInfo());
            myWriter.close();
            System.out.println("Successfully added doctor!.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

}
