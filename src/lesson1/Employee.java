package lesson1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Степанов Степан", "Экономист", "stepan@mailbox.com", "212315318", 50000, 33);
        persArray[2] = new Employee("Алексеев Алексей", "Юрист", "alex@mailbox.com", "212234543", 60000, 35);
        persArray[3] = new Employee("Андреев Андрей", "Бухгалтер", "andr@mailbox.com", "212654765", 70000, 31);
        persArray[4] = new Employee("Николаев Николай", "Водитель", "nik@@maibox.com", "212987789", 20000, 45);
    }
}
