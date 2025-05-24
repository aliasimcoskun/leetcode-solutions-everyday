// time complexity: O(n^2)
// space complexity: O(1)
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // n x n image (square)
        int n = image.length;

        // first, we should flip horizontally
        for(int i=0; i<n; i++){
            int temp = n-1;
            for(int j=0; j<n/2; j++){
                //swap(image[i][j], image[i][temp]);
                image[i][j] = image[i][j] ^ image[i][temp];
                image[i][temp] = image[i][j] ^ image[i][temp];
                image[i][j] =image[i][j] ^ image[i][temp];
                temp--;
            }
        }

        // then, invert it.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                image[i][j] ^= 1;
            }
        }

        return image;
    }
}