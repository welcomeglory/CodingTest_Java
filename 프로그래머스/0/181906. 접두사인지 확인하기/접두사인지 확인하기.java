class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] str = new String[my_string.length()];
	    int answer =0;
	    for(int i=0; i<my_string.length();i++)
            str[i] = my_string.substring(0,my_string.length()-i);
        while(true){
	            for(int i=0; i<str.length;i++){
	                if(str[i].equals(is_prefix))
	                    answer = 1;
	            }
            break;
	        }   
        return answer;
    }
}