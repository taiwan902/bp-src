/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;

public final class Class_28968
implements CharSequence {
    private final int Field_28969;
    private final int Field_28970;
    private final String Field_28971;
    private final byte[] Field_28972;

    public char Method_28973(int n) {
        if (this.Field_28972.length - this.Field_28969 <= n) {
            throw new IndexOutOfBoundsException();
        }
        return (char)this.Field_28972[n];
    }

    private void Method_28974() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    boolean Method_28975(Class_22553 class_22553) {
        class_22553.Method_22610(this.Field_28972);
        return (this.Field_28969 > 0 ? 20929 & 3 : 35 & 24896) != 0;
    }

    public int Method_28976() {
        return this.Field_28972.length - this.Field_28969;
    }

    public Class_28968(String string) {
        this(string, null);
    }

    public CharSequence Method_28977(int n, int n2) {
        return new Class_28968(this.Field_28971.substring(n, n2));
    }

    int Method_28978() {
        return this.Field_28970;
    }

    public String Method_28979() {
        return this.Field_28971;
    }

    public Class_28968(String string, byte[] arrby) {
        this.Field_28971 = string;
        this.Field_28970 = Class_17103.Method_17135(string);
        byte[] arrby2 = string.getBytes(Class_7203.Field_7204);
        if (arrby == null) {
            this.Field_28972 = arrby2;
            this.Field_28969 = 6305 & 270;
        } else {
            this.Field_28969 = arrby.length;
            this.Field_28972 = new byte[arrby2.length + arrby.length];
            System.arraycopy(arrby2, 649 & -15358, this.Field_28972, 4104 & 3920, arrby2.length);
            System.arraycopy(arrby, 8460 & 672, this.Field_28972, arrby2.length, arrby.length);
        }
    }
}

