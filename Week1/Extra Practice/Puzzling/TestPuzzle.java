
public class TestPuzzle {
    public static void main(String[] args){

        PuzzleJava appTest = new PuzzleJava();

        System.out.println("\n----- 10 Random Numbers Test -----");
        int min = 1;
        int max = 20;
        int[] randomTenNumbers = appTest.getTenRolls(min, max); 
        for(int i = 0; i < 10; i++) {
            System.out.printf("%s --> %s\n", (i + 1), randomTenNumbers[i]);
        }
    }    
}
