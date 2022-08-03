package employee;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
    	//adding values to ArrayList
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"Rishabh",80000,24));
        employeeList.add(new Employee(2,"Rochak",90000,25));
        employeeList.add(new Employee(3,"Abhiraj",100000,23));
        employeeList.add(new Employee(4,"Shaddan",110000,24));
        employeeList.add(new Employee(5,"Aman",120000,25));
        employeeList.add(new Employee(6,"Pranav",130000,26));
        employeeList.add(new Employee(7,"Utkarsh",140000,27));
        employeeList.add(new Employee(8,"Harshit",150000,28));
        employeeList.add(new Employee(9,"Anshu",160000,29));
        employeeList.add(new Employee(10,"Sumit",170000,20));
        EmployeeList employeeList1 = new EmployeeList(employeeList);
        System.out.println("Enter key");
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
         //switch case
        switch (key){
            case 1: //Press 1 will display all the record
                employeeList1.display();
                break;
            case 2: //Press 2 will display all the record in descending order
                employeeList1.sort();
                employeeList1.display();
                break;
            case 3: //Press 3 will update the employee if Id is present in record else it will pass the message inavlid id
                System.out.println("Enter employee id");
                int id = s.nextInt();
                System.out.println("Enter employee updated salary");
                int salary = s.nextInt();
                if(employeeList1.update(id,salary)){
                    employeeList1.display();
                }
                else{
                    System.out.println("Invalid id provided");
                    
                }
                break;
            case 4:
                break;
        }
    }
}