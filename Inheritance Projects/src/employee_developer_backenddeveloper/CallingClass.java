package employee_developer_backenddeveloper;

public class CallingClass {

	public static void main(String[] args) {

        BackendDeveloper dev = new BackendDeveloper(
                "Malvi Satpute",
                101,
                80000,
                "Java",
                "Spring Boot",
                "MySQL"
        );

        // Display all info (step-by-step)
        dev.displayEmployee();
        dev.displayDeveloper();
        dev.displayBackendDeveloper();
    }

	}

