package Module_2.Abstraction;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Гитара", "Настройка гитары") ;
        System.out.println(guitar.play);
        System.out.println(guitar.tune);
        String guitarPl = guitar.getPlay();
        String guitarPl1 = guitar.getTune();
        System.out.println(guitarPl);
        System.out.println(guitarPl1);


        System.out.println("_____________________");
        Piano piano = new Piano("Пианино", "Настройка пианино") ;
        System.out.println(piano.play);
        System.out.println(piano.tune);
        String pianoPl = piano.getPlay();
        String pianoPl1 = piano.getTune();
        System.out.println(pianoPl);
        System.out.println(pianoPl1);

    }
}
