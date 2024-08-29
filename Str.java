public class Str {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        String word = "";

        for (int i = 0; i < stringArray.length; i++) {
            word += stringArray[i]  ;

        }
        char [] chars = word.toCharArray();
        System.out.println(word);
    }
}
