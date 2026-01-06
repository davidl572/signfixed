
public class Main {
    public static void main(String[] args) {
        int x;
        String str;
        Sign text = new Sign("hello", 3);
//        System.out.println(text.getLines());
//        System.out.println(text.numofLines());
        Sign sign1 = new Sign("ABC222DE",3);
        str = sign1.getLines();
        x = sign1.numofLines();
        Sign sign2 = new Sign("ABCD",10);
        x = sign2.numofLines();
        str = sign2.getLines();
        Sign sign3 = new Sign("ABCDEF",6);
        x = sign3.numofLines();
        str = sign3.getLines();
        Sign sign4 = new Sign("", 4);
        x = sign4.numofLines();
        str = sign4.getLines();
        Sign sign5 = new Sign("AB_CD_EF", 2);
        x = sign5.numofLines();
        str = sign5.getLines();
        System.out.println(str);
        System.out.println(x);
    }
}
