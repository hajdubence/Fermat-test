package FermatTest;

import java.math.BigInteger;
import java.util.Random;

public class FermatTest {
    public static boolean passes(BigInteger prime){
        return passes(prime, 20);
    }
    public static boolean passes(BigInteger prime, int rounds){
        if (prime.compareTo(BigInteger.TWO)==-1) {
            return false;
        }
        Random random = new Random();
        for (int i = 0; i < rounds; i++) {
            BigInteger rnd = BigInteger.valueOf(random.nextInt(10000)+2);
            if (!rnd.gcd(prime).equals(BigInteger.ONE))
            {
                i--;
                continue;
            }
            if (!rnd.modPow(prime.subtract(BigInteger.ONE), prime).equals(BigInteger.ONE))
            {
                return false;
            }
        }
        return true;
    }
}
