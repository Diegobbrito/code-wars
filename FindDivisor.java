import static org.junit.Assert.assertEquals;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        int cont = 2;

        for (int i = 2; i <= n/2 ; i++) {
            if(n % i == 0) cont++;
        }
        return ( n ==0)? 0 : cont;
    }
    public static void main(String[] args) {
        FindDivisor fd = new FindDivisor();
            assertEquals("Should return 3 if the parameter equals 4", 3, fd.numberOfDivisors(4));
    }
}
