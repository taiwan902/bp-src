/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_28264
extends Class_4291 {
    private Class_3238 Field_28265;

    public Class_28264(Class_3238 class_3238) {
        this.Field_28265 = class_3238;
    }

    private void Method_28266() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_28267(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (class_283.Method_375(class_4751.Method_4769()).Method_3442() != Class_9265.Field_9446) {
            return (513 & -31480) != 0;
        }
        if (class_283.Method_375(class_4751.Method_4782()).Method_3442() != Class_9265.Field_9446) {
            return (8324 & 1536) != 0;
        }
        if (class_283.Method_375(class_4751).Method_3442().Method_3373() != Class_3713.Field_3718 && class_283.Method_375(class_4751).Method_3442() != Class_9265.Field_9446) {
            return (21024 & 1046) != 0;
        }
        int n = 18568 & 12307;
        if (class_283.Method_375(class_4751.Method_4771()).Method_3442() == Class_9265.Field_9446) {
            ++n;
        }
        if (class_283.Method_375(class_4751.Method_4770()).Method_3442() == Class_9265.Field_9446) {
            ++n;
        }
        if (class_283.Method_375(class_4751.Method_4778()).Method_3442() == Class_9265.Field_9446) {
            ++n;
        }
        if (class_283.Method_375(class_4751.Method_4784()).Method_3442() == Class_9265.Field_9446) {
            ++n;
        }
        int n2 = 14336 & 448;
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
        if (n == (675 & 10311) && n2 == (-32763 & 8417)) {
            class_283.Method_462(class_4751, this.Field_28265.Method_3293(), 594 & 24614);
            class_283.Method_356(this.Field_28265, class_4751, random);
        }
        return (325 & 129) != 0;
    }
}

