package Module_2;

public class M2_Sportsmen {
    private String name;
    private String team;
    private int age;
    private String whatitdoes;

    public M2_Sportsmen(String name, String team, int age, String whatitdoes) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.whatitdoes = whatitdoes;

    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public String getWhatitdoes() {
        return whatitdoes;
    }
}

