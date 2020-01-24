/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_4544
extends Class_4555 {
    public static final Class_3957 Field_4545 = Class_3957.Method_3962(Class_4544.Method_4554("\u1800\u1804\u1804\u180c\u1804\u1808\u1800"), Class_4231.class, new Class_4700());

    public Class_4544() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4545, (Comparable)((Object)Class_4231.Field_4238)).Method_3437(\u0000strictfp, (Comparable)((Object)Class_4679.Field_4684)));
    }

    public int Method_4546(Class_3436 class_3436) {
        int n = -32696 & 16386;
        n |= ((Class_4231)((Object)class_3436.Method_3440(Field_4545))).Method_4247();
        switch (Class_15743.Field_15744[((Class_4679)((Object)class_3436.Method_3440(\u0000strictfp))).ordinal()]) {
            case 1: {
                n |= 16388 & 7622;
                break;
            }
            case 2: {
                n |= -18374 & 264;
                break;
            }
            case 3: {
                n |= 12 & 22605;
            }
        }
        return n;
    }

    public Class_3779 Method_4547(Class_3436 class_3436) {
        Class_4231 class_4231 = (Class_4231)((Object)class_3436.Method_3440(Field_4545));
        switch (Class_15743.Field_15744[((Class_4679)((Object)class_3436.Method_3440(\u0000strictfp))).ordinal()]) {
            default: {
                switch (Class_15743.Field_15745[class_4231.ordinal()]) {
                    default: {
                        return Class_4231.Field_4236.Method_4265();
                    }
                    case 2: {
                        return Class_4231.Field_4233.Method_4265();
                    }
                    case 3: {
                        return Class_3779.Field_3796;
                    }
                    case 4: 
                }
                return Class_4231.Field_4236.Method_4265();
            }
            case 4: 
        }
        return class_4231.Method_4265();
    }

    protected Class_23823 Method_4548(Class_3436 class_3436) {
        return new Class_23823(Class_1956.Method_1981(this), 163 & 265, ((Class_4231)((Object)class_3436.Method_3440(Field_4545))).Method_4247());
    }

    public void Method_4549(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 4681 & -31743, Class_4231.Field_4238.Method_4247()));
        list.add(new Class_23823(class_1956, 3091 & 25353, Class_4231.Field_4236.Method_4247()));
        list.add(new Class_23823(class_1956, 17569 & 4613, Class_4231.Field_4242.Method_4247()));
        list.add(new Class_23823(class_1956, -30583 & 9249, Class_4231.Field_4235.Method_4247()));
    }

    public int Method_4550(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_4545))).Method_4247();
    }

    protected Class_3855 Method_4551() {
        Class_3538[] arrclass_3538 = new Class_3538[5438 & 2178];
        arrclass_3538[4132 & 3072] = Field_4545;
        arrclass_3538[-32763 & 24747] = \u0000strictfp;
        return new Class_3855(this, arrclass_3538);
    }

    private void Method_4552() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_4553(int n) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_4545, (Comparable)((Object)Class_4231.Method_4259((n & (10307 & -10741)) % (9319 & -16380))));
        switch (n & (525 & 2062)) {
            case 0: {
                class_3436 = class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)Class_4679.Field_4684));
                break;
            }
            case 4: {
                class_3436 = class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)Class_4679.Field_4682));
                break;
            }
            case 8: {
                class_3436 = class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)Class_4679.Field_4681));
                break;
            }
            default: {
                class_3436 = class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)Class_4679.Field_4683));
            }
        }
        return class_3436;
    }

    private static String Method_4554(String string) {
        int n = 9976;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4544.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

