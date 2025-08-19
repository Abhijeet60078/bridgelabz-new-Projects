import java.util.*;
public class assignment1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Bridgelabz!");
         //add two number
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        int celsius = sc.nextInt();
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
        int radius = sc.nextInt();
        int area = (int)(3.14 * radius * radius);
        System.out.println(area);
        int r = sc.nextInt();
        int h = sc.nextInt();
        int volume = (int)(3.14 * r * r * h);
        System.out.println(volume);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int si = (principal * rate * time) / 100;
        System.out.println(si);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        int power = (int)Math.pow(base, exp);
        System.out.println(power);
         int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int avg = (n1 + n2 + n3) / 3;
        System.out.println(avg);
        int km = sc.nextInt();
        int miles = (int)(km * 0.621371);
        System.out.println(miles);



        
    }

}
