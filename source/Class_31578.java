/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_31578
extends Class_4291 {
    private final boolean Field_31579;
    private final Class_3238 Field_31580;

    public Class_31578(Class_3238 class_3238, boolean bl) {
        this.Field_31580 = class_3238;
        this.Field_31579 = bl;
    }

    public boolean Method_31581(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (class_283.Method_375(class_4751.Method_4769()).Method_3442() != Class_9265.Field_9368) {
            return (16466 & 544) != 0;
        }
        if (class_283.Method_375(class_4751).Method_3442().Method_3373() != Class_3713.Field_3718 && class_283.Method_375(class_4751).Method_3442() != Class_9265.Field_9368) {
            return (27786 & 836) != 0;
        }
        int n = 23123 & 1152;
        if (class_283.Method_375(class_4751.Method_4771()).Method_3442() == Class_9265.Field_9368) {
            ++n;
        }
        if (class_283.Method_375(class_4751.Method_4770()).Method_3442() == Class_9265.Field_9368) {
            ++n;
        }
        if (class_283.Method_375(class_4751.Method_4778()).Method_3442() == Class_9265.Field_9368) {
            ++n;
        }
        if (class_283.Method_375(class_4751.Method_4784()).Method_3442() == Class_9265.Field_9368) {
            ++n;
        }
        if (class_283.Method_375(class_4751.Method_4782()).Method_3442() == Class_9265.Field_9368) {
            ++n;
        }
        int n2 = -24448 & 3072;
        if (class_283.Method_507(class_4751.Method_4771())) {
            ++n2;
        }
        if (class_283.Method_507(class_4751.Method_4770())) {
            ++n2;
        }
        if (class_283.Method_507(class_4751.Method_4778())) {
            ++n2;
        }
        if (class_283.Method_507(class_4751.Method_4784())) {
            ++n2;
        }
        if (class_283.Method_507(class_4751.Method_4782())) {
            ++n2;
        }
        if (!this.Field_31579 && n == (4148 & 26766) && n2 == (16769 & 10249) || n == (5141 & 18701)) {
            class_283.Method_462(class_4751, this.Field_31580.Method_3293(), 902 & 16426);
            class_283.Method_356(this.Field_31580, class_4751, random);
        }
        return (65 & -11759) != 0;
    }

    private void Method_31582() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

