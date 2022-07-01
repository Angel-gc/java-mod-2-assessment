import java.util.List;
import java.util.ArrayList;

class Hospital {
  private String name;
  private List<Doctor> doctors;

  public Hospital(String name) {
    this.name = name;
  }
  public String getName() {
      return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<Doctor> getDoctors() {
    return doctors;
  }
  public void setDoctors(ArrayList doctors) {
    this.doctors = doctors;
  }
  public void addDoctor(Doctor doctor){
    this.doctors.add(doctor);
  }
}