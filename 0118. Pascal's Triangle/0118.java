class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>()); // first row is only 1
        list.get(0).add(1);

        int elements = 1;
        for(int i=1; i<numRows; i++){
            list.add(new ArrayList<>());  // Adding a new list for each row
            list.get(i).add(1); // list[i][0]=1;
            for (int j=1; j<elements; j++){
                int value = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                list.get(i).add(value);
            }
            list.get(i).add(1); // list[i][elements]=1;
            elements++;
        }

        return list;
    }
}