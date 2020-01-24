/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_21186
extends Class_3238 {
    public static final Class_3957 Field_21187 = Class_3957.Method_3963(Class_21186.Method_21194("\u4840\u4840\u4840\u4840"), Class_32154.class);

    public int Method_21188(Class_3436 class_3436) {
        return ((Class_32154)((Object)class_3436.Method_3440(Field_21187))).Method_32178();
    }

    public Class_3436 Method_21189(int n) {
        return this.\u0000strictfp().Method_3685(Field_21187, (Comparable)((Object)Class_32154.Method_32177(n)));
    }

    protected Class_3855 Method_21190() {
        Class_3538[] arrclass_3538 = new Class_3538[17445 & 4865];
        arrclass_3538[-28095 & 16696] = Field_21187;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_21191(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_32154[] arrclass_32154 = Class_32154.Method_32165();
        int n = arrclass_32154.length;
        for (int i = 1057 & -13806; i < n; ++i) {
            Class_32154 class_32154 = arrclass_32154[i];
            list.add(new Class_23823(class_1956, 9345 & -16375, class_32154.Method_32178()));
        }
    }

    public int Method_21192(Class_3436 class_3436) {
        return ((Class_32154)((Object)class_3436.Method_3440(Field_21187))).Method_32178();
    }

    private void Method_21193() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21186() {
        super(Class_3713.Field_3721, Class_4508.Field_4512.Method_4523());
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_21187, (Comparable)((Object)Class_32154.Field_32156)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    private static String Method_21194(String string) {
        int n = 606;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21186.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

