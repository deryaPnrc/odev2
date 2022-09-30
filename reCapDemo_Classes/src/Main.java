public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int topla = dortIslem.Topla(3, 4);
        System.out.println("Toplam= " + topla);
        int cikar = dortIslem.Cikar(9, 5);
        System.out.println("Fark= " + cikar);
        double bol = dortIslem.Bol(13, 2);
        System.out.println("Bölüm= " + bol);
        int carp = dortIslem.Carp(8, 5);
        System.out.println("Çarpımı= " + carp);

    }
}