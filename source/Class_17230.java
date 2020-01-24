/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17230 {
    private int Field_17231;
    private int Field_17232;

    public String Method_17233() {
        return "min: " + this.Field_17231 + ", max: " + this.Field_17232;
    }

    public boolean Method_17234(int n) {
        return (n < this.Field_17231 ? -26606 & 64 : (n <= this.Field_17232 ? 2051 & 24785 : 16531 & 8200)) != 0;
    }

    private void Method_17235() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_17230(int n, int n2) {
        this.Field_17231 = Math.min(n, n2);
        this.Field_17232 = Math.max(n, n2);
    }
}

