class Solution {
    public boolean isPalindrome(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                char c=Character.toLowerCase(s.charAt(i));
                list.add(c);
            }  
        }
        List<Character> rev = new ArrayList<>(list);
        Collections.reverse(rev);
       
        return list.equals(rev);
    }
}
