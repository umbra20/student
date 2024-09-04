package Module_2.Abstraction;

public  class Piano extends Instrument {
    public Piano(String play, String tune) {
        super(play, tune);
    }

    @Override
    public String getPlay() {

        return "Играем на пианино";
    }

    @Override
    public String getTune() {
        return "Лучшие настройка пианино";
    }
}
