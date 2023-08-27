package Calculate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Programm {

    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProectConfig.class);
       // PresenterOfT p = new PresenterOfT(new SumModel(), new View());
        var p = context.getBean(PresenterOfT.class);
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
