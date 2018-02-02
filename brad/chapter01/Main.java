package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fibonacci of 0 is\t\t0,\tfibonacci(0) returns:\t" + fibonacci(0) + ".");
        System.out.println("Fibonacci of 2 is\t\t1,\tfibonacci(2) returns:\t" + fibonacci(2) + ".");
        System.out.println("Fibonacci of 10 is\t\t55,\tfibonacci(10) returns:\t" + fibonacci(10) + ".\n");

        System.out.println("Factorial of 0 is\t\t 1,\tfactorial(0) returns:\t" + factorial(0) + ".");
        System.out.println("Factorial of 1 is\t\t 1,\tfactorial(1) returns:\t" + factorial(1) + ".");
        System.out.println("Factorial of 3 is\t\t 6,\tfactorial(3) returns:\t" + factorial(3) + ".");
        System.out.println("Factorial of 10 is 3628800,\tfactorial(10) returns:\t" + factorial(10) + ".\n");

        System.out.println("PowerN of 3 to 1 is\t\t3,\t\tpower_n(3, 1) returns:\t" + power_n(3, 1) + ".");
        System.out.println("PowerN of 3 to 2 is\t\t9,\t\tpower_n(3, 2) returns:\t" + power_n(3, 2) + ".");
        System.out.println("PowerN of 3 to 3 is\t\t27,\t\tpower_n(3, 3) returns:\t" + power_n(3, 3) + ".");
        System.out.println("PowerN of 2 to 8 is\t\t256,\tpower_n(2, 8) returns:\t" + power_n(2, 8) + ".\n");

        System.out.println("StringClean of 'yyzzza' is\t\t\t\t'yza',\t\t\tstring_clean('yyzzza') returns:\t\t\t\t'" + string_clean("yyzzza") + "'.");
        System.out.println("StringClean of 'abbbcdd' is\t\t\t\t'abcd',\t\t\tstring_clean('abbbcdd') returns:\t\t\t'" + string_clean("abbbcdd") + "'.");
        System.out.println("StringClean of 'Hello' is\t\t\t\t'Helo',\t\t\tstring_clean('Hello') returns:\t\t\t\t'" + string_clean("Hello") + "'.");
        System.out.println("StringClean of 'XXabcYY' is\t\t\t\t'XabcY',\t\tstring_clean('XXabcYY') returns:\t\t\t'" + string_clean("XXabcYY") + "'.");
        System.out.println("StringClean of '112ab445' is\t\t\t'12ab45',\t\tstring_clean('112ab445') returns:\t\t\t'" + string_clean("112ab445") + "'.");
        System.out.println("StringClean of 'Hello Bookkeeper' is\t'Helo Bokeper',\tstring_clean('Hello Bookkeeper') returns:\t'" + string_clean("Hello Bookkeeper") + "'.\n");

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

    private static int factorial(int n){
        if (n>1) {return n*factorial(n-1);}
        else {return 1;}
    }

    private static int power_n(int x, int y){
        if (y==0) {return 1;}
        return power_n(x, y-1)*x;
    }

    private static String string_clean(String s){
        if (s.length() <= 1) {return s;}
        if (s.charAt(s.length()-1) != s.charAt(s.length()-2)) {return string_clean(s.substring(0,s.length()-1)) + s.substring(s.length()-1,s.length());}
        return string_clean(s.substring(0,s.length()-1));
    }

    private static boolean split_array(int[] n){
        if (n.length<=0) {return true;}
        else {
            ArrayList<Integer> N = new ArrayList<>(Arrays.stream(n).boxed().collect(Collectors.toList()));

            int[] sum_A = new int[]{0};
            int[] sum_B = new int[]{0};

            split_array_worker(N, sum_A, sum_B);
            return sum_A[0] == sum_B[0];
        }
    }

    private static void split_array_worker(ArrayList<Integer> N, int[] sum_A, int[] sum_B){
        if (N.size()>0) {
            int next_biggest_index = split_array_next_biggest(N, 0, 0);

            if (sum_A[0] < sum_B[0]) {
                sum_A[0] += N.get(next_biggest_index);
            } else {
                sum_B[0] += N.get(next_biggest_index);
            }
            N.remove(next_biggest_index);
            split_array_worker(N, sum_A, sum_B);
        }
    }

    private static int split_array_next_biggest(ArrayList<Integer> N, int i, int biggest){
        if (i >= N.size()) {return biggest;}
        if (N.get(i) > N.get(biggest)) {return split_array_next_biggest(N, i+1, i);}
        return split_array_next_biggest(N, i+1, biggest);
    }
}
