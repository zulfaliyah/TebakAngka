
package tebakangka;
import java.util.Scanner;

public class TebakAngka {
    int f,y,s,t;

    public static void main(String[] args) {
        System.out.println("pikirkan angka 1-15. ketik y jika sudah");

        String a;
        Scanner b=new Scanner (System.in);
        a=b.nextLine();

        if(a.equals("y")){
            TebakAngka p = new TebakAngka();
            p.card1();
        } else {
            System.out.println("pikir lagi :3");
            TebakAngka p = new TebakAngka();
            p.card1();
        }
}
    
    public void card1() {
        System.out.println();
        int[][] array = {{1,3,5},{7,9,11}};

        for(int row=0; row<2; row++) {
            for(int column=0; column<3; column++) {
                System.out.printf("%4d", array[row][column]);
            }
            System.out.println();
        }
        int [][] array2 = {{13,15}};
        for(int row=0; row<1; row++) {
            for(int column=0; column<2; column++) {
                System.out.printf("%5d", array2[row][column]);
            }   
            System.out.println();
        }

        System.out.println("apakah ada? (y/n)");

        Scanner b=new Scanner (System.in);
        String c;
        c=b.nextLine();

        if(c.equals("y")){
            f=1;
            card2();
        }else {
            f=0;
            card2();
        }        
    }

    public void card2() {
        System.out.println();
        int[][] array = {{2,3,6},{7,10,11}};

        for(int row=0; row<2; row++) {
            for(int column=0; column<3; column++) {
                System.out.printf("%4d", array[row][column]);
            }
            System.out.println();
        }
        int [][] array2 = {{14,15}};
        for(int row=0; row<1; row++) {
            for(int column=0; column<2; column++) {
                System.out.printf("%5d", array2[row][column]);
            }   
            System.out.println();
        }

        System.out.println("apakah ada? (y/n)");
        Scanner b=new Scanner (System.in);
        String c;
        c=b.nextLine();

        if(c.equals("y")){
            y=2;
            card3();
        } else {
            y=0;
            card3();
        }
    }

    public void card3() {
        System.out.println();
        int[][] array = {{4,5,6},{7,12,13}};

        for(int row=0; row<2; row++) {
            for(int column=0; column<3; column++) {
                System.out.printf("%4d", array[row][column]);
            }
            System.out.println();
        }
        int [][] array2 = {{14,15}};
        for(int row=0; row<1; row++) {
            for(int column=0; column<2; column++) {
                System.out.printf("%5d", array2[row][column]);
            }   
            System.out.println();
        }

        System.out.println("apakah ada? (y/n)");
        Scanner b=new Scanner (System.in);
        String c;
        c=b.nextLine();

        if(c.equals("y")){
            s=4;
            card4();
        } else {
            s=0;
            card4();
        }
    }

    public void card4() {
        System.out.println();
        int[][] array = {{8,9,10},{11,12,13}};

        for(int row=0; row<2; row++) {
            for(int column=0; column<3; column++) {
                System.out.printf("%4d", array[row][column]);
            }
            System.out.println();
        }
        int [][] array2 = {{14,15}};
        for(int row=0; row<1; row++) {
            for(int column=0; column<2; column++) {
                System.out.printf("%5d", array2[row][column]);
            }   
            System.out.println();
        }

        System.out.println("apakah ada? (y/n)");
        Scanner b=new Scanner (System.in);
        String c;
        c=b.nextLine();

        if(c.equals("y")){
            t=8;
            total();
        } else {
            t=0;
            total();
        }
    }


    public void total(){
        System.out.println();
        System.out.println("angka yang anda pilih adalah " + (f+y+s+t));
    }
}
