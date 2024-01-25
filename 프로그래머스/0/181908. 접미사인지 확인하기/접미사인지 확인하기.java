class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] answer = new String[my_string.length()];
        int result=0;
        for(int i=0;i<my_string.length();i++)
            answer[i] = my_string.substring(my_string.length()-i-1,my_string.length());
       for(int i=0;i<my_string.length();i++){
	            if(answer[i].equals(is_suffix)) {
	                result =  1;
	                break;
	            }
       }
	            
        return result;
    }
}