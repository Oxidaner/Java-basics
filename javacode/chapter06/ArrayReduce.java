/**
 * @Auther: zhangshibin
 * @Date: 2021/9/1 - 09 - 01 - 23:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
import java.util.Scanner;
public class ArrayReduce {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        do {
            int[] arrNew = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            System.out.println("====数组缩减后情况====");
            for(int i = 0; i < arrNew.length; i++) {
                System.out.print(arrNew[i] + "\t");
            }
            //问用户是否继续
            System.out.println("是否继续缩减? y/n");
            char key = myScanner.next().charAt(0);
            if( key == 'n') { //如果输入n ,就结束
                break;
            }
        }while (true);
    }
}
