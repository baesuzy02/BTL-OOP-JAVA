package sortstudent;

public class Students {
       private String ma;
       private String name;
       private String lopHoc;
       private String email;
    public Students(String ma, String name, String lopHoc, String email) {
        this.ma = ma;
        this.name = name;
        this.lopHoc = lopHoc;
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
    public String getLopHoc() {
        return lopHoc;
    }
    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override 
    public String toString() {
        return ma + " " + name + " " + lopHoc + " " + email;
    }
       
}