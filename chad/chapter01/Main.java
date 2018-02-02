package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fibonacci of 0 is\t\t0,\tchad_fibonacci(0) returns:\t" + chad_fibonacci(0) + ".");
        System.out.println("Fibonacci of 2 is\t\t1,\tchad_fibonacci(2) returns:\t" + chad_fibonacci(2) + ".");
        System.out.println("Fibonacci of 10 is\t\t55,\tchad_fibonacci(10) returns:\t" + chad_fibonacci(10) + ".\n");

        System.out.println("Factorial of 0 is\t\t 1,\tchad_factorial(0) returns:\t" + chad_factorial(0) + ".");
        System.out.println("Factorial of 1 is\t\t 1,\tchad_factorial(1) returns:\t" + chad_factorial(1) + ".");
        System.out.println("Factorial of 3 is\t\t 6,\tchad_factorial(3) returns:\t" + chad_factorial(3) + ".");
        System.out.println("Factorial of 10 is 3628800,\tchad_factorial(10) returns:\t" + chad_factorial(10) + ".\n");

        System.out.println("PowerN of 3 to 1 is\t\t3,\t\tchad_power(3, 1) returns:\t" + chad_power(3, 1) + ".");
        System.out.println("PowerN of 3 to 2 is\t\t9,\t\tchad_power(3, 2) returns:\t" + chad_power(3, 2) + ".");
        System.out.println("PowerN of 3 to 3 is\t\t27,\t\tchad_power(3, 3) returns:\t" + chad_power(3, 3) + ".");
        System.out.println("PowerN of 2 to 8 is\t\t256,\tchad_power(2, 8) returns:\t" + chad_power(2, 8) + ".\n");

        System.out.println("StringClean of 'yyzzza' is\t\t\t\t'yza',\t\t\tchad_clean('yyzzza') returns:\t\t\t\t'" + chad_clean("yyzzza") + "'.");
        System.out.println("StringClean of 'abbbcdd' is\t\t\t\t'abcd',\t\t\tchad_clean('abbbcdd') returns:\t\t\t'" + chad_clean("abbbcdd") + "'.");
        System.out.println("StringClean of 'Hello' is\t\t\t\t'Helo',\t\t\tchad_clean('Hello') returns:\t\t\t\t'" + chad_clean("Hello") + "'.");
        System.out.println("StringClean of 'XXabcYY' is\t\t\t\t'XabcY',\t\tstring_clean('XXabcYY') returns:\t\t\t'" + chad_clean("XXabcYY") + "'.");
        System.out.println("StringClean of '112ab445' is\t\t\t'12ab45',\t\tchad_clean('112ab445') returns:\t\t\t'" + chad_clean("112ab445") + "'.");
        System.out.println("StringClean of 'Hello Bookkeeper' is\t'Helo Bokeper',\tchad_clean('Hello Bookkeeper') returns:\t'" + chad_clean("Hello Bookkeeper") + "'.\n");

        System.out.println("SplitArray of [2, 2] is\t\t\t\t\t\ttrue,\tsplit_array([2, 2]) returns:\t\t\t\t\t" + split_array(new int[]{2, 2}) + ".");
        System.out.println("SplitArray of [2, 3] is\t\t\t\t\t\tfalse,\tsplit_array([2, 3]) returns:\t\t\t\t\t" + split_array(new int[]{2, 3}) + ".");
        System.out.println("SplitArray of [5, 2, 3] is\t\t\t\t\ttrue,\tsplit_array([2, 2]) returns:\t\t\t\t\t" + split_array(new int[]{5, 2, 3}) + ".");
        System.out.println("SplitArray of [5, 2, 2] is\t\t\t\t\tfalse,\tsplit_array([5, 2, 2]) returns:\t\t\t\t\t" + split_array(new int[]{5, 2, 2}) + ".");
        System.out.println("SplitArray of [] is\t\t\t\t\t\t\ttrue,\tsplit_array([]) returns:\t\t\t\t\t\t" + split_array(new int[]{}) + ".");
        System.out.println("SplitArray of [1] is\t\t\t\t\t\tfalse,\tsplit_array([1]) returns:\t\t\t\t\t\t" + split_array(new int[]{1}) + ".");
        System.out.println("SplitArray of [3, 5] is\t\t\t\t\t\tfalse,\tsplit_array([3, 5]) returns:\t\t\t\t\t" + split_array(new int[]{3, 5}) + ".");
        System.out.println("SplitArray of [1, 2, 3, 10, 10, 1, 1] is\ttrue,\tsplit_array([1, 2, 3, 10, 10, 1, 1]) returns:\t" + split_array(new int[]{1, 2, 3, 10, 10, 1, 1}) + ".");
        System.out.println("SplitArray of [1, 2, 2, 10, 10, 1, 1] is\tfalse,\tsplit_array([1, 2, 2, 10, 10, 1, 1]) returns:\t" + split_array(new int[]{1, 2, 2, 10, 10, 1, 1}) + ".");
        System.out.println("SplitArray of [1, 1, 1, 1, 1, 1] is\t\t\ttrue,\tsplit_array([1, 1, 1, 1, 1 1]) returns:\t\t\t" + split_array(new int[]{1, 1, 1, 1, 1, 1}) + ".");
        System.out.println("SplitArray of [1, 1, 1, 1, 1] is\t\t\tfalse,\tsplit_array([1, 1, 1, 1, 1]) returns:\t\t\t" + split_array(new int[]{1, 1, 1, 1, 1}) + ".\n");
    }

    private static int fibonacci(int index){
        if (index == 0) {return 0;}
        if (index == 1) {return 1;}
        return fibonacci(index-2) + fibonacci(index - 1);
    }

    // n = 11, a(11) = a(10) + a(9)
    // n = 10, a(10) = a(9) + a(8)
    // a(n) = a(n-1) + a(n-2)
    private static int chad_fibonacci(int input){
        if (input==0){ return 0;}
        if (input==1) {return 1;}
        return chad_fibonacci(input - 1) + chad_fibonacci(input - 2);
    }
    
    //0! = 1
    //1! = 1 = 1*1
    //3! = 6 = 3*2*1*1
    //5! = 120 = 5*4*3*2*1*1
    private static int chad_factorial(int input){
        if (input==0){return 1;}
        if (input==1) {return 1;}
        return input*chad_factorial(input-1);
    }
    
    //3^1 = 3 = 3
    //3^2 = 9 = 3*3
    //3^3 = 27 = 3 * 3 * 3
    private static int chad_power(int x, int y){
        if (y==1){ return x*y;}
        return x*chad_power(x, y-1);
    }
    
    //'yyyzzzayyy' -> 'yzay'
    private static String chad_clean(String input){
        if (input.length()==1) {return input;}
        if (input.charAt(0)==input.charAt(1)){return chad_clean(input.substring(1, input.length()));}
        return input.substring(0,1) + chad_clean(input.substring(1, input.length()));
    }

    private static boolean split_array(int[] n){
        return true;
    }

}
