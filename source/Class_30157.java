/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_30157 {
    private boolean Field_30158;
    private float Field_30159;
    private Class_10268 Field_30160;
    private Class_1782 Field_30161;
    private boolean Field_30162;
    private boolean Field_30163;
    private Class_10099 Field_30164;
    private Class_12001 Field_30165;
    private UUID Field_30166;

    public Class_10268 Method_30167() {
        return this.Field_30160;
    }

    public boolean Method_30168() {
        return this.Field_30163;
    }

    public Class_12001 Method_30169() {
        return this.Field_30165;
    }

    public boolean Method_30170() {
        return this.Field_30162;
    }

    public boolean Method_30171() {
        return this.Field_30158;
    }

    private void Method_30172(int n) {
        this.Field_30163 = (n & (131 & 8745)) > 0 ? 16387 & 1101 : -32624 & 27178;
        this.Field_30162 = (n & (2962 & -11198)) > 0 ? 15203 & 1029 : 16728 & 8196;
        this.Field_30158 = (n & (1029 & -21708)) > 0 ? 10401 & -32429 : 4352 & 8280;
    }

    public UUID Method_30173() {
        return this.Field_30166;
    }

    private static String Method_30174(String string) {
        int n = 8465;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30157.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_10099 Method_30175() {
        return this.Field_30164;
    }

    public void Method_30176(Class_29900 class_29900) {
        this.Field_30166 = class_29900.Method_30011();
        this.Field_30160 = (Class_10268)class_29900.Method_30009(Class_10268.class);
        switch (Class_33129.Field_33130[this.Field_30160.ordinal()]) {
            case 1: {
                this.Field_30161 = class_29900.Method_30020();
                this.Field_30159 = class_29900.Method_29966();
                this.Field_30165 = (Class_12001)class_29900.Method_30009(Class_12001.class);
                this.Field_30164 = (Class_10099)class_29900.Method_30009(Class_10099.class);
                this.Method_30172(class_29900.Method_30016());
            }
            default: {
                break;
            }
            case 3: {
                this.Field_30159 = class_29900.Method_29966();
                break;
            }
            case 4: {
                this.Field_30161 = class_29900.Method_30020();
                break;
            }
            case 5: {
                this.Field_30165 = (Class_12001)class_29900.Method_30009(Class_12001.class);
                this.Field_30164 = (Class_10099)class_29900.Method_30009(Class_10099.class);
                break;
            }
            case 6: {
                this.Method_30172(class_29900.Method_30016());
            }
        }
    }

    public float Method_30177() {
        return this.Field_30159;
    }

    private void Method_30178() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_30157.Method_30174("\u4303\u4304\u4312\u4305\u4302\u4306\u4314\u4306\u4300\u4300\u4316\u4306\u4305\u4304"));
    }

    public Class_1782 Method_30179() {
        return this.Field_30161;
    }
}

