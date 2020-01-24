/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45965
extends Class_41379 {
    private static final Class_2080 Field_45966 = new Class_2080(Class_45965.Method_45969("\u1201\u1200\u120f\u1203\u1200\u1205\u1202\u1206\u1248\u1200\u120b\u1203\u120c\u1201\u120e\u124a\u1214\u1215\u121e\u1213\u1210\u1215\u125a\u1216\u1214\u1211\u1212\u123a\u1214\u1215\u121e\u1213\u1200\u1205\u124b\u1207\u1209\u1200"));

    protected void Method_45967(Class_45324 class_45324, float f) {
        Class_16867.Method_16973(1.2901961f * 0.5425532f, 0.33766234f * 2.073077f, 1.5641025f * 0.447541f);
    }

    protected Class_2080 Method_45968(Class_44290 class_44290) {
        return this.Method_45971((Class_45324)class_44290);
    }

    private static String Method_45969(String string) {
        int n = 9347;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_45965.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_45970(Class_859 class_859, float f) {
        this.Method_45967((Class_45324)class_859, f);
    }

    protected Class_2080 Method_45971(Class_45324 class_45324) {
        return Field_45966;
    }

    private void Method_45972() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_45965(Class_8491 class_8491) {
        super(class_8491);
        this.\u0000, ` *= 0.44871795f * 1.56f;
    }

    protected Class_2080 Method_45973(Class_1061 class_1061) {
        return this.Method_45971((Class_45324)class_1061);
    }
}

