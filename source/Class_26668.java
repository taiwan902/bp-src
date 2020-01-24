/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26668 {
    private boolean Field_26669;
    private final int Field_26670;
    private final int Field_26671;
    private Object Field_26672;

    public void Method_26673(boolean bl) {
        this.Field_26669 = bl;
    }

    public Class_26668(int n, int n2, Object object) {
        this.Field_26671 = n2;
        this.Field_26672 = object;
        this.Field_26670 = n;
        this.Field_26669 = -30607 & 4229;
    }

    public void Method_26674(Object object) {
        this.Field_26672 = object;
    }

    public boolean Method_26675() {
        return this.Field_26669;
    }

    public Object Method_26676() {
        return this.Field_26672;
    }

    private void Method_26677() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static boolean Method_26678(Class_26668 class_26668, boolean bl) {
        class_26668.Field_26669 = bl;
        return class_26668.Field_26669;
    }

    public int Method_26679() {
        return this.Field_26671;
    }

    public int Method_26680() {
        return this.Field_26670;
    }
}

