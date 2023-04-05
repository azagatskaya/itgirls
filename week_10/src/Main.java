import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // задача 1
        Account user1 = new Account("user1", "012345678");
        try {
            user1.checkLogin("newLogin12345678901234567890");
        } catch (WrongLoginException e) {
            System.out.println("Login error " + e);
        }

        // задача 2
        try {
            user1.checkPassword("123456789", "012345678");;
        } catch (WrongPasswordException e) {
            System.out.println("Password error " + e);
        }

        // задача 3
        try {
            System.out.println(user1.checkLoginAndPassword("user1", "012345678"));
            System.out.println(user1.checkLoginAndPassword("user2", "012345678"));
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Login or password error " + e);
        }
    }
}