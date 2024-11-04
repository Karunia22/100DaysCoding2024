public class Main {
    
    public static void main(String[] args) {
        int k = 0;
        loop:
        while(true){
            if(k==10){
                break loop;
            }
            System.out.println(k);
            k++;
        }
    }
} 
