/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_10020
extends Class_4555 {
    public static final Class_3957 Field_10021 = Class_3957.Method_3962(Class_10020.Method_10030("\u0250\u0241\u0250\u0241\u0244\u0245\u0254"), Class_4231.class, new Class_16694());

    public int Method_10022(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_10021))).Method_4247() - (24620 & 389);
    }

    public Class_3436 Method_10023(int n) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_10021, (Comparable)((Object)Class_4231.Method_4259((n & (-30717 & 16431)) + (16388 & -29620))));
        switch (n & (-19700 & 19471)) {
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

    private void Method_10024() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_23823 Method_10025(Class_3436 class_3436) {
        return new Class_23823(Class_1956.Method_1981(this), -32123 & 2115, ((Class_4231)((Object)class_3436.Method_3440(Field_10021))).Method_4247() - (3142 & 60));
    }

    public Class_3779 Method_10026(Class_3436 class_3436) {
        Class_4231 class_4231 = (Class_4231)((Object)class_3436.Method_3440(Field_10021));
        switch (Class_21798.Field_21800[((Class_4679)((Object)class_3436.Method_3440(\u0000strictfp))).ordinal()]) {
            default: {
                switch (Class_21798.Field_21799[class_4231.ordinal()]) {
                    default: {
                        return Class_3779.Field_3785;
                    }
                    case 2: 
                }
                return Class_4231.Field_4233.Method_4265();
            }
            case 4: 
        }
        return class_4231.Method_4265();
    }

    protected Class_3855 Method_10027() {
        Class_3538[] arrclass_3538 = new Class_3538[-30678 & 4626];
        arrclass_3538[1110 & 8224] = Field_10021;
        arrclass_3538[705 & -32505] = \u0000strictfp;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_10020() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_10021, (Comparable)((Object)Class_4231.Field_4243)).Method_3437(\u0000strictfp, (Comparable)((Object)Class_4679.Field_4684)));
    }

    public int Method_10028(Class_3436 class_3436) {
        int n = -28409 & 16928;
        n |= ((Class_4231)((Object)class_3436.Method_3440(Field_10021))).Method_4247() - (813 & -30716);
        switch (Class_21798.Field_21800[((Class_4679)((Object)class_3436.Method_3440(\u0000strictfp))).ordinal()]) {
            case 1: {
                n |= 16916 & 6149;
                break;
            }
            case 2: {
                n |= 4364 & 1608;
                break;
            }
            case 3: {
                n |= 14 & 8812;
            }
        }
        return n;
    }

    public void Method_10029(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, -24063 & 18695, Class_4231.Field_4243.Method_4247() - (-31724 & 4300)));
        list.add(new Class_23823(class_1956, -32639 & 12355, Class_4231.Field_4233.Method_4247() - (-25323 & 6)));
    }

    private static String Method_10030(String string) {
        int n = 17986;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10020.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

