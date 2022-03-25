/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacban.xuatnhap;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class xnduongtron {
    public static void main(String[] args){
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap ban kinh: ");
        String input = sc.nextLine();
        a = Double.parseDouble(input)*3.14;
        System.out.println("Chu vi duong tron la: " + a);
    }
}
