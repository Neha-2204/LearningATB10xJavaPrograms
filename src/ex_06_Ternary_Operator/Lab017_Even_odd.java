package ex_06_Ternary_Operator;

public class Lab017_Even_odd {
    public static void main(String[] args) {
        String num_string = args[0];
        int num = Integer.parseInt(num_string);
        String result = (num%2==0)?"Number is even":"Number is odd";
        System.out.println(result);
    }
}
