package Submarine;

//DFS
public class Solution {


    // Calculate number of submarines in 2D array
    public static int getSubmarineCount(char[][] ocean) {
        if (ocean == null || ocean.length == 0) {
            return 0;
        }

        int rows = ocean.length;
        int columns = ocean[0].length;
        int submarineCount = 0;

        // Iterating to find '1' - start of a submarine.
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(ocean[i][j] == '1') {
                    submarineCount++;
                    markVisitedCells(ocean, i, j);
                }
            }
        }
        return submarineCount;
    }

    // Marks all submarine parts as visited, using a DFS algorithm
    private static void markVisitedCells(char[][] ocean, int rowIndex, int columnIndex) {
        int rows = ocean.length;
        int columns = ocean[0].length;

        // Base case - 1) Not unvisited submarine part  2) Reached the edge.
        if (rowIndex < 0 || rowIndex >= rows || columnIndex < 0
                || columnIndex >= columns || ocean[rowIndex][columnIndex] != '1') {
            return;
        }

        // Marking the visited piece of the submarine
        ocean[rowIndex][columnIndex] = 'v';

        // Checking further submarine parts in 4 directions.
        markVisitedCells(ocean, rowIndex + 1, columnIndex);
        markVisitedCells(ocean, rowIndex - 1, columnIndex);
        markVisitedCells(ocean, rowIndex, columnIndex + 1);
        markVisitedCells(ocean, rowIndex, columnIndex - 1);
    }

}
