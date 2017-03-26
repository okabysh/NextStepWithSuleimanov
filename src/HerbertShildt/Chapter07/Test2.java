package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class Test2 {
    int i, j;

    public Test2() {
        i *= 2;
        j /= 2;
    }

    public Test2(int i, int j) {
        this.i = i * 2;
        this.j = j / 2;
    }

    public void meth(int i, int j) {
        this.i = i * 2;
        this.j = j / 2;
    }

    public void meth(Test2 o) {
        o.i *= 2;
        o.j /= 2;
    }
}
