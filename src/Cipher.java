public class Cipher {

    private int key = 1;
    private String alpha;
    public Cipher() {
        alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public Cipher(String alpha){
        setAlphabet(alpha);
    }

    public void setKey(int key) {
        this.key = key;
    }

    private void setAlphabet(String alpha) {
        this.alpha = alpha;
    }

    public String encrypt(String text) {
        int alphaLen = alpha.length();
        if(contain(text)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); ++i) {
                char c = text.charAt(i);
                int idx = alpha.indexOf(c);
                idx += key;
                idx = (idx + alphaLen) % alphaLen;
                c = alpha.charAt(idx);
                sb.append(c);
            }
            return sb.toString();
        }
        return "";
    }

    public String decrypt(String text) {
        int alphaLen = alpha.length();
        if (contain(text)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); ++i) {
                char c = text.charAt(i);
                int idx = alpha.indexOf(c);
                idx -= key;
                idx = (idx + alphaLen) % alphaLen;
                c = alpha.charAt(idx);
                sb.append(c);
            }
            return sb.toString();
        }
        return "";
    }

    private boolean contain(String text) {
        for (int i = 0; i < text.length(); ++i) {
            char letter = text.charAt(i);
            if (!alpha.contains(String.valueOf(letter))) {
                System.out.println("Zawiera znaki obce w alfabecie");
                return false;
            }
        }
        return true;
    }
}
