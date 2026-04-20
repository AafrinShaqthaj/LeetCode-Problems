package Integers;

//  https://leetcode.com/problems/fizz-buzz/description/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n; i++){
            result.add((i%3 == 0 && i%5 ==0) ? "FizzBuzz" : (i%5 == 0) ? "Buzz" : (i%3 == 0) ? "Fizz" : String.valueOf(i));
        }
        return result;
    }
}
