import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {

    public static int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> result = Arrays.asList(a, b, c, d).stream()
                .collect(HashMap::new, (accu, curr) -> accu.merge(curr, 1, Integer::sum), Map::putAll);

        Set<Map.Entry<Integer, Integer>> entrySet = result.entrySet();
        Map.Entry<Integer, Integer>[] resultArray = entrySet.toArray(new Map.Entry[0]);

        // 배열을 값 기준으로 내림차순 정렬
        Arrays.sort(resultArray, (a1, b1) -> b1.getValue() - a1.getValue());

        for (Map.Entry<Integer, Integer> entry : resultArray) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (val == 4) {
                return 1111 * key;
            } else if (val == 3) {
                int q = resultArray[1].getKey();
                return (10 * key + q) * (10 * key + q);
            } else if (val == 2 && resultArray.length == 2) {
                int q = resultArray[1].getKey();
                return (key + q) * Math.abs(key - q);
            } else if (val == 2 && resultArray.length == 3) {
                int q = resultArray[1].getKey();
                int r = resultArray[2].getKey();
                return q * r;
            } else if (val == 1 && resultArray.length == 4) {
                return Arrays.stream(new int[]{a, b, c, d}).min().orElse(0);
            }
        }

        return 0; // 기본값
    }
}