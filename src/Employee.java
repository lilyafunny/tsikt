class Employee implements Person {
    private String name;
    private String surname;
    private int age;
    private static final int RETIREMENT_AGE = 62;

    // Constructor for Employee class
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Method to calculate years left until retirement
    public int yearsToRetire() {
        return RETIREMENT_AGE - age;
    }

    // Implement getInfo() to print employee information
    @Override
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        if (age < RETIREMENT_AGE) {
            System.out.println("Years to retire: " + yearsToRetire());
        } else {
            System.out.println("Already retired.");
        }
    }
}