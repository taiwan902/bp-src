/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import javax.net.ssl.SSLEngine;

public class Class_47033
extends Class_43984 {
    private final Class_19025 Field_47034;
    private static long Field_47035 = 1916859424208588822L & -1916859426191318264L;
    private static Class_38541 Field_47036;
    private static Class_47033 Field_47037;
    private static LinkedList Field_47038;
    private Class_1782 Field_47039;
    private boolean Field_47040;
    public Class_26095 Field_47041;
    public static Throwable Field_47042;
    private int Field_47043;
    public boolean Field_47044 = 2060 & 21057;
    private static long Field_47045;

    private static String Method_47046(String string) {
        int n = 25577;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47047(Class_39158 class_39158) {
        this.Method_47051(new Class_2840(Class_47033.Method_47065("\uc8a0\uc881\uc880\uc881\uc880\uc881\uc880\uc881\uc880\uc881\uc880\uc881")));
        this.Field_47044 = 16388 & 10513;
    }

    static {
        Field_47038 = new LinkedList();
        Field_47045 = 4455327444968144934L & -4455327445103524720L;
    }

    private static String Method_47048(String string) {
        int n = 18156;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47049(String string) {
        int n = 855;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47050(Class_39158 class_39158) {
        super.channelActive(class_39158);
        if (Field_47042 != null) {
            this.Method_47064(Field_47042);
            Field_47042 = null;
        }
        this.Method_47057(Class_16620.Method_16632(Class_27123.Field_27125));
        this.Field_47041.Method_26106().Method_6286(Class_47033.Method_47049("\u0c01\u0c00\u0c04"), new Class_47372(Class_16183.Method_16189()));
        this.Method_47057(Class_27123.Method_27126(Class_16620.Method_16633().Method_22586(ByteOrder.BIG_ENDIAN)));
        this.Field_47041.Method_26106().Method_6290(Class_47033.Method_47072("\u4c0e\u4c0c\u4c00\u4c0a\u4c06\u4c0e\u4c0e\u4c00\u4c0e\u4c06\u4c0c\u4c06\u4c0e\u4c00\u4c04\u4c08\u4c14\u4c1e\u4c18\u4c10"), Class_47033.Method_47069("\u1040\u1043\u1050\u1041\u1050\u1053\u1050\u1053\u1052\u1051\u1052\u1053\u1002\u1051\u1050\u1041\u1050\u1011\u1042\u1011"), new Class_45604(2222 & 795)).Method_6290(Class_47033.Method_47054("\u6004\u6006\u6002\u6000\u6000\u6000\u6000\u6006\u6004\u6004\u6006\u6004\u6000\u6006\u6002\u6006\u6006\u6004\u6002\u6002"), Class_47033.Method_47063("\u4000\u4003\u4001\u4001\u4000\u4002\u4002\u4002\u4008\u400b\u400b\u4008\u4009\u4008\u4009\u4008\u4000\u4001\u4000\u4003"), new Class_47088()).Method_6290(Class_47033.Method_47078("\ua684\ua685\ua682\ua683\ua680\ua681\ua682\ua687\ua68c\ua68d\ua68e\ua68f\ua688\ua68d\ua68a\ua68f\ua684\ua685\ua682\ua683"), Class_47033.Method_47077("\u0601\u0604\u0605\u0600\u0601\u0600\u0604\u0604\u060c\u060d\u0608\u064d\u0609\u060c\u064d\u0608\u0605\u0604\u0604\u0604"), new Class_42777(Class_31224.Field_31227)).Method_6290(Class_47033.Method_47058("\u008c\u009f\u008b\u0094\u009d\u008e\u0081\u0094\u008d\u0084\u008f\u0094\u008b\u008c\u0081\u0086\u008d\u0088\u0091"), Class_47033.Method_47046("\u0442\u0400\u0402\u0400\u0444\u0404\u0404\u0406\u0408\u0408\u0408\u040a\u040e\u040c\u040e\u040e\u0402\u0400\u0400\u0400"), new Class_43510()).Method_6290(Class_47033.Method_47076("\u1201\u1203\u120d\u1206\u120d\u1204\u1206\u1208\u1209\u1201\u1209\u1203\u120d\u1202\u1204\u1208\u121b\u1210\u1214\u121d"), Class_47033.Method_47070("\u2300\u2301\u2302\u230b\u2304\u232d\u232e\u2327\u2328\u2309\u230a\u232b\u2304\u2325\u2306\u232f\u2308\u2329\u232a\u2303"), new Class_40492(Class_31224.Field_31225));
        this.Field_47041.Method_26110().Method_19096((5003 & -22527) != 0);
        Field_47037 = this;
        this.Field_47034.Method_19037();
    }

    public void Method_47051(Class_1782 class_1782) {
        if (this.Field_47040) {
            return;
        }
        this.Field_47040 = 1287 & 2161;
        if (this.Method_47082()) {
            this.Field_47041.Method_26111().Method_27588();
        }
        this.Field_47039 = class_1782;
        this.Field_47034.Method_19035(this.Field_47039);
    }

    protected void Method_47052(Class_39158 class_39158, Class_1486 class_1486) {
        if (this.Field_47041.Method_26114()) {
            this.Field_47043 = 8194 & 592;
            try {
                class_1486.Method_1489(this.Field_47034);
            }
            catch (Class_48002 class_48002) {
                // empty catch block
            }
        }
    }

    private static String Method_47053(String string) {
        int n = 23893;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47054(String string) {
        int n = 10335;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47055(String string) {
        int n = 1778;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47056(String string) {
        int n = 16742;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_47057(Class_22553 class_22553) {
        this.Field_47041.Method_26096(class_22553).Method_27583(Class_21832.Field_21833);
    }

    private static String Method_47058(String string) {
        int n = 5769;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_47059(Class_1486 class_1486) {
        if (Field_47036 == null) {
            Field_47036 = Class_44584.Field_44597.next();
        }
        if (!Field_47036.inEventLoop()) {
            Field_47036.execute(() -> Class_47033.Method_47066(class_1486));
            return;
        }
        if (Field_47037 == null) {
            if (class_1486 != null) {
                Field_47038.add(class_1486);
            }
            return;
        }
        while (Class_47033.Field_47037.Field_47044 && !Field_47038.isEmpty()) {
            Field_47037.Method_47080((Class_1486)Field_47038.removeFirst());
        }
        if (class_1486 != null) {
            Field_47037.Method_47080(class_1486);
        }
        Class_47033.Field_47037.Field_47041.Method_26098();
    }

    public static void Method_47060() {
        long l = System.currentTimeMillis();
        if (l - Field_47045 < (-2566947283991496718L & 2566947283704090584L)) {
            return;
        }
        Field_47045 = l;
        for (Class_1486 class_1486 : Field_47038) {
            if (!(class_1486 instanceof Class_20760) || l - ((Class_20760)class_1486).Field_20763 <= (7288876861077157297L & 1098939768L) || Class_18.Field_89.Method_251() || Class_18.Field_89.Field_72 == null) continue;
            new Class_30877(new RuntimeException(Class_47033.Method_47081("\u8821\u8828\u882c\u8820\u8820\u8820\u8829\u8821\u8824\u882c\u8828\u882c\u8825\u882c\u882d\u8829\u8838\u883c\u8831\u8835\u8831\u883d\u8839\u8831\u8834\u8830\u883d\u8838\u8838\u8834\u883c\u8831\u8829\u8824\u8825\u8820\u882c\u8828\u8825\u8821\u8820\u882c\u8828\u882c\u8829\u8825\u882d\u8825\u8830\u8830\u8839\u883c\u883c\u8830\u8835\u883d\u883c\u883c\u8830\u8839\u8839\u8830\u883d\u8839\u8828\u8821\u8824\u8824\u882c\u8825\u8820\u8828\u882c\u8828\u8825\u8820")));
        }
    }

    private void Method_47061(Class_1486 class_1486) {
        this.Method_47080(class_1486);
    }

    private static String Method_47062(String string) {
        int n = 1653;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47063(String string) {
        int n = 22802;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47064(Throwable throwable) {
        byte[] arrby = Class_47033.Method_47067(throwable);
        this.Method_47057(Class_16620.Method_16627(arrby.length + (-28505 & 2581)).Method_22586(ByteOrder.BIG_ENDIAN).Method_22606(1115 & 22843).Method_22565(arrby.length).Method_22610(arrby));
    }

    private static String Method_47065(String string) {
        int n = 1408;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_47066(Class_1486 class_1486) {
        Class_47033.Method_47059(class_1486);
    }

    public static byte[] Method_47067(Throwable throwable) {
        int n;
        Object[] arrobject;
        StringBuilder stringBuilder = new StringBuilder();
        while (throwable != null) {
            stringBuilder.append(throwable.getClass().getName()).append(Class_47033.Method_47048("\u300a\u3000")).append(throwable.getLocalizedMessage()).append(Class_47033.Method_47056("\ue400\ue401\ue402")).append(throwable.getMessage()).append((char)(-32757 & 1674));
            arrobject = throwable.getStackTrace();
            n = arrobject.length;
            for (int i = 4541 & -31744; i < n; ++i) {
                byte by = arrobject[i];
                stringBuilder.append((char)(-7927 & 521)).append((Object)by).append((char)(1579 & 14686));
            }
            if ((throwable = throwable.getCause()) == null) continue;
            stringBuilder.append(Class_47033.Method_47071("\u0001\u0002\u0003\u0000\u0003\u0003\u0002\u0001\u0003\u0001\n"));
        }
        arrobject = stringBuilder.toString().getBytes(StandardCharsets.UTF_8);
        for (n = 6372 & 16400; n < arrobject.length; ++n) {
            byte[] arrby = arrobject;
            int n2 = n;
            arrby[n2] = (byte)(arrby[n2] ^ ((n & (6169 & 16387)) != 0 ? 497 & 16633 : 1198 & 654));
        }
        return arrobject;
    }

    private void Method_47068() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_47033.Method_47055("\u4045\u4040\u4054\u4041\u4040\u4044\u4054\u4044\u404c\u404c\u4058\u4048\u404d\u404c"));
    }

    private static String Method_47069(String string) {
        int n = 2454;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47070(String string) {
        int n = 14472;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_47033(Class_19025 class_19025, Class_26095 class_26095) {
        this.Field_47034 = class_19025;
        class_19025.Field_19033 = this;
        this.Field_47041 = class_26095;
        Field_47036 = class_26095.Method_26113();
    }

    private static String Method_47071(String string) {
        int n = 11691;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47072(String string) {
        int n = 10430;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_47073(Class_19025 class_19025) {
        Field_47035 = System.currentTimeMillis();
        new Class_6262(class_19025).start();
    }

    public void Method_47074(Class_39158 class_39158, Throwable throwable) {
        try {
            Class_2849 class_2849;
            Field_47042 = throwable;
            if (throwable instanceof Class_37378 || throwable instanceof Class_12190) {
                class_2849 = new Class_2849(Class_47033.Method_47062("\u28f3\u28f6\u28e6\u28f6\u28f4\u28f5\u28f7\u28f4\u28f4\u28e3\u28b3\u28e1\u28f2\u28f6\u28f4\u28f6\u28e2\u28e3"), new Object[4363 & 9220]);
            } else {
                Object[] arrobject = new Object[875 & -15231];
                arrobject[2196 & -24544] = Class_47033.Method_47075("MHRCPLCN\u0004A^GEPVKYX\u000e\u0016") + throwable;
                class_2849 = new Class_2849(Class_47033.Method_47053("\u0200\u020c\u0204\u0204\u020a\u020a\u0208\u0202\u020e\u0208\u0240\u0208\u0208\u0202\u020a\u020c\u020c\u0206\u0204\u0202\u0204\u0206\u0208\u0208"), arrobject);
            }
            this.Method_47051(class_2849);
        }
        catch (Throwable throwable2) {
            throwable2.printStackTrace();
        }
    }

    private static String Method_47075(String string) {
        int n = 22986;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47076(String string) {
        int n = 14040;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47077(String string) {
        int n = 1824;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47078(String string) {
        int n = 13023;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_47079(Class_39158 class_39158, Object object) {
        this.Method_47052(class_39158, (Class_1486)object);
    }

    public void Method_47080(Class_1486 class_1486) {
        if (!this.Method_47082()) {
            return;
        }
        if (this.Field_47041.Method_26113().inEventLoop()) {
            this.Field_47041.Method_26106().Method_6280(class_1486).Method_27583(Class_21832.Field_21833);
        } else {
            this.Field_47041.Method_26113().execute(() -> this.Method_47061(class_1486));
        }
    }

    private static String Method_47081(String string) {
        int n = 18256;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47033.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_47082() {
        return (this.Field_47041 != null && this.Field_47041.Method_26114() ? 17621 & -28151 : -12096 & 1588) != 0;
    }
}

