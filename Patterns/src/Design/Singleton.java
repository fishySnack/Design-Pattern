package Design;

public class Singleton {
    private static Singleton singleton;
    private boolean isLogIn;

    private Singleton() {
        isLogIn = true;
    }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public boolean isLogin() {
        return isLogIn;
    }

    public void logOut() {
        isLogIn = false;
    }

    public void logIn() {
        isLogIn = true;
    }

}
