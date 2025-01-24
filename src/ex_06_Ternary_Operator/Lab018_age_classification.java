package ex_06_Ternary_Operator;

public class Lab018_age_classification {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        String result= (age>=65)?"Senior":((age<18)?"Minor":"Adult");
        System.out.println(result);
    }
}
