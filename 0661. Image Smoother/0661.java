// time complexity: O(m x n)
// space complexity: O(m x n)
class Solution {
    public int[][] imageSmoother(int[][] img) {
        // result matrix with same size as input
        int[][] result = new int[img.length][img[0].length];

        // loop through each pixel in the image
        for(int i = 0; i < img.length; i++){
            for(int j = 0; j < img[i].length; j++){
                int counter = 0;

                // loop through 3x3 grid around the current pixel
                for(int x = -1; x < 2; x++){
                    for(int y = -1; y < 2; y++){
                        // check if neighboring pixel is within bounds
                        if(j + y >= 0 && j + y < img[i].length &&
                                i + x >= 0 && i + x < img.length){
                            // add pixel value to sum
                            result[i][j] += img[i + x][j + y];
                            counter++;
                        }
                    }
                }

                // compute average by dividing total sum by number of valid neighbors
                result[i][j] /= counter;
            }
        }

        // return the smoothed image
        return result;
    }
}
