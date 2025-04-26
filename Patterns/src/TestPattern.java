import Design.Singleton;

public class TestPattern {
    public static void main(String[] args) throws Exception {
        Singleton user = Singleton.getInstance();
        Singleton user2 = Singleton.getInstance();

        user.logOut();

        System.out.println(user2.isLogin());

    }
}
