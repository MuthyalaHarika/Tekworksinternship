import java.util.*;
class HospitalData
  {
/*The patient details should include his/her name, age, gender, 
 Aadhar Card number, contact number, Emergency contact number, 
 Complete address, etc.*/
  int patient_id;
  String patient_name;
  int patient_age;
  String patient_gender;
  long AdharNumber;
  long contact_number;
     String cityname;
    String Patientaddress;
    String Dateof_admission;
    String guardian_name;
   long guad_adhar;
    long guad_number;
HospitalData(int patient_id,String name,int age,String gender,long Adhar_num,long contact_num,long emergency_num,String Address,String Dateof_admission,String city,String guardian_name,long guad_adhar)
  {
    this.patient_id=patient_id;
    this.patient_name=patient_name;
    this.patient_age=patient_age;
    this.patient_gender=patient_gender;
    this.AdharNumber=AdharNumber;
    this.contact_number=contact_number;
    this.cityname=cityname;
    this.Patientaddress=Patientaddress;
    this.Dateof_admission=Dateof_admission;
    this.guardian_name=guardian_name;
    this.guad_adhar=guad_adhar;
    this.guad_number=guad_number;
  }
public int getPatient_id() {
	return patient_id;
}
public String getName() {
	return patient_name;
}
public int getAge() {
	return patient_age;
}
public String getGender() {
	return patient_gender;
}
public long getAdhar_num() {
	return AdharNumber;
}
public long getContact_num() {
	return contact_number;
}
public String getAddress() {
	return Patientaddress;
}
public String getDateof_admission()
    {
      return Dateof_admission;
    }
    public String getcity()
    {
      return cityname;
    }
    public String getguardian_name()
    {
      return guardian_name;
    }
    public long getguad_adhar()
    {
      return guad_adhar;
    }
    public long getguad_number()
    {
      return guad_number;
    }
public String toString()
  {
    return "name:"+getName()+" "+"age"+getAge()+" "+"gender"+" "+getGender()+" "+"Adhar number"+getAdhar_num()+" "+"contact number"+getContact_num()+" "+"emergency number"+" "+"address"+" "+getAddress()+" "+"date of address"+getDateof_admission();
  }
}