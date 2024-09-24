public class TipeDataReferenceLong {
    
    public static void main(String[] args) {
        Long a = 2147483645L;
        Long b = 2147483646L;
        Long c = Long.max(a, b);
        System.out.println(a.longValue());
        System.out.println(c);
    }
}
