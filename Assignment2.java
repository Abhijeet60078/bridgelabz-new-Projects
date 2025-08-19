import java.util.*;
public class assignment2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int birth = 2000;
        int currentYear = 2024;
        int age = currentYear - birth;
        System.out.println(age);
        int m = 94, p = 95, c = 96;
        int avg = (m + p + c) / 3;
        System.out.println(avg);
        double km = 10.8;
        double miles = km * 1.6;
        System.out.println(km + " km in miles is " + miles);
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;
        System.out.println(costPrice + " " + sellingPrice +"\n" + profit + " " + profitPercent);
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println(perStudent + " " + remaining);
        int fee = 125000;
        int discountPercent = 10;
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        System.out.println(" " + discount + " " + finalFee);
        double radiusKm = 6378;
        double volumeKm = (4.0/3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("" + volumeKm + "" + volumeMiles);
        double pk = sc.nextDouble();
        double mil = km / 1.6;
        System.out.println("" + mil + "" + pk + " km");
        int ee = sc.nextInt();
        int dP = sc.nextInt();
        int dis = (ee * dP) / 100;
        int ff = fee - dis;
        System.out.println("The discount amount is INR " + dP + " and final discounted fee is INR " + ff);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Add" + (num1 + num2));
        System.out.println("Sub" + (num1 - num2));
        System.out.println("Mul" + (num1 * num2));
        System.out.println("Div" + (num1 / num2));
         double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println(" " + area + "");
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println(+ side + " " + perimeter);
        int feet = sc.nextInt();
        double yards = feet / 3.0;
        double mp = yards / 1760.0;
        System.out.println("The distance is " + feet + " feet, which is " + yards + " yards and " + mp + " miles");
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();
        int total = unitPrice * quantity;
        System.out.println(" " + total + "  " + quantity + " " + unitPrice);
        int Students = sc.nextInt();
        int handshakes = (Students * (Students - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);



    }}
