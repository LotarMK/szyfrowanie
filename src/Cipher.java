import jdk.jshell.spi.ExecutionControl;

public class Cipher {

    private int key = 1;
    private String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int alphaLen = alpha.length();

    public void setKey(int key) {
      this.key = key % alphaLen;
    }

    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            int idx = alpha.indexOf(c);
            idx = (idx + key) % alphaLen;
//            if (idx >= alphaLen) {
//                idx -= alphaLen;
//            }
            c = alpha.charAt(idx);
            sb.append(c);
        }
        return sb.toString();
    }

//    public String decrypt(String text) {
//        throw new NotImplementedException();
//    }
}
