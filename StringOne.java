import java.util.Arrays;

public class StringOne {

    public static void main(String[] args) {
        String str1 =  new String{"ab", "cd", "ef"};
        char[] strArray = str1.toCharArray();
        System.out.println(Arrays.toString(strArray));

    }
}
