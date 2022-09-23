package leetcode._solved;

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String binaryString = Integer.toBinaryString(n);

        for(int i = 1; i < binaryString.length(); i++) {
            if(i % 2 == 1 && binaryString.charAt(i) != '0') return false;
            if(i % 2 == 0 && binaryString.charAt(i) != '1') return false;
        }

        return true;
    }
}
