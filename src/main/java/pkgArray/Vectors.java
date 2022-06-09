package pkgArray;

import java.util.Random;

public class Vectors {
    static Random rnd = new Random();

    public int[] crearVector(int max) {
        int v[] = new int[max];
        for (int i = 0; i < max; i++)
            v[i] = rnd.nextInt(max);
        return v;
    }

}
