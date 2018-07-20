public class Solution5 { 
    public int scoreUp(String[] key, String[] answers){
        int result=0;
        for(int i=0; i<key.length; i++){
            if(answers[i].equals("?")) continue;
            else if(key[i].equals(answers[i])) result+=4;
            else result -=1;
        }
        return result;
    }
    
    public static void main(String[] args){
        
        
        Solution5 s = new Solution5();
        String[] answers, key;
        
        key = new String[]{"a", "a", "b", "b"};
        answers = new String[]{"a", "?", "a", "b"};
        System.out.println(s.scoreUp(key, answers));
        
        key = new String[]{"a", "a", "b", "b"};
        answers = new String[]{"a", "c", "b", "c"};
        System.out.println(s.scoreUp(key, answers));
        
        
        key = new String[]{"a", "a", "b", "b"};
        answers = new String[]{"a", "a", "b", "c"};
        System.out.println(s.scoreUp(key, answers));
        
        key = new String[]{"a", "a", "b", "b"};
        answers = new String[]{"a", "a", "b", "b"};
        System.out.println(s.scoreUp(key, answers));
    }

}