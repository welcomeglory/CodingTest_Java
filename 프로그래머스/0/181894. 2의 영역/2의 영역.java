import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int emp;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==2)
               list.add(i);
        }
        if(list.size() ==0)
            return new int[]{-1};
        int s = list.get(0);
        int e = list.get(list.size()-1);
        answer = Arrays.copyOfRange(arr,s,e+1);  
        return answer;
    }
}