class Solution {
    public boolean isAnagram(String s, String t) {

    //Anagrams must have same length
    if(s.length() != t.length())
       return false;

     Map<Character, Integer> input1 = new HashMap<>();
     Map<Character, Integer> input2 = new HashMap<>();

     for(int i = 0; i<s.length(); i++){
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);


        input1.put(c1, input1.getOrDefault(c1,0)+1);
        input2.put(c2, input2.getOrDefault(c2,0)+1);
     }
     
     return input1.equals(input2);
    }
}
