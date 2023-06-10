package bangdiem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BangDiem> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            sc.nextLine();
            double diem[] = new double[10];
            String t = sc.nextLine();
            for(int j=0; j<10; j++) {
                diem[j] = sc.nextDouble();
            }
            BangDiem tmp = new BangDiem(i + 1 , t, diem);
            arr.add(tmp);
        }
        Collections.sort(arr, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if(o1.getTongDiem() < o2.getTongDiem()) {
                    return 1;
                }
                if(o1.getTongDiem() > o2.getTongDiem()) {
                    return -1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }
        
    }
    
}
