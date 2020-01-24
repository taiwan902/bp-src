/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27146
implements Class_1486 {
    public static final String[] Field_27147;
    private int Field_27148;
    private float Field_27149;

    public void Method_27150(Class_10954 class_10954) {
        this.Method_27157((Class_14856)class_10954);
    }

    public Class_27146() {
    }

    public void Method_27151(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_27148);
        class_29900.Method_29939(this.Field_27149);
    }

    public float Method_27152() {
        return this.Field_27149;
    }

    public Class_27146(int n, float f) {
        this.Field_27148 = n;
        this.Field_27149 = f;
    }

    private void Method_27153() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_27154(String string) {
        int n = 4821;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27146.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_27155(Class_29900 class_29900) {
        this.Field_27148 = class_29900.Method_30016();
        this.Field_27149 = class_29900.Method_29966();
    }

    public int Method_27156() {
        return this.Field_27148;
    }

    public void Method_27157(Class_14856 class_14856) {
        class_14856.Method_14922(this);
    }

    static {
        String[] arrstring = new String[16961 & 4519];
        arrstring[20488 & 2224] = Class_27146.Method_27154("\u8428\u8425\u8422\u842b\u8422\u842e\u842b\u842a\u8422\u8422\u8421\u842a\u840a\u842d\u8422\u8427\u8428");
        Field_27147 = arrstring;
    }
}

