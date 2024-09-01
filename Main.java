package Module_2;

public class Main {
    public static void main(String[] args) {

        Footballer footballer = new Footballer("Васька", "Dogs", 21);
        System.out.println("Имя игрока - " +footballer.getName() + " : " + "Название команды - " + footballer.getTeam() + " : " + "Возраст - " + footballer.getAge());
        footballer.sport();
        System.out.println();

        HockeyPlayer hockeyPlayer = new HockeyPlayer("Игорь", "Смерч", 32);
        System.out.println("Имя игрока - " + hockeyPlayer.getName() + " : " + "Название команды - " + hockeyPlayer.getTeam() + " : " + "Возраст - " + hockeyPlayer.getAge());
        hockeyPlayer.sport();
        System.out.println();

        Skier skier = new Skier("Михаил", "Муравьи", 29);
        System.out.println("Имя лыжника - " + skier.getName() + " : " + "Название команды - " + skier.getTeam() + " : " + "Возраст - " + skier.getAge());
        skier.sport();

    }
}


