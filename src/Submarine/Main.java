package Submarine;

public class Main {


    public static void main(String[] args) {


        char[][] ocean = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(Solution.getSubmarineCount(ocean));
        //System.out.println(Solution2.getSubmarineCount(ocean));



    }
}
