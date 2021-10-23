public class lv1_2 {
    public static void main (String[] args){
        int linenum = 20;
        int maxline = 45 ;
        //1-6
        for (int line = 1 ; line<=6 ; line++) {
            for (int space = 1 ; space<=maxline/2+1-line ; space++) {
                System.out.print(" ");
            }
            for (int star = 1 ; star <= line*2-1 ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //7-11
        for (int line = 0 ; line<5 ; line++) {
            for (int space = 1 ; space <= line * 3 ; space++) {
                System.out.print(" ");
            }
            for (int star = 1 ; star <= maxline-line*6 ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //12-14
        for (int line = 10 ; line<=12 ; line++) {
            for (int space = 1 ; space<=maxline/2+1-line ; space++) {
                System.out.print(" ");
            }
            for (int star = 1 ; star<=17+(line-9)*2; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //15-20
        for (int line = 13 ; line<=18 ; line++) {
            for (int space = 1 ; space<=maxline/2+1-line ; space++) {
                System.out.print(" ");
            }
            for (int star = 1 ; star<=line-2-(line-13)*3;star++) {
                System.out.print("*");
            }
            for (int space = 1; space<=3*(2*(line-12)-1); space++){
                System.out.print(" ");
            }
            for (int star = 1; star<=line-2-(line-13)*3;star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
