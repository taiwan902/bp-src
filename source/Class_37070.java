/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37070
extends Class_1906 {
    private static final Class_2080 Field_37071 = new Class_2080(Class_37070.Method_37081("\u9920\u9920\u9922\u9922\u9920\u9920\u9922\u9922\u9960\u9920\u9922\u9922\u9960\u9920\u9922\u9922\u9930\u9930\u9932\u9932\u9930\u9930\u9972\u9932\u9930\u9930\u9932\u9932\u9970\u9930\u9932\u9932"));
    private Class_4961 Field_37072;
    private Class_4961 Field_37073;
    private float Field_37074;
    private Class_46199 Field_37075;
    private float Field_37076;

    protected void Method_37077(int n, int n2) {
        this.\u0000strictfp.Method_28692(this.Field_37072.\u0000strictfp().Method_1788(), 12824 & -32724, 3655 & -16378, -1059729343 & 342508352);
        this.\u0000strictfp.Method_28692(this.Field_37073.\u0000strictfp().Method_1788(), 2344 & 16472, this.\u0000= int - (97 & 13044) + (2790 & 8195), 38299748 & 634799040);
    }

    private void Method_37078() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37079(int n, int n2, float f) {
        this.Field_37076 = n;
        this.Field_37074 = n2;
        super.Method_1948(n, n2, f);
    }

    public Class_37070(Class_4961 class_4961, Class_4961 class_49612, Class_46199 class_46199) {
        super(new Class_16645(class_4961, class_49612, class_46199, Class_18.Field_89.Field_48));
        this.Field_37073 = class_4961;
        this.Field_37072 = class_49612;
        this.Field_37075 = class_46199;
        this.\u0000strictfp = 12520 & 17152;
    }

    protected void Method_37080(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_37071);
        int n3 = (this.\u0000= final - this.\u0000, for) / (-23954 & 4226);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (5926 & -6134);
        this.\u0000strictfp(n3, n4, 8451 & 2052, 6152 & 24657, this.\u0000, for, this.\u0000= int);
        if (this.Field_37075.Method_46352()) {
            this.\u0000strictfp(n3 + (1103 & 4815), n4 + (24723 & 2129), 259 & -10160, this.\u0000= int, 25850 & -32421, 310 & 19518);
        }
        if (this.Field_37075.Method_46357()) {
            this.\u0000strictfp(n3 + (7 & 11343), n4 + (26723 & -28109), -15788 & 14729, this.\u0000= int + (28734 & 3254), 8218 & -29321, -21858 & 16402);
        }
        Class_1888.Method_1892(n3 + (4919 & -30661), n4 + (10556 & 126), -32743 & 113, (float)(n3 + (2359 & 187)) - this.Field_37076, (float)(n4 + (8571 & 4175) - (5106 & -31694)) - this.Field_37074, this.Field_37075);
    }

    private static String Method_37081(String string) {
        int n = 28471;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37070.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

