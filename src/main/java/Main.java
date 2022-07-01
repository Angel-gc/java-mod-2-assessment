public class Main {
    public static void main(String[] args) {
        WorldCreation newWorld = new WorldCreation();
        Hospital newHospital = newWorld.createHospital();
        newWorld.createDoctors(newHospital);
        newWorld.createPatients(newHospital);

        System.out.println("Our Hospital name: " + newHospital.getName() + "\n Our Hospital's Doctors: " + newHospital.getDoctors());
        System.out.println("Our Hospital's patients and doctors: ");
        newHospital.printDoctorsPatients();
    }
}






    