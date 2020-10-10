package cd.get.ready.algorithms;

public class EuclidsAlgorithm {

    public int gcd(int a, int b){

        int mod = a % b;

        while (mod != 0) {
            a = b;
            b = mod;
            mod = a % b;
        }

        return b;
    }
}
