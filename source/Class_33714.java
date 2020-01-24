/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33714
extends Class_27380 {
    private final Class_43553 Field_33715 = new Class_43553();
    private static final Class_2080 Field_33716 = new Class_2080(Class_33714.Method_33722("\u200a\u200a\u2000\u2008\u200e\u200c\u200c\u200e\u2008\u2002\u200a\u2000\u200e\u2006\u200c\u200e\u2008\u2002\u2008\u2000\u200e\u200c\u2006\u200e\u200a\u2002\u2008\u2000\u2004\u202c\u200c\u200e\u2028\u202a\u2020\u2022\u202e\u202c\u202c\u202e\u202a\u2022\u202a\u2020\u202c\u2024"));
    private static final Class_2080 Field_33717 = new Class_2080(Class_33714.Method_33720("\u142f\u142f\u1421\u142c\u142e\u1428\u142c\u142b\u1464\u142f\u1427\u142c\u1422\u142e\u1420\u1467\u142c\u1423\u142d\u1420\u142e\u1428\u1466\u142f\u1422\u142e\u1421\u142d\u1429\u1464\u1429\u1426\u142c"));

    private float Method_33718(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -304.6154f * 0.59090906f; f4 += 0.7631579f * 471.72412f) {
        }
        while (f4 >= 119.36842f * 1.5079365f) {
            f4 -= 0.13333334f * 2699.9998f;
        }
        return f + f3 * f4;
    }

    protected Class_2080 Method_33719(Class_1061 class_1061) {
        return this.Method_33724((Class_47728)class_1061);
    }

    public Class_33714(Class_8491 class_8491) {
        super(class_8491);
    }

    private static String Method_33720(String string) {
        int n = 22882;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33714.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33721(Class_47728 class_47728, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        Class_16867.Method_16969();
        float f3 = this.Method_33718(class_47728.\u0000switch, class_47728.\u0000= ?, f2);
        float f4 = class_47728.\u0000, 2 + (class_47728.\u0000= float - class_47728.\u0000, 2) * f2;
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
        float f5 = 0.21354167f * 0.29268292f;
        Class_16867.Method_16957();
        Class_16867.Method_16973(1.7272727f * -0.57894737f, 1.0f * -1.0f, 1.0f);
        Class_16867.Method_16913();
        this.\u0000, `((Class_1061)class_47728);
        this.Field_33715.Method_43557(class_47728, 0.0f, 0.0f, 0.0f, f3, f4, f5);
        Class_16867.Method_16945();
        super.Method_27403(class_47728, d, d2, d3, f, f2);
    }

    private static String Method_33722(String string) {
        int n = 6373;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33714.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_33723() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_33724(Class_47728 class_47728) {
        return class_47728.Method_47732() ? Field_33716 : Field_33717;
    }

    public void Method_33725(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_33721((Class_47728)class_1061, d, d2, d3, f, f2);
    }
}

