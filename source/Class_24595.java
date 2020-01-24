/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class Class_24595 {
    private Class_26095 Field_24596;
    private Class_38541 Field_24597 = Field_24601.next();
    public double Field_24598;
    public long Field_24599 = 8137052242705491713L & -8137052243279067104L;
    public LinkedHashMap Field_24600 = new LinkedHashMap();
    public static final Class_36973 Field_24601 = new Class_36973(-32727 & 5121, new ThreadFactoryBuilder().setNameFormat(Class_24595.Method_24639("\u202a\u2000\u2002\u2003\u2009\u2001\u2020\u2023\u2008\u2020\u2021\u200b\u200b\u2008\u200a")).setDaemon((22065 & -22515) != 0).build());
    private FileOutputStream Field_24602;
    public final String Field_24603;
    private long Field_24604 = 138412288L & 10649797L;
    private File Field_24605;
    private String Field_24606;
    public long Field_24607 = 1898563491049537601L & 8706L;
    public File Field_24608 = new File(Class_21077.Method_21078(), Class_24595.Method_24616("\u4061\u4061\u4047\u4026\u4071\u4071\u4072\u4027\u4023\u4025\u4072\u4022\u4064\u4075\u4051\u4077\u4065\u4067\u4043\u4057"));

    private static String Method_24609(String string) {
        int n = 1173;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24610(String string) {
        int n = 27150;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24611(String string) {
        int n = 17586;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_24612(String string, long l, byte[] arrby, Class_20457 class_20457) {
        this.Method_24620(string, l, arrby, class_20457);
    }

    private void Method_24613() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_24595.Method_24637("\u2540\u2542\u2550\u2542\u2544\u2544\u2556\u2544\u254a\u254a\u2558\u2548\u254e\u254e"));
    }

    private void Method_24614() {
        this.Method_24628();
    }

    private static String Method_24615(String string) {
        int n = 12075;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24616(String string) {
        int n = 27197;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24617(Class_39158 class_39158) {
        Class_24595.Method_24622(Class_24595.Method_24643("\u2808\u2800\u2802\u2802\u280a\u2808\u2808\u2800\u2800\u2800\u2808\u2800\u2800\u2808\u2808\u2808"));
        this.Field_24596 = null;
        this.Field_24606 = null;
        if (this.Field_24602 != null) {
            this.Field_24602.close();
        }
        if (this.Field_24605 != null) {
            this.Field_24605.delete();
        }
        this.Field_24607 = this.Field_24604;
        if (!this.Field_24600.isEmpty()) {
            Class_24595.Method_24622(Class_24595.Method_24634("\u088d\u08a8\u08ac\u08a0\u08a1\u08a1\u08a8\u08ac\u08a1\u08ac\u08a9\u08a0\u08e5\u08ac\u08a9\u08e5\u08fc\u08fd\u08bc\u08b8\u08bc\u08bc\u08f1\u08f1\u08f9"));
            this.Field_24597.schedule(this::Method_24644, 873463959L & 5609921388719661635L, TimeUnit.SECONDS);
        }
    }

    private static String Method_24618(String string) {
        int n = 13633;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24619(String string) {
        int n = 27583;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24620(String string, long l, byte[] arrby, Class_20457 class_20457) {
        File file;
        if (!this.Field_24597.inEventLoop()) {
            this.Field_24597.execute(() -> this.Method_24612(string, l, arrby, class_20457));
            return;
        }
        Class_24595.Method_24622(Class_24595.Method_24615("\u8003\u8023\u8022\u8022\u8020\u8020\u8022\u8021\u802b\u802b\u802b\u802b\u803a\u8028\u802a\u802b\u8021\u8022\u8022\u8023\u8031\u8022\u8032\u8023\u802a\u8038\u802b\u8039\u802b\u802b") + l + Class_24595.Method_24619("\u8188\u8189\u8182\u818a\u8188\u8180\u818b\u819b\u8180\u8188") + string);
        class_20457.Field_20458 = arrby;
        if (class_20457.Field_20458 == null) {
            byte[] arrby2 = new byte[1250 & 24637];
            arrby2[4128 & -14192] = -20 & -51;
            arrby2[9 & 26211] = 14419 & 1639;
            arrby2[-32242 & 6338] = -7 & -48;
            arrby2[399 & 17987] = 11991 & 4191;
            arrby2[-31844 & 12357] = 8310 & -25224;
            arrby2[-29515 & 4173] = 16505 & -27149;
            arrby2[-9850 & 534] = 4217 & -32391;
            arrby2[271 & -32761] = -128 & -64;
            arrby2[296 & 14408] = -25 & -25;
            arrby2[4107 & 73] = -33 & -49;
            arrby2[779 & 14] = -113 & -97;
            arrby2[1307 & 2063] = -79 & -15;
            arrby2[-4756 & 29] = -68 & -79;
            arrby2[17293 & 4111] = 14703 & 613;
            arrby2[16414 & 1359] = 12905 & 2282;
            arrby2[25359 & -32753] = -18 & -26;
            arrby2[-23532 & 2834] = -6 & -66;
            arrby2[-31207 & 26705] = -38 & -9;
            arrby2[178 & 2590] = -73 & -69;
            arrby2[3091 & 563] = -97 & -41;
            arrby2[8596 & -9708] = 62 & -17666;
            arrby2[4245 & -16107] = 3645 & -16163;
            arrby2[16406 & 4150] = -32529 & 5716;
            arrby2[16471 & 12695] = -33 & -11;
            arrby2[7194 & 8217] = -1 & -65;
            arrby2[-16293 & 2201] = 8478 & -32202;
            arrby2[12314 & 3295] = -3 & -57;
            arrby2[2331 & 8411] = -2 & -5;
            arrby2[4124 & 508] = 6228 & 599;
            arrby2[31 & 14621] = 501 & -30671;
            arrby2[-15842 & 222] = 9334 & -27676;
            arrby2[-32065 & 13407] = -3 & -93;
            class_20457.Field_20458 = arrby2;
        }
        if ((file = new File(new File(this.Field_24608, string.substring(256 & 1089, -29502 & 8474)), string.substring(18 & 8966))).exists()) {
            Class_24595.Method_24622(Class_24595.Method_24632("\u0502\u0505\u0500\u0501\u0500\u0505\u0500\u0501\u050f\u0508\u050f\u050d\u0508\u050b\u0508\u050d\u0507\u0507\u0505\u0502\u0507\u0500\u0506\u0506\u050a"));
            try {
                String string2 = Class_7749.Method_7754(file.toPath());
                if (string2.equals(string)) {
                    Class_24595.Method_24622(Class_24595.Method_24625("\u2200\u2208\u220a\u2202\u2205"));
                    class_20457.Method_20461(new Class_19123(file, class_20457.Field_20458));
                    return;
                }
                Class_24595.Method_24622(Class_24595.Method_24609("\u4042\u4041\u404a\u4049\u4042\u4043\u4048\u4009\u4040\u404b\u4048\u4041\u4002\u4003\u4040\u4041\u4042\u404b\u4048\u4041\u4040\u4049\u4002\u4003\u4008"));
                file.delete();
            }
            catch (IOException iOException) {
                file.delete();
                Class_24595.Method_24622(Class_24595.Method_24641("\u8c85\u8ca2\u8ca0\u8ca0\u8ca0") + iOException);
            }
        }
        Class_24595.Method_24622(Class_24595.Method_24647("\uc24e\uc24b\uc24b\uc246\uc241\uc248\uc20f\uc24b\uc248\uc207\uc243\uc248\uc240\uc249\uc24b\uc248\uc25e\uc25b\uc211\uc211\uc211\uc21f\uc25d\uc25a\uc251\uc258\uc255\uc252\uc217\uc256\uc253\uc253\uc205\uc20f") + this.Field_24600.size());
        boolean bl = this.Field_24600.isEmpty();
        if (!this.Field_24600.containsKey(string)) {
            ArrayList<Class_20457> arrayList = new ArrayList<Class_20457>();
            arrayList.add(class_20457);
            this.Field_24599 += l;
            this.Field_24600.put(string, arrayList);
        } else {
            ((ArrayList)this.Field_24600.get(string)).add(class_20457);
        }
        if (this.Field_24606 == null && bl) {
            if (this.Field_24596 == null) {
                Class_24595.Method_24622(Class_24595.Method_24626("\u001a\u0017\u0014\u0015\u0018\u001f\n\u0017\u001e\u0017R\u0007\u001aU\u0004\u0013\n\u000f\u001e\tRSP"));
                this.Method_24628();
            } else {
                this.Method_24646(this.Field_24596, string);
            }
        }
    }

    private static String Method_24621(String string) {
        int n = 31822;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_24622(String string) {
        byte[] arrby = (Class_24595.Method_24611("\u0302\u031e\u0310\u0314\u031c\u031c\u0316\u030e\u0316\u0314\u0316\u0318\u031c\u031c\u030a\u0304\u0308") + string).getBytes(StandardCharsets.UTF_8);
        int n = 289 & 4230;
        while (n < arrby.length) {
            byte[] arrby2 = arrby;
            int n2 = n++;
            arrby2[n2] = (byte)(arrby2[n2] ^ 27377 & 243);
        }
        System.out.println(Base64.getEncoder().encodeToString(arrby));
    }

    public void Method_24623(Class_39158 class_39158, Throwable throwable) {
        Class_24595.Method_24622(Class_24595.Method_24610("\u0000\u0004\u0007\u0003\u0001@\u0006\u0002\u0004\u0000\u0002F\u0005\u0005\u0006\u0006\u0001\u0001\u0006\u0002\u0000\u0004\u0006B\u0001\u0005\u0003\u0003A@") + throwable.toString().replace(Class_24595.Method_24631("\u044c\u0448\u044e\u044a\u0448\u0448\u040c\u0400\u044a\u0444\u044a\u0440\u0444\u0442\u0448\u044e\u0448\u044a\u0440\u0404\u044c\u0440"), ""));
        for (ArrayList arrayList : this.Field_24600.values()) {
            for (Class_20457 class_20457 : arrayList) {
                class_20457.Method_20460(throwable);
            }
        }
        class_39158.Method_39178();
        if (!(throwable instanceof Class_37378)) {
            System.out.println(throwable.toString().replace(Class_24595.Method_24645("\u2890\u2895\u2880\u2885\u2890\u2881\u2894\u2881\u2884\u2881\u2884\u2895\u2884\u2881\u2880\u2895\u2884\u2885\u2884\u2881\u2894\u2881"), ""));
        }
        if (this.Field_24596 == null && !this.Field_24600.isEmpty()) {
            Class_24595.Method_24622(Class_24595.Method_24653("\u0127\u0100\u0106\u0102\u0103\u0103\u0100\u0106\u0109\u010c\u010b\u010a\u010d\u010c\u010b\u010d\u0116\u0115\u0116\u0110\u0116\u0116\u0115\u0114\u011b\u0119\u0118\u011f\u011d\u011e\u011c\u0118\u0122\u0125\u0121\u0125\u0120\u0125\u0126\u0120\u012d\u0129\u012c\u012a\u012b\u012b\u012b\u012b"));
            this.Field_24597.schedule(this::Method_24614, -5087470033090378205L & 5087470031785173251L, TimeUnit.SECONDS);
        }
    }

    private static String Method_24624(String string) {
        int n = 31566;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24625(String string) {
        int n = 21244;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24626(String string) {
        int n = 22447;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24627(Class_39158 class_39158) {
        this.Field_24596 = class_39158.Method_39175();
        this.Field_24597 = this.Field_24596.Method_26113();
        Class_24595.Method_24622(Class_24595.Method_24636("\u302a\u3003\u3000\u3001\u300c\u300f\u301e\u300f\u3000\u3001"));
        if (!this.Field_24600.isEmpty()) {
            this.Method_24646(class_39158.Method_39175(), (String)this.Field_24600.keySet().iterator().next());
            for (ArrayList arrayList : this.Field_24600.values()) {
                for (Class_20457 class_20457 : arrayList) {
                    class_20457.Method_20462();
                }
            }
        }
    }

    public void Method_24628() {
        String string = this.Field_24603;
        new Class_15266(this, string).start();
    }

    private static String Method_24629(String string) {
        int n = 26199;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24630(String string) {
        int n = 8033;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24631(String string) {
        int n = 31428;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24632(String string) {
        int n = 19132;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static void Method_24633(String string) {
        Class_24595.Method_24622(string);
    }

    private static String Method_24634(String string) {
        int n = 6340;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24635(Class_26458 class_26458, byte[] arrby, Class_20457 class_20457) {
        this.Method_24620(class_26458.Field_26460, class_26458.Field_26459, arrby, class_20457);
    }

    private static String Method_24636(String string) {
        int n = 26302;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24637(String string) {
        int n = 14538;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_24595(String string) {
        this.Field_24608.mkdirs();
        this.Field_24603 = string;
    }

    private static String Method_24638(String string) {
        int n = 315;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24639(String string) {
        int n = 11657;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24640(String string) {
        int n = 24153;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24641(String string) {
        int n = 3148;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24642(String string) {
        int n = 4625;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24643(String string) {
        int n = 32595;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_24644() {
        this.Method_24628();
    }

    private static String Method_24645(String string) {
        int n = 16332;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_24646(Class_26095 class_26095, String string) {
        Class_24595.Method_24622(Class_24595.Method_24640("\uc824\uc813\uc813\uc810\uc812\uc814\uc816\uc810\uc805\uc813\uc804\uc801\uc816\uc801\uc805\uc810\uc803\uc811\uc815\uc810\uc814\uc805\uc817\uc814\uc810\uc817\uc811\uc814") + string);
        Class_47937 class_47937 = new Class_47937(Class_18300.Field_18305, Class_16725.Field_16730, Class_24595.Method_24642("\ub098\ub0d2\ub0c0\ub0c0\ub0d6\ub0c7\ub0c4\ub09c") + string.substring(-12285 & 0, 162 & 11338) + Class_24595.Method_24621("\u0600") + string.substring(2050 & 50) + Class_24595.Method_24618("\u6208\u6209\u6201\u6201"));
        Class_17103.Method_17147(class_47937, (16641 & 681) != 0);
        Class_17103.Method_17151(class_47937, Class_24595.Method_24624("\u5844\u5840\u5856\u5852\u5844\u5854\u5800\u581c\u5852\u585c\u5852\u5848\u5858\u585e\u5854\u5842\u5850\u5852\u5858\u581c\u5840\u585c"));
        Class_17103.Method_17134(class_47937, Class_24595.Method_24638("\u055c\u0559\u054e\u055a\u0504\u0549\u054e\u054f\u0545\u055c"), Class_24595.Method_24648("\u7682\u7684\u7683\u7690\u7681\u7686\u7685\u7692\u7689\u768b\u7689"));
        class_26095.Method_26096(class_47937);
        this.Field_24606 = string;
    }

    private static String Method_24647(String string) {
        int n = 22950;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24648(String string) {
        int n = 12855;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24649(String string) {
        int n = 6981;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_38541 Method_24650(Class_24595 class_24595, Class_38541 class_38541) {
        class_24595.Field_24597 = class_38541;
        return class_24595.Field_24597;
    }

    private static String Method_24651(String string) {
        int n = 3809;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_24652(Class_39158 class_39158, Object object) {
        Object object2;
        Object object3;
        if (object instanceof Class_39148) {
            object3 = (Class_39148)object;
            int n = ((Class_39148)object3).Method_39150().Method_7129();
            if (n != (-32277 & 12504)) {
                for (Iterator iterator : (ArrayList)this.Field_24600.remove(this.Field_24606)) {
                    ((Class_20457)((Object)iterator)).Method_20464(n);
                }
            } else {
                object2 = new File(this.Field_24608, this.Field_24606.substring(4384 & -29172, -15733 & 1106));
                ((File)object2).mkdirs();
                this.Field_24605 = new File((File)object2, this.Field_24606.substring(25858 & 4739));
                this.Field_24602 = new FileOutputStream(this.Field_24605);
                for (Class_20457 class_20457 : (ArrayList)this.Field_24600.get(this.Field_24606)) {
                    class_20457.Method_20459();
                }
            }
        }
        if (object instanceof Class_45052) {
            object3 = (Class_45052)object;
            Class_22553 class_22553 = ((Class_45052)object3).Method_45055();
            int n = class_22553.Method_22564();
            class_22553.Method_22597(this.Field_24602, n);
            this.Field_24607 += (long)n;
            if (this.Field_24599 > (8405460L & 324044288L)) {
                this.Field_24598 = (double)this.Field_24607 * (45.238095238095234 * 2.210526315789474) / (double)this.Field_24599;
            }
            for (Class_20457 class_20457 : (ArrayList)this.Field_24600.get(this.Field_24606)) {
                class_20457.Method_20465(this.Field_24607 - this.Field_24604);
            }
        }
        if (object instanceof Class_44416) {
            Class_24595.Method_24622(Class_24595.Method_24649("\u764b\u7660\u7663\u766a\u762d\u766d\u7664\u767c\u7663\u7661\u7660\u766a\u766d\u766c\u766f\u762e\u7629\u764a\u7663\u766a\u766e\u7666\u7666\u7665\u766a\u7623\u7621\u7621"));
            if (this.Field_24602 != null) {
                this.Field_24602.close();
                this.Field_24602 = null;
            }
            this.Field_24604 = this.Field_24607;
            object3 = this.Field_24606;
            File file = this.Field_24605;
            this.Field_24606 = null;
            this.Field_24605 = null;
            object2 = Class_7749.Method_7754(file.toPath());
            if (!((String)object2).equals(object3)) {
                Class_24595.Method_24622(Class_24595.Method_24651("\u8800\u8825\u8824\u8821\u8820\u8821\u8864\u8865\u8804\u8821\u8820\u8825\u8820\u8825\u8820\u8865\u8834\u8835\u8834\u8835"));
                file.delete();
                for (Class_20457 class_20457 : (ArrayList)this.Field_24600.remove(object3)) {
                    class_20457.Method_20464(-1 & -1);
                }
            } else {
                Class_24595.Method_24622(Class_24595.Method_24629("\u6005\u600c\u600f\u6006\u6004"));
                for (Class_20457 class_20457 : (ArrayList)this.Field_24600.remove(object3)) {
                    class_20457.Method_20461(new Class_19123(file, class_20457.Field_20458));
                }
            }
            if (!this.Field_24600.isEmpty()) {
                this.Method_24646(class_39158.Method_39175(), (String)this.Field_24600.keySet().iterator().next());
            } else {
                Class_24595.Method_24622(Class_24595.Method_24630("\u9091\u9090\u9090\u9090\u9090\u9091\u9090\u9091\u9081\u9090\u9090\u9091\u9081\u9090\u9090\u9091\u9081\u9080\u9081\u9080\u9081"));
                this.Field_24607 = this.Field_24604 = -2051830076880976823L & 2051830075241861894L;
                this.Field_24599 = this.Field_24604;
            }
        }
    }

    private static String Method_24653(String string) {
        int n = 3749;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24595.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

