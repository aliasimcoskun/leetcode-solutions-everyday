// memory allocated for the vector is rowIndex+1
class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> row(rowIndex+1);
        row[0]=1;
        for(int i=0; i<rowIndex; i++){
            for(int j=i;j>0;j--) row[j]=row[j]+row[j-1];
            row[i+1]=1;
        }
        return row;
    }
};