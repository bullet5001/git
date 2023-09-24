package Methods;

import java.util.Scanner;

public class Calculation {

public static double  sum(double num1, double num2){
    return(num1+num2);
}
public static double sum(double num1,double num2,double num3){
    return (num1+num2+num3);
}
public static double subtraction(double num1,double num2){
    return(num1-num2);
}
public static double multi(double num1,double num2){
    return (num1*num2);
}
public static double division(double num1,double num2){
    return (num1/num2);
}
public static int display(){
    Scanner scn=new Scanner(System.in);
    System.out.println("PRESS 1 FOR THE SUM");
    System.out.println("PRESS 2 FOR THE SUBTRACTION");
    System.out.println("PRESS 3 FOR THE MULTIPLICATION");
    System.out.println("PRESS 4 FOR THE DIVISION");
    int o= scn.nextInt();
    return o;
}
public static double scan1(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the First Number");
    return (s.nextDouble());
}
public static double scan2(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Second Number");
    return (s.nextDouble());
}
public static double scan3(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Third Number");
    return (s.nextDouble());
}
public static char exitOp(){
    System.out.println("      ");
    System.out.println("CHOOSE OPTIONS ");
    System.out.println("      ");
    System.out.println("PRESS Y FOR CONTINUE AND E EXIT");
    Scanner sc= new Scanner(System.in);
    return (sc.next().charAt(0));

}
}
