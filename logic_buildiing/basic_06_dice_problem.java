import java.util.*;

public class basic_06_dice_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        guessOppositeFace_if(n[0]);
        guessOppositeFace_switch(n[0]);
        System.out.println(guessOppositeFace_sum(n[0]));
        sc.close();
    }

    public static void guessOppositeFace_if(char n)
    {
        if(n == '1')
        {
            System.out.println("6");
        }
        else if(n == '2')
        {
            System.out.println("5");
        }
        else if(n == '3')
        {
            System.out.println("4");
        }
        else if(n == '4')
        {
            System.out.println("3");
        }
        else if(n == '5')
        {
            System.out.println("2");
        }
        else if(n == '6')
        {
            System.out.println("1");
        }
    }

    public static void guessOppositeFace_switch(char n)
    {
        switch(n)
        {
            case '1': System.out.println("6");
                      break;
            case '2': System.out.println("5");
                      break;
            case '3': System.out.println("4");
                      break;
            case '4': System.out.println("3");
                      break;
            case '5': System.out.println("2");
                      break;
            case '6': System.out.println("1");
                      break;
        }
    }

    public static int guessOppositeFace_sum(char n)
    {
        return 7 - (n - '0');
    }
}
