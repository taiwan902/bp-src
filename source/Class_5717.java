/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public abstract class Class_5717
extends Class_3238 {
    public static final Class_3957 Field_5718 = Class_3957.Method_3963(Class_5717.Method_5723("\u0f38\u0f30\u0f3e\u0f36"), Class_5736.class);

    public void Method_5719() {
        if (this.Method_5721()) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.33333334f * 1.5f, 1.0f);
        }
    }

    public abstract String Method_5720(int var1);

    public abstract boolean Method_5721();

    public abstract Class_3538 Method_5722();

    public Class_5717(Class_3713 class_3713) {
        super(class_3713);
        if (this.Method_5721()) {
            this.\u0000= final = 25 & 4737;
        } else {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.36792454f * 1.3589743f, 1.0f);
        }
        this.\u0000strictfp(10751 & 4863);
    }

    private static String Method_5723(String string) {
        int n = 17612;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5717.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_5724() {
        return this.Method_5721();
    }

    public Class_3436 Method_5725(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        Class_3436 class_3436 = super.Method_3330(class_283, class_4751, class_4595, f, f2, f3, n, class_859).Method_3437(Field_5718, (Comparable)((Object)Class_5736.Field_5738));
        return this.Method_5721() ? class_3436 : (class_4595 != Class_4595.Field_4615 && (class_4595 == Class_4595.Field_4601 || (double)f2 <= 0.7934782608695653 * 0.6301369863013698) ? class_3436 : class_3436.Method_3437(Field_5718, (Comparable)((Object)Class_5736.Field_5737)));
    }

    public boolean Method_5726(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        int n;
        if (this.Method_5721()) {
            return super.Method_3356(class_561, class_4751, class_4595);
        }
        if (class_4595 != Class_4595.Field_4601 && class_4595 != Class_4595.Field_4615 && !super.Method_3356(class_561, class_4751, class_4595)) {
            return (13576 & 2563) != 0;
        }
        Class_4751 class_47512 = class_4751.Method_4765(class_4595.Method_4660());
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        Class_3436 class_34362 = class_561.Method_568(class_47512);
        int n2 = Class_5717.Method_5733(class_3436.Method_3442()) && class_3436.Method_3440(Field_5718) == Class_5736.Field_5737 ? 19505 & 77 : 25046 & -32736;
        int n3 = n = Class_5717.Method_5733(class_34362.Method_3442()) && class_34362.Method_3440(Field_5718) == Class_5736.Field_5737 ? -26523 & 1027 : 4132 & -22271;
        return (n != 0 ? (class_4595 == Class_4595.Field_4615 ? 14865 & 16647 : (class_4595 == Class_4595.Field_4601 && super.Method_3356(class_561, class_4751, class_4595) ? 5315 & 18473 : (!Class_5717.Method_5733(class_3436.Method_3442()) || n2 == 0 ? 2393 & 9729 : -32606 & 16457))) : (class_4595 == Class_4595.Field_4601 ? 8581 & -32175 : (class_4595 == Class_4595.Field_4615 && super.Method_3356(class_561, class_4751, class_4595) ? 4611 & 2317 : (!Class_5717.Method_5733(class_3436.Method_3442()) || n2 != 0 ? 2127 & -31695 : 7328 & 8777)))) != 0;
    }

    public void Method_5727(Class_561 class_561, Class_4751 class_4751) {
        if (this.Method_5721()) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            Class_3436 class_3436 = class_561.Method_568(class_4751);
            if (class_3436.Method_3442() == this) {
                if (class_3436.Method_3440(Field_5718) == Class_5736.Field_5737) {
                    this.\u0000strictfp(0.0f, 0.96875f * 0.516129f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.8666667f * 0.5769231f, 1.0f);
                }
            }
        }
    }

    public int Method_5728(Class_283 class_283, Class_4751 class_4751) {
        return super.Method_3328(class_283, class_4751) & (16983 & 263);
    }

    public boolean Method_5729() {
        return this.Method_5721();
    }

    public void Method_5730(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_10997 class_10997, List list, Class_1061 class_1061) {
        this.Method_5727(class_283, class_4751);
        super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
    }

    public abstract Object Method_5731(Class_23823 var1);

    public int Method_5732(Random random) {
        return this.Method_5721() ? 4322 & 1043 : -32509 & 577;
    }

    protected static boolean Method_5733(Class_3238 class_3238) {
        return (class_3238 == Class_9265.Field_9430 || class_3238 == Class_9265.Field_9460 || class_3238 == Class_9265.Field_9463 ? 11331 & -27759 : -28664 & 19009) != 0;
    }

    private void Method_5734() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean Method_5735() {
        return (-30638 & 268) != 0;
    }
}

