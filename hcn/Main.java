package hcn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();
        String mau = sc.next();

        Rectangle r = new Rectangle(dai, rong, mau);
        r.print();
    }
    
}
