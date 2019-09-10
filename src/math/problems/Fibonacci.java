package math.problems;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int fibo[] = new int[40];
        for (int i = 0; i < 40; i++) {
            if (i < 2) {
                fibo[i] = i;
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }
        System.out.println(Arrays.toString(fibo));


         int fib []= new int[40];
        for(int i=0;i<40;i++){
            if (i<2){
                fib[i]=i;
            }else{
                fib[i]=fibo[i-1]+fib[i-2];
            }


        }
        System.out.println(Arrays.toString(fib));
    }


    }



