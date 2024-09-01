package Module_2;

public class M2_Sportsman0 {
    public static void main(String[] args) {
        M2_Sportsman sportsMan = new M2_Sportsman("Ivan", "Piranie", 21); // создаем объект класса Sportsman
        System.out.print("Название команды: ");
        System.out.println(sportsMan.getTeam());
        System.out.print("Имя спортсмена: ");
        System.out.println(sportsMan.getName());
        System.out.print("Возраст: ");
        System.out.println(sportsMan.getAge());


    }
}
