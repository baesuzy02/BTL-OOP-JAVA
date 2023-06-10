package sundayleague;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<League> a = new ArrayList<League>();
        for(int i = 1; i <= 20; i++){
            scanner.nextLine();
            League le = new League(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            a.add(le);
            scanner.nextLine();
            scanner.nextLine();
        }

        for (int i = 1; i <= 10; i++) {
            String s = scanner.nextLine();
            String[] b = s.split("\\s+");
            int index = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[j].equals("-")) {
                    index = j;
                }
            }
            int t1 = Integer.parseInt(b[index - 1]);
            int t2 = Integer.parseInt(b[index + 1]);
            String ans = "";
            for (int j = 0; j < index; j++) {
                ans += b[j] + " ";
            }
            ans = ans.substring(0, ans.length() - 1);
            String res = "";
            for (int j = index + 2; j < b.length; j++) {
                res += b[j] + " ";
            }
            res = res.substring(0, res.length() - 1);
            for (League le : a) {
                if (le.getTen().equals(ans)) {
                    le.setDaDau(le.getDaDau() + 1);
                    le.setHieu(le.getHieu() + t1 - t2);
                    if (t1 > t2) {
                        le.setDiem(le.getDiem() + 3);
                    }
                }
                if (le.getTen().equals(res)) {
                    le.setDaDau(le.getDaDau() + 1);
                    le.setHieu(le.getHieu() + t2 - t1);
                    if (t2 > t1) {
                        le.setDiem(le.getDiem() + 3);
                    }
                }
            }
            Collections.sort(a, new Comparator<League>(){
                @Override
                public int compare(League o1, League o2){
                    if(o1.getDiem() == o2.getDiem()){
                        if(o1.getHieu() > o2.getHieu())
                        return -1;
                        else if(o1.getHieu() == o2.getHieu()){
                            if(o1.getTen().compareTo(o2.getTen()) < 0)
                                return -1;
                            else 
                                return 1;    
                        }
                        else 
                                return 1;
                    }else {
                        if(o1.getDiem() > o2.getDiem()){
                            return -1;
                        }else {
                            return 1;
                        }
                    }
                }
            });
            int cnt = 1;
            for(League tmp : a){
                tmp.display(cnt);
                cnt++;
            }
        }
    }  
}
