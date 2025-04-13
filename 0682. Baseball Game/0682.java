// time complexity: O(n)
// space complexity: O(n)
class Solution {
    public int calPoints(String[] operations) {
        // create a list to store the scores
        List<Integer> output = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            int size = output.size();
            if(operations[i].equals("+")){
                // add the sum of the last two scores to the list
                output.add(output.get(size - 1) + output.get(size - 2));
            }
            else if(operations[i].equals("D")){
                // add double the value of the last score to the list
                output.add(output.get(size - 1) * 2);
            }
            else if(operations[i].equals("C")){
                // remove the last score from the list
                output.remove(size - 1);
            }
            else{
                // parse the string as an integer and add it to the list
                output.add(Integer.parseInt(operations[i]));
            }
        }

        // calculate the result
        int result = 0;
        for(int i = 0; i < output.size(); i++) {
            result += output.get(i);
        }

        return result;
    }
}
