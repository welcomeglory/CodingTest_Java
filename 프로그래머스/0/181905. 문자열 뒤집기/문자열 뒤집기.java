class Solution {
    public String solution(String my_string, int s, int e) {
       char[] charArray = my_string.toCharArray();

        // s부터 e까지의 부분 문자열을 뒤집음
        while (s < e) {
            char temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;

            s++;
            e--;
        }

        // 뒤집은 문자 배열을 다시 문자열로 변환
        return new String(charArray);
    }
}