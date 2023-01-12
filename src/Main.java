public class Main {
    public static void main(String[] args) {

        Cipher cipher = new Cipher();
        System.out.println(cipher.encrypt("BACA"));

//        String text = "ABC";
//        int key = 1;
//        System.out.println(text);
//        System.out.println("\uD83D\uDC27" + "-----------------" + "\uD83D\uDC27"); //pingwinki
//
//        StringBuilder sb = new StringBuilder(); //dużo szybszy od konkatenacji
//        for(int i = 0; i < text.length(); ++i) {
//            int c = text.charAt(i);
//            c += key;
//            sb.append((char)c);
//        }
//
////        text.chars()
////                .mapToObj(c -> (char)(c + 1))
////                .forEach(c -> sb.append(c));
//
//        String encText = sb.toString();
//        System.out.println(encText);
    }
}