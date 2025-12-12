package employee_developer_backenddeveloper;

public class BackendDeveloper extends Developer {

    private String framework;
    private String database;

    public BackendDeveloper() {
        this("Unknown", 0, 0.0, "Not Assigned", "No Framework", "No DB");
    }

    public BackendDeveloper(String name, int id, double salary,
                            String programmingLanguage,
                            String framework, String database) {

        super(name, id, salary, programmingLanguage);   // calling Developer constructor

        this.framework = framework;
        this.database = database;
    }

    public void displayBackendDeveloper() {
        System.out.println("----- Backend Developer Details -----");
        System.out.println("Framework: " + framework);
        System.out.println("Database: " + database);
    }

    public String getFramework() { return framework; }
    public void setFramework(String framework) { this.framework = framework; }

    public String getDatabase() { return database; }
    public void setDatabase(String database) { this.database = database; }
}