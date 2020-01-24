/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_18154
extends Class_17793 {
    protected long Field_18155;
    protected float Field_18156;

    public Class_18154(Class_30157 class_30157) {
        super(class_30157.Method_30173(), class_30157.Method_30179(), class_30157.Method_30169(), class_30157.Method_30175());
        this.Field_18156 = class_30157.Method_30177();
        this.\u0000strictfp = class_30157.Method_30177();
        this.Field_18155 = Class_18154.Method_18160();
        this.\u0000= final(class_30157.Method_30168());
        this.\u0000strictfp(class_30157.Method_30170());
        this.\u0000, `(class_30157.Method_30171());
    }

    private void Method_18157() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_18154.Method_18162("\u2340\u2340\u2352\u2342\u2344\u2344\u2356\u2346\u2340\u2340\u2352\u2342\u2344\u2344"));
    }

    public void Method_18158(Class_30157 class_30157) {
        switch (Class_7588.Field_7589[class_30157.Method_30167().ordinal()]) {
            case 1: {
                this.\u0000strictfp(class_30157.Method_30179());
                break;
            }
            case 2: {
                this.Method_18159(class_30157.Method_30177());
                break;
            }
            case 3: {
                this.\u0000strictfp(class_30157.Method_30169());
                this.\u0000strictfp(class_30157.Method_30175());
                break;
            }
            case 4: {
                this.\u0000= final(class_30157.Method_30168());
                this.\u0000strictfp(class_30157.Method_30170());
            }
        }
    }

    public void Method_18159(float f) {
        this.\u0000strictfp = this.Method_18161();
        this.Field_18156 = f;
        this.Field_18155 = Class_18154.Method_18160();
    }

    public static long Method_18160() {
        return System.nanoTime() / (354370116L & -2116634385037925821L);
    }

    public float Method_18161() {
        long l = Class_18154.Method_18160() - this.Field_18155;
        float f = Class_13337.Method_13360((float)l / (2.5f * 40.0f), 0.0f, 1.0f);
        return this.\u0000strictfp + (this.Field_18156 - this.\u0000strictfp) * f;
    }

    private static String Method_18162(String string) {
        int n = 30708;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18154.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

