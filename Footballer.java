package Module_2;

public class Footballer extends Sport {

    public Footballer(int scoring, int out){
        super(scoring, out);
    }

    @Override
    public void start() {
        System.out.println("Футбольный матч");
    }

    @Override
    public void stop() {
        System.out.println("Конец матча");
    }
}





/*
public class Footballer {
    String  scoring;
    boolean out;

    public Footballer(String  scoring, boolean out) {
        this.scoring = scoring;
        this.out = out;
    }


    public void start() {
        System.out.println("Начало футбольного матча");
    }
    public void stop() {
        System.out.println("Конец футбольного матча");

    }
}*/
