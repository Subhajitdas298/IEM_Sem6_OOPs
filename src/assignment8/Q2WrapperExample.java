package assignment8;

public class Q2WrapperExample {

    public static void main(String args[]) {
        int b = 55;
        String bb = "45";
        Integer x = new Integer(b);
        Integer y = new Integer(bb);
        System.out.println("bytevalue(x) = " + x.byteValue());
        System.out.println("shortvalue(x) = " + x.shortValue());
        System.out.println("intvalue(x) = " + x.intValue());
        System.out.println("longvalue(x) = " + x.longValue());
        System.out.println("doublevalue(x) = " + x.doubleValue());
        System.out.println("floatvalue(x) = " + x.floatValue());
        int value = 45;
        System.out.println("Integer.bitcount(value)="
                + Integer.bitCount(value));
        System.out.println("Integer.numberOfTrailingZeros(value)="
                + Integer.numberOfTrailingZeros(value));
        System.out.println("Integer.numberOfLeadingZeros(value)="
                + Integer.numberOfLeadingZeros(value));
        System.out.println("Integer.highestOneBit(value)="
                + Integer.highestOneBit(value));
        System.out.println("Integer.lowestOneBit(value)="
                + Integer.lowestOneBit(value));
        System.out.println("Integer.reverse(value)="
                + Integer.reverse(value));
        System.out.println("Integer.reverseBytes(value)="
                + Integer.reverseBytes(value));
        System.out.println("Integer.signum(value)=" + Integer.signum(value));
        int hash = x.hashCode();
        System.out.println("hashcode(x) = " + hash);
        boolean eq = x.equals(y);
        System.out.println("x.equals(y) = " + eq);
        int e = Integer.compare(x, y);
        System.out.println("compare(x,y) = " + e);
        int f = x.compareTo(y);
        System.out.println("x.compareTo(y) = " + f);

        double b2 = 55.05;
        bb = "45";
        Double x2 = new Double(b);
        Double y2 = new Double(bb);
        System.out.println("toString(b2) = " + Double.toString(b2));
        Double z = Double.valueOf(b2);
        System.out.println("valueOf(b2) = " + z);
        z = Double.valueOf(bb);
        System.out.println("ValueOf(bb) = " + z);
        double zz = Double.parseDouble(bb);
        System.out.println("parseDouble(bb) = " + zz);
        System.out.println("bytevalue(x2) = " + x2.byteValue());
        System.out.println("shortvalue(x2) = " + x2.shortValue());
        System.out.println("intvalue(x2) = " + x2.intValue());
        System.out.println("longvalue(x2) = " + x2.longValue());
        System.out.println("doublevalue(x2) = " + x2.doubleValue());
        System.out.println("floatvalue(x2) = " + x2.floatValue());
        hash = x2.hashCode();
        System.out.println("hashcode(x2) = " + hash);
        eq = x2.equals(y2);
        System.out.println("x2.equals(y2) = " + eq);
        e = Double.compare(x2, y2);
        System.out.println("compare(x2,y2) = " + e);
        f = x2.compareTo(y2);
        System.out.println("x2.compareTo(y2) = " + f);
        Double d = Double.valueOf("1010.54789654123654");
        System.out.println("isNaN(d) = " + d.isNaN());
        System.out.println("Double.isNaN(45.12452) = " + Double.isNaN(45.12452));
        d = Double.valueOf(Double.POSITIVE_INFINITY + 1);
        System.out.println("Double.isInfinite(d) = "
                + Double.isInfinite(d.doubleValue()));
        double dd = 10245.21452;
        System.out.println("Double.toString(dd) = " + Double.toHexString(dd));
        long double_to_long = Double.doubleToLongBits(dd);
        System.out.println("Double.doubleToLongBits(dd) = " + double_to_long);
        double long_to_double = Double.longBitsToDouble(double_to_long);
        System.out.println("Double.LongBitsToDouble(double_to_long) = "
                + long_to_double);

        Character ch = new Character('a');
        System.out.println("ch.charValue() : " + ch.charValue());
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('0'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isWhitespace('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isWhitespace(9));
        System.out.println(Character.isWhitespace('9'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase(65));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase(97));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase(97));
        System.out.println(Character.toUpperCase(48));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toLowerCase(65));
        System.out.println(Character.toLowerCase(48));
        System.out.println(Character.toString('x'));
        System.out.println(Character.toString('Y'));
    }
}
