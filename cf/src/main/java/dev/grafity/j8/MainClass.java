package dev.grafity.j8;

import java.util.*;
import java.lang.*;

class Solution {
/**
 * @param String[] ops - List of operations
 * @return int - Sum of scores after performing all operations
 */
    public static int calPoints(String[] ops) {
        int result = Integer.MIN_VALUE;
        List<Integer> results = new ArrayList <>();
        
        for(String op:ops){          
          switch(op){            
            case "+":
              results.add(results.get(results.size()-1)+results.get(results.size()-2));
              break;
            case "D":
              results.add(results.get(results.size()-1)*2);
              break;
            case "C":
              results = results.subList(0,results.size()-1);
              break;
            default:  
              results.add(Integer.parseInt(op));
          }
        }
        int sum = results.stream().reduce(0,Integer::sum);
        System.out.println(sum);
        return sum;        
    }
}


public class MainClass
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] ops = sc.nextLine().split(" ");

        System.out.println(Solution.calPoints(ops));
    }
}