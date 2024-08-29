package encapsulation;

public class Gamer {
    private String nickname;
    private boolean isActive;
  public Gamer(String nickname, boolean isActive) {
      this.nickname = nickname; // конструктор
      this.isActive = isActive;
  }
    public String getNickname() {// функция
        return nickname;
    }

    public boolean isActive() {
        return isActive;
    }
}














