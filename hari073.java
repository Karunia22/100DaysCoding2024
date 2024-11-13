public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";

        char characterAtIndex4 = text.charAt(4);

        System.out.println("Karakter pada posisi ke-4: " + characterAtIndex4);

        for (int i = 0; i < text.length(); i++) {
            System.out.println("Karakter pada posisi ke-" + i + ": " + text.charAt(i));
        }
    }
}
