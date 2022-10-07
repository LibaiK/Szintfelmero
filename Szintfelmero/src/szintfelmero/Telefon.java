
package szintfelmero;

public class Telefon {
    public Telefongyartok Gyarto;
    public String nev;
    public Integer ar;
    public Boolean Gyorst;
    public Boolean GPS;
    public Boolean JackC;
    public Boolean Videofelvetel;

    public Telefon(Telefongyartok Gyarto, String nev, Integer ar, Boolean Gyorst, Boolean GPS, Boolean JackC, Boolean Videofelvetel) {
        this.Gyarto = Gyarto;
        this.nev = nev;
        this.ar = ar;
        this.Gyorst = Gyorst;
        this.GPS = GPS;
        this.JackC = JackC;
        this.Videofelvetel = Videofelvetel;
    }

    public Telefongyartok getGyarto() {
        return Gyarto;
    }

    public void setGyarto(Telefongyartok Gyarto) {
        this.Gyarto = Gyarto;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public Boolean getGyorst() {
        return Gyorst;
    }

    public void setGyorst(Boolean Gyorst) {
        this.Gyorst = Gyorst;
    }

    public Boolean getGPS() {
        return GPS;
    }

    public void setGPS(Boolean GPS) {
        this.GPS = GPS;
    }

    public Boolean getJackC() {
        return JackC;
    }

    public void setJackC(Boolean Jack) {
        this.JackC = Jack;
    }

    public Boolean getVideofelvetel() {
        return Videofelvetel;
    }

    public void setVideofelvetel(Boolean Videofelvetel) {
        this.Videofelvetel = Videofelvetel;
    }
    public static String PhoneLister(Telefon[] Testphone,Ember Arpad){
     for(Telefon t : Testphone){
         if(t.getAr()<Arpad.getAktualisPenz()){
            System.out.println("Az alábbi telefont megveheted:"+" "+t.getNev());
        }else{
            System.out.print("");
        }
    }
     return "";
    }
    public static Integer BuyPhone(Ember Arpad,Telefon Myphone,Telefon Telefon6){
        Arpad.setAktualisPenz(Arpad.getAktualisPenz()-Telefon6.getAr());
           Myphone.setGyarto(Telefongyartok.XIAOMI);
           Myphone.setNev("Redminote10pro");
           Myphone.setAr(140000);
           
           return Arpad.getAktualisPenz();
        }
    public static String PhoneSeller(Telefon Myphone){
        double levonas = Myphone.getAr()*0.5;
        return "Árpád eladta a telefonját"+" "+levonas+" "+"ért";
    }
    }
