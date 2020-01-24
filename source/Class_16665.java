/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_16665
extends Class_6841 {
    private int Field_16666;
    final Class_30498 Field_16667;
    private ArrayList Field_16668;
    private long Field_16669 = -4937281216335097400L & 4937281214861027328L;

    public void Method_16670() {
        this.Field_16668 = Class_12440.Method_12805();
        this.Field_16666 = -28359 & 66;
        int n = this.Field_16668.size();
        for (int i = 32 & -17280; i < n; ++i) {
            if (!((String)this.Field_16668.get(i)).equals(Class_12440.Field_12519)) continue;
            this.Field_16666 = i;
            break;
        }
    }

    public Class_16665(Class_30498 class_30498, int n, int n2, int n3, int n4, int n5) {
        super(class_30498.Method_30512(), n, n2, n3, n4, n5);
        this.Field_16667 = class_30498;
        this.Method_16670();
        this.\u0000= final = 0.0f;
        int n6 = this.Field_16666 * n5;
        int n7 = (n4 - n3) / (-24254 & 16430);
        if (n6 > n7) {
            this.\u0000, `(n6 - n7);
        }
    }

    protected int Method_16671() {
        return this.Method_16675() * (1534 & 530);
    }

    public int Method_16672() {
        return this.\u0000, ` - (-4587 & 278);
    }

    protected void Method_16673(int n, boolean bl, int n2, int n3) {
        if (n != this.Field_16666 || this.\u0000strictfp != this.Field_16669) {
            this.Field_16666 = n;
            this.Field_16669 = this.\u0000strictfp;
            String string = (String)this.Field_16668.get(n);
            Class_12440.Method_12984(string);
            Class_12440.Method_12961();
            if (Class_12440.Field_12519 != string) {
                this.Method_16670();
            }
            this.Field_16667.Method_30523();
        }
    }

    protected void Method_16674() {
    }

    protected int Method_16675() {
        return this.Field_16668.size();
    }

    protected boolean Method_16676(int n) {
        return (n == this.Field_16666 ? 16645 & 14337 : 8202 & 2304) != 0;
    }

    private void Method_16677() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int Method_16678() {
        return this.\u0000, ` - (-11642 & 10614);
    }

    protected void Method_16679(int n, int n2, int n3, int n4, int n5, int n6) {
        String string = (String)this.Field_16668.get(n);
        if (string.equals(Class_12440.Field_12514)) {
            string = Class_14688.Method_14697("of.options.shaders.packNone");
        } else if (string.equals(Class_12440.Field_12576)) {
            string = Class_14688.Method_14697("of.options.shaders.packDefault");
        }
        this.Field_16667.Method_30514(string, this.\u0000, ` / (8275 & 2050), n3 + (-12267 & 1729), 283566577 & 48299246);
    }
}

