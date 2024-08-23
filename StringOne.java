import java.util.Arrays;
//TODO  Дан массив со строками: String[] stringArray = {"ab", "cd", "ef"}.
Получите массив символов этих строк: char[] charArray =  {'a', 'b', 'c', 'd', 'e', 'f'}.
public class StringOne {

    public static void main(String[] args) {
        String str1 =  new String{"ab", "cd", "ef"};
        char[] strArray = str1.toCharArray();
        System.out.println(Arrays.toString(strArray));

    }
}
