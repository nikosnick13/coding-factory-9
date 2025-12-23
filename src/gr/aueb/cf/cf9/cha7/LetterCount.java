package gr.aueb.cf.cf9.cha7;

public class LetterCount {
    public static void main(String[] args) {

    }
    public static int getCounterLetter(String str, char letter ){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
