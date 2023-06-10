package bangdiem;

public class BangDiem {
    private String ma,ten;
    private double[] diem;
    public BangDiem(int stt, String ten, double[] diem) {
        if(stt < 10){
            this.ma = "HS" + String.format("%02d",stt);
        }else {
            this.ma = "HS" + String.format("%03d", stt);
        }
        this.diem = new double[10];
        this.ten = ten;
        for(int i = 0; i < 10; i++){
            this.diem[i] = diem[i];
        }
    }
    public double getTongDiem(){
        double res = 0;
        for(int i = 0; i < 10; i++){
            res += this.diem[i];
        }
        return res / 10;
    }
    public String getMa(){
        return this.ma;
    }
    public String toString(){
        String kq = "";
        if(getTongDiem() >= 9.0){
            kq = "XUAT SAC";
        }else if(getTongDiem() >= 8 && getTongDiem() < 9 ){
            kq = "GIOI";
        }else if(getTongDiem() >= 7 && getTongDiem() < 8 ){
            kq = "KHA";
        }else if (getTongDiem() >= 5 && getTongDiem() < 7){
            kq = "TB";
        }else {
            kq = "YEU";
        }
        return ma + " " + ten + " " + String.format("%.1f", getTongDiem()) + " " + kq;
    }
}
