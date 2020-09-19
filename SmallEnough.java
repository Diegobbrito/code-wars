import static org.junit.Assert.assertEquals;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit)
    {
        for (int i: a) {
            if( i > limit)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        assertEquals(true, SmallEnough.smallEnough(new int[] { 66, 101 }, 200));

    }
}
