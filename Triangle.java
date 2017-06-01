/**
 * Created by Administrator on 2017/6/1.
 * Creating a isosceles triangle with number
 */

public class Triangle {

    public void isoscelesTriangle() {
        for (int i = 1; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");//for empty space in front of number which make
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);//numbers before 1
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);//numbers after 1
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void asteriskTriangle() {
        for (int i = 1; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");//for empty space in front of number which make
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("*");//numbers before 1
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");//numbers after 1
            }
            System.out.println("");
        }
    }


}
