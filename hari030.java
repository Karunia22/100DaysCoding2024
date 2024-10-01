import java.math.BigDecimal;
public class Main {
    
    public static void main(String[] args) {
        BigDecimal bil1 = new BigDecimal("3.163727283736626228384991751617373");
        BigDecimal bil2 = new BigDecimal("3.163727283736626228384991751617373");
        
        System.out.println(bil1.add(bil2)); // penjumlahan
        System.out.println(bil1.subtract(bil2)); //pengurangan
        System.out.println(bil1.multiply(bil2)); //perkalian
        System.out.println(bil1.divide(bil2)); //pembagian
    }
    
}
