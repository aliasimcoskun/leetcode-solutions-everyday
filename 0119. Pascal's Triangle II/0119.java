// O(n) space complexity
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // first element is always 1
        
        for(int i=0; i<rowIndex; i++){
            for(int j=i; j>0; j--){
                row.set(j, row.get(j) + row.get(j-1));
            }
            row.add(1);
        }

        return row;
    }
}