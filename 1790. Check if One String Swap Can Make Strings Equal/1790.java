class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // s1 and s2 are strings, not array of characters.
        int difference=0;
        int firstDiff=0;
        int secondDiff=0;
        for (int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                difference+=1;
                //below this lines, should be inside of the if statement. otherwise, index differences will be different.
                if (difference==1) firstDiff = i;
                if (difference==2) secondDiff = i;
                if (difference>2) return false;
            }
        }

        if(difference == 0) return true;
        if(difference == 2 && 
            s1.charAt(firstDiff)==s2.charAt(secondDiff) && 
            s1.charAt(secondDiff)==s2.charAt(firstDiff)) 
            return true;

        return false;
    }
}