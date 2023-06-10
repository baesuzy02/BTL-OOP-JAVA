package phanso2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tu1 = new int[n];
        int[] mau1 = new int[n];
        int[] tu2 = new int[n];
        int[] mau2 = new int[n];
        PhanSo[] ps = new PhanSo[n];

        for (int i = 0; i < n; i++) {
            tu1[i] = sc.nextInt();
            mau1[i] = sc.nextInt();
            tu2[i] = sc.nextInt();
            mau2[i] = sc.nextInt();
            ps[i] = new PhanSo(tu1[i], tu2[i], mau1[i], mau2[i]);
        }

        for (int i = 0; i < n; i++) {
            ps[i].in();
        }
    }
}


