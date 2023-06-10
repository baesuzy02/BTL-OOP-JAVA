package sortstudent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Students> list = new ArrayList<Students>();
        while (scanner.hasNextLine()) {
            String ma = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            Students st = new Students(ma, name, lop, email);
            list.add(st);
        }
        Collections.sort(list, new Comparator<Students>(){
            @Override
            public int compare(Students o1 , Students o2){
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(Students x : list){
            System.out.println(x);
        }
    }
    
}
