/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_11117 {
    protected Random Field_11118 = new Random();
    protected int Field_11119 = 1292 & 712;
    protected Class_283 Field_11120;

    protected void Method_11121(Class_283 class_283, int n, int n2, int n3, int n4, Class_36425 class_36425) {
    }

    private void Method_11122() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_11123(Class_12166 class_12166, Class_283 class_283, int n, int n2, Class_36425 class_36425) {
        int n3 = this.Field_11119;
        this.Field_11120 = class_283;
        this.Field_11118.setSeed(class_283.Method_392());
        long l = this.Field_11118.nextLong();
        long l2 = this.Field_11118.nextLong();
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                long l3 = (long)i * l;
                long l4 = (long)j * l2;
                this.Field_11118.setSeed(l3 ^ l4 ^ class_283.Method_392());
                this.Method_11121(class_283, i, j, n, n2, class_36425);
            }
        }
    }
}

