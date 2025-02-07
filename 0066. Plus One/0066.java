class Solution {
    public int[] plusOne(int[] digits) {
        // if last digit is not 9 (just increment by one)
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
        }

        // create new array for the last option and check if there is another number than 9
        int flag=0;
        int newArr[] = new int[digits.length+1];
        for (int i=0; i<digits.length; i++){
            newArr[i]=digits[i];
            if(digits[i]!=9) flag=1;
        }

        // if all digits are not 9 and last digit is 9 (check if there are multiple 9 at the end)
        if(flag==1){
            int j=1;
            while(digits[digits.length-j]==9){
                digits[digits.length-j]=0;
                j++;
            }
            digits[digits.length-j]+=1;
            return digits;
        }

        // if all digits are 9 (use the newArr that you created with the size of length+1)
        newArr[digits.length]=0;
        int j=1;
        while(digits.length-j!=0){
            newArr[digits.length-j]=0;
            j++;
        }
        newArr[digits.length-j]=1;
        return newArr;

    }
}