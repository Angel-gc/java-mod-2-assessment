public enum SpecialtiesEnum {
  DERMATOLOGY("dermatology"), 
  CARDIOLOGY("cardiology"), 
  NEUROLOGY("neurology"),
  RADIOLOGY("radiology"),
  PEDIATRICS("pediatrics");

  String label;

  SpecialtiesEnum(String label){
    this.label = label;
  }
  public String getLabel(){
    return label;
  }

}