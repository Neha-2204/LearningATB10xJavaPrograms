package ex_06_Ternary_Operator;

public class Largest_number {
    public static void main(String[] args) {
        //int a = 20;
        //int b = 30;
        //int c = 40;
        String a_string = args[0];
        String b_string = args[1];
        String c_string = args[2];
        int a = Integer.parseInt(a_string);
        int b = Integer.parseInt(b_string);
        int c = Integer.parseInt(c_string);
        String result = (a>b)?((a>c)?"Largest  is a":"Largest  is c"):((b>c)?"Largest  is b":"Largest  is c");
        System.out.println(result);
    }
}
