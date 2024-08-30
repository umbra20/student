package Module_2;

public class Skier extends Sport {

    public Skier(int scoring, int out){
        super(scoring, out);
    }

    @Override
    public void start() {
        System.out.println("Лыжного старт");
    }

    @Override
    public void stop() {
        System.out.println("Конец старта");
    }
}
