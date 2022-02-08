import java.util.Random;
import java.util.ArrayList;

public class PuzzleJavaUtil {

    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int nums = (randMachine.nextInt(20) + 1);
            randNums.add(nums);
        }
        return randNums;
    }

    public char getRandomLetter() {
        Random randMachine = new Random();
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char randLetter = ' ';
        int nums = (randMachine.nextInt(26));
        randLetter = letters[nums];
        return randLetter;
    }

    public String generatePassword(){
        String randString = "";
        for(int i = 0; i < 8; i++){
            randString += getRandomLetter();
        }
        return randString;
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> newPass = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            newPass.add(generatePassword());
        }
        return newPass;
    }
}
