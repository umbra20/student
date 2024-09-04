package Module_2.Abstraction;

public class Guitar extends Instrument {
    public Guitar(String play, String tune) {
        super(play, tune);

    }

    @Override
    public String getPlay() {
        return "С играть на гитаре";
    }

    @Override
    public String getTune() {
        return "Лучшая настройка гитары";
    }

}