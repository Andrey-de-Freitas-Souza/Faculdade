
package projetovideo;

public class User extends Pessoa{
    private String login;
    private int totalAssistido;

    public User(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "User{" + super.toString() + "login=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
}
