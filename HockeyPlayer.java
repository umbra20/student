package Module_2;

public class HockeyPlayer extends Sport {

    public HockeyPlayer(int scoring, int out){
        super(scoring, out);
    }

    @Override
    public void start() {
        System.out.println("Хоккейный матч ");
    }

    @Override
    public void stop() {
        System.out.println("Конец матча ");
    }
}
