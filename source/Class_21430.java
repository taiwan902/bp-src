/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21430
implements Class_7380 {
    private final Class_45185 Field_21431;
    private static final Class_2080 Field_21432 = new Class_2080(Class_21430.Method_21435("\uca84\uca85\uca88\uca85\uca84\uca81\uca84\uca81\uca8c\uca85\uca8c\uca85\uca88\uca85\uca88\uca8d\uca90\uca99\uca94\uca9d\uca90\uca99\uca94\uca9d\uca90\uca91\uca94\uca95\uca9c\uca95\uca9c\uca91\ucaac\ucaa5"));
    private final Class_45963 Field_21433 = new Class_45963(1.2173913f * 0.4107143f);

    public Class_21430(Class_45185 class_45185) {
        this.Field_21431 = class_45185;
    }

    public void Method_21434(Class_47600 class_47600, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (class_47600.Method_47609()) {
            this.Field_21431.\u0000strictfp(Field_21432);
            this.Field_21433.\u0000strictfp(this.Field_21431.\u0000strictfp());
            this.Field_21433.\u0000strictfp((Class_1061)class_47600, f, f2, f4, f5, f6, f7);
        }
    }

    private static String Method_21435(String string) {
        int n = 27861;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21430.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_21436(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_21434((Class_47600)class_859, f, f2, f3, f4, f5, f6, f7);
    }

    public boolean Method_21437() {
        return (-30707 & 5632) != 0;
    }

    private void Method_21438() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

