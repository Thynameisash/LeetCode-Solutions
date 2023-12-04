class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                int digit = Integer.valueOf(num.substring(i, i + 3));
                max = Math.max(max, digit);
            }
        }

        if (max == -1) {
            return "";
        }
        if (max == 0) {
            return "000";
        }
        return String.valueOf(max);
    }
}