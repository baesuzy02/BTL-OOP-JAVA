package gioquannet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GioQuanNet> gqn = new ArrayList<>();
        for(int i=0; i<n; i++) {
          String user = sc.nextLine();
          String pass = sc.nextLine();
          String name = sc.nextLine();
          String timIn = sc.nextLine();
          String timOut = sc.nextLine();
          GioQuanNet net = new GioQuanNet(user, pass, name, timIn, timOut);
          gqn.add(net);
        }
        Collections.sort(gqn, new Comparator<GioQuanNet>() {
            @Override
            public int compare(GioQuanNet o1, GioQuanNet o2) {
                if(o1.getGio() != o2.getGio()) {
                    return o2.getGio() - o1.getGio();
                }
                if(o1.getPhut() != o2.getPhut()) {
                    return o2.getPhut() - o1.getPhut();
                }
                return o1.getUsername().compareTo(o2.getUsername());
            }
        });
        for(int i=0; i<gqn.size(); i++) {
            System.out.println(gqn.get(i));
        }
    }
}