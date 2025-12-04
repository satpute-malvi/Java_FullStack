package encapsulation_practice;

public class CallingHospitalPatient {

	public static void main(String[] args) {

		HospitalPatient hp = new HospitalPatient();
		
		hp.setAdmissionDate("1 Dec 2025");
		hp.setAdmitted(false);
		hp.setPatientAge(25);
		hp.setDisease("Viral Cold");
		hp.setDoctorAssigned("A. B. Patil");
		hp.setGender("Female");
		hp.setPatientName("Riya");
		hp.setPatientId(234);
		
		System.out.println("<----------Patient Info------------->");
		System.out.println("Admission Date        : " + hp.getAdmissionDate());
		System.out.println("Admitted Satatus      : " + hp.getAdmitted());
		System.out.println("Patient Disease       : " + hp.getDisease());
		System.out.println("Doctor Assigned       : " + hp.getDoctorAssigned());
		System.out.println("PatientId             : " + hp.getPatientId());
		System.out.println("Patient Name          : " + hp.getPatientName());
		System.out.println("Patient Gender        : " + hp.getGender());
		System.out.println("Patient age           : " + hp.getPatientAge());
		
	}

}
