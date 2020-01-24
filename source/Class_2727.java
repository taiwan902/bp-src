/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_2727
extends OutputStream
implements DataOutput {
    private final DataOutputStream Field_2728 = new DataOutputStream(this);
    private final Class_22553 Field_2729;
    private final int Field_2730;

    public void Method_2731(int n) {
        this.Field_2729.Method_22565(n);
    }

    public void Method_2732(String string) {
        int n = string.length();
        for (int i = 13584 & 67; i < n; ++i) {
            this.Method_2745((byte)string.charAt(i));
        }
    }

    public void Method_2733(String string) {
        this.Field_2728.writeUTF(string);
    }

    public void Method_2734(byte[] arrby) {
        this.Field_2729.Method_22610(arrby);
    }

    public Class_2727(Class_22553 class_22553) {
        if (class_22553 == null) {
            throw new NullPointerException("buffer");
        }
        this.Field_2729 = class_22553;
        this.Field_2730 = class_22553.Method_22620();
    }

    public void Method_2735(byte[] arrby, int n, int n2) {
        if (n2 == 0) {
            return;
        }
        this.Field_2729.Method_22570(arrby, n, n2);
    }

    public void Method_2736(double d) {
        this.Method_2742(Double.doubleToLongBits(d));
    }

    public void Method_2737(int n) {
        this.Method_2738((short)n);
    }

    public void Method_2738(int n) {
        this.Field_2729.Method_22575((short)n);
    }

    public void Method_2739(int n) {
        this.Method_2745(n);
    }

    public void Method_2740(boolean bl) {
        this.Method_2745(bl ? 6489 & -15707 : -27640 & 18529);
    }

    public void Method_2741(String string) {
        int n = string.length();
        for (int i = 3084 & 768; i < n; ++i) {
            this.Method_2737(string.charAt(i));
        }
    }

    public void Method_2742(long l) {
        this.Field_2729.Method_22584(l);
    }

    private void Method_2743() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_2744(float f) {
        this.Method_2731(Float.floatToIntBits(f));
    }

    public void Method_2745(int n) {
        this.Field_2729.Method_22606((byte)n);
    }
}

