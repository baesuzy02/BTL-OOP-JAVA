package teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<Teacher> a = new ArrayList<>();
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0; i<n; i++) {
                Teacher tmp = new Teacher(i + 1 , sc.nextLine(), sc.nextLine());
                a.add(tmp);
            }
            Collections.sort(a, new Comparator<Teacher>() {
                @Override
                public int compare(Teacher o1, Teacher o2) {
                    if(o1.getTen().equals(o2.getTen()) == false) {
                        return o1.getTen().compareTo(o2.getTen());
                    }
                    else {
                        return o1.getMa().compareTo(o2.getMa());
                    }
                }
            });
            for(Teacher x : a) {
                System.out.println(x);
            }
    }
}