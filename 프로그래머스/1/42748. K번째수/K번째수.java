import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int init = 0;
        for (int x = 0; x < commands.length; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];

            // i ~ j 자르기
            int[] newArray = new int[j - i + 1];
            int z = 0;
            for (int y = i - 1; y <= j - 1; y++) {
                newArray[z] = array[y];
                z++;
            }

            // 정렬
            Arrays.sort(newArray);

            // k 번째 숫자 담기
            result[init] = newArray[k - 1];
            init++;
        }
        
        return result;
    }
}