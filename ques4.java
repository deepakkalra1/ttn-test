@FunctionalInterface
interface Initializing{
    public Employee initFunctionalInterface(String name,int age,String city);
}


class Employee{
    Employee(String name,int age,String city){
        this.Name = name;
    }

    String Name;
    int Age;
    String City;


}

public class ques4 {
    public static void main(String[] args) {
        Initializing init = Employee::new;
        Employee employee = init.initFunctionalInterface("abc", 1, "abc");

        System.out.println(employee.Name);

    }
}
