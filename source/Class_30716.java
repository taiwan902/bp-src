/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30716
extends Class_1906 {
    private Class_4961 Field_30717;
    private final Class_37781 Field_30718;
    private static final Class_2080 Field_30719 = new Class_2080(Class_30716.Method_30723("\u8800\u8800\u8806\u8803\u8805\u8803\u8807\u8800\u8843\u8802\u8803\u8806\u8847\u8802\u8805\u8805\u8810\u8814\u8817\u8811\u8815\u8813\u8855\u8811\u8816\u8810\u8811\u8816\u8816\u8816\u8835\u8810\u8800\u8804\u8800\u8803\u8846\u8801\u8804\u8804"));

    private void Method_30720() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_30721(int n, int n2) {
        String string = this.Field_30717.\u0000strictfp().Method_1788();
        this.\u0000strictfp.Method_28692(string, this.\u0000, for / (21514 & -24573) - this.\u0000strictfp.Method_28715(string) / (8194 & 22666), 8198 & -14826, 172508256 & -1799307198);
        this.\u0000strictfp.Method_28692(this.Field_30718.Method_37811().Method_1788(), 748 & -28662, this.\u0000= int - (104 & 16609) + (10274 & 331), 544063552 & 1523602123);
    }

    protected void Method_30722(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_30719);
        int n3 = (this.\u0000= final - this.\u0000, for) / (-7634 & 4162);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (-30718 & 8234);
        this.\u0000strictfp(n3, n4, 0 & 22033, -24365 & 2052, this.\u0000, for, this.\u0000= int);
        int n5 = this.Field_30717.Method_4973(2821 & -16366);
        if (n5 > 0) {
            int n6 = (int)(1.3529412f * 20.695652f * (1.0f - (float)n5 / (1.046875f * 382.08954f)));
            if (n6 > 0) {
                this.\u0000strictfp(n3 + (105 & -19359), n4 + (2072 & 5395), 12472 & 16883, 11016 & 16576, 6153 & -32691, n6);
            }
            int n7 = n5 / (34 & -20157) % (55 & 12367);
            switch (n7) {
                case 0: {
                    n6 = 669 & 6173;
                    break;
                }
                case 1: {
                    n6 = 540 & 22841;
                    break;
                }
                case 2: {
                    n6 = 156 & 25652;
                    break;
                }
                case 3: {
                    n6 = 2320 & 29842;
                    break;
                }
                case 4: {
                    n6 = 31 & -30965;
                    break;
                }
                case 5: {
                    n6 = -31729 & 4262;
                    break;
                }
                case 6: {
                    n6 = 1024 & -24382;
                }
            }
            if (n6 > 0) {
                this.\u0000strictfp(n3 + (2161 & 4425), n4 + (10286 & 16591) + (23197 & 29) - n6, 253 & -9287, (159 & -25571) - n6, -14212 & 8333, n6);
            }
        }
    }

    private static String Method_30723(String string) {
        int n = 23737;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30716.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_30716(Class_37781 class_37781, Class_4961 class_4961) {
        super(new Class_18889(class_37781, class_4961));
        this.Field_30718 = class_37781;
        this.Field_30717 = class_4961;
    }
}

