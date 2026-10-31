class Solution {

    public String encode(List<String> strs) {
        //encoding the list of strings into a single string 
        //encoding using lenght of string and using a delimeter tp represent encoding 

        StringBuilder encodedString = new StringBuilder();

        for(String str : strs){

            //append the length to encodedString and add delimeter 
            encodedString.append(str.length());
            encodedString.append("#");

            //add the string 
            encodedString.append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();

    int i = 0;
    while(i<str.length()){
        //find the delimeter
        int j = i;

        while(str.charAt(j)!='#'){
            j++;
        }

        //extract the length 
        int len = Integer.parseInt(str.substring(i,j));

        //extract the string 
        String s = str.substring(j+1,j+1+len);

        result.add(s);

        //move the pointer to next encoded string 
        i = j+1+len;

    }
    return result;
    }
}
