/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Class_44584
extends Class_43984 {
    public static final Marker Field_44585;
    private Class_10954 Field_44586;
    public boolean Field_44587;
    private final Queue Field_44588 = Queues.newConcurrentLinkedQueue();
    private static final Logger Field_44589;
    public Class_26095 Field_44590;
    private final ReentrantReadWriteLock Field_44591 = new ReentrantReadWriteLock();
    private boolean Field_44592;
    public Class_6816 Field_44593 = new Class_6816();
    private SocketAddress Field_44594;
    private final Class_31224 Field_44595;
    private Class_1782 Field_44596;
    public static final Class_36973 Field_44597;
    public static final Class_33611 Field_44598;
    private boolean Field_44599;
    public static final Marker Field_44600;
    public static final Class_28213 Field_44601;

    private static String Method_44602(String string) {
        int n = 10082;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44584.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_44603(SecretKey secretKey) {
        this.Field_44599 = 8211 & 18445;
        this.Field_44590.Method_26106().Method_6290("TgM9dnjnTWoLe8IPlEDg", "kgNi426IIZns8srpE9YJ", new Class_46992(Class_31852.Method_31860(34 & 578, secretKey)));
        this.Field_44590.Method_26106().Method_6290("4WsU6niRGZTOtfJgYNPX", "UYWQ4gbOAOvBI3wRlg63", new Class_40014(Class_31852.Method_31860(-28639 & 1217, secretKey)));
    }

    public boolean Method_44604() {
        return (this.Field_44590 != null && this.Field_44590.Method_26114() ? 387 & 2077 : 20056 & -20350) != 0;
    }

    public void Method_44605() {
        if (!this.Field_44587 && !this.Field_44592) {
            this.Field_44592 = 281 & -32767;
            if (this.Method_44633() != null) {
                this.Method_44615().Method_10955(this.Method_44633());
            } else if (this.Method_44615() != null) {
                this.Method_44615().Method_10955(new Class_2840("Disconnected"));
            }
        } else if (this.Field_44590 != null && !this.Field_44590.Method_26114()) {
            if (!this.Field_44592) {
                this.Field_44592 = 16387 & -22487;
                if (this.Method_44615() != null) {
                    if (this.Method_44633() != null) {
                        this.Method_44615().Method_10955(this.Method_44633());
                    } else {
                        this.Method_44615().Method_10955(new Class_2840("Disconnected"));
                    }
                }
            } else {
                Field_44589.warn("handleDisconnection() called twice");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_44606(Class_1486 class_1486, Class_18600 class_18600, Class_18600 ... arrclass_18600) {
        if (this.Method_44604()) {
            this.Method_44621();
            this.Method_44611(class_1486, (Class_18600[])ArrayUtils.add((Object[])arrclass_18600, (int)(14860 & 130), (Object)class_18600));
        } else {
            this.Field_44591.writeLock().lock();
            try {
                this.Field_44588.add(new Class_14030(class_1486, (Class_18600[])ArrayUtils.add((Object[])arrclass_18600, (int)(-32697 & 27152), (Object)class_18600)));
            }
            finally {
                this.Field_44591.writeLock().unlock();
            }
        }
    }

    public void Method_44607(Class_11271 class_11271) {
        this.Field_44590.attr(Field_44601).Method_34811((Object)class_11271);
        this.Field_44590.Method_26110().Method_19096((15511 & 16385) != 0);
        Field_44589.debug("Enabled auto read");
    }

    public void Method_44608(int n) {
        if (n >= 0) {
            if (this.Field_44590.Method_26106().Method_6287("xQ73qi6nibbWQqtoHwQV") instanceof Class_42994) {
                ((Class_42994)this.Field_44590.Method_26106().Method_6287("xQ73qi6nibbWQqtoHwQV")).Method_42999(n);
            } else {
                this.Field_44590.Method_26106().Method_6290("dQaqSJfmdN2DevRyxjrU", "xQ73qi6nibbWQqtoHwQV", new Class_42994(n));
            }
            if (this.Field_44590.Method_26106().Method_6287("93MWfDMbHG2gDEPGqlDe") instanceof Class_39970) {
                ((Class_39970)this.Field_44590.Method_26106().Method_6287("xQ73qi6nibbWQqtoHwQV")).Method_39974(n);
            } else {
                this.Field_44590.Method_26106().Method_6290("R9ubjY8KjbDKm9fBD92L", "93MWfDMbHG2gDEPGqlDe", new Class_39970(n));
            }
        } else {
            if (this.Field_44590.Method_26106().Method_6287("xQ73qi6nibbWQqtoHwQV") instanceof Class_42994) {
                this.Field_44590.Method_26106().Method_6276("xQ73qi6nibbWQqtoHwQV");
            }
            if (this.Field_44590.Method_26106().Method_6287("93MWfDMbHG2gDEPGqlDe") instanceof Class_39970) {
                this.Field_44590.Method_26106().Method_6276("93MWfDMbHG2gDEPGqlDe");
            }
        }
    }

    public boolean Method_44609() {
        return (this.Field_44590 instanceof Class_41005 || this.Field_44590 instanceof Class_38138 ? 12289 & 16897 : 16550 & 7496) != 0;
    }

    private void Method_44610(Class_1782 class_1782) {
        if (this.Field_44596 == null) {
            this.Field_44596 = class_1782;
        } else {
            Class_2840 class_2840 = new Class_2840("");
            class_2840.\u0000strictfp(this.Field_44596);
            class_2840.\u0000strictfp("\n");
            class_2840.\u0000strictfp(class_1782);
            this.Field_44596 = class_2840;
        }
    }

    private void Method_44611(Class_1486 class_1486, Class_18600[] arrclass_18600) {
        Class_11271 class_11271 = Class_11271.Method_11285(class_1486);
        Class_11271 class_112712 = (Class_11271)((Object)this.Field_44590.attr(Field_44601).Method_34812());
        if (class_112712 != class_11271) {
            Field_44589.debug("Disabled auto read");
            this.Field_44590.Method_26110().Method_19096((10251 & 17152) != 0);
        }
        if (this.Field_44590.Method_26113().inEventLoop()) {
            if (class_11271 != class_112712) {
                this.Method_44607(class_11271);
            }
            Class_27581 class_27581 = this.Field_44590.Method_26096(class_1486);
            if (arrclass_18600 != null) {
                class_27581.Method_27587(arrclass_18600);
            }
            class_27581.Method_27583(Class_21832.Field_21833);
        } else {
            this.Field_44590.Method_26113().execute(new Class_15619(this, class_11271, class_112712, class_1486, arrclass_18600));
        }
    }

    public SocketAddress Method_44612() {
        return this.Field_44594;
    }

    protected void Method_44613(Class_39158 class_39158, Class_1486 class_1486) {
        if (this.Field_44590.Method_26114()) {
            try {
                class_1486.Method_1489(this.Field_44586);
            }
            catch (Class_48002 class_48002) {
                // empty catch block
            }
        }
    }

    protected void Method_44614(Class_39158 class_39158, Object object) {
        this.Method_44613(class_39158, (Class_1486)object);
    }

    public Class_10954 Method_44615() {
        return this.Field_44586;
    }

    public void Method_44616(Class_39158 class_39158) {
        super.channelActive(class_39158);
        if (this.Field_44593 != null) {
            this.Field_44593.Method_6822(5148 & -13690);
        }
        this.Field_44590 = class_39158.Method_39175();
        this.Field_44594 = this.Field_44590.Method_26102();
        try {
            this.Method_44607(Class_11271.Field_11272);
        }
        catch (Throwable throwable) {
            Field_44589.fatal((Object)throwable);
        }
        if (!this.Field_44587) {
            this.Method_44621();
        }
    }

    private static String Method_44617(String string) {
        int n = 16785;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44584.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_44584 Method_44618(InetAddress inetAddress, int n, boolean bl, boolean bl2, Class_29733 class_29733, Class_6816 class_6816, boolean bl3) {
        Class_44584 class_44584 = new Class_44584(Class_31224.Field_31227);
        class_44584.Field_44587 = bl2;
        class_44584.Field_44593 = class_6816;
        Class<Class_47482> class_ = Class_47482.class;
        Class_36973 class_36973 = Field_44597;
        Class_27581 class_27581 = ((Class_38936)((Class_38936)((Class_38936)((Class_38936)((Class_38936)new Class_38936().group((Class_18163)class_36973)).attr(Class_10188.Field_10189, (Object)class_29733)).handler((Class_31885)new Class_46421(class_44584))).option(Class_25272.Field_25281, (Object)(bl2 ? -6374 & 10000 : 11197 & 24568))).channel(class_)).Method_38957(inetAddress, n, bl3);
        if (bl2) {
            class_27581.Method_27589();
        } else {
            class_27581.Method_27583(Class_21832.Field_21833);
        }
        return class_44584;
    }

    private static String Method_44619(String string) {
        int n = 20869;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44584.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_44620(String string) {
        int n = 11125;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44584.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_44621() {
        if (this.Field_44590 != null && this.Field_44590.Method_26114()) {
            this.Field_44591.readLock().lock();
            try {
                while (!this.Field_44588.isEmpty()) {
                    Class_14030 class_14030 = (Class_14030)this.Field_44588.poll();
                    this.Method_44611(Class_14030.Method_14035(class_14030), Class_14030.Method_14034(class_14030));
                }
            }
            finally {
                this.Field_44591.readLock().unlock();
            }
        }
    }

    public void Method_44622(Class_1782 class_1782) {
        if (!this.Field_44587) {
            this.Method_44610(class_1782);
        } else if (this.Field_44590 != null && this.Field_44590.Method_26114()) {
            this.Field_44590.Method_26111().Method_27588();
            this.Method_44610(class_1782);
        }
    }

    public Class_44584(Class_31224 class_31224) {
        this.Field_44595 = class_31224;
    }

    public void Method_44623() {
        this.Field_44590.Method_26110().Method_19096((-24569 & 5952) != 0);
    }

    public boolean Method_44624() {
        return this.Field_44599;
    }

    public static Class_44584 Method_44625(SocketAddress socketAddress) {
        Class_44584 class_44584 = new Class_44584(Class_31224.Field_31227);
        ((Class_38936)((Class_38936)((Class_38936)new Class_38936().group((Class_18163)Field_44598)).handler((Class_31885)new Class_47131(class_44584))).channel(Class_41005.class)).Method_38944(socketAddress).Method_27589();
        return class_44584;
    }

    static {
        Field_44589 = LogManager.getLogger();
        Field_44600 = MarkerManager.getMarker((String)Class_44584.Method_44620("\u0000\u0000\u0000\u0000\u0001\u0001\u0001"));
        Field_44585 = MarkerManager.getMarker((String)Class_44584.Method_44617("\ua020\ua022\ua020\ua022\ua020\ua020\ua022\ua022\ua02a\ua02a\ua02a\ua02a\ua02a\ua02a\ua02a"), (Marker)Field_44600);
        Field_44601 = Class_28213.Method_28216(Class_44584.Method_44602("\u0a2d\u0a2d\u0a30\u0a29\u0a30\u0a3c\u0a30\u0a31"));
        Field_44597 = new Class_36973(-24095 & 1553, new ThreadFactoryBuilder().setNameFormat(Class_44584.Method_44627("\u4383\u43a0\u43a1\u43a1\u43a4\u43a5\u4386\u43a5\u43a8\u43a8\u43ab\u43a9\u43ad\u438c\u438e\u43ad\u43b2\u43b0\u43b1")).setDaemon((8197 & 17251) != 0).build());
        Field_44598 = new Class_33611(2061 & -24479, new ThreadFactoryBuilder().setNameFormat(Class_44584.Method_44619("\u0ba8\u0b81\u0b82\u0b83\u0b8c\u0b85\u0baa\u0b8b\u0b84\u0b85\u0b8a\u0b87\u0ba4\u0b89\u0b8e\u0b83\u0b98\u0b91\u0b96\u0bbf\u0bb8\u0b95\u0b96\u0b93\u0b90")).setDaemon((-31997 & 24705) != 0).build());
    }

    public boolean Method_44626() {
        return (this.Field_44590 == null ? -32171 & 9353 : 25236 & 290) != 0;
    }

    private static String Method_44627(String string) {
        int n = 23101;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44584.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_44628(Class_39158 class_39158, Throwable throwable) {
        Class_2849 class_2849;
        if (throwable instanceof Class_37378 || throwable instanceof Class_12190) {
            class_2849 = new Class_2849("disconnect.timeout", new Object[4393 & 2176]);
        } else {
            Object[] arrobject = new Object[17539 & 9];
            arrobject[130 & -28664] = "Internal Exception: " + throwable;
            class_2849 = new Class_2849("disconnect.genericReason", arrobject);
        }
        this.Method_44622(class_2849);
    }

    public void Method_44629(Class_1486 class_1486) {
        if (this.Method_44604()) {
            this.Method_44621();
            this.Method_44611(class_1486, null);
        } else {
            this.Field_44591.writeLock().lock();
            try {
                this.Field_44588.add(new Class_14030(class_1486, null));
            }
            finally {
                this.Field_44591.writeLock().unlock();
            }
        }
    }

    public void Method_44630(Class_10954 class_10954) {
        Validate.notNull((Object)class_10954, (String)"packetListener", (Object[])new Object[4192 & 24832]);
        Object[] arrobject = new Object[-24550 & 4551];
        arrobject[16448 & 5392] = this;
        arrobject[13781 & -32253] = class_10954;
        Field_44589.debug("Set listener of {} to {}", arrobject);
        this.Field_44586 = class_10954;
    }

    public void Method_44631() {
        this.Method_44621();
        if (this.Field_44586 instanceof Class_5591) {
            ((Class_5591)((Object)this.Field_44586)).Method_5592();
        }
        this.Field_44590.Method_26098();
    }

    private void Method_44632() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1782 Method_44633() {
        return this.Field_44596;
    }

    public void Method_44634(Class_39158 class_39158) {
        this.Method_44622(new Class_2849("disconnect.endOfStream", new Object[32 & -32448]));
    }
}

