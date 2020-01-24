/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_35249
extends Class_33077 {
    private int Field_35250;
    private Class_45373 Field_35251;

    private void Method_35252() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35253() {
        if (this.Field_35250 == 0) {
            this.Field_35250 = 1620 & 2196;
        }
    }

    public void Method_35254() {
        this.Field_35250 -= 2837 & 20545;
        if (this.Field_35250 <= 0) {
            Class_283 class_283 = this.Field_35251.\u0000strictfp;
            Random random = this.Field_35251.\u0000strictfp();
            Class_4751 class_4751 = new Class_4751(this.Field_35251);
            int n = 4097 & 11046;
            while (n <= (-18683 & 141) && n >= (-1 & -5)) {
                int n2 = 2121 & 4100;
                while (n2 <= (271 & 58) && n2 >= (-2 & -10)) {
                    int n3 = 18888 & 8196;
                    while (n3 <= (-8182 & 6334) && n3 >= (-1 & -10)) {
                        Class_4751 class_47512 = class_4751.Method_4791(n2, n, n3);
                        Class_3436 class_3436 = class_283.Method_375(class_47512);
                        if (class_3436.Method_3442() == Class_9265.Field_9384) {
                            if (class_283.Method_522().Method_7529("mobGriefing")) {
                                class_283.Method_541(class_47512, (4129 & 1) != 0);
                            } else {
                                class_283.Method_462(class_47512, ((Class_30961)((Object)class_3436.Method_3440(Class_25738.Field_25739))).Method_30989(), 11335 & 259);
                            }
                            if (random.nextBoolean()) {
                                return;
                            }
                        }
                        n3 = n3 <= 0 ? (16393 & 11539) - n3 : (8256 & 3329) - n3;
                    }
                    n2 = n2 <= 0 ? (16529 & -20445) - n2 : (-31610 & 10249) - n2;
                }
                n = n <= 0 ? (16465 & 4105) - n : (5376 & -32120) - n;
            }
        }
    }

    public Class_35249(Class_45373 class_45373) {
        this.Field_35251 = class_45373;
    }

    public boolean Method_35255() {
        return (this.Field_35250 > 0 ? -32735 & 26641 : -11896 & 16) != 0;
    }
}

