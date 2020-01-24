/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Proxy;
import java.security.KeyPair;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_3013
extends Class_2457 {
    private Class_34325 Field_3014;
    private boolean Field_3015;
    private static final Logger Field_3016 = LogManager.getLogger();
    private final Class_18 Field_3017;
    private boolean Field_3018;
    private final Class_9780 Field_3019;

    public boolean Method_3020() {
        return (5 & 1841) != 0;
    }

    public boolean Method_3021() {
        return (-28415 & 8713) != 0;
    }

    protected void Method_3022(Class_13268 class_13268) {
        this.Field_3017.Method_232(class_13268);
    }

    private static String Method_3023(String string) {
        int n = 24256;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3013.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3013(Class_18 class_18) {
        super(class_18.Method_236(), new File(class_18.Field_68, \u0000strictfp.getName()));
        this.Field_3017 = class_18;
        this.Field_3019 = null;
        Class_3013.Method_3031();
    }

    protected boolean Method_3024() {
        Field_3016.info("Starting integrated minecraft server version 1.8.8");
        this.\u0000%((-15343 & 10509) != 0);
        this.\u0000= final((24577 & 1565) != 0);
        this.\u0000strictfp((-32063 & 7441) != 0);
        this.\u0000
        ((6665 & 387) != 0);
        this.\u0000= int((13441 & -14297) != 0);
        Field_3016.info("Generating keypair");
        this.\u0000strictfp(Class_31852.Method_31856());
        this.Method_3026(this.\u0000, #(), this.\u0000%(), this.Field_3019.Method_9791(), this.Field_3019.Method_9792(), this.Field_3019.Method_9799());
        this.\u0000%(this.\u0000, 2() + " - " + this.\u0000strictfp[-32688 & 524].\u0000strictfp().Method_31831());
        return (18593 & 8195) != 0;
    }

    public void Method_3025(Class_26801 class_26801) {
        super.Method_2576(class_26801);
        if (this.Field_3017.Field_72 != null) {
            this.Field_3017.Field_72.\u0000strictfp().Method_31801(class_26801);
        }
    }

    protected void Method_3026(String string, String string2, long l, Class_43755 class_43755, String string3) {
        this.\u0000, for(string);
        Class_26655 class_26655 = this.\u0000strictfp().Method_2048(string, (-18415 & 291) != 0);
        Class_31717 class_31717 = class_26655.Method_26657();
        this.\u0000strictfp = new Class_2651[8971 & 131];
        this.\u0000strictfp = new long[this.\u0000strictfp.length][-30108 & 108];
        this.\u0000strictfp(this.\u0000, #(), class_26655);
        if (class_31717 == null) {
            class_31717 = new Class_31717(this.Field_3019, string2);
        } else {
            class_31717.Method_31776(string2);
        }
        for (int i = 651 & 20496; i < this.\u0000strictfp.length; ++i) {
            int n = -32250 & 1105;
            if (i == (649 & 23)) {
                n = -1 & -1;
            }
            if (i == (-32442 & 18986)) {
                n = 20617 & 2339;
            }
            if (i == 0) {
                this.\u0000strictfp[i] = this.\u0000
                () ? (Class_2651)new Class_29849(this, class_26655, class_31717, n, this.\u0000strictfp).\u0000strictfp() : (Class_2651)new Class_33538(this, class_26655, class_31717, n, this.\u0000strictfp).\u0000strictfp();
                this.\u0000strictfp[i].Method_2682(this.Field_3019);
            } else {
                this.\u0000strictfp[i] = (Class_2651)new Class_29684(this, class_26655, n, this.\u0000strictfp[6690 & 8257], this.\u0000strictfp).Method_29686();
            }
            this.\u0000strictfp[i].\u0000strictfp((Class_2638)new Class_31896(this, this.\u0000strictfp[i]));
        }
        this.\u0000strictfp().Method_3106(this.\u0000strictfp);
        if (this.\u0000strictfp[-31736 & 67].\u0000strictfp().Method_31800() == null) {
            this.Method_3025(this.Field_3017.Field_84.Field_39775);
        }
        this.\u0000%();
    }

    public Class_35650 Method_3027() {
        return this.Field_3019.Method_9797();
    }

    public File Method_3028() {
        return this.Field_3017.Field_68;
    }

    public boolean Method_3029() {
        return this.Field_3015;
    }

    public int Method_3030() {
        return -24444 & 20519;
    }

    static void Method_3031() {
        try {
            Class[] arrclass = new Class[10949 & 16641];
            arrclass[16786 & 7264] = String.class;
            Method method = ClassLoader.class.getDeclaredMethod(Class_3013.Method_3023("\u0824\u0820\u0824\u0824\u0804\u0824\u0820\u0824\u0824\u0824\u0800\u0824\u0820\u0820\u0820"), arrclass);
            method.setAccessible((20533 & 131) != 0);
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Object[] arrobject = new Object[8497 & -11255];
            arrobject[3201 & 32] = Class_3013.Method_3037("\u0b08\u0b0a\u0b00\u0b00\u0b06\u0b04\u0b0c\u0b0e\u0b00\u0b02\u0b0a\u0b02\u0b0c\u0b06\u0b0c\u0b0e\u0b10\u0b18\u0b1a\u0b18\u0b1e\u0b16\u0b1e\u0b14\u0b12\u0b12\u0b12\u0b1a\u0b1c\u0b1c\u0b1e\u0b1e\u0b2a\u0b22");
            Object object = method.invoke(classLoader, arrobject);
            if (object != null) {
                Class_18.Field_89.Field_129 = null;
                Class_18.Field_89.Field_27 = null;
                Class_18.Field_89.Field_120 = null;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public boolean Method_3032() {
        return this.Field_3019.Method_9793();
    }

    public String Method_3033(Class_35650 class_35650, boolean bl) {
        try {
            int n = -1 & -1;
            try {
                n = Class_32476.Method_32484();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n <= 0) {
                n = -4130 & 29660;
            }
            this.\u0000strictfp().Method_15018(null, n);
            Field_3016.info("Started on " + n);
            this.Field_3015 = -30445 & 24677;
            this.Field_3014 = new Class_34325(this.\u0000= final(), n + "");
            this.Field_3014.start();
            this.\u0000strictfp().Method_3132(class_35650);
            this.\u0000strictfp().Method_3127(bl);
            return n + "";
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public Class_13268 Method_3034(Class_13268 class_13268) {
        class_13268 = super.Method_2612(class_13268);
        class_13268.Method_13281().Method_13232("Type", new Class_41371(this));
        class_13268.Method_13281().Method_13232("Is Modded", new Class_15173(this));
        return class_13268;
    }

    public void Method_3035() {
        this.\u0000= final();
    }

    private void Method_3036() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3013(Class_18 class_18, String string, String string2, Class_9780 class_9780) {
        super(new File(class_18.Field_68, "saves"), class_18.Method_236(), new File(class_18.Field_68, \u0000strictfp.getName()));
        this.\u0000= int(class_18.Method_265().Method_2116());
        this.\u0000= final(string);
        this.\u0000strictfp(string2);
        this.\u0000, for(class_18.Method_183());
        this.\u0000= switch(class_9780.Method_9801());
        this.\u0000, `(-7936 & 962);
        this.\u0000strictfp((Class_3069)new Class_3158(this));
        this.Field_3017 = class_18;
        this.Field_3019 = this.\u0000
        () ? Class_29849.Field_29850 : class_9780;
    }

    private static String Method_3037(String string) {
        int n = 16398;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3013.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_3038() {
        return (34 & 128) != 0;
    }

    public void Method_3039() {
        Futures.getUnchecked((Future)this.\u0000strictfp((Runnable)new Class_6731(this)));
        super.Method_2520();
        if (this.Field_3014 != null) {
            this.Field_3014.Method_34337();
            this.Field_3014 = null;
        }
    }

    public void Method_3040(Class_2423 class_2423) {
        super.Method_2543(class_2423);
        class_2423.Method_2434("snooper_partner", this.Field_3017.Method_190().Method_2440());
    }

    public void Method_3041(Class_35650 class_35650) {
        this.\u0000strictfp().Method_3132(class_35650);
    }

    public boolean Method_3042() {
        return Class_18.Field_89.Method_215();
    }

    public boolean Method_3043() {
        return (-32639 & 18497) != 0;
    }

    protected Class_3049 Method_3044() {
        return new Class_3067();
    }

    public void Method_3045() {
        super.Method_2532();
        if (this.Field_3014 != null) {
            this.Field_3014.Method_34337();
            this.Field_3014 = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_3046() {
        boolean bl = this.Field_3018;
        this.Field_3018 = Class_18.Field_89.Method_271() != null && Class_18.Field_89.Method_169() ? 16385 & 4105 : 5696 & -14328;
        int n = this.Field_3018 ? 1 : 0;
        if (!bl && this.Field_3018) {
            Field_3016.info("Saving and pausing game...");
            this.\u0000strictfp().Method_3095();
            this.\u0000, `((-31103 & 92) != 0);
        }
        if (this.Field_3018) {
            Queue queue = this.\u0000strictfp;
            Queue queue2 = this.\u0000strictfp;
            synchronized (queue2) {
                while (!this.\u0000strictfp.isEmpty()) {
                    Class_2090.Method_2093((FutureTask)this.\u0000strictfp.poll(), Field_3016);
                }
            }
        } else {
            super.Method_2578();
            if (this.Field_3017.Field_84.Field_39801 != this.\u0000strictfp().Method_3151()) {
                Object[] arrobject = new Object[682 & 11270];
                arrobject[25601 & 2048] = this.Field_3017.Field_84.Field_39801;
                arrobject[8969 & 1205] = this.\u0000strictfp().Method_3151();
                Field_3016.info("Changing view distance to {}, from {}", arrobject);
                this.\u0000strictfp().Method_3145(this.Field_3017.Field_84.Field_39801);
            }
            if (this.Field_3017.Field_72 != null) {
                Class_31717 class_31717 = this.\u0000strictfp[256 & 517].\u0000strictfp();
                Class_31717 class_317172 = this.Field_3017.Field_72.\u0000strictfp();
                if (!class_31717.Method_31791() && class_317172.Method_31800() != class_31717.Method_31800()) {
                    Object[] arrobject = new Object[8450 & 4107];
                    arrobject[-26551 & 1664] = class_317172.Method_31800();
                    arrobject[-16343 & 9749] = class_31717.Method_31800();
                    Field_3016.info("Changing difficulty to {}, from {}", arrobject);
                    this.Method_3025(class_317172.Method_31800());
                } else if (class_317172.Method_31791() && !class_31717.Method_31791()) {
                    Object[] arrobject = new Object[4161 & 19515];
                    arrobject[256 & -20408] = class_317172.Method_31800();
                    Field_3016.info("Locking difficulty to {}", arrobject);
                    Class_2651[] arrclass_2651 = this.\u0000strictfp;
                    int n2 = arrclass_2651.length;
                    for (int i = 18724 & 12353; i < n2; ++i) {
                        Class_2651 class_2651 = arrclass_2651[i];
                        if (class_2651 == null) continue;
                        class_2651.\u0000strictfp().Method_31837((-28685 & 8193) != 0);
                    }
                }
            }
        }
    }

    public boolean Method_3047() {
        return (544 & 2112) != 0;
    }

    public Class_26801 Method_3048() {
        return this.Field_3017.Field_72 == null ? this.Field_3017.Field_84.Field_39775 : this.Field_3017.Field_72.\u0000strictfp().Method_31800();
    }
}

