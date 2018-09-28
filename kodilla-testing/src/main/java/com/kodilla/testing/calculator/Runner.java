package com.kodilla.testing.calculator;

public class Runner {
        public static void main(String[] args) {
            Calculator calc = new Calculator();

            int res1 = calc.add(555, 445);
            int res2 = calc.subtract(1000, 100);
           System.out.println(res1);
            System.out.println(res2);

            if (res1 == 1000)
                if (res2 == 900) {
                    System.out.println("Working");
                }else{
                    System.out.println("Doesn't working");


                }
        }
        }


