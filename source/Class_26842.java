/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_26842
implements Class_26405 {
    public int Field_26843;

    public void Method_26844(Random random) {
        int n = random.nextInt(16647 & 9229);
        if (n <= (8203 & 657)) {
            this.Field_26843 = Class_8338.Field_8361.Field_8364;
        } else if (n <= (34 & -32762)) {
            this.Field_26843 = Class_8338.Field_8349.Field_8364;
        } else if (n <= (515 & 5379)) {
            this.Field_26843 = Class_8338.Field_8348.Field_8364;
        } else if (n <= (2436 & 16436)) {
            this.Field_26843 = Class_8338.Field_8362.Field_8364;
        }
    }

    private void Method_26845() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

