package gioquannet;

public class GioQuanNet {
    private String username;
    private String password;
    private String name;
    private String gioVao;
    private String gioRa;
    public GioQuanNet(String username, String password, String name, String gioVao, String gioRa) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGioVao() {
        return gioVao;
    }
    public void setGioVao(String gioVao) {
        this.gioVao = gioVao;
    }
    public String getGioRa() {
        return gioRa;
    }
    public void setGioRa(String gioRa) {
        this.gioRa = gioRa;
    }
    public int getGio() {
        int a = Integer.parseInt(gioVao.substring(0, 2));
        int b = Integer.parseInt(gioVao.substring(3, gioVao.length()));
        int c = Integer.parseInt(gioRa.substring(0, 2));
        int d = Integer.parseInt(gioRa.substring(3, gioRa.length()));
        int hh = c - a;
        int mm = d - b;
        if(mm < 0) {
            mm = 60 + mm;
            --hh;
        }
        return hh;
    }
    public int getPhut() {
        int a = Integer.parseInt(gioVao.substring(0, 2));
        int b = Integer.parseInt(gioVao.substring(3, gioVao.length()));
        int c = Integer.parseInt(gioRa.substring(0, 2));
        int d = Integer.parseInt(gioRa.substring(3, gioRa.length()));
        int hh = c - a;
        int mm = d - b;
        if(mm < 0) {
            mm = 60 + mm;
            --hh;
        }
        return mm;
    }
    public String thoiGian() {
        int a = Integer.parseInt(gioVao.substring(0, 2));
        int b = Integer.parseInt(gioVao.substring(3, gioVao.length()));
        int c = Integer.parseInt(gioRa.substring(0, 2));
        int d = Integer.parseInt(gioRa.substring(3, gioRa.length()));
        int hh = c - a;
        int mm = d - b;
        if(mm < 0) {
            mm = 60 + mm;
            --hh;
        }
        return hh +" gio " + mm + " phut"; 
    }
    @Override
    public String toString() {
        return username + " " + password + " " + name + " " + thoiGian();
    }
    
}
