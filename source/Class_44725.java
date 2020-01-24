/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_44725
extends Class_39999 {
    private static final Logger Field_44726 = LogManager.getLogger();
    private Class_15008 Field_44727;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_44728(Class_39158 class_39158, Object object) {
        Class_22553 class_22553 = (Class_22553)object;
        class_22553.Method_22567();
        int n = 4161 & 20007;
        try {
            if (class_22553.Method_22648() == (25854 & -32514)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress)class_39158.Method_39175().Method_26102();
                Class_2457 class_2457 = this.Field_44727.Method_15017();
                int n2 = class_22553.Method_22564();
                switch (n2) {
                    case 0: {
                        Object[] arrobject = new Object[-28573 & 2442];
                        arrobject[1072 & 20488] = inetSocketAddress.getAddress();
                        arrobject[4129 & -22911] = inetSocketAddress.getPort();
                        Field_44726.debug("Ping: (<1.3.x) from {}:{}", arrobject);
                        Object[] arrobject2 = new Object[2055 & 8779];
                        arrobject2[1567 & -32736] = class_2457.Method_2516();
                        arrobject2[273 & 129] = class_2457.Method_2608();
                        arrobject2[6538 & 594] = class_2457.Method_2539();
                        String string = String.format("%s\u00a7%d\u00a7%d", arrobject2);
                        this.Method_44729(class_39158, this.Method_44731(string));
                        break;
                    }
                    case 1: {
                        if (class_22553.Method_22648() != (393 & -24555)) {
                            return;
                        }
                        Object[] arrobject = new Object[-32190 & 5147];
                        arrobject[17488 & -32768] = inetSocketAddress.getAddress();
                        arrobject[69 & -11007] = inetSocketAddress.getPort();
                        Field_44726.debug("Ping: (1.4-1.5.x) from {}:{}", arrobject);
                        Object[] arrobject3 = new Object[12293 & 16389];
                        arrobject3[24612 & -26928] = 12927 & -31489;
                        arrobject3[1635 & -22391] = class_2457.Method_2597();
                        arrobject3[5546 & 16387] = class_2457.Method_2516();
                        arrobject3[4371 & -16313] = class_2457.Method_2608();
                        arrobject3[4228 & 16430] = class_2457.Method_2539();
                        String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", arrobject3);
                        this.Method_44729(class_39158, this.Method_44731(string));
                        break;
                    }
                    default: {
                        int n3 = class_22553.Method_22648() == (515 & -13943) ? 17747 & -32251 : -30572 & 5120;
                        n3 &= class_22553.Method_22648() == (27898 & -32262) ? -2019 & 1 : 28681 & -30590;
                        n3 &= "MC|PingHost".equals(new String(class_22553.Method_22601(class_22553.Method_22633() * (18738 & 4610)).Method_22599(), Charsets.UTF_16BE));
                        int n4 = class_22553.Method_22615();
                        n3 &= class_22553.Method_22648() >= (201 & 367) ? -27983 & 1295 : 0 & -12278;
                        n3 &= (8195 & -11873) + class_22553.Method_22601(class_22553.Method_22633() * (12802 & 17686)).Method_22599().length + (14367 & 17572) == n4 ? 13571 & 2693 : 2129 & 1678;
                        n3 &= class_22553.Method_22640() <= (1082458111 & 308412415) ? 257 & 9387 : 4225 & -16382;
                        if ((n3 &= class_22553.Method_22564() == 0 ? -32757 & 16385 : -29183 & 20916) == 0) {
                            return;
                        }
                        Object[] arrobject = new Object[-24474 & 23187];
                        arrobject[19936 & 12288] = inetSocketAddress.getAddress();
                        arrobject[-30663 & 4357] = inetSocketAddress.getPort();
                        Field_44726.debug("Ping: (1.6) from {}:{}", arrobject);
                        Object[] arrobject4 = new Object[-7921 & 1541];
                        arrobject4[1026 & -21695] = -17281 & 16511;
                        arrobject4[8609 & 6145] = class_2457.Method_2597();
                        arrobject4[8226 & 4555] = class_2457.Method_2516();
                        arrobject4[10499 & 3] = class_2457.Method_2608();
                        arrobject4[428 & -28153] = class_2457.Method_2539();
                        String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", arrobject4);
                        Class_22553 class_225532 = this.Method_44731(string);
                        try {
                            this.Method_44729(class_39158, class_225532);
                            break;
                        }
                        finally {
                            class_225532.release();
                        }
                    }
                }
                class_22553.release();
                n = 9506 & 2048;
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        finally {
            if (n != 0) {
                class_22553.Method_22608();
                class_39158.Method_39175().Method_26106().Method_6276("61f0RSkXHwKmqJQYBVQ6");
                class_39158.Method_39183(object);
            }
        }
    }

    private void Method_44729(Class_39158 class_39158, Class_22553 class_22553) {
        class_39158.Method_39171().Method_6282().Method_39186(class_22553).Method_27583(Class_21832.Field_21834);
    }

    private void Method_44730() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_44725(Class_15008 class_15008) {
        this.Field_44727 = class_15008;
    }

    private Class_22553 Method_44731(String string) {
        Class_22553 class_22553 = Class_16620.Method_16633();
        class_22553.Method_22606(4351 & 8703);
        char[] arrc = string.toCharArray();
        class_22553.Method_22575(arrc.length);
        char[] arrc2 = arrc;
        int n = arrc2.length;
        for (int i = 22545 & -23040; i < n; ++i) {
            char c = arrc2[i];
            class_22553.Method_22576(c);
        }
        return class_22553;
    }
}

