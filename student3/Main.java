package student3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Students> st = new ArrayList<>();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            String ma = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            Students st1 = new Students(ma, name, lop, email);
            st.add(st1);
        }
        Collections.sort(st, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.getLop().equals(o2.getLop()) == false) {
                    return o1.getLop().compareTo(o2.getLop());
                }
                else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        for(Students x : st) {
            System.out.println(x.toString());
        }
    }
    }
    

