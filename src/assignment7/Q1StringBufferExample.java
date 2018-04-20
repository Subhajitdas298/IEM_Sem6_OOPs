package assignment7;

public class Q1StringBufferExample {

    public static void main(String[] args) {
        StringBuffer sbuf = new StringBuffer("Geralt of Rivia");
        System.out.println("sbuf : " + sbuf);
        System.out.println("sbuf length : " + sbuf.length());
        System.out.println("sbuf current capacity : " + 
                sbuf.capacity());
        System.out.println("sbuf char at 7 before : " + 
                sbuf.charAt(7));
        sbuf.setCharAt(7, 'i');
        System.out.println("sbuf char at 7 after : " + 
                sbuf.charAt(7));
        sbuf.setCharAt(7, 'o');
        System.out.println("sbuf char at 7 after 2nd change : " + 
                sbuf.charAt(7));
        System.out.println("After appending \" is a Witcher\" : "
                + sbuf.append(" is a Witcher"));
        System.out.println("After inserting \" legendary\" : "
                + sbuf.insert(20, " legendary"));
        System.out.println("After deleting from 7 to 16 : "
                + sbuf.delete(7, 16));
    }
}
