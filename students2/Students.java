package students2;

import java.util.*;

public class Students {
    private String ma;
    private String name;
    private String ngaySinh;
    private String lopHoc;
    private double diemGPA;

    public Students(int stt, String name,String lopHoc ,String ngaySinh, double diemGPA) {
        this.ma = "SV" + String.format("%03d", stt);
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.lopHoc = lopHoc;
        this.diemGPA = diemGPA;
    }
    public Students(){

    }
    
    public String chuanHoaTen() {
        String chuanHoa = "";
        String token[] = name.split("\\s+");
        for(String x : token) {
            chuanHoa += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++) {
                chuanHoa += Character.toLowerCase(x.charAt(i));
            }
            chuanHoa += " ";
        }
        return this.name = chuanHoa.trim();
    }
    public String chuanHoa(){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3,"0");
        }
        return this.ngaySinh = sb.toString();
    }
    @Override
    public String toString(){
        return ma + " " + chuanHoaTen() + " " + lopHoc + " " + chuanHoa() + " " + String.format("%.2f", diemGPA);
    }
}
