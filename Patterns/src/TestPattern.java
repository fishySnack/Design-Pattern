import Design.Singleton;
import Design.BuilderPattern.Student;
import Design.BuilderPattern.StudentBuilder;

public class TestPattern {
    public static void main(String[] args) throws Exception {
        Singleton user = Singleton.getInstance();
        Singleton user2 = Singleton.getInstance();

        user.logOut();

        System.out.println(user2.isLogin());

        StudentBuilder builder = new StudentBuilder();
        builder.setAge(23).setId(132L).setName("John");
        System.out.println(builder);

        Student builder2 = new StudentBuilder().setAge(23).setId(132L)
                .setName("John").build();

        System.out.println(builder2);
    }
}
