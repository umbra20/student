package Module_2;

public class Sport {
    int scoring;
    int out;

    public Sport(int scoring, int out) {
        this.scoring = scoring;
        this.out = out;
    }

    public void start() {
        System.out.println("Начало матча");
    }

    public void stop() {
        System.out.println("Конец матча");
    }
}
