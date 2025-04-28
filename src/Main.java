public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Алексадр Костылев", 1, 5000);
        employees[1] = new Employee("Евгений Aunkere", 2, 600000);
        employees[2] = new Employee("Ростик uglyfacekid", 3, 550000);
        employees[3] = new Employee("Кирилл helin139", 1, 700000);
        employees[4] = new Employee("Влад lattyk", 4, 450000);
        employees[5] = new Employee("Даня em0k1d", 5, 300000);
        employees[6] = new Employee("Дмитрий sh1ro", 2, 980000);
        employees[7] = new Employee("Даня donk", 3, 999000);
        employees[8] = new Employee("Илья m0nesy", 4, 4000000);
        employees[9] = new Employee("Денис deko Жуков", 1, 10000000);

        System.out.println("Все сотрудники:");
        Employee.printAllEmployees(employees);

        System.out.println("\nСумма затрат на зарплату в месяц: " + Employee.calculateTotalSalary(employees));
        Employee minSalaryEmployee = Employee.findEmployeeWithMinSalary(employees);
        System.out.println("\nСотрудник с минимальной зарплатой: " + minSalaryEmployee);

        Employee maxSalaryEmployee = Employee.findEmployeeWithMaxSalary(employees);
        System.out.println("\nСотрудник с максимальной зарплатой: " + maxSalaryEmployee);

        System.out.println("\nСреднее значение зарплат: " + Employee.calculateAverageSalary(employees));

        System.out.println("\nФИО всех сотрудников:");
        Employee.printEmployeeNames(employees);
    }
}