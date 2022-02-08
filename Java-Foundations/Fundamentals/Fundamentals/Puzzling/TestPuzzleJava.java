import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args){
        
        PuzzleJavaUtil appTest = new PuzzleJavaUtil();

        System.out.println(appTest.getTenRolls());
        System.out.println(appTest.getRandomLetter());
        System.out.println(appTest.generatePassword());
        System.out.println(appTest.getNewPasswordSet(10));
    }
}