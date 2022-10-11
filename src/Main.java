import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        sayhello(); // Prints hello 1 time
        System.out.println("\n spacer \n");
        sayhello(10);
        sayMsg("Life sucks", 35);

        int myFav = getRangedInt(console, "enter your val", 1, 100);
        int myFavDoubled = doubleit(myFav);
        System.out.println("Doubled is " +myFavDoubled);

    }
    //user defined methods go here and are static
    public static void sayhello()
    {
        System.out.println("Hello");
    }
    public static void sayhello(int times)
    {
        for (int rep =0 ; rep < times; rep++)
        System.out.println("Hello");
    }

    public static void sayMsg(String msg, int times)
    {
        for (int rep =0 ; rep < times; rep++)
            System.out.println(msg);
    }
    public static int doubleit (int toBeDoubled)
    {
        int doubledVal = toBeDoubled * 2;
        return doubledVal;
    }


         public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
        {
            int retVal = low - 1;
            boolean done = false;


            do {
                System.out.print(prompt + ": ");
                if (pipe.hasNextInt()) ;
                {
                    retVal = pipe.nextInt();
                    pipe.nextLine();
                    if (retVal >= low && retVal <= high) {
                        System.out.println("You said your val is " + retVal);
                        done = true;
                    } else {
                        System.out.println("You said said your val is " + retVal + " but that is out of range");
                    }
                }
            } while (!done);

            return retVal;

    }
}