class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
        }
        
        String res = "";
        int n = s.length();
        
        for (int i = n - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        
        if (isNegative) {
            res = "-" + res;
        }
        
        
        long finalVal = Long.parseLong(res);
        
        
        if (finalVal < Integer.MIN_VALUE || finalVal > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) finalVal;
    }
}
