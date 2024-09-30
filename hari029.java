import java.math.BigInteger;
public class Main {
    
    public static void main(String[] args) {
        BigInteger bil1 = new BigInteger("10000000000000052691872627293927179492828396");
        BigInteger bil2 = new BigInteger("25263738287363663636362728474728286463727162");
        
        System.out.println(bil1.add(bil2)); // penjumlahan
        System.out.println(bil1.subtract(bil2)); //pengurangan
        System.out.println(bil1.multiply(bil2)); //perkalian
        System.out.println(bil1.divide(bil2)); //pembagian
        System.out.println(bil1.mod(bil2)); //sisa bagi
    }
} 
