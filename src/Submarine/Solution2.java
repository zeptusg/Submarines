package Submarine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//BFS
public class Solution2 {

    public static int getSubmarineCount(char[][] ocean) {
        if (ocean == null || ocean.length == 0) {
            return 0;
        }
        int rows = ocean.length;
        int columns = ocean[0].length;
        int submarineCount = 0;

        List<int[]> visitedCells = new ArrayList<>();  // Tuples of row,col
        int [][] directions = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };  // Represents 4 directions of movement.

        // Iterating to find '1' - start of a submarine.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (ocean[i][j] == '1') {
                    submarineCount++;
                    markVisitedCells(ocean, i, j, visitedCells, directions);
                }
            }
        }
        return submarineCount;
    }

    // Marks all submarine parts as visited, using a BFS algorithm
    private static void markVisitedCells(char[][] ocean, int currRow, int currColumn,
                                         List<int[]> visitedCells, int[][] directions) {
        visitedCells.add(new int[] {currRow, currColumn});
        ocean[currRow][currColumn] = 'v';  // Mark as visited.

        int nextRow, nextCol;
        while(!visitedCells.isEmpty()) {
            int[] currentCell = visitedCells.remove(visitedCells.size() - 1);

            // Check for 1's in 4 directions.
            for (int[] dir : directions) {
                nextRow = currentCell[0] + dir[0];
                nextCol = currentCell[1] + dir[1];

                if (nextRow >= 0 && nextRow < ocean.length && nextCol >= 0
                        && nextCol < ocean[0].length && ocean[nextRow][nextCol] == '1') {

                    visitedCells.add(new int[] {nextRow, nextCol});
                    ocean[nextRow][nextCol] = 'v';
                }
            }
        }
    }
}
