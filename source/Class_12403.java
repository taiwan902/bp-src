/*
 * Decompiled with CFR 0.145.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

public final class Class_12403 {
    public static final Inet4Address Field_12404;
    private static final Class_6113 Field_12405;
    public static final NetworkInterface Field_12406;
    public static final InetAddress Field_12407;
    public static final Inet6Address Field_12408;
    public static final int Field_12409;

    private static String Method_12410(String string) {
        int n = 17893;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12411(String string) {
        int n = 17630;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12412(String string) {
        int n = 8664;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12413(String string) {
        int n = 6833;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12414(String string) {
        int n = 29555;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12415(String string) {
        int n = 2123;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12416(String string) {
        int n = 25681;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12417(String string) {
        int n = 10349;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12418(String string) {
        int n = 6783;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static {
        block39 : {
            Class_12403.Field_12405 = Class_10201.Method_10203(Class_12403.class);
            v0 = new byte[5 & 13636];
            v0[16907 & 16] = 8319 & -16257;
            v0[-13175 & 8977] = 520 & 4162;
            v0[10250 & 338] = 12384 & -31997;
            v0[17179 & 4323] = 12869 & 275;
            var0 = v0;
            v1 = new byte[21936 & -32752];
            v1[24600 & 487] = 161 & 17408;
            v1[-8061 & 257] = 32 & -31726;
            v1[-32734 & 2187] = 512 & 31016;
            v1[9331 & 4099] = 161 & -15010;
            v1[-32123 & 4164] = 12808 & -31481;
            v1[2197 & 24847] = 17172 & 0;
            v1[71 & -24282] = 4186 & -32220;
            v1[519 & 12391] = 0 & 12369;
            v1[-32503 & 6264] = 18514 & 12836;
            v1[2089 & 20489] = 19336 & 33;
            v1[-10229 & 1226] = 4100 & -32230;
            v1[2123 & 8331] = 9490 & -28096;
            v1[60 & -21490] = -16191 & 9224;
            v1[-29395 & 4813] = 69 & 640;
            v1[21262 & 1166] = 4164 & 138;
            v1[-19441 & 17231] = -28007 & 2085;
            var1_1 = v1;
            var2_2 = null;
            try {
                var2_2 = (Inet4Address)InetAddress.getByAddress(var0);
            }
            catch (Exception var3_3) {
                Class_7799.Method_7834(var3_3);
            }
            Class_12403.Field_12404 = var2_2;
            var3_4 = null;
            try {
                var3_4 = (Inet6Address)InetAddress.getByAddress(var1_1);
            }
            catch (Exception var4_5) {
                Class_7799.Method_7834(var4_5);
            }
            Class_12403.Field_12408 = var3_4;
            var4_6 = new ArrayList<NetworkInterface>();
            try {
                var5_7 = NetworkInterface.getNetworkInterfaces();
                while (var5_7.hasMoreElements()) {
                    var6_9 = var5_7.nextElement();
                    if (!var6_9.getInetAddresses().hasMoreElements()) continue;
                    var4_6.add((NetworkInterface)var6_9);
                }
            }
            catch (SocketException var5_8) {
                Class_12403.Field_12405.Method_6127(Class_12403.Method_12420("\u01c8\u01cb\u01c3\u01c2\u01cb\u01ca\u018a\u01ca\u01c9\u0182\u01c0\u01c3\u01c2\u01c0\u01cb\u01c3\u01d8\u01db\u019a\u01da\u01d2\u01db\u019a\u01d2\u01db\u01d1\u01d2\u0192\u01d9\u01d0\u0192\u01d3\u01c8\u01cb\u01c3\u01c2\u01cb\u01c8\u01c2\u01cb\u0182\u01c8\u01c3\u01c2\u01c1\u01c9\u01c0\u01c9\u019a\u01d3\u01d0\u01da\u01db\u01d8\u01d8\u01db\u01d1\u01d3\u01d1"), var5_8);
            }
            var5_7 = null;
            var6_9 = null;
            block23 : for (NetworkInterface var8_14 : var4_6) {
                var9_18 = var8_14.getInetAddresses();
                while (var9_18.hasMoreElements()) {
                    var10_19 = var9_18.nextElement();
                    if (!var10_19.isLoopbackAddress()) continue;
                    var5_7 = var8_14;
                    var6_9 = var10_19;
                    break block23;
                }
            }
            if (var5_7 == null) {
                try {
                    for (NetworkInterface var8_16 : var4_6) {
                        if (!var8_16.isLoopback() || !(var9_18 = var8_16.getInetAddresses()).hasMoreElements()) continue;
                        var5_7 = var8_16;
                        var6_9 = var9_18.nextElement();
                        break;
                    }
                    if (var5_7 == null) {
                        Class_12403.Field_12405.Method_6132(Class_12403.Method_12419("\uc008\uc008\uc000\uc000\uc008\uc008\uc008\uc018\uc008\uc000\uc000\uc008\uc008\uc000\uc000\uc010\uc010\uc018\uc018\uc010\uc010\uc010\uc008\uc018\uc010\uc010\uc018\uc010\uc018\uc018\uc000\uc010\uc038\uc028\uc028\uc028\uc028"));
                    }
                }
                catch (SocketException var7_11) {
                    Class_12403.Field_12405.Method_6127(Class_12403.Method_12415("\u4d41\u4d41\u4d42\u4d42\u4d40\u4d40\u4d03\u4d42\u4d48\u4d08\u4d4b\u4d4b\u4d49\u4d48\u4d0b\u4d4a\u4d51\u4d51\u4d13\u4d52\u4d50\u4d51\u4d53\u4d52\u4d58\u4d59\u4d5a\u4d1a\u4d58\u4d58\u4d5b\u4d5b\u4d61\u4d60\u4d62\u4d63\u4d60"), var7_11);
                }
            }
            if (var5_7 != null) {
                v2 = new Object[-26045 & 17459];
                v2[98 & 2056] = var5_7.getName();
                v2[9349 & 16897] = var5_7.getDisplayName();
                v2[16434 & 5062] = var6_9.getHostAddress();
                Class_12403.Field_12405.Method_6124(Class_12403.Method_12412("\u040e\u042c\u042f\u0421\u0424\u0426\u0427\u042e\u0422\u042a\u042e\u0425\u0423\u0425\u0422\u0424\u0421\u0426\u042a\u0421\u042d\u042a\u0424\u042d\u0429\u042e\u042c\u0421\u042d\u042a\u042d"), v2);
            } else if (var6_9 == null) {
                try {
                    if (NetworkInterface.getByInetAddress(Class_12403.Field_12408) != null) {
                        Class_12403.Field_12405.Method_6114(Class_12403.Method_12411("\u92c4\u92c3\u92c0\u92c7\u92c6\u9281\u92c0\u92c1\u92c2\u92c5\u9284\u92c3\u92c6\u92c5\u92c4\u92c5\u9290\u92d1\u92d0\u92d7\u9296\u9291\u92d4\u92d7\u92d2\u92d1\u92d4\u92d1\u92d6\u92d3\u92d4\u9291\u92e0\u92e5\u92e4\u92e3\u92e4\u92e3\u92e2\u92a3\u92a0\u92e3\u92e4"), var3_4);
                        var6_9 = var3_4;
                    }
                    if (var6_9 == null) {
                        Class_12403.Field_12405.Method_6114(Class_12403.Method_12422("\u0124\u0102\u0108\u010e\u0102\u0104\u010c\u0104\u0102\u0104\u010c\u0102\u010a\u0100\u0100\u0100\u0100\u0128\u0120\u0106\u0100\u0104\u0108\u010a\u0102\u0100\u010c\u0108\u010a\u0106\u0100\u0104\u0100\u0104\u0104\u0102\u0100\u0106\u0106\u010e\u0100\u010a\u010c"), var2_2);
                        var6_9 = var2_2;
                    }
                }
                catch (Exception var7_12) {
                    if (var6_9 == null) {
                        Class_12403.Field_12405.Method_6114(Class_12403.Method_12418("\u4883\u4885\u4885\u4882\u4885\u48c2\u4880\u4881\u488c\u488a\u48c9\u488f\u488d\u488e\u488d\u488c\u48d6\u4897\u4894\u4892\u48d6\u48d2\u4894\u4897\u489d\u489f\u4898\u489c\u489d\u4899\u489c\u48d8\u48a7\u48a2\u48a0\u48a6\u48a7\u48a1\u48a3\u48e2\u48ee\u48ad\u48a9"), var2_2);
                        var6_9 = var2_2;
                    }
                    catch (Throwable var11_23) {
                        if (var6_9 != null) throw var11_23;
                        Class_12403.Field_12405.Method_6114(Class_12403.Method_12410("\u1280\u1281\u129a\u129b\u1294\u1295\u129e\u1297\u1288\u1299\u1292\u129b\u1294\u129d\u129e\u129f\u1290\u1299\u1282\u1283\u1284\u1295\u129e\u129f\u1298\u1299\u1292\u1293\u1294\u128d\u128e\u129f\u12b0\u12b1\u12b2\u12a3\u12b4\u12a5\u12a6\u12af\u12b8\u12a1\u12a2"), var2_2);
                        var6_9 = var2_2;
                        throw var11_23;
                    }
                }
            }
            Class_12403.Field_12406 = var5_7;
            Class_12403.Field_12407 = var6_9;
            var7_13 = Class_7799.Method_7840() != false ? 14536 & 1998 : 3745 & 4224;
            var8_17 = new File(Class_12403.Method_12414("\u4224\u4260\u4260\u4264\u4260\u4224\u4260\u4260\u4260\u4224\u4264\u4264\u4264\u4224\u4260\u4264\u4260\u4264\u4224\u4260\u4264\u4264\u4260\u4260\u4260\u4264\u4264\u4264"));
            if (var8_17.exists()) {
                var9_18 = null;
                try {
                    var9_18 = new BufferedReader(new FileReader(var8_17));
                    var7_13 = Integer.parseInt(var9_18.readLine());
                    if (Class_12403.Field_12405.Method_6131()) {
                        Class_12403.Field_12405.Method_6122(Class_12403.Method_12417("\u0810\u0814\u0852\u084a\u0810\u0814"), var8_17, var7_13);
                    }
                    ** if (var9_18 == null) goto lbl-1000
                }
                catch (Exception var10_21) {
                    try {
                        Class_12403.Field_12405.Method_6122(Class_12403.Method_12413("\udc00\udc00\udc02\udc02\udc00\udc00\udc02\udc12\udc08\udc08\udc0a\udc0a\udc18\udc08\udc1a\udc0a\udc00\udc00\udc12\udc02\udc00\udc00\udc02\udc02\udc08\udc18\udc0a\udc0a\udc18\udc08\udc1a\udc1a"), var8_17, var10_21);
                        ** if (var9_18 == null) goto lbl-1000
                    }
                    catch (Throwable var12_24) {
                        if (var9_18 == null) throw var12_24;
                        try {
                            var9_18.close();
                            throw var12_24;
                        }
                        catch (Exception var13_25) {
                            // empty catch block
                        }
                        throw var12_24;
                    }
lbl-1000: // 1 sources:
                    {
                        try {
                            var9_18.close();
                        }
                        catch (Exception var10_22) {}
                    }
lbl-1000: // 2 sources:
                    {
                        break block39;
                    }
                }
lbl-1000: // 1 sources:
                {
                    try {
                        var9_18.close();
                    }
                    catch (Exception var10_20) {}
                }
lbl-1000: // 2 sources:
                {
                    break block39;
                }
            }
            if (Class_12403.Field_12405.Method_6131()) {
                Class_12403.Field_12405.Method_6122(Class_12403.Method_12416("\u0000\u0006\u0002\b\u0004\u0002\f\u0004\f\f\u000e\f\u0002\u000e\f\u0006\u000e\u000e\u0006\f\u0006"), var8_17, var7_13);
            }
        }
        Class_12403.Field_12409 = var7_13;
    }

    private Class_12403() {
    }

    private static String Method_12419(String string) {
        int n = 28829;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12420(String string) {
        int n = 15598;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_12421() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_12422(String string) {
        int n = 25799;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12403.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

