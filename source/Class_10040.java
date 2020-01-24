/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;

public class Class_10040 {
    private final Class_34695 Field_10041;
    private static final Class_2080 Field_10042 = new Class_2080(Class_10040.Method_10049("\u0101\u0100\u0101\u0101\u0100\u0103\u0100\u0102\u0102\u0100\u0100\u0101\u0102\u0100\u0100\u0101\u0102\u0100\u0102\u0102\u0103\u0102\u0103\u0101\u0103\u0102"));
    private final Map Field_10043 = Maps.newHashMap();

    private void Method_10044() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_10040(Class_34695 class_34695) {
        this.Field_10041 = class_34695;
    }

    static Class_2080 Method_10045() {
        return Field_10042;
    }

    public void Method_10046(Class_33760 class_33760) {
        this.Method_10048(class_33760).Method_21683();
    }

    public void Method_10047(Class_33760 class_33760, boolean bl) {
        this.Method_10048(class_33760).Method_21681(bl);
    }

    private Class_21674 Method_10048(Class_33760 class_33760) {
        Class_21674 class_21674 = (Class_21674)this.Field_10043.get(class_33760.\u0000strictfp);
        if (class_21674 == null) {
            class_21674 = new Class_21674(this, class_33760, null);
            this.Field_10043.put(class_33760.\u0000strictfp, class_21674);
        }
        return class_21674;
    }

    private static String Method_10049(String string) {
        int n = 11532;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10040.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_34695 Method_10050(Class_10040 class_10040) {
        return class_10040.Field_10041;
    }

    public void Method_10051() {
        for (Class_21674 class_21674 : this.Field_10043.values()) {
            this.Field_10041.Method_34702(Class_21674.Method_21682(class_21674));
        }
        this.Field_10043.clear();
    }
}

