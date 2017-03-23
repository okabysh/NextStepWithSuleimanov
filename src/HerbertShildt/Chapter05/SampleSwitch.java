package HerbertShildt.Chapter05;

/**
 * Created by Oleg Kabysh on 23.03.2017.
 */
public class SampleSwitch {
    public static void main(String[] args) {
        for (int i=0; i<6; i++) {
            switch (i) {
                case 0:
                    System.out.println("0");
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("больше 3");
            }
        }
    }
}
