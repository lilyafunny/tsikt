public class Main {
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student("S12345", "Alice", "Smith", 20);
        System.out.println("Student Info:");
        student.getInfo();

        System.out.println();

        // Create Employee object
        Employee employee = new Employee("Bob", "Johnson", 45);
        System.out.println("Employee Info:");
        employee.getInfo();
    }
}