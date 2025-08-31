class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (i < minX) minX = i;
                    if (j < minY) minY = j;
                    if (i > maxX) maxX = i;
                    if (j > maxY) maxY = j;
                }
            }
        }

        return new int[] { minX, minY, maxX + 1, maxY + 1 };
    }
}