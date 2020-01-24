/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public final class Class_24415
extends SocketAddress
implements Comparable {
    private final String Field_24416;
    private final String Field_24417;
    public static final Class_24415 Field_24418 = new Class_24415(Class_24415.Method_24423("\u1218\u1215\u1200"));

    Class_24415(Class_26095 class_26095) {
        StringBuilder stringBuilder = new StringBuilder(19484 & 4112);
        stringBuilder.append("local:E");
        stringBuilder.append(Long.toHexString((long)class_26095.hashCode() & (0xFFFFFFFFL & 0xFFFFFFFFL) | 8724773488763944980L & 5909907531L));
        stringBuilder.setCharAt(16407 & -18905, (char)(-32518 & 6458));
        this.Field_24416 = stringBuilder.substring(3182 & -20218);
        this.Field_24417 = stringBuilder.toString();
    }

    public int Method_24419(Object object) {
        return this.Method_24425((Class_24415)object);
    }

    private void Method_24420() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_24421() {
        return this.Field_24417;
    }

    public int Method_24422() {
        return this.Field_24416.hashCode();
    }

    private static String Method_24423(String string) {
        int n = 11523;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24415.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_24424(Object object) {
        if (!(object instanceof Class_24415)) {
            return (285 & 29888) != 0;
        }
        return this.Field_24416.equals(((Class_24415)object).Field_24416);
    }

    public int Method_24425(Class_24415 class_24415) {
        return this.Field_24416.compareTo(class_24415.Field_24416);
    }

    public Class_24415(String string) {
        if (string == null) {
            throw new NullPointerException("id");
        }
        if ((string = string.trim().toLowerCase()).isEmpty()) {
            throw new IllegalArgumentException("empty id");
        }
        this.Field_24416 = string;
        this.Field_24417 = "local:" + string;
    }
}

