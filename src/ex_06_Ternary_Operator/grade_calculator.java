package ex_06_Ternary_Operator;

public class grade_calculator {
    public static void main(String[] args) {
        String r_string = args[0];
        int r = Integer.parseInt(r_string);
        String grade = (r>=90)?"A":(r>=80)?"B":(r>=70)?"C":((r>=60))?"D":"F";
        System.out.println(grade);
    }
}
