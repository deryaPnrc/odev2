public class Main {
    public static void main(String[] args) {

        Product product=new Product(1,"laptop","Asus Laptop",3000,2,"Siyah");

//        product.setName("laptop");
//        product.setId(1);
//        product.setDescription("asus laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);


        ProductManager productManager= new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());
        System.out.println(product.getKod());
    }
}