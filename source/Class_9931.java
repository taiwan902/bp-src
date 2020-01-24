/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_9931
implements Comparable {
    protected final float Field_9932;
    protected static final Object Field_9933 = Class_9931.Method_9950("\u0500\u0509\u0502\u0503\u0508");
    protected final int Field_9934;
    protected final int Field_9935;
    protected final float Field_9936;
    protected final float Field_9937;
    protected final int Field_9938;
    protected final String Field_9939;
    protected final float Field_9940;
    protected final float Field_9941;
    protected final Object Field_9942;
    protected final float Field_9943;

    public int Method_9944(Object object) {
        return this.Method_9951((Class_9931)object);
    }

    public String Method_9945() {
        Object[] arrobject = new Object[-32503 & 4105];
        arrobject[-30382 & 4609] = this.Field_9939;
        arrobject[-20343 & 1377] = this.Field_9938;
        arrobject[1474 & 22] = Float.valueOf(this.Field_9941);
        arrobject[1147 & 2055] = Float.valueOf(this.Field_9932);
        arrobject[-972 & 525] = Float.valueOf(this.Field_9937);
        arrobject[-30171 & 17559] = Float.valueOf(this.Field_9936);
        arrobject[8198 & -27929] = Float.valueOf(this.Field_9940);
        arrobject[-28409 & 25127] = Float.valueOf(this.Field_9943);
        arrobject[42 & 27916] = this.Field_9942;
        return String.format("%s:%d (%1.6f,%1.6f,%1.6f)-(%1.6f,%1.6f,%1.6f) : %s", arrobject);
    }

    private boolean Method_9946(Class_9931 class_9931) {
        return (this.Field_9938 == class_9931.Field_9938 && this.Field_9941 == class_9931.Field_9941 && this.Field_9932 == class_9931.Field_9932 && this.Field_9937 == class_9931.Field_9937 && this.Field_9936 == class_9931.Field_9936 && this.Field_9940 == class_9931.Field_9940 && this.Field_9943 == class_9931.Field_9943 && Class_9931.Method_9947(this.Field_9939, class_9931.Field_9939) && this.Field_9942.equals(class_9931.Field_9942) ? -32759 & 8721 : 17322 & -28668) != 0;
    }

    private static boolean Method_9947(String string, String string2) {
        return (string == string2 || string != null && string.equals(string2) ? 5377 & 599 : -27647 & 18432) != 0;
    }

    private void Method_9948() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_9949() {
        return this.Field_9934;
    }

    private static String Method_9950(String string) {
        int n = 2255;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_9931.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_9951(Class_9931 class_9931) {
        int n = this.Field_9939.compareTo(class_9931.Field_9939);
        return this.Field_9935 != class_9931.Field_9935 ? this.Field_9935 - class_9931.Field_9935 : (this.Field_9938 != class_9931.Field_9938 ? this.Field_9938 - class_9931.Field_9938 : (n != 0 ? n : this.Field_9942.toString().compareTo(class_9931.Field_9942.toString())));
    }

    protected Class_9931(int n, int n2, String string, float f, float f2, float f3, float f4, float f5, float f6, Object object) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        if (object == null) {
            object = Field_9933;
        }
        this.Field_9938 = n;
        this.Field_9935 = n2;
        this.Field_9939 = string;
        this.Field_9941 = f;
        this.Field_9932 = f2;
        this.Field_9937 = f3;
        this.Field_9936 = f4;
        this.Field_9940 = f5;
        this.Field_9943 = f6;
        this.Field_9942 = object;
        int n3 = n ^ string.hashCode();
        n3 ^= Float.floatToRawIntBits(f + 1.0f);
        n3 ^= Float.floatToRawIntBits(f2 + 2.0f);
        n3 ^= Float.floatToRawIntBits(f3 + 1.0625f * 2.8235295f);
        n3 ^= Float.floatToRawIntBits(f4 + 0.23076922f * 17.333334f);
        n3 ^= Float.floatToRawIntBits(f6 + 0.2857143f * 17.5f);
        n3 ^= Float.floatToRawIntBits(f5 + 1.0909091f * 5.5f);
        this.Field_9934 = n3 ^= object.hashCode();
    }

    public boolean Method_9952(Object object) {
        return (object != null && this == object || object instanceof Class_9931 && this.Method_9946((Class_9931)object) ? 10369 & 1897 : 896 & -28606) != 0;
    }
}

