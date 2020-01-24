/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_15008 {
    public boolean Field_15009;
    private final Class_2457 Field_15010;
    public static final Class_7374 Field_15011;
    private static final Logger Field_15012;
    private final List Field_15013 = Collections.synchronizedList(Lists.newArrayList());
    private final List Field_15014 = Collections.synchronizedList(Lists.newArrayList());
    public static final Class_7374 Field_15015;

    static {
        Field_15012 = LogManager.getLogger();
        Field_15011 = new Class_25489();
        Field_15015 = new Class_14251();
    }

    static Class_2457 Method_15016(Class_15008 class_15008) {
        return class_15008.Field_15010;
    }

    public Class_2457 Method_15017() {
        return this.Field_15010;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_15018(InetAddress inetAddress, int n) {
        List list = this.Field_15013;
        synchronized (list) {
            Class<Class_45493> class_ = Class_45493.class;
            Class_7374 class_7374 = Field_15011;
            Field_15012.info("Using default channel type");
            this.Field_15013.add(((Class_42827)((Class_42827)new Class_42827().channel(class_)).Method_42847(new Class_42335(this)).Method_42843((Class_18163)class_7374.Method_7379()).localAddress(inetAddress, n)).bind().Method_27589());
        }
    }

    public Class_15008(Class_2457 class_2457) {
        this.Field_15010 = class_2457;
        this.Field_15009 = 6281 & 17409;
    }

    static List Method_15019(Class_15008 class_15008) {
        return class_15008.Field_15014;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_15020() {
        List list = this.Field_15014;
        synchronized (list) {
            Iterator iterator = this.Field_15014.iterator();
            while (iterator.hasNext()) {
                Class_44584 class_44584 = (Class_44584)iterator.next();
                if (class_44584.Method_44626()) continue;
                if (!class_44584.Method_44604()) {
                    iterator.remove();
                    class_44584.Method_44605();
                    continue;
                }
                try {
                    class_44584.Method_44631();
                }
                catch (Exception exception) {
                    Object object;
                    if (class_44584.Method_44609()) {
                        object = Class_13268.Method_13285(exception, "Ticking memory connection");
                        Class_13220 class_13220 = ((Class_13268)object).Method_13280("Ticking connection");
                        class_13220.Method_13232("Connection", new Class_20474(this, class_44584));
                        throw new Class_1809((Class_13268)object);
                    }
                    Field_15012.warn("Failed to handle packet for " + class_44584.Method_44612(), (Throwable)exception);
                    object = new Class_2840("Internal server error");
                    class_44584.Method_44606(new Class_26444((Class_1782)object), new Class_19358(this, class_44584, (Class_2840)object), new Class_18600[11538 & 608]);
                    class_44584.Method_44623();
                }
            }
        }
    }

    public void Method_15021() {
        this.Field_15009 = 14658 & -31224;
        for (Class_27581 class_27581 : this.Field_15013) {
            try {
                class_27581.Method_27590().Method_26111().Method_27582();
            }
            catch (InterruptedException interruptedException) {
                Field_15012.error("Interrupted whilst closing channel");
            }
        }
    }

    private void Method_15022() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress Method_15023() {
        Class_27581 class_27581;
        List list = this.Field_15013;
        synchronized (list) {
            class_27581 = ((Class_42827)((Class_42827)new Class_42827().channel(Class_38138.class)).Method_42847(new Class_44387(this)).Method_42843((Class_18163)Field_15011.Method_7379()).localAddress((SocketAddress)Class_24415.Field_24418)).bind().Method_27589();
            this.Field_15013.add(class_27581);
        }
        return class_27581.Method_27590().Method_26099();
    }
}

