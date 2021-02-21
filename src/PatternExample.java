/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 2/20/2021
 *   Time: 9:09 PM
 *   File: PatternExample.java
 */
import java.util.Scanner;

public class PatternExample {
    public static void main(String[] args) {
        int i, j, rows = 9;
        for (i = 1; i < rows; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}