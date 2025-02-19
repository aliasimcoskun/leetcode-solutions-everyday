/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
 int** generate(int numRows, int* returnSize, int** returnColumnSizes) {
    // create 2D array in C
    int** arr = malloc(numRows * sizeof(int*));
    for (int i = 0; i < numRows; i++)
        arr[i] = (int*)malloc((i+1) * sizeof(int));
    // arr[i][j] is same as *(*(arr+i)+j)

    // check if we've allocated the space correctly
    // int count = 0;
    // for (int i = 0; i < numRows; i++)
    //     for (int j = 0; j < i+1; j++)
    //         arr[i][j] = ++count;
    // for (int i = 0; i < numRows; i++)
    //     for (int j = 0; j < i+1; j++)
    //         printf("%d ", arr[i][j]);

    // create the returnColumnSizes array and assign the number of columns for each row:
    *returnColumnSizes = malloc(numRows * sizeof(int));
    for (int i = 0; i < numRows; i++) {
        (*returnColumnSizes)[i] = i + 1;
    }
    *returnSize=numRows;

    arr[0][0]=1;
    for(int i=1; i<numRows; i++){
        for(int j=0; j<i+1; j++){
            if(j==0 || j==i) arr[i][j]=1;
            else{
                arr[i][j]=arr[i-1][j-1] + arr[i-1][j]; 
            }
        }
    }

    return arr;
}