/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_26831
extends Class_17048 {
    private final Class_19102 Field_26832;
    public static final Class_4173 Field_26833 = Class_4173.Method_4177(Class_26831.Method_26839("\u8041\u8041\u8040\u8041\u8041\u8041\u8041"));

    public int Method_26834(Class_3436 class_3436) {
        return (Boolean)class_3436.Method_3440(Field_26833) != false ? 4145 & -31483 : 16385 & 10272;
    }

    protected Class_26831(Class_3713 class_3713, Class_19102 class_19102) {
        super(class_3713);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_26833, Boolean.valueOf((10020 & -14248) != 0)));
        this.Field_26832 = class_19102;
    }

    public Class_3436 Method_26835(int n) {
        return this.\u0000strictfp().Method_3685(Field_26833, Boolean.valueOf((n == (-32719 & 4615) ? -29143 & 12417 : 320 & -4953) != 0));
    }

    private void Method_26836() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int Method_26837(Class_3436 class_3436) {
        return (Boolean)class_3436.Method_3440(Field_26833) != false ? 15 & 1551 : 4608 & 9609;
    }

    protected int Method_26838(Class_283 class_283, Class_4751 class_4751) {
        List list;
        Class_10997 class_10997 = this.\u0000strictfp(class_4751);
        switch (Class_30914.Field_30915[this.Field_26832.ordinal()]) {
            case 1: {
                list = class_283.Method_473(null, class_10997);
                break;
            }
            case 2: {
                list = class_283.Method_488(Class_859.class, class_10997);
                break;
            }
            default: {
                return 16900 & 256;
            }
        }
        if (!list.isEmpty()) {
            for (Class_1061 class_1061 : list) {
                if (class_1061.Method_1363()) continue;
                return 8271 & 2351;
            }
        }
        return 341 & 10272;
    }

    private static String Method_26839(String string) {
        int n = 3139;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26831.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_26840() {
        Class_3538[] arrclass_3538 = new Class_3538[8273 & 143];
        arrclass_3538[9362 & 19296] = Field_26833;
        return new Class_3855(this, arrclass_3538);
    }

    protected Class_3436 Method_26841(Class_3436 class_3436, int n) {
        return class_3436.Method_3437(Field_26833, Boolean.valueOf((n > 0 ? 15369 & 65 : -7680 & 8) != 0));
    }
}

