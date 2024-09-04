package Module_2.Abstraction;

public abstract class Instrument {
    String play;
    String tune;


    public Instrument(String play, String tune) {
        this.play = play;
        this.tune = tune;
    }

    public abstract String getPlay();

    public abstract String getTune();

}

