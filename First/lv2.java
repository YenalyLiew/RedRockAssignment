import java.util.Arrays;
import java.util.Scanner;

public class lv2 {
    public static void main (String[] args){
        int shuzu[] = {10 , 20 , 30 , 40 , 25 , 35 , 45};
        System.out.println("冒泡排序后的结果：");
        for (int i = 0 ; i < shuzu.length - 1 ; i++) {
            for (int j = 0 ; j < shuzu.length - i - 1 ; j++) {
                if (shuzu[j] >= shuzu[j+1]){
                int temp = shuzu[j];
                shuzu[j] = shuzu[j+1];
                shuzu[j+1] = temp;
                }
            }
        }
        for (int i = 0 ; i < shuzu.length ; i++) {
            System.out.print(shuzu[i] + " ");
        }
        System.out.println();
        System.out.println("反转：");
        for (int i = 0 ; i < shuzu.length / 2 ; i++) {
            int temp = shuzu[i];
            shuzu[i] = shuzu[shuzu.length - i - 1];
            shuzu[shuzu.length - i - 1] = temp;
        }
        for (int i = 0 ; i < shuzu.length ; i++) {
            System.out.print(shuzu[i] + " ");
        }
        int newzu[] = new int[shuzu.length+1];
        for (int i = 0 ; i < shuzu.length ; i++) {
            newzu[i] = shuzu[i];
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("请插入一个待插入的数：");
        int value = sc.nextInt();
        newzu[newzu.length-1] = value;
        Arrays.sort(newzu);
        System.out.println("插入数字" + "(" + value + ")" + "之后的数组为：");
        for (int i = 0 ; i < newzu.length ; i++) {
            System.out.print(newzu[i] + " ");
        }
        sc.close();
    }
}
