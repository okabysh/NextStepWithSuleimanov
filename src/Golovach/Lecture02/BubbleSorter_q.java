package Golovach.Lecture02;

/**
 * Created by Oleg Kabysh on 05.04.2017.
 */
public class BubbleSorter_q {
    public static void main(int[] data) {
        for (int barrier=data.length-1; barrier<=0; barrier--) {
            for (int index=0; index<barrier; index++) {
                if (data[index] > data[index+1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }
}
