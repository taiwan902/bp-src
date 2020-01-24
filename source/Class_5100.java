/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_5100
extends Class_4879 {
    public boolean Field_5101;
    public byte Field_5102;

    private void Method_5103() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_5104() {
        this.Field_5102 = (byte)((this.Field_5102 + (289 & -28159)) % (-14309 & 12861));
        this.\u0000, for();
    }

    public void Method_5105(Class_283 class_283, Class_4751 class_4751) {
        if (class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3373() == Class_3713.Field_3718) {
            Class_3713 class_3713 = class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3373();
            int n = 768 & -20235;
            if (class_3713 == Class_3713.Field_3721) {
                n = 23841 & 709;
            }
            if (class_3713 == Class_3713.Field_3746) {
                n = 23686 & -32758;
            }
            if (class_3713 == Class_3713.Field_3752) {
                n = 16467 & 7459;
            }
            if (class_3713 == Class_3713.Field_3723) {
                n = 1030 & 16716;
            }
            class_283.Method_466(class_4751, Class_9265.Field_9454, n, this.Field_5102);
        }
    }

    public void Method_5106(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        class_1699.Method_1724("note", this.Field_5102);
    }

    public void Method_5107(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        this.Field_5102 = class_1699.Method_1716("note");
        this.Field_5102 = (byte)Class_13337.Method_13367(this.Field_5102, 10760 & 16768, 6040 & 8280);
    }
}

