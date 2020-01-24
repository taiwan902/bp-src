/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_4465
extends Class_4475 {
    public static final Class_3957 Field_4466 = Class_3957.Method_3963(Class_4465.Method_4470("\u0100\u0111\u0102\u0113\u0110\u0111\u0102"), Class_4508.class);

    public Class_3436 Method_4467(int n) {
        return this.\u0000strictfp().Method_3685(Field_4466, (Comparable)((Object)Class_4508.Method_4528(n)));
    }

    public int Method_4468(Class_3436 class_3436) {
        return ((Class_4508)((Object)class_3436.Method_3440(Field_4466))).Method_4525();
    }

    protected Class_3855 Method_4469() {
        Class_3538[] arrclass_3538 = new Class_3538[185 & 257];
        arrclass_3538[1058 & -17855] = Field_4466;
        return new Class_3855(this, arrclass_3538);
    }

    private static String Method_4470(String string) {
        int n = 21002;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4465.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4465() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4466, (Comparable)((Object)Class_4508.Field_4510)));
    }

    public int Method_4471(Class_3436 class_3436) {
        return ((Class_4508)((Object)class_3436.Method_3440(Field_4466))).Method_4525();
    }

    public Class_3779 Method_4472(Class_3436 class_3436) {
        return ((Class_4508)((Object)class_3436.Method_3440(Field_4466))).Method_4523();
    }

    private void Method_4473() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_4474(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_4508[] arrclass_4508 = Class_4508.Method_4530();
        int n = arrclass_4508.length;
        for (int i = 4178 & -30940; i < n; ++i) {
            Class_4508 class_4508 = arrclass_4508[i];
            list.add(new Class_23823(class_1956, -30719 & 17019, class_4508.Method_4525()));
        }
    }
}

