import java.util.InputMismatchException;
import java.util.Scanner;

class WorldCreation implements UserInput{
  Scanner sc = new Scanner(System.in);
    
  @Override
  public void createHospital() {
    System.out.println("What is the name of the hospital you would like to build?");
    String name = sc.next();
    Hospital hospital = new Hospital(name);
    System.out.println("Hospital " + hospital.getName() + "has been created");
  }

  @Override
  public void createDoctors(Hospital hospital) {
      System.out.println("How many Doctors would you like to hire?");
      //Let user define the number of doctors to create;
      int numberOfDoctors = sc.nextInt();
      //create doctors;
      for(int i = 0; i < numberOfDoctors; i++){
        System.out.println("What is the doctor's name?");
        String name = sc.next();

        //Get valid user definable specialties from our enum;
        System.out.println("What is their specialty? You must choose from this list." + "DERMATOLOGY, CARDIOLOGY, NEUROLOGY, RADIOLOGY, PEDIATRICS");
        String specialtyInput = sc.next();
        try {
          //loop through enum values and compare to user input to test validity;
          for (SpecialtiesEnum currentSpecialty : SpecialtiesEnum.values()){
            if(currentSpecialty.equals(specialtyInput)){
              Doctor doctor = new Doctor(name, specialtyInput);
              hospital.addDoctor(doctor);
              System.out.println("Doctor " + doctor.getName() + " has been hired at " + hospital.getName());
            } else {
              throw new InputMismatchException("Specialty must be from the suggested list.");
            }
          }
          
        } catch(InputMismatchException inputException) {
          sc.nextLine(); // clear the invalid input
          System.out.println("Invalid input - " + inputException.getMessage());;
          } 
      }
  }

  @Override
  public void createPatients(Hospital hospital) {
    System.out.println("How many Patients would you like to register?");
      int numberOfPatients = sc.nextInt();

      //Allow for user defined patients and loop to create them;
      for(int i = 0; i < numberOfPatients; i++){
        System.out.println("What is the patient's name?");
        String name = sc.next();
        //Get valid user definable specialties from our enum;
        System.out.println("What kind of Doctor do they need? You must choose from this list." + "DERMATOLOGY, CARDIOLOGY, NEUROLOGY, RADIOLOGY, PEDIATRICS");
        String specialtyInput = sc.next();
        try {
          //loop through enum values and compare to user input to test validity;
          for (SpecialtiesEnum currentSpecialty : SpecialtiesEnum.values()){
            if(currentSpecialty.equals(specialtyInput)){
              Patient patient = new Patient(name, specialtyInput);
               //loop through doctors and assign doctor to patient by comparing specialties needed and doctor specialties
               if(hospital.getDoctors().contains(specialtyInput)){
       
               }
               System.out.println("Patient " + patient.getName() + " has been created.");
            } else {
              throw new InputMismatchException("Specialty must be from the suggested list.");
            }
          }
        } catch(InputMismatchException inputException) {
          sc.nextLine(); // clear the invalid input
          System.out.println("Invalid input - " + inputException.getMessage());;
          } 
      }
  }
}