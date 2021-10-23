public class lv1_1 {
    public static void main (String[] args){
        System.out.println("九九乘法表：");
        for (int i = 1 ; i <= 9 ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                int value = j * i ;
                System.out.print(j + "*" + i + "=" + value + "\t");
            }
            System.out.println();
        }
    }
}
