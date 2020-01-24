/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Formatter;

public final class Class_22304 {
    private static final String[] Field_22305;
    private static final String[] Field_22306;
    static final boolean Field_22307;
    public static final String Field_22308;

    static {
        int n;
        String string;
        StringBuilder stringBuilder;
        Field_22307 = !Class_22304.class.desiredAssertionStatus() ? 2377 & 1061 : 18016 & -22272;
        Field_22306 = new String[12712 & -30394];
        Field_22305 = new String[4386 & 11016];
        try {
            string = new Formatter().format(Class_22304.Method_22313("\u0302\u0348"), new Object[10242 & 337]).toString();
        }
        catch (Exception exception) {
            string = Class_22304.Method_22311("\u2000");
        }
        Field_22308 = string;
        for (n = 2312 & 4642; n < (8219 & 10); ++n) {
            stringBuilder = new StringBuilder(2586 & 16738);
            stringBuilder.append((char)(1716 & 50));
            stringBuilder.append(n);
            Class_22304.Field_22306[n] = stringBuilder.toString();
            Class_22304.Field_22305[n] = String.valueOf(n);
        }
        while (n < (917 & -16368)) {
            stringBuilder = new StringBuilder(-31346 & 66);
            char c = (char)((8299 & 4977) + n - (74 & 18202));
            stringBuilder.append((char)(1720 & 6452));
            stringBuilder.append(c);
            Class_22304.Field_22306[n] = stringBuilder.toString();
            Class_22304.Field_22305[n] = String.valueOf(c);
            ++n;
        }
        while (n < Field_22306.length) {
            String string2;
            stringBuilder = new StringBuilder(-18678 & 2);
            stringBuilder.append(Integer.toHexString(n));
            Class_22304.Field_22306[n] = string2 = stringBuilder.toString();
            Class_22304.Field_22305[n] = string2;
            ++n;
        }
    }

    public static String Method_22309(Class class_) {
        if (class_ == null) {
            return "null_class";
        }
        Package package_ = class_.getPackage();
        if (package_ != null) {
            return class_.getName().substring(package_.getName().length() + (19075 & 17));
        }
        return class_.getName();
    }

    private void Method_22310() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_22311(String string) {
        int n = 26419;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22304.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_22304() {
    }

    public static String Method_22312(Object object) {
        if (object == null) {
            return "null_object";
        }
        return Class_22304.Method_22309(object.getClass());
    }

    private static String Method_22313(String string) {
        int n = 8413;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22304.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

