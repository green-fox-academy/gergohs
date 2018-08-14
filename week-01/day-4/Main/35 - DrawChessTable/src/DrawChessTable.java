public class DrawChessTable {
    public static void main(String[] args) {

        int i;
        int j;
        int n=10;


        for (i=1; i<=n; i++)
        {
           for (j=1; j<=n; j++)
            {
                if (i%2==0)
                {
                System.out.print("% ");
                }
                else if (i%2!=0)
                {
                    System.out.print(" %");
                }
            }
            System.out.println();
        }

    }

}
