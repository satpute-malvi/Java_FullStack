package encapsulation_practice;

public class HospitalPatient {
	
	private int patientId;
	private String patientname;
	private int age;
	private String gender;
	private String disease;
	private String doctorAssigned;
	private String admissionDate;
	private boolean admitted;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientname;
	}
	public void setPatientName(String name) {
		this.patientname = name;
	}
	public int getPatientAge() {
		return age;
	}
	public void setPatientAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctorAssigned() {
		return doctorAssigned;
	}
	public void setDoctorAssigned(String doctorAssigned) {
		this.doctorAssigned = doctorAssigned;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	public boolean getAdmitted() {
		return admitted;
	}
	public void setAdmitted(boolean admitted) {
		this.admitted = admitted;
	}
	
}
