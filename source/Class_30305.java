/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30305 {
    private int[] Field_30306 = null;
    private int Field_30307 = -1 & -1;

    public Class_30305(int n) {
        this.Field_30307 = n;
    }

    public Class_30305(int n, int[] arrn) {
        this.Field_30307 = n;
        this.Field_30306 = arrn;
    }

    public int Method_30308() {
        return this.Field_30307;
    }

    public boolean Method_30309(int n, int n2) {
        return (n != this.Field_30307 ? 9220 & 18520 : (int)(Class_20912.Method_20915(n2, this.Field_30306) ? 1 : 0)) != 0;
    }

    public int[] Method_30310() {
        return this.Field_30306;
    }

    private void Method_30311() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

