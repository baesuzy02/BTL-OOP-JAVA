package phanso2;

public class PhanSo{
    private int tu1,tu2;
    private int mau1,mau2;

    public PhanSo(int tu1,int tu2, int mau1,int mau2){
        this.tu1 = tu1;
        this.tu2 = tu2;
        this.mau1 = mau1;
        this.mau2 = mau2;
    }
    public long gcd(long a , long b){
        if(b == 0){
            return a;
        }else {
            return gcd(b, b % a);
        }
    }
    public String bieuThuc1(){
        long A = this.tu1 / (this.gcd(this.tu1, this.mau1));
        long B = this.mau1 / (this.gcd(this.tu1, this.mau1));
        long C = this.tu2 / (this.gcd(this.tu2, this.mau2));
        long D = this.mau2 / (this.gcd(this.tu2, this.mau2));
        long x = (long)Math.pow(A * D + B * C,2);
        long y = (long)Math.pow(B * D ,2);
        long tu = x / (this.gcd(x,y));
        long mau = y / (this.gcd(x,y));
        return tu + "/" + mau;
    }
    public String bieuThuc2(){
        long A = this.tu1 / (this.gcd(this.tu1, this.mau1));
        long B = this.mau1 / (this.gcd(this.tu1, this.mau1));
        long C = this.tu2 / (this.gcd(this.tu2, this.mau2));
        long D = this.mau2 / (this.gcd(this.tu2, this.mau2));
        long x = (long)Math.pow(A * D + B * C,2);
        long y = (long)Math.pow(B * D ,2);
        long E = x/(this.gcd(x,y));
        long F = y / (this.gcd(x, y));
        long tu = A * C * E;
        long mau = B * D * F;
        if(tu < 0 && mau < 0){
            return Math.abs(tu / (this.gcd(tu,mau))) + "/" + Math.abs(mau / (this.gcd(tu,mau)));
        }else {
            return tu / (this.gcd(tu, mau)) + "/" + mau / (this.gcd(tu, mau));
        }
    }
    public void in(){
        System.out.println(this.bieuThuc1() + " " + this.bieuThuc2());
    }
}