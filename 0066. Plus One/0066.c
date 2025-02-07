/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 int* plusOne(int* digits, int digitsSize, int* returnSize) {
    // digits: integer array
    // digitsSize: size of that integer array
    // returnSize: size of the array that you are gonna return
    for (int i=digitsSize-1; i>=0; i--){
        if(digits[i]!=9){
            digits[i]++;
            *returnSize= digitsSize; // i've forgotten...
            return digits;
        }
        digits[i]=0;
    }
    // if all of them was 9, now all of them became 0
    // now create new array with the size of digitsSize+1
    int* newArr = (int*)malloc((digitsSize+1)*(sizeof(int)));
    newArr[0]=1;
    for(int i=0; i<digitsSize; i++) newArr[i+1]=digits[i];

    *returnSize = digitsSize+1;
    return newArr;
}