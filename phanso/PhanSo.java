package phanso;

public class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    public long gcd(long a, long b){
           if(b == 0){
            return a;
           }else {
            return gcd(b, a % b);
           }
    }
    public void print(){
        long x = tu/gcd(tu,mau);
        long y = mau/gcd(tu, mau);
        System.out.println(x + "/" + y);
    }
    
}
