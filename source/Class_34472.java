/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34472
implements Class_7380 {
    private static final Class_2080 Field_34473 = new Class_2080(Class_34472.Method_34476("\u4101\u4101\u4103\u4102\u4100\u4100\u4102\u4103\u4140\u4101\u4103\u4102\u4100\u4100\u4102\u4143\u4100\u4100\u4102\u4103\u4101\u4101\u4103\u4143\u4100\u4100\u4102\u4103\u4101\u4101\u4103\u4123\u4120\u4120\u4122\u4123\u4121\u4160\u4123\u4122\u4120"));
    private final Class_35378 Field_34474 = new Class_35378(2.0f);
    private final Class_45521 Field_34475;

    private static String Method_34476(String string) {
        int n = 23637;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34472.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_34477(Class_43073 class_43073, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (class_43073.Method_43097()) {
            boolean bl = class_43073.\u0000= ?();
            Class_16867.Method_16930((!bl ? 14033 & -30453 : 5134 & 8208) != 0);
            this.Field_34475.\u0000strictfp(Field_34473);
            Class_16867.Method_16934(5987 & 6034);
            Class_16867.Method_16962();
            float f8 = (float)class_43073.\u0000= package + f3;
            Class_16867.Method_16943(f8 * (0.0058333334f * 1.7142857f), f8 * (0.0039506173f * 2.53125f), 0.0f);
            Class_16867.Method_16934(30500 & 5896);
            Class_16867.Method_16947();
            float f9 = 1.2037038f * 0.4153846f;
            Class_16867.Method_16924(f9, f9, f9, 1.0f);
            Class_16867.Method_16931();
            Class_16867.Method_16951(2051 & -32703, -29947 & 17427);
            this.Field_34474.\u0000strictfp(this.Field_34475.\u0000strictfp());
            this.Field_34474.Method_35387(class_43073, f, f2, f4, f5, f6, f7);
            Class_16867.Method_16934(30466 & 8011);
            Class_16867.Method_16962();
            Class_16867.Method_16934(22336 & 5888);
            Class_16867.Method_16918();
            Class_16867.Method_16952();
            Class_16867.Method_16930(bl);
        }
    }

    public void Method_34478(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_34477((Class_43073)class_859, f, f2, f3, f4, f5, f6, f7);
    }

    public boolean Method_34479() {
        return (-28632 & 9171) != 0;
    }

    private void Method_34480() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34472(Class_45521 class_45521) {
        this.Field_34475 = class_45521;
    }
}

