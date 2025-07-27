class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            
            if (width < size[0]) width = size[0];
            if (height < size[1]) height = size[1];
        }
        
        return width * height;
    }
}