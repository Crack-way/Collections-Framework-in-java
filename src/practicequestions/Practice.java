package practicequestions;

import java.util.Scanner;


class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    try{
        System.out.println("Input value as a decimal");

        long input = sc.nextLong();

        if (input >= -128 && input <= 127) {

            System.out.println(input + " can be stored in  byte,short , int , long");

        } else if (input >= -32768 && input <= 32767) {

            System.out.println(input + " can be stored in short , int , long");
        } else if (input >= -2147483648 && input <= 2147483647) {
            System.out.println(input + " can be stored int and long");

        } else if (input >= -9223372036854775808L && input <= 9223372036854775807L) {
            System.out.println(input + " can be stored in long");

        }
    }
    catch(Exception e){
        System.out.println("Cant be stored");
    }
    }
}