class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += c - '0'; // char를 int로 변환하여 덧셈
        }
        return sum%9;
    }
}