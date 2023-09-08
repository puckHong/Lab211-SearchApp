/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Validtion {

    private Scanner sc = new Scanner(System.in);

    public String getValue(String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine();
            input.trim();
            if (input == null || input.length() == 0) {
                System.out.println("Do not enter null data. Please enter again.");
                continue;
            }
            return input;
        }
    }

    public int getValueInt(String msg) {
        while (true) {

            String check = getValue(msg);
            try {
                int output = Integer.parseInt(check);
                if (output <= 0) {
                    System.out.println("Please just enter positive number");
                    continue;
                } else {
                    return output;
                }
            } catch (Exception e) {
                System.out.println("Can't follow wrong data type. Please input again.");
            }
        }
    }

}
