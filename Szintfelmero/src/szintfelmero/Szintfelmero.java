
package szintfelmero;


public class Szintfelmero {

  
    public static void main(String[] args) {
       Telefon Myphone = new Telefon(Telefongyartok.SAMSUNG,"SamsungA52S",150000,true,true,true,true);
       Telefon Telefon2 = new Telefon(Telefongyartok.SAMSUNG,"SamsungA71",145000,true,true,true,true);
       Telefon Telefon3 = new Telefon(Telefongyartok.HUAWEI,"HuaweiP30",154000,true,true,true,true);
       Telefon Telefon4  = new Telefon(Telefongyartok.HONOR,"Honor50",146000,true,true,false,true);
       Telefon Telefon5 = new Telefon(Telefongyartok.SAMSUNG,"SamsungZfold4",780000,true,true,false,true);
       Telefon Telefon6 = new Telefon(Telefongyartok.XIAOMI,"Redminote10pro",140000,true,true,true,true);
       Telefon Telefon7 = new Telefon(Telefongyartok.APPLE,"Iphone14",385600,true,true,true,true);
       Telefon Telefon8 = new Telefon(Telefongyartok.SAMSUNG,"SamsungS22",266860,true,true,true,true);
       Telefon Telefon9 = new Telefon(Telefongyartok.TELEKOM,"TPhone5G",72380,true,true,true,true);
       Telefon Telefon10 = new Telefon(Telefongyartok.OPPO,"OppoA16S",76120,true,true,true,true);
       Ember Arpad = new Ember(152264,Myphone);
       
       Telefon[] phones = {Telefon2,Telefon3,Telefon4,Telefon5,Telefon6,Telefon7,Telefon8,Telefon9,Telefon10};
       
       System.out.println(Telefon.PhoneLister(phones, Arpad));
       System.out.println("Ennyi pénze maradt Árpádnak:"+" "+Telefon.BuyPhone(Arpad,Myphone,Telefon6));
       System.out.println("Az új telefonjának neve"+" "+Myphone.getNev());
       System.out.println(Telefon.PhoneSeller(Myphone));
    }
    
}
