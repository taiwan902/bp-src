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
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_38605
extends Class_36787 {
    private static final Map Field_38606;

    private int Method_38607(String string) {
        if (!Field_38606.containsKey(string)) {
            Object[] arrobject = new Object[5139 & 24581];
            arrobject[2330 & -27072] = string;
            throw new Class_30034("commands.generic.parameter.invalid", arrobject);
        }
        return (Integer)Field_38606.get(string);
    }

    private static String Method_38608(String string) {
        int n = 19326;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38609(String string) {
        int n = 17485;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38610(String string) {
        int n = 10481;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38611(String string) {
        int n = 3502;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_38612() {
        return "replaceitem";
    }

    private static String Method_38613(String string) {
        int n = 17908;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        int n;
        Field_38606 = Maps.newHashMap();
        for (n = 1036 & 12929; n < (-8138 & 6262); ++n) {
            Field_38606.put(Class_38605.Method_38629("\u0201\u0209\u0209\u0201\u020c\u0204\u020d\u020d\u0208\u0208\u0201\u0201\u020d\u020d\u0204") + n, n);
        }
        for (n = 4424 & 18464; n < (26125 & 6185); ++n) {
            Field_38606.put(Class_38605.Method_38615("0\"\"0d&&4 \"2b") + n, n);
        }
        for (n = 9280 & 21298; n < (-30433 & 9819); ++n) {
            Field_38606.put(Class_38605.Method_38616("\ub513\ub500\ub503\ub510\ub502\ub501\ub502\ub512\ub509\ub50a\ub518\ub50b\ub51a\ub519\ub50a") + n, (2793 & -32739) + n);
        }
        for (n = 24 & 10465; n < (12347 & -32161); ++n) {
            Field_38606.put(Class_38605.Method_38613("\u40d9\u40c0\u40c1\u40d8\u4084\u40cd\u40c4\u40cc\u40c1\u40d0\u40c1\u40c8\u40c5\u40d5\u40d4\u408c") + n, (-7992 & 200) + n);
        }
        for (n = 44 & 6225; n < (-24312 & 2091); ++n) {
            Field_38606.put(Class_38605.Method_38608("\u0810\u0808\u080a\u0812\u0848\u0810\u080a\u080a\u0808\u0800\u0802\u0802\u0810\u0848") + n, (-23699 & 1452) + n);
        }
        for (n = -18424 & 17600; n < (-30193 & 16655); ++n) {
            Field_38606.put(Class_38605.Method_38621("\u4100\u4112\u4110\u4102\u4111\u4112\u4110\u4100\u4100\u4113\u4111") + n, (503 & 1020) + n);
        }
        Field_38606.put(Class_38605.Method_38610("\u8025\u8032\u8033\u8020\u8034\u8025\u8035\u8031\u8026\u8031\u8032"), 8819 & -31385);
        Field_38606.put(Class_38605.Method_38618("\u0017\u0000\u0001\u0012\u0002\u0005\u0014\u0003\u0003\u0016\u0000\u0006\u0001\u0005\u0002"), 13031 & 359);
        Field_38606.put(Class_38605.Method_38617("\u3030\u3021\u3020\u3031\u3060\u3021\u3030\u3021\u3020\u3031\u3060\u3021\u3020\u3021\u3030\u3031"), 10342 & 16871);
        Field_38606.put(Class_38605.Method_38609("\u1242\u1255\u1254\u1247\u1217\u1250\u1241\u1256\u1256\u1243\u1215\u1257\u1254\u1256\u1240"), -5915 & 125);
        Field_38606.put(Class_38605.Method_38623("\u2808\u2804\u2804\u280c\u2841\u280d\u280d\u2801\u280c\u2800\u284d\u2804\u2800\u2801\u2801"), 1637 & 8556);
        Field_38606.put(Class_38605.Method_38611("\u023a\u0221\u0220\u023b\u0266\u0225\u0224\u023d\u023a\u0229\u0260\u0239\u022c\u022d\u022e\u0227\u0238"), -29804 & 400);
        Field_38606.put(Class_38605.Method_38626("\u08ad\u08b2\u08b1\u08aa\u08f4\u08b2\u08b5\u08a8\u08a5\u08b3\u08f8\u08b7\u08a0\u08bf\u08bd\u08a0"), 10681 & 913);
        Field_38606.put(Class_38605.Method_38620("\u0004\n\b\u0002\b\u000e\b\u0004\f\n\u0000\f\u0006\n\f\n"), 1019 & 2547);
    }

    protected String[] Method_38614() {
        return Class_2457.Method_2530().Method_2554();
    }

    private static String Method_38615(String string) {
        int n = 10273;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38616(String string) {
        int n = 14419;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38617(String string) {
        int n = 17542;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38618(String string) {
        int n = 21954;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_38619(Class_1367 class_1367) {
        return "commands.replaceitem.usage";
    }

    private static String Method_38620(String string) {
        int n = 24941;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38621(String string) {
        int n = 28699;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_38622(Class_1367 class_1367, String[] arrstring) {
        int n;
        Class_1956 class_1956;
        Object object;
        int n2;
        if (arrstring.length < (9249 & 16585)) {
            throw new Class_34974("commands.replaceitem.usage", new Object[-13312 & 4101]);
        }
        if (arrstring[66 & 288].equals("entity")) {
            n2 = 20808 & 1156;
        } else {
            if (!arrstring[16520 & -22512].equals("block")) {
                throw new Class_34974("commands.replaceitem.usage", new Object[21 & 2112]);
            }
            n2 = 833 & 4265;
        }
        if (n2 != 0) {
            if (arrstring.length < (8262 & -26233)) {
                throw new Class_34974("commands.replaceitem.block.usage", new Object[164 & 19545]);
            }
            n = 2444 & 4629;
        } else {
            if (arrstring.length < (8838 & 4101)) {
                throw new Class_34974("commands.replaceitem.entity.usage", new Object[9056 & -32750]);
            }
            n = 11834 & 16514;
        }
        int n3 = this.Method_38607(arrstring[n++]);
        try {
            class_1956 = Class_38605.\u0000strictfp((Class_1367)class_1367, (String)arrstring[n]);
        }
        catch (Class_30032 class_30032) {
            if (Class_3238.Method_3341(arrstring[n]) != Class_9265.Field_9351) {
                throw class_30032;
            }
            class_1956 = null;
        }
        int n4 = arrstring.length > ++n ? Class_38605.\u0000strictfp((String)arrstring[n++], (int)(24587 & 3073), (int)(-32691 & 11730)) : -28629 & 10389;
        int n5 = arrstring.length > n ? Class_38605.\u0000strictfp((String)arrstring[n++]) : 8500 & 17473;
        Class_23823 class_23823 = new Class_23823(class_1956, n4, n5);
        if (arrstring.length > n) {
            object = Class_38605.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)n).Method_1788();
            try {
                class_23823.Method_23869(Class_10981.Method_10996((String)object));
            }
            catch (Class_34310 class_34310) {
                Object[] arrobject = new Object[-28415 & 3209];
                arrobject[11267 & 48] = class_34310.getMessage();
                throw new Class_30034("commands.replaceitem.tagError", arrobject);
            }
        }
        if (class_23823.Method_23844() == null) {
            class_23823 = null;
        }
        if (n2 != 0) {
            class_1367.Method_1374(Class_26261.Field_26264, 1032 & 4);
            object = Class_38605.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(401 & -25085), (4100 & 8866) != 0);
            Class_283 class_283 = class_1367.Method_1375();
            Class_4879 class_4879 = class_283.Method_429((Class_4751)object);
            if (class_4879 == null || !(class_4879 instanceof Class_4961)) {
                Object[] arrobject = new Object[22715 & 1283];
                arrobject[-28464 & 8460] = object.\u0000= final();
                arrobject[22737 & 301] = object.\u0000, `();
                arrobject[8194 & 87] = object.\u0000strictfp();
                throw new Class_30034("commands.replaceitem.noContainer", arrobject);
            }
            Class_4961 class_4961 = (Class_4961)((Object)class_4879);
            if (n3 >= 0 && n3 < class_4961.Method_4968()) {
                class_4961.Method_4963(n3, class_23823);
            }
        } else {
            object = Class_38605.\u0000strictfp((Class_1367)class_1367, (String)arrstring[-16349 & 1281]);
            class_1367.Method_1374(Class_26261.Field_26264, 6657 & -23408);
            if (object instanceof Class_626) {
                ((Class_626)object).Field_681.Method_8322();
            }
            if (!((Class_1061)object).Method_1269(n3, class_23823)) {
                Object[] arrobject = new Object[18051 & 6211];
                arrobject[-32624 & 16640] = n3;
                arrobject[24133 & 129] = n4;
                arrobject[26626 & 275] = class_23823 == null ? "Air" : class_23823.Method_23900();
                throw new Class_30034("commands.replaceitem.failed", arrobject);
            }
            if (object instanceof Class_626) {
                ((Class_626)object).Field_681.Method_8322();
            }
        }
        class_1367.Method_1374(Class_26261.Field_26264, n4);
        Object[] arrobject = new Object[10259 & -12221];
        arrobject[0 & 17041] = n3;
        arrobject[8705 & 3553] = n4;
        arrobject[-6138 & 1035] = class_23823 == null ? "Air" : class_23823.Method_23900();
        Class_38605.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.replaceitem.success", (Object[])arrobject);
    }

    private static String Method_38623(String string) {
        int n = 4369;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_38624(String[] arrstring, int n) {
        return (arrstring.length > 0 && arrstring[-14080 & 4682].equals("entity") && n == (12933 & 3161) ? 73 & 17 : 17171 & 4100) != 0;
    }

    public List Method_38625(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        Object object;
        if (arrstring.length == (8261 & -26605)) {
            String[] arrstring2 = new String[4099 & 16474];
            arrstring2[-32188 & 258] = "entity";
            arrstring2[22803 & 705] = "block";
            object = Class_38605.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            object = arrstring.length == (8834 & 50) && arrstring[2051 & 1760].equals("entity") ? Class_38605.\u0000strictfp((String[])arrstring, (String[])this.Method_38614()) : (arrstring.length >= (-28526 & 25666) && arrstring.length <= (1669 & 2358) && arrstring[5128 & 2149].equals("block") ? Class_38605.\u0000strictfp((String[])arrstring, (int)(10773 & 201), (Class_4751)class_4751) : (!(arrstring.length == (-15737 & 8195) && arrstring[-7288 & 32].equals("entity") || arrstring.length == (16501 & 15367) && arrstring[17197 & 15362].equals("block")) ? (!(arrstring.length == (4 & 1287) && arrstring[6149 & 9472].equals("entity") || arrstring.length == (16750 & -32618) && arrstring[37 & 26704].equals("block")) ? null : Class_38605.\u0000strictfp((String[])arrstring, (Collection)Class_1956.Field_1961.\u0000strictfp())) : Class_38605.\u0000strictfp((String[])arrstring, Field_38606.keySet())));
        }
        return object;
    }

    private static String Method_38626(String string) {
        int n = 3367;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_38627() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_38628() {
        return -12221 & 2946;
    }

    private static String Method_38629(String string) {
        int n = 20857;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38605.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

