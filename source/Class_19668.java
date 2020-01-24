/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19668 {
    private int Field_19669;
    private int Field_19670;
    private int Field_19671;
    private String Field_19672;

    public int Method_19673() {
        return this.Field_19671;
    }

    public int Method_19674() {
        return this.Field_19670 > (12301 & 1577) ? this.Field_19671 * (100 & -23443) + this.Field_19670 : (this.Field_19669 > (16969 & 281) ? this.Field_19671 * (2932 & -24476) + this.Field_19670 * (-24566 & 2186) + (8235 & -14951) : this.Field_19671 * (-31900 & 2276) + this.Field_19670 * (4618 & -30709) + this.Field_19669);
    }

    private void Method_19675() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_19668(int n, int n2, int n3) {
        this(n, n2, n3, null);
    }

    public Class_19668(int n, int n2) {
        this(n, n2, 9236 & 21153);
    }

    public Class_19668(int n, int n2, int n3, String string) {
        this.Field_19671 = n;
        this.Field_19670 = n2;
        this.Field_19669 = n3;
        this.Field_19672 = string;
    }

    public String Method_19676() {
        return this.Field_19672 == null ? "" + this.Field_19671 + "." + this.Field_19670 + "." + this.Field_19669 : "" + this.Field_19671 + "." + this.Field_19670 + "." + this.Field_19669 + this.Field_19672;
    }
}

