package student3;

public class Students {
    private String ma;
    private String name;
    private String lop;
    private String email;
    public Students(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }
    
}
