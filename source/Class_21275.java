/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_21275
extends Class_13196 {
    public static final Class_3957 Field_21276 = Class_3957.Method_3963(Class_21275.Method_21278("\u214a\u2142\u2141\u2142\u214b"), Class_5393.class);

    public int Method_21277(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_21276))).Method_5419();
    }

    private static String Method_21278(String string) {
        int n = 26461;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21275.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_21279(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Class_36217.Method_36224(class_283, class_4751);
        }
    }

    public Class_17531 Method_21280() {
        return Class_17531.Field_17537;
    }

    public Class_3436 Method_21281(int n) {
        return this.\u0000strictfp().Method_3685(Field_21276, (Comparable)((Object)Class_5393.Method_5446(n)));
    }

    public void Method_21282(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Class_36217.Method_36224(class_283, class_4751);
        }
    }

    public void Method_21283(Class_1956 class_1956, Class_3987 class_3987, List list) {
        for (int i = 1026 & -25975; i < Class_5393.Method_5464().length; ++i) {
            list.add(new Class_23823(class_1956, -32631 & 12341, i));
        }
    }

    public Class_21275() {
        super(Class_3713.Field_3752, (24768 & 5684) != 0);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(\u0000
        , Boolean.valueOf((12354 & 3585) != 0)).Method_3437(\u0000strictfp, Boolean.valueOf((4099 & 2280) != 0)).Method_3437(\u0000= final, Boolean.valueOf((-13006 & 128) != 0)).Method_3437(\u0000, `, Boolean.valueOf((20768 & -22328) != 0)).Method_3437(Field_21276, (Comparable)((Object)Class_5393.Field_5398)));
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public int Method_21284(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_21276))).Method_5419();
    }

    protected Class_3855 Method_21285() {
        Class_3538[] arrclass_3538 = new Class_3538[277 & -32697];
        arrclass_3538[-30072 & 17504] = \u0000;
        arrclass_3538[4109 & -22383] = \u0000strictfp;
        arrclass_3538[9218 & 539] = \u0000, `;
        arrclass_3538[-20413 & 1051] = \u0000= final;
        arrclass_3538[28998 & 4] = Field_21276;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_3779 Method_21286(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_21276))).Method_5426();
    }

    private void Method_21287() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

