/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.minimum.pkg3.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUTY.com
 */
public class TheMinimum3Numbers {

    public void getminimum3numbers() {
        ArrayList arr = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count Of The Numbers");
        int x = in.nextInt();
        //int i=0;
        System.out.println("Enter Your Numbers");
        for (int j = 0; j < x; j++) {
            int s = in.nextInt();
            arr.add(s);
        }

        Collections.sort(arr);

        for (int j = 0; j < 4; j++) {
            if (arr.get(j) == arr.get(j + 1)) {
                System.out.print(arr.get(j + 1));
                j++;

            } else {
                System.out.print(arr.get(j));

            }
            

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        TheMinimum3Numbers x = new TheMinimum3Numbers();
        x.getminimum3numbers();
    }

}
