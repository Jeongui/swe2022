package c1103;

import java.util.Random;

public class LocalClassTest {
    static public void main(String[] arg){
        intSequence seq = randomints(3,5);
        System.out.println(seq.next());
        System.out.println(seq.next());
        System.out.println(seq.next());
    }

    private static Random generator = new Random();
    public static intSequence randomints(int low, int high){
        class RandomSequence implements intSequence{
            @Override
            public int next() {
                return low + generator.nextInt(high - low +1);
            }

        }
        return new RandomSequence();
    }
}




