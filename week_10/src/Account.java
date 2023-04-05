import java.util.HashMap;

public class Account {
    String login;
    String password;
    HashMap<String, String> accounts = new HashMap<>();

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
        this.accounts.put(login, password);
    }
    public String checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException{
        if(accounts.get(login).equals(password)){
        return "Вы успешно вошли в аккаунт!";
        } else throw new WrongLoginOrPasswordException();
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void checkLogin(String login) throws WrongLoginException{
        if(login.length() > 5 && login.length() < 20 && !login.isEmpty()){
            setLogin(login);
        }else throw new WrongLoginException();
    }
    public void checkPassword(String pwd1, String pwd2) throws WrongPasswordException{

        if(pwd1.equals(pwd2) && pwd1.length() > 8 && pwd1.length() < 20 && !pwd1.isEmpty()){
            setPassword(pwd1);
        }else throw new WrongPasswordException();
    }

}
