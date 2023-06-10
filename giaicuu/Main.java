package giaicuu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine().substring(8));
        int blood = Integer.parseInt(scanner.nextLine().substring(8));
        String tmp = scanner.nextLine();
        boolean alive = false;
        if(tmp.equals("ALIVE")) alive = true;

        NhanVat nv = new NhanVat(power, blood, alive);
        int event = scanner.nextInt(); scanner.nextLine();
        for(int i = 0; i < event; i++){
            String s = scanner.nextLine();
            if(s.equals("pea")){
                nv.pea();
            }else if(s.equals("mushroom")){
                nv.mushroom();
            }else if(s.charAt(0) == 's'){
                int power1 = Integer.parseInt(s.substring(8));
                nv.soldier(power1);
            }else {
                int power1 = Integer.parseInt(s.substring(6));
                nv.witch(power1);
            }
            System.out.println(nv);
        }
    }   
}
