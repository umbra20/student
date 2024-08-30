package Module_2;

public class Main {
    public static void main(String[] args) {
        Footballer footballer = new Footballer(5, 10);
        footballer.start();
        System.out.println("I тайм закончился: " + footballer.scoring);
        System.out.println("II тайм: " + footballer.out);
        footballer.stop();
        System.out.println();

        HockeyPlayer hockeyPlayer = new HockeyPlayer(7, 8);
        hockeyPlayer.start();
        System.out.println("I тайм закончился: " + footballer.scoring);
        System.out.println("II тайм закончился: " + footballer.out);
        hockeyPlayer.stop();
        System.out.println();

        Skier skier = new Skier(6, 7);
        skier.start();
        System.out.println("Кол-во кругов пройдено: " + footballer.scoring);
        System.out.println("Осталось пройти: " + footballer.out);
        skier.stop();
    }

}

