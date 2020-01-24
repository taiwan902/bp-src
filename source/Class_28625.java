/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_28625
extends Class_26421 {
    final Class_4751 Field_28626;
    final Class_283 Field_28627;
    final Class_9871 Field_28628;

    public boolean Method_28629(Class_23823 class_23823) {
        return (8376 & 768) != 0;
    }

    private void Method_28630() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_28631(Class_626 class_626, Class_23823 class_23823) {
        Object object;
        if (!class_626.Field_694.Method_18094()) {
            class_626.Method_829(-this.Field_28628.Field_9879);
        }
        Class_9871.Method_9886(this.Field_28628).Method_4963(3320 & 12800, null);
        if (Class_9871.Method_9884(this.Field_28628) > 0) {
            object = Class_9871.Method_9886(this.Field_28628).Method_4964(-24443 & 321);
            if (object != null && ((Class_23823)object).Field_23826 > Class_9871.Method_9884(this.Field_28628)) {
                ((Class_23823)object).Field_23826 -= Class_9871.Method_9884(this.Field_28628);
                Class_9871.Method_9886(this.Field_28628).Method_4963(2081 & 1281, (Class_23823)object);
            } else {
                Class_9871.Method_9886(this.Field_28628).Method_4963(1 & -29647, null);
            }
        } else {
            Class_9871.Method_9886(this.Field_28628).Method_4963(17 & 5, null);
        }
        this.Field_28628.Field_9879 = 17420 & 13152;
        object = this.Field_28627.Method_375(this.Field_28626);
        if (!class_626.Field_694.Method_18094() && !this.Field_28627.Field_306 && object.Method_3442() == Class_9265.Field_9376 && class_626.\u0000strictfp().nextFloat() < 15.8f * 0.0075949365f) {
            int n = (Integer)object.Method_3440(Class_27430.Field_27432);
            if (++n > (2066 & 1123)) {
                this.Field_28627.Method_472(this.Field_28626);
                this.Field_28627.Method_502(13308 & -14339, this.Field_28626, 16908 & 12354);
            } else {
                this.Field_28627.Method_462(this.Field_28626, object.Method_3437(Class_27430.Field_27432, Integer.valueOf(n)), -28565 & 16390);
                this.Field_28627.Method_502(19453 & 6143, this.Field_28626, 7233 & 8);
            }
        } else if (!this.Field_28627.Field_306) {
            this.Field_28627.Method_502(19453 & 5119, this.Field_28626, -32174 & 256);
        }
    }

    Class_28625(Class_9871 class_9871, Class_4961 class_4961, int n, int n2, int n3, Class_283 class_283, Class_4751 class_4751) {
        this.Field_28628 = class_9871;
        this.Field_28627 = class_283;
        this.Field_28626 = class_4751;
        super(class_4961, n, n2, n3);
    }

    public boolean Method_28632(Class_626 class_626) {
        return ((class_626.Field_694.Method_18094() || class_626.Field_668 >= this.Field_28628.Field_9879) && this.Field_28628.Field_9879 > 0 && this.\u0000strictfp() ? 1 & 22817 : 9261 & 4928) != 0;
    }
}

