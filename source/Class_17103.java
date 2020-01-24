/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Class_17103
implements Iterable {
    public static final Class_17103 Field_17104;
    private static final CharSequence Field_17105;
    private static final CharSequence Field_17106;
    private static final CharSequence Field_17107;
    private static final CharSequence Field_17108;
    private static final CharSequence Field_17109;
    private static final CharSequence Field_17110;
    private static final CharSequence Field_17111;
    private static final CharSequence Field_17112;
    private static final CharSequence Field_17113;
    private static final byte[] Field_17114;
    private static final CharSequence Field_17115;
    private static final byte[] Field_17116;
    private static final CharSequence Field_17117;
    private static final CharSequence Field_17118;
    private static final CharSequence Field_17119;
    private static final CharSequence Field_17120;

    public abstract String Method_17121(String var1);

    public static boolean Method_17122(Class_32692 class_32692) {
        return class_32692.Method_32694().Method_17157(Field_17113, Field_17118, (-31727 & 10281) != 0);
    }

    static void Method_17123(Class_17103 class_17103, Class_22553 class_22553) {
        if (class_17103 instanceof Class_45721) {
            ((Class_45721)class_17103).Method_45726(class_22553);
        } else {
            for (Map.Entry entry : class_17103) {
                Class_17103.Method_17143((CharSequence)entry.getKey(), (CharSequence)entry.getValue(), class_22553);
            }
        }
    }

    static {
        byte[] arrby = new byte[2 & -14169];
        arrby[-26624 & 154] = -28614 & 2042;
        arrby[-30159 & 16519] = 17448 & -24287;
        Field_17116 = arrby;
        byte[] arrby2 = new byte[-15265 & 15138];
        arrby2[16416 & 9486] = 77 & 21903;
        arrby2[-31727 & 2115] = 522 & 28699;
        Field_17114 = arrby2;
        Field_17108 = Class_17103.Method_17127(Class_17103.Method_17161("\u0482\u0483\u0482\u0481\u0480\u0483\u0480\u0481\u0488\u0489\u048a\u048b\u0488\u0489"));
        Field_17120 = Class_17103.Method_17127(Class_17103.Method_17162("\u8004\u8001\u8000\u8001\u8006\u8001\u8006\u8003\u8000\u8001"));
        Field_17105 = Class_17103.Method_17127(Class_17103.Method_17156("\u0200\u020a\u020a\u0202\u0206"));
        Field_17110 = Class_17103.Method_17127(Class_17103.Method_17163("\u810c\u8103\u8102\u8107\u814e\u8103\u810e\u810b\u8108\u810b"));
        Field_17117 = Class_17103.Method_17127(Class_17103.Method_17165("\u0901\u0920\u0932\u0933"));
        Field_17109 = Class_17103.Method_17127(Class_17103.Method_17152("\u4002\u4007\u4000\u4001"));
        Field_17107 = Class_17103.Method_17127(Class_17103.Method_17155("\u7110\u7104\u7105\u7111\u7116\u7100"));
        Field_17119 = Class_17103.Method_17127(Class_17103.Method_17131("\u20a0\u20a1\u20a0\u20a5\u20e0\u20e5\u20e4\u20e5\u20e0\u20e5\u20e4\u20e5"));
        Field_17113 = Class_17103.Method_17127(Class_17103.Method_17169("\u4405\u4401\u4412\u441f\u4404\u4411\u4412\u4407\u445c\u4414\u441f\u4412\u4418\u4411\u441e\u441b\u4404"));
        Field_17118 = Class_17103.Method_17127(Class_17103.Method_17139("\u40f0\u40f1\u40e4\u40f5\u40f4\u40f0\u40f1"));
        Field_17115 = Class_17103.Method_17127(Class_17103.Method_17128("\u1a62\u1a40\u1a40\u1a0a\u1a66\u1a44\u1a45\u1a64\u1a42\u1a4a\u1a40\u1a4a\u1a4d\u1a04\u1a64\u1a4e\u1a58\u1a10"));
        Field_17106 = Class_17103.Method_17127(Class_17103.Method_17138("\u484a\u485c\u4858\u4816\u484a\u4858\u485c\u484c\u4856\u485a\u4850\u485e\u4848\u4810\u4854\u485a\u4840\u480a"));
        Field_17112 = Class_17103.Method_17127(Class_17103.Method_17150("\u0004#$c\u0004'!\u0001(-,+/o\f(6160"));
        Field_17111 = Class_17103.Method_17127(Class_17103.Method_17136("\u1f00\u1f03\u1f00\u1f43\u1f04\u1f07\u1f04\u1f05\u1f08\u1f09\u1f08\u1f0b\u1f0e\u1f4f\u1f0e\u1f0d\u1f10\u1f13\u1f12\u1f13\u1f14\u1f15"));
        Field_17104 = new Class_21617();
    }

    static void Method_17124(CharSequence charSequence, Class_22553 class_22553) {
        int n = charSequence.length();
        for (int i = -15102 & 64; i < n; ++i) {
            class_22553.Method_22606((byte)charSequence.charAt(i));
        }
    }

    public Class_17103 Method_17125(CharSequence charSequence, Iterable iterable) {
        return this.Method_17133(charSequence.toString(), iterable);
    }

    public abstract List Method_17126(String var1);

    public static CharSequence Method_17127(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        return new Class_28968(string);
    }

    private static String Method_17128(String string) {
        int n = 23595;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public abstract Class_17103 Method_17129(String var1, Object var2);

    public abstract Class_17103 Method_17130(String var1);

    private static String Method_17131(String string) {
        int n = 24359;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_17132(Class_32692 class_32692) {
        String string = class_32692.Method_32694().Method_17148(Field_17120);
        if (string != null && Class_17103.Method_17159(Field_17105, string)) {
            return (1540 & 16515) != 0;
        }
        if (class_32692.Method_32693().Method_18325()) {
            return (!Class_17103.Method_17159(Field_17105, string) ? 261 & -32759 : 8192 & 112) != 0;
        }
        return Class_17103.Method_17159(Field_17110, string);
    }

    public abstract Class_17103 Method_17133(String var1, Iterable var2);

    public static void Method_17134(Class_32692 class_32692, String string, Object object) {
        class_32692.Method_32694().Method_17158(string, object);
    }

    static int Method_17135(CharSequence charSequence) {
        if (charSequence instanceof Class_28968) {
            return ((Class_28968)charSequence).Method_28978();
        }
        int n = 2608 & 4109;
        for (int i = charSequence.length() - (-24571 & 4873); i >= 0; --i) {
            char c = charSequence.charAt(i);
            if (c >= (597 & -21407) && c <= (10234 & 16478)) {
                c = (char)(c + (-31580 & 18976));
            }
            n = (95 & -32737) * n + c;
        }
        if (n > 0) {
            return n;
        }
        if (n == (-1574834176 & -2075521404)) {
            return Integer.MAX_VALUE & Integer.MAX_VALUE;
        }
        return -n;
    }

    private static String Method_17136(String string) {
        int n = 13040;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public List Method_17137(CharSequence charSequence) {
        return this.Method_17126(charSequence.toString());
    }

    private static String Method_17138(String string) {
        int n = 12927;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17103() {
    }

    private static String Method_17139(String string) {
        int n = 10069;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_17103 Method_17140(CharSequence charSequence) {
        return this.Method_17130(charSequence.toString());
    }

    static void Method_17141(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Header names cannot be null");
        }
        for (int i = 4874 & 18676; i < charSequence.length(); ++i) {
            char c = charSequence.charAt(i);
            if (c > (3455 & 127)) {
                throw new IllegalArgumentException("Header name cannot contain non-ASCII characters: " + charSequence);
            }
            switch (c) {
                case '\t': 
                case '\n': 
                case '\u000b': 
                case '\f': 
                case '\r': 
                case ' ': 
                case ',': 
                case ':': 
                case ';': 
                case '=': {
                    throw new IllegalArgumentException("Header name cannot contain the following prohibited characters: =,;: \\t\\r\\n\\v\\f: " + charSequence);
                }
            }
        }
    }

    public static long Method_17142(Class_32692 class_32692, long l) {
        String string = class_32692.Method_32694().Method_17148(Field_17108);
        if (string != null) {
            try {
                return Long.parseLong(string);
            }
            catch (NumberFormatException numberFormatException) {
                return l;
            }
        }
        long l2 = Class_17103.Method_17168(class_32692);
        if (l2 >= (168052809L & 22160002L)) {
            return l2;
        }
        return l;
    }

    static void Method_17143(CharSequence charSequence, CharSequence charSequence2, Class_22553 class_22553) {
        if (!Class_17103.Method_17146(charSequence, class_22553)) {
            class_22553.Method_22610(Field_17116);
        }
        if (!Class_17103.Method_17146(charSequence2, class_22553)) {
            class_22553.Method_22610(Field_17114);
        }
    }

    public boolean Method_17144(CharSequence charSequence) {
        return this.Method_17167(charSequence.toString());
    }

    public static void Method_17145(Class_32692 class_32692) {
        List list = class_32692.Method_32694().Method_17137(Field_17113);
        if (list.isEmpty()) {
            return;
        }
        Iterator<E> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            if (!Class_17103.Method_17159(string, Field_17118)) continue;
            iterator.remove();
        }
        if (list.isEmpty()) {
            class_32692.Method_32694().Method_17140(Field_17113);
        } else {
            class_32692.Method_32694().Method_17125(Field_17113, list);
        }
    }

    public static boolean Method_17146(CharSequence charSequence, Class_22553 class_22553) {
        if (charSequence instanceof Class_28968) {
            return ((Class_28968)charSequence).Method_28975(class_22553);
        }
        Class_17103.Method_17124(charSequence, class_22553);
        return (2066 & 1248) != 0;
    }

    public static void Method_17147(Class_32692 class_32692, boolean bl) {
        Class_17103 class_17103 = class_32692.Method_32694();
        if (class_32692.Method_32693().Method_18325()) {
            if (bl) {
                class_17103.Method_17140(Field_17120);
            } else {
                class_17103.Method_17154(Field_17120, Field_17105);
            }
        } else if (bl) {
            class_17103.Method_17154(Field_17120, Field_17110);
        } else {
            class_17103.Method_17140(Field_17120);
        }
    }

    public String Method_17148(CharSequence charSequence) {
        return this.Method_17121(charSequence.toString());
    }

    public abstract boolean Method_17149();

    private static String Method_17150(String string) {
        int n = 6520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_17151(Class_32692 class_32692, String string) {
        class_32692.Method_32694().Method_17154(Field_17117, string);
    }

    private static String Method_17152(String string) {
        int n = 7613;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_17153(String string, String string2, boolean bl) {
        List list = this.Method_17126(string);
        if (list.isEmpty()) {
            return (16424 & 7169) != 0;
        }
        for (String string3 : list) {
            if (bl) {
                if (!Class_17103.Method_17159(string3, string2)) continue;
                return (23041 & 33) != 0;
            }
            if (!string3.equals(string2)) continue;
            return (17 & 20685) != 0;
        }
        return (8236 & 2192) != 0;
    }

    public Class_17103 Method_17154(CharSequence charSequence, Object object) {
        return this.Method_17158(charSequence.toString(), object);
    }

    private static String Method_17155(String string) {
        int n = 32047;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17156(String string) {
        int n = 29341;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_17157(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        return this.Method_17153(charSequence.toString(), charSequence2.toString(), bl);
    }

    public abstract Class_17103 Method_17158(String var1, Object var2);

    public static boolean Method_17159(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return (37 & 18577) != 0;
        }
        if (charSequence == null || charSequence2 == null) {
            return (-31936 & 9252) != 0;
        }
        int n = charSequence.length();
        if (n != charSequence2.length()) {
            return (17409 & 2178) != 0;
        }
        for (int i = n - (9473 & -28503); i >= 0; --i) {
            char c;
            char c2 = charSequence.charAt(i);
            if (c2 == (c = charSequence2.charAt(i))) continue;
            if (c2 >= (113 & -16317) && c2 <= (-32678 & 1274)) {
                c2 = (char)(c2 + (1572 & 6432));
            }
            if (c >= (-32307 & 21585) && c <= (17498 & -30117)) {
                c = (char)(c + (4658 & 168));
            }
            if (c2 == c) continue;
            return (20 & 14466) != 0;
        }
        return (5 & 18945) != 0;
    }

    static void Method_17160(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Header values cannot be null");
        }
        int n = -16382 & 2688;
        block19 : for (int i = 2177 & 806; i < charSequence.length(); ++i) {
            char c = charSequence.charAt(i);
            switch (c) {
                case '\u000b': {
                    throw new IllegalArgumentException("Header value contains a prohibited character '\\v': " + charSequence);
                }
                case '\f': {
                    throw new IllegalArgumentException("Header value contains a prohibited character '\\f': " + charSequence);
                }
            }
            switch (n) {
                case 0: {
                    switch (c) {
                        case '\r': {
                            n = 11265 & 865;
                            continue block19;
                        }
                        case '\n': {
                            n = 2 & -7646;
                        }
                    }
                    continue block19;
                }
                case 1: {
                    switch (c) {
                        case '\n': {
                            n = -9790 & 35;
                            continue block19;
                        }
                    }
                    throw new IllegalArgumentException("Only '\\n' is allowed after '\\r': " + charSequence);
                }
                case 2: {
                    switch (c) {
                        case '\t': 
                        case ' ': {
                            n = 11009 & 178;
                            continue block19;
                        }
                    }
                    throw new IllegalArgumentException("Only ' ' and '\\t' are allowed after '\\n': " + charSequence);
                }
            }
        }
        if (n != 0) {
            throw new IllegalArgumentException("Header value must not end with '\\r' or '\\n':" + charSequence);
        }
    }

    private static String Method_17161(String string) {
        int n = 11171;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17162(String string) {
        int n = 19884;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17163(String string) {
        int n = 14659;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_17103 Method_17164(CharSequence charSequence, Object object) {
        return this.Method_17129(charSequence.toString(), object);
    }

    private static String Method_17165(String string) {
        int n = 4940;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_17166() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public abstract boolean Method_17167(String var1);

    private static int Method_17168(Class_32692 class_32692) {
        Class_37974 class_37974;
        Class_17103 class_17103 = class_32692.Method_32694();
        if (class_32692 instanceof Class_34657) {
            Class_34657 class_34657 = (Class_34657)class_32692;
            if (Class_16725.Field_16730.Method_16744(class_34657.Method_34659()) && class_17103.Method_17144(Field_17115) && class_17103.Method_17144(Field_17106)) {
                return 16478 & 4872;
            }
        } else if (class_32692 instanceof Class_37974 && (class_37974 = (Class_37974)class_32692).Method_37975().Method_7129() == (239 & -29579) && class_17103.Method_17144(Field_17112) && class_17103.Method_17144(Field_17111)) {
            return 8766 & 5200;
        }
        return -1 & -1;
    }

    private static String Method_17169(String string) {
        int n = 17767;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17103.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public abstract Class_17103 Method_17170();
}

