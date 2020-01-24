/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_22784
extends Class_3238 {
    public static final Class_4173 Field_22785;
    public static final Class_5011 Field_22786;

    public int Method_22787(Class_3436 class_3436) {
        int n = 192 & 18950;
        n |= ((Class_4595)((Object)class_3436.Method_3440(Field_22786))).Method_4619();
        if (((Boolean)class_3436.Method_3440(Field_22785)).booleanValue()) {
            n |= 516 & -23420;
        }
        return n;
    }

    public boolean Method_22788() {
        return (26690 & 12) != 0;
    }

    public Class_3436 Method_22789(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(Field_22786, (Comparable)((Object)class_859.\u0000, `().Method_4660())).Method_3437(Field_22785, Boolean.valueOf((2178 & 21545) != 0));
    }

    public boolean Method_22790() {
        return (-32751 & 205) != 0;
    }

    private void Method_22791() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22792() {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.5298913f * 1.5333333f, 1.0f);
    }

    private static String Method_22793(String string) {
        int n = 32662;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22784.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_22794(Class_283 class_283, Class_4751 class_4751) {
        return (Boolean)class_283.Method_375(class_4751).Method_3440(Field_22785) != false ? 9231 & 591 : 16552 & 4372;
    }

    private static String Method_22795(String string) {
        int n = 14602;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22784.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_22796() {
        Class_3538[] arrclass_3538 = new Class_3538[2119 & 42];
        arrclass_3538[-22484 & 145] = Field_22786;
        arrclass_3538[43 & 17473] = Field_22785;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_22784() {
        super(Class_3713.Field_3721, Class_3779.Field_3794);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_22786, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_22785, Boolean.valueOf((8254 & 128) != 0)));
    }

    public Class_3436 Method_22797(int n) {
        return this.\u0000strictfp().Method_3685(Field_22785, Boolean.valueOf(((n & (-12148 & 2119)) != 0 ? -23539 & 2561 : 54 & -22520) != 0)).Method_3437(Field_22786, (Comparable)((Object)Class_4595.Method_4628(n & (-15849 & 8195))));
    }

    static {
        Field_22786 = Class_5011.Method_5012(Class_22784.Method_22795("\u1060\u1063\u1062\u1061\u1060\u1061"), Class_4662.Field_4663);
        Field_22785 = Class_4173.Method_4177(Class_22784.Method_22793("\ud340\ud354\ud342"));
    }

    public void Method_22798(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_10997 class_10997, List list, Class_1061 class_1061) {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.82560486f * 0.984127f, 1.0f);
        super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        if (((Boolean)class_283.Method_375(class_4751).Method_3440(Field_22785)).booleanValue()) {
            this.\u0000strictfp(0.15555556f * 2.0089285f, 0.18530701f * 4.3846154f, 0.18181819f * 1.71875f, 4.6160717f * 0.14893617f, 1.0f, 0.012276785f * 56.0f);
            super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        }
        this.Method_22792();
    }

    public Class_1956 Method_22799(Class_3436 class_3436, Random random, int n) {
        return null;
    }
}

