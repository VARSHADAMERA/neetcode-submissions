class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String str: strs){
       //convert the string into character array 
       
       char[] chars = str.toCharArray();
       //sort the characters in the char array 

       Arrays.sort(chars);

       //use the sorted String as the key (Char -> String conversion)

       String key = new String(chars);

       //create a group if key doesn't exist 
       //then add the original string to the group 

       map.computeIfAbsent(key, k-> new ArrayList<>()).add(str);

        }
       
       return new ArrayList<>(map.values());
    }
}
