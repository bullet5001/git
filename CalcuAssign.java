package Methods;

import java.util.Scanner;

public class CalcuAssign {

    public static void main(String[] args) {
        char op='y';
        do {
            switch (Calculation.display()) {
                case 1: {
                    System.out.println("ENTER THE NUMBER OF OPERANDS YOU WANT TO ADD (2 0R 3)");
                    Scanner opr = new Scanner(System.in);
                    if (opr.nextInt() > 2)
                        System.out.println("ADDITION OF TWO NUMBERS IS " + Calculation.sum(Calculation.scan1(), Calculation.scan2(), Calculation.scan3()));
                    else
                        System.out.println("ADDITION OF TWO NUMBERS IS " + Calculation.sum(Calculation.scan1(), Calculation.scan2()));
                   op= Calculation.exitOp();
                    break;
                }
                case 2:
                    System.out.println("RESULT OF SUBTRACTION IS  " + Calculation.subtraction(Calculation.scan1(), Calculation.scan2()));
                    op=Calculation.exitOp();
                    break;
                case 3:
                    System.out.println("RESULT OF MULTIPLICATION IS  " + Calculation.multi(Calculation.scan1(), Calculation.scan2()));
                   op= Calculation.exitOp();
                    break;
                case 4:
                    System.out.println("RESULT FOR THE DIVISION IS " + Calculation.division(Calculation.scan1(), Calculation.scan2()));
                    op=Calculation.exitOp();
                    break;
                default:
                    System.out.println("INVALID OPTION");
                    op=Calculation.exitOp();
            }
        }while(op=='y');
    }
}