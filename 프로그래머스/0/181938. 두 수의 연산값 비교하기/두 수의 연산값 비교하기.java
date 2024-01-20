class Solution {
    public int solution(int a, int b) {
       String ab = String.valueOf(a)+String.valueOf(b);
        if(Integer.parseInt(ab) >= 2*a*b)
            return Integer.parseInt(ab);
        else 
            return 2*a*b;
        
    }
}