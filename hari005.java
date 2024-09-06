import java.util.Scanner;
public class membalikkanKata {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata = in.nextLine();
        
        char[] huruf = new char[kata.length()];
        for(int i = 0; i < huruf.length; i++){
            huruf[i] = kata.charAt(i);
        }
        
        String reverse = "";
        for(int i = huruf.length-1; i >=0 ; i--){
            reverse+=huruf[i];
        }
        
        System.out.println(reverse);
    }
    
}
