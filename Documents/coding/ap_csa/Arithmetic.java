public class Arithmetic
{
    public static void main ( String [] args )
        {
            int first = (5 * 2) % ((2 + 3) - 1), third = 5 % 2 + 4 / 2 * 8;
            double second = (6 + 5) / 2.0 - 1 * 4, fourth = 13.0 / 2 % 0.5 * 2 + 1;
            System.out.println("(5 * 2) % ((2 + 3) - 1) = " + first);
            System.out.println("(6 + 5) / 2.0 - 1 * 4 = " + second);
            System.out.println("5 % 2 + 4 / 2 * 8 = " + third);
            System.out.println("13.0 / 2 % 0.5 * 2 + 1 = " + fourth);
        }
}
