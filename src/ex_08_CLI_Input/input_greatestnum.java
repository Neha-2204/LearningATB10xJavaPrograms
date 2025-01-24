package ex_08_CLI_Input;

public class input_greatestnum {
    public static void main(String[] args) {
        String a_string = args[0];
        String b_string = args [1];
        int a = Integer.parseInt(a_string);
        int b = Integer.parseInt(b_string);
        String result = a>b? ("The largest number is 'a' - "  + a):"The largest number is 'b' - " + b;
        System.out.println(result);
    }
}
