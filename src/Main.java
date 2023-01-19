public class Main {
    public static void main(String[] args) {

        Cipher cipher = new Cipher();
        System.out.println(cipher.encrypt("BACA"));
        System.out.println(cipher.decrypt("BCD"));

    }
}