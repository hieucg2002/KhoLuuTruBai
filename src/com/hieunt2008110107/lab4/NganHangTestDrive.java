package lab4;

public class NganHangTestDrive {
    public static void main(String[] args) {
    Account account;
    account= new Account(2008110107,500000);
    account.showData();
    account.deposit(900000);
    account.showData();
    account.withdraw(500000);
    account.showData();
    System.out.println("=================");

    Customer customer;
    customer=new Customer();
    customer.getName();
    customer.getAddress();
    customer.showCustomer();
    System.out.println("==================");

    Employee employee;
    employee = new Employee();
    employee.getName();
    employee.getSalary();
    employee.showEmloyee();
    System.out.println("===================");
    }
}
