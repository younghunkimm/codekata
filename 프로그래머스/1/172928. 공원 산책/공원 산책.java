import java.util.Map;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        Map<String, int[]> directionMap = Map.of(
                "E", new int[] { 0, 1 },
                "W", new int[] { 0, -1 },
                "S", new int[] { 1, 0 },
                "N", new int[] { -1, 0 }
        );
            
        int rows = park.length;
        int cols = park[0].length();
        
        int[] start = new int[2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (park[i].charAt(j) == 'S') {
                    start[0] = i;
                    start[1] = j;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int distance = Integer.parseInt(parts[1]);

            int[] move = directionMap.get(direction);
            int newRow = start[0];
            int newCol = start[1];
            boolean canMove = true;

            for (int step = 0; step < distance; step++) {
                newRow += move[0];
                newCol += move[1];

                if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols || park[newRow].charAt(newCol) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                start[0] = newRow;
                start[1] = newCol;
            }
        }

        return start;
    }
}