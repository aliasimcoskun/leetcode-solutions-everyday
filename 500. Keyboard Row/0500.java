// time complexity: O(n*m)
// space complexity: O(n)
class Solution {
    public String[] findWords(String[] words) {
        // define the keyboard rows
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thirdRow = "zxcvbnmZXCVBNM";

        // store valid words
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            int firstCheck = 0;
            int secondCheck = 0;
            int thirdCheck = 0;

            // check each character of the word
            for(int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if(firstRow.contains(String.valueOf(ch)))
                    firstCheck = 1;
                else if(secondRow.contains(String.valueOf(ch)))
                    secondCheck = 1;
                else if(thirdRow.contains(String.valueOf(ch)))
                    thirdCheck = 1;
            }

            // add word only if it belongs to one row
            if(firstCheck + secondCheck + thirdCheck == 1)
                result.add(words[i]);
        }

        // convert ArrayList to String array
        String[] finalResult = new String[result.size()];
        finalResult = result.toArray(finalResult);

        return finalResult;
    }
}
