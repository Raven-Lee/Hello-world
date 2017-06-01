/**
 * Created by Administrator on 2017/6/1.
 * Creating a triangle with number
 */

public class Triangle {

    public void initializeTriangle() {
        for (int i = 1; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println("");
        }
    }


}
