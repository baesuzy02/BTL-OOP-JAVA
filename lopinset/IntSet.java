package lopinset;

import java.util.*;
public class IntSet {
    private int []a;
    public IntSet(int[] a) {
        this.a = a;
    }
    public int[] getA(){
        return a;
    }
    public void setA( int []a){
        this. a = a;
    }
    public IntSet intersection (IntSet x){
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(x.getA());
        int cnt = 0;
        for(int i = 0 ; i < a.length ; i++){
            for (int j = 0; j < x.getA().length; j++){
                if(a[i] == x.getA()[j]){
                    if(arr.contains(a[i]) == false){
                        arr.add(a[i]);
                    }
                }
            }
        }
        int []c = new int[arr.size()];
        for(int i = 0; i < c.length; i++){
            c[i] = arr.get(i);
        }
        IntSet in = new IntSet(c);
        String t = "";
        for(int i = 0; i < c.length; i++){
            t += "" + c[i] + " ";
        }
        return in;
    }
    @Override
        public String toString() {
            String t = "";
            for(int i = 0; i < a.length; i++){
                t += "" + a[i] + " ";
            }
            return t;
        }  
}
