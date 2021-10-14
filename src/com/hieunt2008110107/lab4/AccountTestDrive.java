package lab4;

public class AccountTestDrive {
    public static void main(String[] args) {
    Account account;
    account= new Account(2008110107,500000);
    account.showData();
    account.deposit(900000);
    account.showData();
    account.withdraw(500000);
    account.showData();

    Customer customer;
    customer=new Customer();
    customer.getName();
    customer.getAddress();
    customer.showCustomer();


    Employee employee;
    employee = new Employee();
    employee.getName();
    employee.getSalary();
    }
}
