public class Sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(" World");
        sb.append(" World");
        sb.append(" World");
        sb.append(" World");
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
