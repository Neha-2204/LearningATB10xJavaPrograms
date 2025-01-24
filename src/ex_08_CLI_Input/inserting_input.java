package ex_08_CLI_Input;

public class inserting_input {
    public static void main(String[] args) {
        String Name_string = args[0];
        String age_string = args[1];
        String salary_string = args[2];
        int age = Integer.parseInt(age_string);
        int salary = Integer.parseInt(salary_string);
        System.out.println("The name is "+Name_string);
        System.out.println("The age is "+age);
        System.out.println("The salary is "+salary);

    }
}
