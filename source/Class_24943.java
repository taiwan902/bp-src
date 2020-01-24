/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.EnumSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Class_24943 {
    private static final String[] Field_24944;
    private static Class_28119 Field_24945;
    private final long Field_24946;
    private long Field_24947;
    private final ReferenceQueue Field_24948 = new ReferenceQueue();
    private static final Class_6113 Field_24949;
    private static final Class_28119 Field_24950;
    private final int Field_24951;
    private final AtomicBoolean Field_24952 = new AtomicBoolean();
    private final Class_27689 Field_24953 = new Class_27689(this, null);
    private final ConcurrentMap Field_24954 = Class_7799.Method_7828();
    private long Field_24955;
    private final Class_27689 Field_24956 = new Class_27689(this, null);
    private final String Field_24957;

    private static String Method_24958(String string) {
        int n = 22100;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static String Method_24959(int n) {
        StackTraceElement[] arrstackTraceElement;
        StringBuilder stringBuilder = new StringBuilder(4248 & -25822);
        StackTraceElement[] arrstackTraceElement2 = arrstackTraceElement = new Throwable().getStackTrace();
        int n2 = arrstackTraceElement2.length;
        for (int i = 70 & 14849; i < n2; ++i) {
            StackTraceElement stackTraceElement = arrstackTraceElement2[i];
            if (n > 0) {
                --n;
                continue;
            }
            String string = stackTraceElement.toString();
            int n3 = -32382 & 8224;
            String[] arrstring = Field_24944;
            int n4 = arrstring.length;
            for (int j = 4352 & -13308; j < n4; ++j) {
                String string2 = arrstring[j];
                if (!string.startsWith(string2)) continue;
                n3 = 12321 & -31591;
                break;
            }
            if (n3 != 0) continue;
            stringBuilder.append((char)(717 & -13271));
            stringBuilder.append(string);
            stringBuilder.append(Class_22304.Field_22308);
        }
        return stringBuilder.toString();
    }

    public Class_20340 Method_24960(Object object) {
        Class_28119 class_28119 = Field_24945;
        if (class_28119 == Class_28119.Field_28121) {
            return null;
        }
        if (class_28119.ordinal() < Class_28119.Field_28124.ordinal()) {
            long l = this.Field_24955;
            this.Field_24955 = l + (135269385L & -5544178097279414239L);
            if (l % (long)this.Field_24951 == (4190821286215189296L & -4190821287985020923L)) {
                this.Method_24972(class_28119);
                return new Class_27689(this, object);
            }
            return null;
        }
        this.Method_24972(class_28119);
        return new Class_27689(this, object);
    }

    static long Method_24961(Class_24943 class_24943) {
        long l = class_24943.Field_24947;
        class_24943.Field_24947 = l - (121700993L & 4639418830566351907L);
        return l;
    }

    static {
        boolean bl;
        Field_24950 = Class_28119.Field_28123;
        Field_24949 = Class_10201.Method_10203(Class_24943.class);
        if (Class_16591.Method_16598(Class_24943.Method_24965("\u242a\u242c\u2426\u2426\u2424\u2428\u2426\u242a\u246c\u242a\u242c\u246c\u2428\u2422\u2422\u2422\u242a\u246c\u242c\u242c\u2404\u2422\u2424\u2428\u2426\u2420\u2420\u2426\u240a\u2422\u2426\u242c\u2426\u2406\u2406\u2406\u2404\u2402\u240e\u2408\u240c")) != null) {
            bl = (Class_16591.Method_16604(Class_24943.Method_24964("\u0611\u0611\u0600\u0610\u0604\u0615\u0615\u0615\u0618\u0618\u0619\u0619\u061c\u061c\u060c\u060d\u0611\u0601\u0600\u0600\u0634\u0604\u0615\u0604\u0619\u0619\u0609\u0608\u062c\u060c\u060d\u060c\u0610\u0630\u0620\u0630\u0635\u0625\u0635\u0634\u0638"), (-21483 & 64) != 0) ? 1 : 0) != 0;
            Field_24949.Method_6114(Class_24943.Method_24969("\uc082\uc0c3\uc0c2\uc0c1\uc0c3\uc0c2\uc0c1\uc0c1\uc0c2\uc0c3\uc081\uc0c2\uc0c0\uc081\uc0c1\uc0c2\uc0c3\uc0c3\uc0c2\uc081\uc0c1\uc0c0\uc0c1\uc0c2\uc0c0\uc0c0\uc0c2\uc0c1\uc0c0\uc0c2\uc0c3\uc0c2\uc0e2\uc0e0\uc0e3\uc0e2\uc0e3\uc0e2\uc0e0\uc0e3\uc0e2\uc0e0\uc0e1\uc0a1\uc0a3\uc0e0\uc0e2"), bl);
            Field_24949.Method_6123(Class_24943.Method_24958("Q\u0019\u0017\u0013\f\u001c\n\u0017\u0015\u0019Z\u001e\u001d]\u001e\u0016\u0018\u0019\u0017C\u0004\u0004\u001a\u000e\u0015\b\u0013\u0017\u0001\u0004\u000e\u0006\u001d\u0014\u001a\u001a\f\u001c\u001b\u000f\u001d\u0018\u001aW\u0019\u0000R\u0017\t\u001d\u001e\n\t\b\u001e\u000e\u0000IF\u0012\u0011\u0004BF\u0011YGB\u0005@G\u001e\u0014\\ZFDTSW\u0000"), Class_24943.Method_24971("\ue154\ue150\ue143\ue153\ue141\ue154\ue152\ue156\ue111\ue155\ue152\ue112\ue155\ue155\ue147\ue146\ue154\ue100\ue143\ue143\ue140\ue141\ue167\ue147\ue151\ue141\ue146\ue152\ue140\ue145\ue147\ue166\ue170\ue160\ue172\ue172"), Field_24950.name().toLowerCase());
        } else {
            bl = -22524 & 80;
        }
        Class_28119 class_28119 = bl ? Class_28119.Field_28121 : Field_24950;
        String string = Class_16591.Method_16596(Class_24943.Method_24962("\u068b\u0688\u0680\u0681\u0684\u068c\u0685\u068c\u0688\u068b\u068b\u068a\u068c\u0687\u0684\u0684\u068b\u0688\u0688\u0681\u0687\u068d\u0684\u0685\u0682\u0683\u0683\u0680\u068f\u068d\u068e\u068c\u06a3\u06a0\u06a1\u06a8"), class_28119.name()).trim().toUpperCase();
        Class_28119 class_281192 = Field_24950;
        for (Class_28119 class_281193 : EnumSet.allOf(Class_28119.class)) {
            if (!string.equals(class_281193.name()) && !string.equals(String.valueOf(class_281193.ordinal()))) continue;
            class_281192 = class_281193;
        }
        Field_24945 = class_281192;
        if (Field_24949.Method_6131()) {
            Field_24949.Method_6122(Class_24943.Method_24973("\u2204\u220c\u2200\u2204\u2200\u2208\u2200\u2204"), Class_24943.Method_24970("\u2400\u2400\u2413\u2403\u2411\u2400\u2402\u2402\u2409\u2409\u240a\u240a\u2409\u2409\u241b\u241a\u2400\u2410\u2413\u2413\u2410\u2411\u2413\u2413\u2409\u2419\u241a\u240a\u2418\u2419\u241b\u241a\u2420\u2430\u2422\u2422"), class_281192.name().toLowerCase());
        }
        String[] arrstring = new String[23041 & -31679];
        arrstring[-31741 & 16524] = Class_24943.Method_24963("\u0c40\u0c40\u0c50\u0c40\u0c50\u0c40\u0c40\u0c40\u0c08\u0c48\u0c48\u0c08\u0c48\u0c48\u0c58\u0c58\u0c50\u0c00\u0c40\u0c50\u0c40\u0c40\u0c40\u0c50\u0c08\u0c48\u0c48\u0c58\u0c58\u0c58\u0c48\u0c48\u0c50\u0c40\u0c50\u0c50\u0c40\u0c40\u0c50\u0c40\u0c48\u0c48\u0c48\u0c48\u0c48\u0c48\u0c58\u0c48\u0c50\u0c00\u0c50\u0c40\u0c40\u0c40\u0c40\u0c40\u0c48\u0c58\u0c48\u0c58\u0c48\u0c48\u0c58\u0c48\u0c00\u0c00\u0c10\u0c40");
        Field_24944 = arrstring;
    }

    private static String Method_24962(String string) {
        int n = 13578;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24963(String string) {
        int n = 2105;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24964(String string) {
        int n = 26276;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24965(String string) {
        int n = 27550;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static long Method_24966(Class_24943 class_24943) {
        long l = class_24943.Field_24947;
        class_24943.Field_24947 = l + (-6153693732560960339L & 6153693732401479699L);
        return l;
    }

    static ReferenceQueue Method_24967(Class_24943 class_24943) {
        return class_24943.Field_24948;
    }

    public Class_24943(String string, int n, long l) {
        if (string == null) {
            throw new NullPointerException("resourceType");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("samplingInterval: " + n + " (expected: 1+)");
        }
        if (l <= (84684865L & -6926659996679550718L)) {
            throw new IllegalArgumentException("maxActive: " + l + " (expected: 1+)");
        }
        this.Field_24957 = string;
        this.Field_24951 = n;
        this.Field_24946 = l;
        Class_27689.Method_27700(this.Field_24953, this.Field_24956);
        Class_27689.Method_27699(this.Field_24956, this.Field_24953);
    }

    public static Class_28119 Method_24968() {
        return Field_24945;
    }

    private static String Method_24969(String string) {
        int n = 27025;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24970(String string) {
        int n = 26147;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24971(String string) {
        int n = 5497;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_24972(Class_28119 class_28119) {
        int n;
        Class_27689 class_27689;
        if (!Field_24949.Method_6128()) {
            Class_27689 class_276892;
            while ((class_276892 = (Class_27689)this.Field_24948.poll()) != null) {
                class_276892.Method_27701();
            }
            return;
        }
        int n2 = n = class_28119 == Class_28119.Field_28124 ? 561 & -15997 : this.Field_24951;
        if (this.Field_24947 * (long)n > this.Field_24946 && this.Field_24952.compareAndSet((2048 & -31698) != 0, (2819 & -20471) != 0)) {
            Field_24949.Method_6126("LEAK: You are creating too many " + this.Field_24957 + " instances.  " + this.Field_24957 + " is a shared resource that must be reused across the JVM,so that only a few instances are created.");
        }
        while ((class_27689 = (Class_27689)this.Field_24948.poll()) != null) {
            String string;
            class_27689.clear();
            if (!class_27689.Method_27701() || this.Field_24954.putIfAbsent(string = class_27689.Method_27696(), Boolean.TRUE) != null) continue;
            if (string.isEmpty()) {
                Object[] arrobject = new Object[8229 & 6726];
                arrobject[64 & 3105] = this.Field_24957;
                arrobject[-13275 & 13185] = "internal.io.netty.leakDetectionLevel";
                arrobject[12299 & 3922] = Class_28119.Field_28120.name().toLowerCase();
                arrobject[15 & 10643] = Class_22304.Method_22312(this);
                Field_24949.Method_6120("LEAK: {}.release() was not called before it's garbage-collected. Enable advanced leak reporting to find out where the leak occurred. To enable advanced leak reporting, specify the JVM option '-D{}={}' or call {}.setLevel()", arrobject);
                continue;
            }
            Field_24949.Method_6115("LEAK: {}.release() was not called before it's garbage-collected.{}", this.Field_24957, string);
        }
    }

    public Class_24943(String string) {
        this(string, 1137 & 16755, Long.MAX_VALUE & Long.MAX_VALUE);
    }

    private static String Method_24973(String string) {
        int n = 8057;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24943.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_27689 Method_24974(Class_24943 class_24943) {
        return class_24943.Field_24953;
    }

    public Class_24943(Class class_) {
        this(Class_22304.Method_22309(class_));
    }

    private void Method_24975() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

