/*
 * Decompiled with CFR 0.145.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Class_7799 {
    private static final boolean Field_7800;
    private static final long Field_7801;
    private static final int Field_7802;
    private static final boolean Field_7803;
    private static final boolean Field_7804;
    private static final boolean Field_7805;
    private static final File Field_7806;
    private static final boolean Field_7807;
    private static final int Field_7808;
    private static final Pattern Field_7809;
    private static final boolean Field_7810;
    private static final Class_6113 Field_7811;
    private static final boolean Field_7812;
    private static final long Field_7813;
    private static final int Field_7814;

    public static byte Method_7815(long l) {
        return Class_11149.Method_11161(l);
    }

    private void Method_7816() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_7817() {
        return Field_7814;
    }

    public static ClassLoader Method_7818() {
        return Class_11149.Method_11168();
    }

    private static boolean Method_7819() {
        boolean bl = Class_16591.Method_16604("internal.io.netty.noUnsafe", (21248 & -23438) != 0);
        Field_7811.Method_6114("-Dinternal.io.netty.noUnsafe: {}", bl);
        if (Class_7799.Method_7833()) {
            Field_7811.Method_6130("sun.misc.Unsafe: unavailable (Android)");
            return (16928 & -32546) != 0;
        }
        if (bl) {
            Field_7811.Method_6130("sun.misc.Unsafe: unavailable (internal.io.netty.noUnsafe)");
            return (5146 & 580) != 0;
        }
        boolean bl2 = Class_16591.Method_16599("internal.io.netty.tryUnsafe") ? Class_16591.Method_16604("internal.io.netty.tryUnsafe", (26881 & -32763) != 0) : Class_16591.Method_16604("org.jboss.netty.tryUnsafe", (12899 & -32511) != 0);
        if (!bl2) {
            Field_7811.Method_6130("sun.misc.Unsafe: unavailable (internal.io.netty.tryUnsafe/org.jboss.netty.tryUnsafe)");
            return (145 & -30164) != 0;
        }
        try {
            boolean bl3 = Class_11149.Method_11163();
            Field_7811.Method_6114("sun.misc.Unsafe: {}", bl3 ? "available" : "unavailable");
            return bl3;
        }
        catch (Throwable throwable) {
            return (65 & 13696) != 0;
        }
    }

    private static File Method_7820(String string) {
        if (string == null) {
            return null;
        }
        File file = new File(string);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        }
        catch (Exception exception) {
            return file;
        }
    }

    public static void Method_7821(long l, int n) {
        Class_11149.Method_11158(l, n);
    }

    public static boolean Method_7822() {
        return Field_7807;
    }

    public static AtomicLongFieldUpdater Method_7823(Class class_, String string) {
        if (Class_7799.Method_7858()) {
            try {
                return Class_11149.Method_11171(class_, string);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    private static void Method_7824(Throwable throwable) {
        throw throwable;
    }

    private static boolean Method_7825() {
        boolean bl = Class_16591.Method_16596("os.name", "").toLowerCase(Locale.US).contains("win");
        if (bl) {
            Field_7811.Method_6130("Platform: Windows");
        }
        return bl;
    }

    public static long Method_7826(ByteBuffer byteBuffer) {
        return Class_11149.Method_11187(byteBuffer);
    }

    public static void Method_7827(long l, byte by) {
        Class_11149.Method_11169(l, by);
    }

    public static ConcurrentMap Method_7828() {
        if (Field_7804) {
            return new Class_21500();
        }
        return new ConcurrentHashMap();
    }

    public static long Method_7829() {
        return Field_7813;
    }

    public static Queue Method_7830() {
        return new Class_37530();
    }

    private static File Method_7831() {
        File file;
        try {
            file = Class_7799.Method_7820(Class_16591.Method_16598("internal.io.netty.tmpdir"));
            if (file != null) {
                Field_7811.Method_6114("-Dinternal.io.netty.tmpdir: {}", file);
                return file;
            }
            file = Class_7799.Method_7820(Class_16591.Method_16598("java.io.tmpdir"));
            if (file != null) {
                Field_7811.Method_6114("-Dinternal.io.netty.tmpdir: {} (java.io.tmpdir)", file);
                return file;
            }
            if (Class_7799.Method_7840()) {
                file = Class_7799.Method_7820(System.getenv("TEMP"));
                if (file != null) {
                    Field_7811.Method_6114("-Dinternal.io.netty.tmpdir: {} (%TEMP%)", file);
                    return file;
                }
                String string = System.getenv("USERPROFILE");
                if (string != null) {
                    file = Class_7799.Method_7820(string + "\\AppData\\Local\\Temp");
                    if (file != null) {
                        Field_7811.Method_6114("-Dinternal.io.netty.tmpdir: {} (%USERPROFILE%\\AppData\\Local\\Temp)", file);
                        return file;
                    }
                    file = Class_7799.Method_7820(string + "\\Local Settings\\Temp");
                    if (file != null) {
                        Field_7811.Method_6114("-Dinternal.io.netty.tmpdir: {} (%USERPROFILE%\\Local Settings\\Temp)", file);
                        return file;
                    }
                }
            } else {
                file = Class_7799.Method_7820(System.getenv("TMPDIR"));
                if (file != null) {
                    Field_7811.Method_6114("-Dinternal.io.netty.tmpdir: {} ($TMPDIR)", file);
                    return file;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        file = Class_7799.Method_7840() ? new File("C:\\Windows\\Temp") : new File("/tmp");
        Field_7811.Method_6125("Failed to get the temporary directory; falling back to: {}", file);
        return file;
    }

    public static void Method_7832(byte[] arrby, int n, long l, long l2) {
        Class_11149.Method_11192(arrby, Field_7801 + (long)n, null, l, l2);
    }

    public static boolean Method_7833() {
        return Field_7803;
    }

    public static void Method_7834(Throwable throwable) {
        if (Class_7799.Method_7858()) {
            Class_11149.Method_11182(throwable);
        } else {
            Class_7799.Method_7824(throwable);
        }
    }

    public static AtomicReferenceFieldUpdater Method_7835(Class class_, String string) {
        if (Class_7799.Method_7858()) {
            try {
                return Class_11149.Method_11196(class_, string);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public static void Method_7836(long l, long l2) {
        Class_11149.Method_11195(l, l2);
    }

    public static long Method_7837(long l) {
        return Class_11149.Method_11186(l);
    }

    private Class_7799() {
    }

    public static ClassLoader Method_7838(Class class_) {
        return Class_11149.Method_11173(class_);
    }

    public static boolean Method_7839() {
        return Field_7812;
    }

    public static boolean Method_7840() {
        return Field_7810;
    }

    public static void Method_7841(long l, byte[] arrby, int n, long l2) {
        Class_11149.Method_11192(null, l, arrby, Field_7801 + (long)n, l2);
    }

    private static String Method_7842(String string) {
        int n = 28396;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7799.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7843(String string) {
        int n = 8467;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7799.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static AtomicIntegerFieldUpdater Method_7844(Class class_, String string) {
        if (Class_7799.Method_7858()) {
            try {
                return Class_11149.Method_11159(class_, string);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    private static int Method_7845() {
        if (!Class_7799.Method_7858()) {
            return -1 & -1;
        }
        return Class_11149.Method_11194();
    }

    private static long Method_7846() {
        GenericDeclaration genericDeclaration;
        Class<?> class_;
        long l = 1816330640L & -448042265238508000L;
        try {
            class_ = Class.forName("sun.misc.VM", (777 & 5313) != 0, Class_7799.Method_7818());
            genericDeclaration = class_.getDeclaredMethod("maxDirectMemory", new Class[19072 & 21]);
            l = ((Number)((Method)genericDeclaration).invoke(null, new Object[-16384 & 6144])).longValue();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (l > (2229632L & 806363137L)) {
            return l;
        }
        try {
            class_ = Class.forName("java.lang.management.ManagementFactory", (-5689 & 1) != 0, Class_7799.Method_7818());
            genericDeclaration = Class.forName("java.lang.management.RuntimeMXBean", (915 & 1029) != 0, Class_7799.Method_7818());
            Object object = class_.getDeclaredMethod("getRuntimeMXBean", new Class[88 & 8193]).invoke(null, new Object[8216 & -27323]);
            List list = (List)((Class)genericDeclaration).getDeclaredMethod("getInputArguments", new Class[18432 & 493]).invoke(object, new Object[-22943 & 260]);
            for (int i = list.size() - (1205 & -30711); i >= 0; --i) {
                Matcher matcher = Field_7809.matcher((CharSequence)list.get(i));
                if (!matcher.matches()) continue;
                l = Long.parseLong(matcher.group(1409 & 10245));
                switch (matcher.group(8450 & -32693).charAt(17473 & -24040)) {
                    case 'K': 
                    case 'k': {
                        l *= 263424L & 274241080L;
                        break;
                    }
                    case 'M': 
                    case 'm': {
                        l *= 135292229L & -5673760981128478584L;
                        break;
                    }
                    case 'G': 
                    case 'g': {
                        l *= 1082404883L & -2420201638371261436L;
                    }
                }
                break;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (l <= (-7803766475426042623L & 332302L)) {
            l = Runtime.getRuntime().maxMemory();
            Field_7811.Method_6114("maxDirectMemory: {} bytes (maybe)", l);
        } else {
            Field_7811.Method_6114("maxDirectMemory: {} bytes", l);
        }
        return l;
    }

    private static int Method_7847() {
        int n;
        if (Class_7799.Method_7833()) {
            n = -23098 & 2062;
        } else {
            try {
                Class.forName("java.time.Clock", (8209 & -11770) != 0, Class_7799.Method_7838(Object.class));
                n = 7262 & -32760;
            }
            catch (Exception exception) {
                try {
                    Class.forName("java.util.concurrent.LinkedTransferQueue", (1196 & 16386) != 0, Class_7799.Method_7838(BlockingQueue.class));
                    n = 79 & 21671;
                }
                catch (Exception exception2) {
                    n = 17462 & -24442;
                }
            }
        }
        if (Field_7811.Method_6131()) {
            Field_7811.Method_6114("Java version: {}", n);
        }
        return n;
    }

    public static void Method_7848(ByteBuffer byteBuffer) {
        if (Class_7799.Method_7858() && !Class_7799.Method_7833()) {
            Class_11149.Method_11175(byteBuffer);
        }
    }

    private static boolean Method_7849() {
        int n;
        try {
            Class.forName("android.app.Application", (8204 & 16640) != 0, Class_7799.Method_7818());
            n = 257 & -32759;
        }
        catch (Exception exception) {
            n = -32510 & 5704;
        }
        if (n != 0) {
            Field_7811.Method_6130("Platform: Android");
        }
        return n != 0;
    }

    private static int Method_7850() {
        int n = Class_16591.Method_16601("internal.io.netty.bitMode", 26745 & 1414);
        if (n > 0) {
            Field_7811.Method_6114("-Dinternal.io.netty.bitMode: {}", n);
            return n;
        }
        n = Class_16591.Method_16601("sun.arch.data.model", 8644 & 16433);
        if (n > 0) {
            Field_7811.Method_6114("-Dinternal.io.netty.bitMode: {} (sun.arch.data.model)", n);
            return n;
        }
        n = Class_16591.Method_16601("com.ibm.vm.bitmode", 18944 & 121);
        if (n > 0) {
            Field_7811.Method_6114("-Dinternal.io.netty.bitMode: {} (com.ibm.vm.bitmode)", n);
            return n;
        }
        String string = Class_16591.Method_16596("os.arch", "").toLowerCase(Locale.US).trim();
        if ("amd64".equals(string) || "x86_64".equals(string)) {
            n = -32444 & 3144;
        } else if ("i386".equals(string) || "i486".equals(string) || "i586".equals(string) || "i686".equals(string)) {
            n = 23584 & 948;
        }
        if (n > 0) {
            Field_7811.Method_6122("-Dinternal.io.netty.bitMode: {} (os.arch: {})", n, string);
        }
        String string2 = Class_16591.Method_16596("java.vm.name", "").toLowerCase(Locale.US);
        Pattern pattern = Pattern.compile("([1-9][0-9]+)-?bit");
        Matcher matcher = pattern.matcher(string2);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(32005 & -32757));
        }
        return 704 & -7098;
    }

    public static void Method_7851(long l, short s) {
        Class_11149.Method_11174(l, s);
    }

    private static String Method_7852(String string) {
        int n = 21865;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7799.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static ClassLoader Method_7853() {
        return Class_11149.Method_11164();
    }

    public static int Method_7854(long l) {
        return Class_11149.Method_11185(l);
    }

    public static void Method_7855(long l, long l2, long l3) {
        Class_11149.Method_11167(l, l2, l3);
    }

    static {
        Field_7811 = Class_10201.Method_10203(Class_7799.class);
        Field_7809 = Pattern.compile(Class_7799.Method_7843("\u0081\u0086\u0085\u0082\u0085\u0085\u0085\u0082\u0084\u0085\u0083\u0086\u0087\u0084\u0083\u0090\u0090\u0092\u0090\u0097\u0094\u0094\u0096\u0097\u0090\u0093\u0094\u0097\u0090\u0093\u0094\u00a7\u00a5\u00a4\u00a7\u00a0\u00a4\u00a2\u00a4\u00a4\u00a1\u00a4\u00a5\u00a5\u00a6\u00a4\u00a4\u00b0\u00b0\u00b0\u00b0\u00b0\u00b2\u00b6\u00b3\u00b6\u00b7\u00b3"));
        Field_7803 = Class_7799.Method_7849();
        Field_7810 = Class_7799.Method_7825();
        Field_7807 = Class_7799.Method_7857();
        Field_7814 = Class_7799.Method_7847();
        Field_7812 = !Class_7799.Method_7833() ? 8217 & -32603 : 194 & 3584;
        Field_7805 = Class_7799.Method_7819();
        Field_7804 = Field_7805 && Field_7814 < (-26408 & 1067) ? 4099 & 17705 : 8453 & 4640;
        Field_7800 = Field_7805 && !Class_16591.Method_16604(Class_7799.Method_7860("\u413f\u4138\u4122\u4133\u4120\u413c\u4133\u413e\u4178\u413f\u4139\u4178\u413c\u4137\u4126\u4126\u413f\u4168\u4128\u4129\u4112\u4130\u4127\u4124\u4123\u4134\u4102\u412f\u4130\u4127\u4121\u4136"), (4226 & -32512) != 0) ? 17923 & -32695 : 18176 & 1;
        Field_7813 = Class_7799.Method_7846();
        Field_7801 = Class_7799.Method_7859();
        Field_7806 = Class_7799.Method_7831();
        Field_7802 = Class_7799.Method_7850();
        Field_7808 = Class_7799.Method_7845();
        if (Field_7811.Method_6131()) {
            Field_7811.Method_6114(Class_7799.Method_7852("\u9020\u9000\u9026\u9020\u9024\u9024\u9020\u9024\u902c\u9028\u9028\u902e\u902e\u902e\u902c\u902e\u9030\u9030\u9036\u9030\u9036\u9036\u9012\u9030\u9038\u903a\u903a\u903c\u901c\u9038\u9038\u903e\u9026\u9020\u9024\u9026\u9022\u9024"), (!Field_7800 ? 16517 & 5641 : 2066 & -32736) != 0);
        }
        if (!Class_7799.Method_7858() && !Class_7799.Method_7833()) {
            Field_7811.Method_6117(Class_7799.Method_7842("\u8298\u828f\u8294\u8293\u82c0\u8291\u828c\u8281\u829c\u828f\u8286\u829b\u8284\u82c9\u828c\u8287\u8294\u8283\u82d0\u829f\u829e\u8285\u82d0\u8281\u828a\u8297\u828e\u8291\u829c\u829d\u82d8\u829b\u82ae\u82ad\u82b0\u82ad\u82a4\u82b5\u82a4\u82e1\u82a4\u82a7\u82be\u82e5\u82a4\u82ad\u82be\u82ad\u82bc\u82f1\u82b0\u82a1\u82b8\u82f1\u82b6\u82bf\u82aa\u82f9\u82b8\u82bb\u82ba\u82bd\u82aa\u82ab\u8288\u828f\u8286\u82c1\u8284\u8289\u8292\u8285\u828a\u829d\u82c8\u828b\u829c\u828f\u828e\u828d\u8282\u8283\u82d0\u8283\u8294\u829d\u8298\u8291\u829a\u8295\u8280\u82d7\u82d8\u828d\u8296\u8295\u82a4\u82b3\u82b2\u82e1\u82a4\u82b9\u82b0\u82ad\u82a0\u82ab\u82a0\u82bd\u82a4\u82b1\u82e8\u82bb\u82b4\u82a1\u82a4\u82b5\u82a2\u82a5\u82b4\u82b5\u82f4\u82f9\u82b0\u82bd\u82b8\u82a9\u82f8\u82bb\u8214\u8207\u8206\u8205\u8212\u8241\u8216\u8209\u8204\u8205\u8248\u8209\u8204\u821f\u8208\u8211\u8202\u8251\u8212\u8215\u8250\u8201\u8202\u8215\u821e\u821d\u820a\u820b\u821c\u821d\u8258\u820d\u822e\u8261\u8220\u8237\u822e\u8229\u8224\u8261\u8238\u8227\u823c\u822d\u8226\u823d\u8220\u8229\u823c\u8271\u8222\u8229\u8222\u8225\u8234\u823d\u8278\u822d\u8236\u822b\u822c\u8239\u823a\u8231\u820c\u8209\u8214\u8219\u824e"));
        }
    }

    public static boolean Method_7856() {
        return Field_7800;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean Method_7857() {
        Object object;
        if (Class_7799.Method_7840()) {
            return (28673 & 1630) != 0;
        }
        String[] arrstring = new String[21444 & -24524];
        arrstring[21504 & 2561] = "/usr/bin/id";
        arrstring[129 & -22961] = "/bin/id";
        arrstring[-28510 & 2114] = "id";
        arrstring[17667 & 143] = "/usr/xpg4/bin/id";
        String[] arrstring2 = arrstring;
        Pattern pattern = Pattern.compile("^(?:0|[1-9][0-9]*)$");
        Object object2 = arrstring2;
        int n = ((String[])object2).length;
        for (int i = -32718 & 16900; i < n; ++i) {
            String string = object2[i];
            object = null;
            BufferedReader bufferedReader = null;
            String string2 = null;
            try {
                String[] arrstring3 = new String[278 & 6210];
                arrstring3[-31296 & 8] = string;
                arrstring3[3075 & 16777] = "-u";
                object = Runtime.getRuntime().exec(arrstring3);
                bufferedReader = new BufferedReader(new InputStreamReader(((Process)object).getInputStream(), Class_7203.Field_7204));
                string2 = bufferedReader.readLine();
                bufferedReader.close();
                do {
                    try {
                        int n2 = ((Process)object).waitFor();
                        if (n2 != 0) {
                            string2 = null;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        continue;
                    }
                    break;
                } while (true);
            }
            catch (Exception exception) {
                string2 = null;
            }
            finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    }
                    catch (IOException iOException) {}
                }
                if (object != null) {
                    try {
                        ((Process)object).destroy();
                    }
                    catch (Exception exception) {}
                }
            }
            if (string2 == null || !pattern.matcher(string2).matches()) continue;
            Field_7811.Method_6114("UID: {}", string2);
            return "0".equals(string2);
        }
        Field_7811.Method_6130("Could not determine the current UID using /usr/bin/id; attempting to bind at privileged ports.");
        object2 = Pattern.compile(".*(?:denied|not.*permitted).*");
        for (n = -31745 & 11263; n > 0; --n) {
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket();
                serverSocket.setReuseAddress((16393 & 577) != 0);
                serverSocket.bind(new InetSocketAddress(n));
                if (Field_7811.Method_6131()) {
                    Field_7811.Method_6114("UID: 0 (succeded to bind at port {})", n);
                }
                boolean bl = -14751 & 4377;
                return bl;
            }
            catch (Exception exception) {
                object = exception.getMessage();
                if (object == null) {
                    object = "";
                }
                if (!((Pattern)object2).matcher((CharSequence)(object = ((String)object).toLowerCase())).matches()) continue;
                break;
            }
            finally {
                if (serverSocket != null) {
                    try {
                        serverSocket.close();
                    }
                    catch (Exception exception) {}
                }
            }
        }
        Field_7811.Method_6130("UID: non-root (failed to bind at any privileged ports)");
        return (27749 & 0) != 0;
    }

    public static boolean Method_7858() {
        return Field_7805;
    }

    private static long Method_7859() {
        if (!Class_7799.Method_7858()) {
            return -1L & -1L;
        }
        return Class_11149.Method_11183();
    }

    private static String Method_7860(String string) {
        int n = 31341;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7799.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static short Method_7861(long l) {
        return Class_11149.Method_11179(l);
    }
}

