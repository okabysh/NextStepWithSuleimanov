package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 28.03.2017.
 */
public class Demo3Super {
    public static void main(String[] args) {
        Box3Weight mybox1 = new Box3Weight(10, 20, 15, 34.3);
        Box3Weight mybox2 = new Box3Weight(2, 3, 4, 0.076);
        Box3Weight mybox3 = new Box3Weight();
        Box3Weight mycube = new Box3Weight(3, 2);
        Box3Weight myclone = new Box3Weight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + myclone.weight);
        System.out.println();
    }
}
