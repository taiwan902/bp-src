/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_18300
implements Comparable {
    private final String Field_18301;
    public static final Class_18300 Field_18302;
    private final boolean Field_18303;
    private static final Pattern Field_18304;
    public static final Class_18300 Field_18305;
    private final byte[] Field_18306;
    private final int Field_18307;
    private final int Field_18308;
    private final String Field_18309;

    private static String Method_18310(String string) {
        int n = 18029;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18300.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_18304 = Pattern.compile(Class_18300.Method_18311("R\" PVTV&\u0012PR\"TV&\u0016@B"));
        Field_18302 = new Class_18300(Class_18300.Method_18314("\u5450\u5444\u5444\u5440"), 8259 & -30463, 22664 & 0, (22531 & 8744) != 0, (1075 & 18433) != 0);
        Field_18305 = new Class_18300(Class_18300.Method_18310("\ue128\ue134\ue134\ue130"), 2817 & 113, 12437 & -30207, (257 & 1121) != 0, (25379 & -32767) != 0);
    }

    public Class_18300(String string, boolean bl) {
        if (string == null) {
            throw new NullPointerException("text");
        }
        if ((string = string.trim().toUpperCase()).isEmpty()) {
            throw new IllegalArgumentException("empty text");
        }
        Matcher matcher = Field_18304.matcher(string);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("invalid version format: " + string);
        }
        this.Field_18309 = matcher.group(17 & 20547);
        this.Field_18307 = Integer.parseInt(matcher.group(9891 & 70));
        this.Field_18308 = Integer.parseInt(matcher.group(-31741 & 8323));
        this.Field_18301 = this.Field_18309 + (char)(-32593 & 12847) + this.Field_18307 + (char)(686 & 19518) + this.Field_18308;
        this.Field_18303 = bl;
        this.Field_18306 = null;
    }

    private static String Method_18311(String string) {
        int n = 14773;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18300.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_18312() {
        return this.Field_18301;
    }

    public boolean Method_18313(Object object) {
        if (!(object instanceof Class_18300)) {
            return (-30720 & 5141) != 0;
        }
        Class_18300 class_18300 = (Class_18300)object;
        return (this.Method_18318() == class_18300.Method_18318() && this.Method_18317() == class_18300.Method_18317() && this.Method_18316().equals(class_18300.Method_18316()) ? 9697 & 2053 : 8192 & 4879) != 0;
    }

    private static String Method_18314(String string) {
        int n = 24903;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18300.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_18315(Class_18300 class_18300) {
        int n = this.Method_18316().compareTo(class_18300.Method_18316());
        if (n != 0) {
            return n;
        }
        n = this.Method_18317() - class_18300.Method_18317();
        if (n != 0) {
            return n;
        }
        return this.Method_18318() - class_18300.Method_18318();
    }

    public String Method_18316() {
        return this.Field_18309;
    }

    public int Method_18317() {
        return this.Field_18307;
    }

    public int Method_18318() {
        return this.Field_18308;
    }

    public String Method_18319() {
        return this.Method_18312();
    }

    private void Method_18320() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Class_18300 Method_18321(String string) {
        if ("HTTP/1.1".equals(string)) {
            return Field_18305;
        }
        if ("HTTP/1.0".equals(string)) {
            return Field_18302;
        }
        return null;
    }

    public int Method_18322(Object object) {
        return this.Method_18315((Class_18300)object);
    }

    public int Method_18323() {
        return (this.Method_18316().hashCode() * (10591 & 5791) + this.Method_18317()) * (16479 & 8607) + this.Method_18318();
    }

    private Class_18300(String string, int n, int n2, boolean bl, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("protocolName");
        }
        if ((string = string.trim().toUpperCase()).isEmpty()) {
            throw new IllegalArgumentException("empty protocolName");
        }
        for (int i = 130 & 16977; i < string.length(); ++i) {
            if (!Character.isISOControl(string.charAt(i)) && !Character.isWhitespace(string.charAt(i))) continue;
            throw new IllegalArgumentException("invalid character in protocolName");
        }
        if (n < 0) {
            throw new IllegalArgumentException("negative majorVersion");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("negative minorVersion");
        }
        this.Field_18309 = string;
        this.Field_18307 = n;
        this.Field_18308 = n2;
        this.Field_18301 = string + (char)(-23489 & 16943) + n + (char)(17454 & -30034) + n2;
        this.Field_18303 = bl;
        this.Field_18306 = bl2 ? this.Field_18301.getBytes(Class_7203.Field_7204) : null;
    }

    public static Class_18300 Method_18324(String string) {
        if (string == null) {
            throw new NullPointerException("text");
        }
        if ((string = string.trim()).isEmpty()) {
            throw new IllegalArgumentException("text is empty");
        }
        Class_18300 class_18300 = Class_18300.Method_18321(string);
        if (class_18300 == null && (class_18300 = Class_18300.Method_18321(string = string.toUpperCase())) == null) {
            class_18300 = new Class_18300(string, (2065 & -31353) != 0);
        }
        return class_18300;
    }

    public boolean Method_18325() {
        return this.Field_18303;
    }

    void Method_18326(Class_22553 class_22553) {
        if (this.Field_18306 == null) {
            Class_17103.Method_17124(this.Field_18301, class_22553);
        } else {
            class_22553.Method_22610(this.Field_18306);
        }
    }
}

