class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> list = new ArrayList<>(); 
       int num=strs.length;
        List<String> check = new ArrayList<>();
       for(int i=0;i<num;i++){

        char[] c1=strs[i].toCharArray();
        Arrays.sort(c1);
        String s1=new String(c1);
        List<String> l= new ArrayList<>();
        if(!check.contains(strs[i])){
            l.add(strs[i]);
            check.add(strs[i]);
        }
        else
            continue;

        for(int k=i+1 ; k<num ; k++){
            if(s1.length()==strs[k].length()){
                char[] c2=strs[k].toCharArray();
                Arrays.sort(c2);
                String s2=new String(c2);  
                if(s1.equals(s2)){
                    l.add(strs[k]);
                    check.add(strs[k]);
                }
            }    
        }
        list.add(l);

       }
       return list;
    }
}
