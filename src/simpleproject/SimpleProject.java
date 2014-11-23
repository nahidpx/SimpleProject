/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleproject;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DBA
 */
public class SimpleProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int minNumber;
        int maxNumber;
        boolean flag = true;

        while (flag) {
            try {
                final String os = System.getProperty("os.name");
                System.out.println(os);
                Runtime.getRuntime().exec("cls");
                
            } catch (final Exception e) {
                System.out.println("I am an error\n" + e.getMessage());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for findout Prime Number.");
            System.out.println("Enter 2 for findout Perfect Number.");
            System.out.println("Enter 3 for findout Add Number.");
            System.out.println("Enter 0 to Terminate.");
            int input = sc.nextInt();

            MyMethods m = new MyMethods();

            switch (input) {
                case 1:
                    System.out.print("Enter Minimum Number");
                    minNumber = sc.nextInt();
                    System.out.print("Enter Max Number");
                    maxNumber = sc.nextInt();
                    while (minNumber <= maxNumber) {
                        if (m.isPrime(minNumber)) {
                            System.out.print(minNumber);
                        }

                        minNumber++;
                    }
                    break;
                case 2:
                    System.out.print("Enter Minimum Number");
                    minNumber = sc.nextInt();
                    System.out.print("Enter Max Number");
                    maxNumber = sc.nextInt();
                    while (minNumber <= maxNumber) {
                        if (m.isPerfect(minNumber)) {
                            System.out.print(minNumber + ", ");
                        }

                        minNumber++;
                    }
                    break;
                case 3:
                    System.out.print("Enter Minimum Number");
                    minNumber = sc.nextInt();
                    System.out.print("Enter Max Number");
                    maxNumber = sc.nextInt();
                    System.out.println(m.add(minNumber, maxNumber));
                    break;
                case 0:
                    System.out.println("The Program is Terminated");
                    flag = false;
                    break;
            }
        }
    }
}
