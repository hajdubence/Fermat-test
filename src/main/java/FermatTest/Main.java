package FermatTest;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prímszámok lehetnek: ");
        for (int i = 1; i < 100; i++) {
            if (FermatTest.passes(BigInteger.valueOf(i))) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // Vannak olyan számok amelyek teljesítik a fermat tesztet de mégse prímek.
        // 561=3*11*17
        if (FermatTest.passes(BigInteger.valueOf(561),100)) {
            System.out.println("561 átment a teszten.");
        } else {
            System.out.println("561 nem ment át a teszten.");
        }

        // elearning.unideb.hu rsa nyilvános kulcsa.
        BigInteger RsaPublicKey = new BigInteger("D4F2EF6B881D1ED2C5C83F137179B170B31F9D5790F9FD47B68B8A794B8236996B4252FE00953D5B8396B87A34FE7B8B1B2510F80DC92337AEA94D260E7C0209C7E9DB059D61ECB9B9120D779FE4FFA4D4517A800DF8B5A7217B2DEF0B5C9429C3AD9D5260C1A7A488CBF4D1D7035CB2879A972666AE4DDBF5E13EDA279B688A42DE0DDB14A3D68BE18CEFA0DE1B1EBE29E593343DC0332075A513DA0FD4C6006AD7C4D9D9AA672E52DD33B809B6A0A9D4FC87969E768CE64556B0CCEC0FF76D298A4F796C1376EAD03765306AA6F9DEFBB098F95D85208ADF8D8F6A797AEB21A2FA34190E714756D7F35C953286F3CC003204F175C56AE7D3718AA76E67D883A6A747875602F46EB64720B2409244E6C1910B990C206753929BC7ACE0C67556685C0F0B95EC9DAC2487E6FF1EAC3888AC3ED390C30F78CBA6AAAF96FFBEF69F5DB504BCA6621559A089CE4DD727EA9BDB29C724B81D02CC9C5BBF0C017293D0C2DA1B2D4F28282ECFD81CBA6B76BC4C6B254375740B2FCE10FB1EAB6DB1595DFA536BA57EAEBF0ADF29D81D8504BFFAB04233E58DABB1672BB55A1736A38BA35C7E3C73D5305ACA67C7E29C9A1DD63366EE6AB64EC49ACEC51B53A48216EDC612BB9C675834186BEF4D515373BA3AFD530AFC36B38614CD3C89CB468699B9FA2070C76BFD1AEFA127F56CDB4CA22DBA5C88E08BC6B0640ECAE75ED62D98CF4B",16);
        if (FermatTest.passes(RsaPublicKey)) {
            System.out.println("RsaPublicKey átment a teszten.");
        } else {
            System.out.println("RsaPublicKey nem ment át a teszten.");
        }

    }
}
