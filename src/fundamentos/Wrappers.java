package fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;

        Integer i = 10000; //inteiro
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#'; // char
        System.out.println(c.toString());


    }
}
