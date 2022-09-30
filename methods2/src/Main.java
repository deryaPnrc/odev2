public class Main {
    public static void main(String[] args) {
        String mesaj="bugün hava çok güzel";
        String yeniMesaj=sehirVer();
        System.out.println(sehirVer());
        int sayi=topla(15,8565);
        System.out.println(sayi);
        int toplam=topla2(1,1,1,1,1,1,1,1,1,1);
        System.out.println(toplam);

    }
    public static void ekle(){
        System.out.println("eklendi");
    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void guncelle(){
        System.out.println("güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){ //... 1den fazla gönderilecek arka planda diziye çevirir
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public  static String sehirVer(){
        return "ankara";
    }

}
