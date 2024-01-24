import java.math.BigInteger;
class Solution {
    public int solution(String number) {
        BigInteger big = new BigInteger(number);
        return(big.remainder(BigInteger.valueOf(9)).intValue());         
    }
}