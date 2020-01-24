/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_18614
extends Class_3238 {
    private void Method_18615() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_18616(Random random) {
        return (10658 & 16450) + random.nextInt(23047 & 211);
    }

    public Class_3779 Method_18617(Class_3436 class_3436) {
        return Class_3779.Field_3783;
    }

    public Class_1956 Method_18618(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10712;
    }

    public Class_18614(Class_3713 class_3713) {
        super(class_3713);
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public int Method_18619(int n, Random random) {
        return Class_13337.Method_13367(this.Method_18616(random) + random.nextInt(n + (-13675 & 1313)), -25151 & 8705, 17926 & -28508);
    }
}

