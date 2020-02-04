package oo2020.w01_funktsioon;

public class HelloWorld {
    public static void main(String[] arg){
       System.out.println("Hello World");
       
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        // byte, short, int, long, float, double, char, boolean

        boolean flag = true;

        System.out.println(1+1); // * / - %
        // i++ on i = i+1
        int number = 5;
        System.out.println(number++);
        System.out.println(++number);

        if (number < 10 && number > 0){
            System.out.println("Jah");
        }



        for(int i = 0; i < 10; i++){
        
        }

        int count = 0;
        while(flag){
            if(!flag){

            }
            count++;
            if(count == 10){
               // System.out.println("bruh");
            }
            //ok
        }

        
        int counterTwo = 0;

        do{
            counterTwo++;
        } while(counterTwo == 10);

        int[] numberArray = new int[] {1, 2, 3, 4, 5};

        for(int element : numberArray){
            System.out.println(element);
        }

        for(int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }

        String myName = "Marten";

        System.out.println(myName);


    }

    static void printSomething(int number){
        int numbera = 10;
        for(int i = 1; i < 10; i++ ){
            number += i;
        }
    }
}