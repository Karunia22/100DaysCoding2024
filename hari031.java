public class Main {
    
    public static void main(String[] args) {
        String bilBulat = "12";
        String bilDesimal = "2.3";
        String logika = "true";
        String karakter = "2";
        
        // Bilangan bulat
        int bil1 = Integer.parseInt(bilBulat);
        byte bil2 = Byte.parseByte(bilBulat);
        short bil3 = Short.parseShort(bilBulat);
        long bil4 = Long.parseLong(bilBulat);
        
        // bilangan desimal atau bilangan pecahan
        float bil5 = Float.parseFloat(bilDesimal);
        double bil6 = Double.parseDouble(bilDesimal);
        
        // karakter
        char kar = karakter.charAt(0);
        
        // logika
        boolean log = Boolean.parseBoolean(logika);
        
        System.out.println(bil1);
        System.out.println(bil2);
        System.out.println(bil3);
        System.out.println(bil4);
        System.out.println(bil5);
        System.out.println(bil6);
        System.out.println(kar);
        System.out.println(log);
    }
    
}
