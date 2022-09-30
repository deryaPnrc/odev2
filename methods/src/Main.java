public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();sayiBulmaca();

    }
    public static  void sayiBulmaca(){ //camel casing java fonksiyon isimleri
        int [] sayilar =new int[]{1,2,5,7,9,0};
        int aranacak=3;
        boolean varMi=false;
        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        String mesaj=" ";
        if (varMi){
            mesaj="sayı mevcuttur"+aranacak;
           mesajVer(mesaj);
        }else {
            mesajVer("sayı mevcut değildir"+aranacak);
        }
    }
    public  static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}