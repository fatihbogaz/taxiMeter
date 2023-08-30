package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20;
        double priceSubTotal;
        double priceTotal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km cinsinden giriniz :");
        km = scan.nextInt();
        priceSubTotal = (km * perKm) + 10;
        priceTotal = (priceSubTotal > 20) ? priceSubTotal : 20;
        System.out.println("Ödeyeceğiniz ücret : " + priceTotal);
    }
}
