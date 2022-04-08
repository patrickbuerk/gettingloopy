public class Main {

    public static void main(String[] args)
    {
        for (int  cnt=0; cnt<=30; cnt++){
            System.out.println(cnt);
        }
        for(int cnnt=0; cnnt<=18; cnnt=cnnt+3){
        System.out.println(cnnt);
    }
        for (int cnt1=30; cnt1>=0; cnt1--){
            System.out.println(cnt1);
        }
        for (int count=10; count>=0;count=count-2){
            System.out.println(count);
        }
        System.out.println("Next code");
        for (int Cnt = 1; Cnt <= 5; Cnt++)
        {
            for (int Cnt2 = 1; Cnt2 <= Cnt; Cnt2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("next code");
        for (int Cnt = 1; Cnt <= 5; Cnt++)
        {
            for (int Cnt2 = 1; Cnt2 <= (-1 * Cnt + 6); Cnt2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Next code");
        for (int Cnt = 1; Cnt <= 5; Cnt++)
        {
            for (int Cnt1 = 1; Cnt1 <= 5; Cnt1++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Next code");
        for (int cnt = 1; cnt <= 3; cnt++)
        {
            for (int cnt1 = 1; cnt1 <= 18; cnt1++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int nt = 1; nt <= 3; nt++)
        {
            for (int space = 1; space <= (nt * -2 + 70); space = space + 10)
            {
                System.out.print(" ");
            }
            for (int nt1 = 1; nt1 <= 3; nt1++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
