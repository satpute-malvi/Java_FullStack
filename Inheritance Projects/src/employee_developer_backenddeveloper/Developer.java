package employee_developer_backenddeveloper;

public class Developer extends Employee {

	private String programmingLanguage;

    public Developer() {
        this("Unknown", 0, 0.0, "Not Assigned");
    }

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);   // calling parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloper() {
        System.out.println("----- Developer Details -----");
        System.out.println("Programming Language: " + programmingLanguage);
    }

    public String getProgrammingLanguage() { return programmingLanguage; }
    public void setProgrammingLanguage(String programmingLanguage) { 
        this.programmingLanguage = programmingLanguage;
    }
    
}