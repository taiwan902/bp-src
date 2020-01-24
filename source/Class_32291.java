/*
 * Decompiled with CFR 0.145.
 */
import java.util.Comparator;

@FunctionalInterface
public interface Class_32291
extends Comparator {
    @Deprecated
    default public int Method_32292(Object object, Object object2) {
        return this.Method_32294((Integer)object, (Integer)object2);
    }

    public int Method_32293(int var1, int var2);

    @Deprecated
    default public int Method_32294(Integer n, Integer n2) {
        return this.Method_32293(n, n2);
    }
}

