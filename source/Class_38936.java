/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hashing
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 */
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public final class Class_38936
extends Class_35837 {
    private static final Class_6113 Field_38937;
    static final Set Field_38938;
    private SocketAddress Field_38939;
    public static final ThreadPoolExecutor Field_38940;
    private static final Joiner Field_38941;
    private static final Splitter Field_38942;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void Method_38943(Class_26095 class_26095) {
        Map map;
        Class_6274 class_6274 = class_26095.Method_26106();
        Class_31885[] arrclass_31885 = new Class_31885[-14331 & 4627];
        arrclass_31885[-28670 & 28544] = this.handler();
        class_6274.Method_6275(arrclass_31885);
        Map map2 = map = this.options();
        synchronized (map2) {
            for (Map.Entry object : map.entrySet()) {
                try {
                    if (class_26095.Method_26110().Method_19093((Class_25272)object.getKey(), object.getValue())) continue;
                    Field_38937.Method_6132("Unknown channel option: " + object);
                }
                catch (Throwable entry) {
                    Field_38937.Method_6127("Failed to set a channel option: " + class_26095, entry);
                }
            }
        }
        map2 = this.attrs();
        Map map3 = map2;
        synchronized (map3) {
            for (Map.Entry entry : map2.entrySet()) {
                class_26095.attr((Class_28213)entry.getKey()).Method_34811(entry.getValue());
            }
        }
    }

    private Class_38936(Class_38936 class_38936) {
        super(class_38936);
        this.Field_38939 = class_38936.Field_38939;
    }

    public Class_27581 Method_38944(SocketAddress socketAddress) {
        return this.Method_38947(socketAddress, (1033 & 10818) != 0);
    }

    static void Method_38945(Class_27581 class_27581, Class_26095 class_26095, SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        Class_38936.Method_38960(class_27581, class_26095, socketAddress, socketAddress2, class_37748);
    }

    public Class_38936 Method_38946() {
        super.Method_35844();
        if (this.handler() == null) {
            throw new IllegalStateException("handler not set");
        }
        return this;
    }

    public Class_27581 Method_38947(SocketAddress socketAddress, boolean bl) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        }
        this.Method_38946();
        return this.Method_38958(socketAddress, this.localAddress(), bl);
    }

    private void Method_38948() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_38936() {
    }

    public Class_35837 Method_38949() {
        return this.Method_38956();
    }

    public Class_21065 Method_38950(SocketAddress socketAddress) {
        Class_33149 class_33149 = Class_46724.Field_46725.newPromise();
        Field_38940.submit(new Class_15736(this, class_33149, socketAddress));
        return class_33149;
    }

    private Class_27581 Method_38951(SocketAddress socketAddress, SocketAddress socketAddress2) {
        return this.Method_38958(socketAddress, socketAddress2, (4257 & 1024) != 0);
    }

    public Class_38936 Method_38952(InetAddress inetAddress, int n) {
        this.Field_38939 = new InetSocketAddress(inetAddress, n);
        return this;
    }

    public static boolean Method_38953(String string) {
        String string2;
        if (string == null) {
            return (4179 & 24736) != 0;
        }
        if (string.isEmpty()) {
            return (11526 & -11672) != 0;
        }
        while (string.charAt(string.length() - (-32763 & 6305)) == (302 & -31186)) {
            string = string.substring(-24567 & 1408, string.length() - (1617 & 2209));
        }
        if (Class_38936.Method_38964(string)) {
            return (1041 & 3) != 0;
        }
        ArrayList arrayList = Lists.newArrayList((Iterable)Field_38942.split((CharSequence)string));
        int n = arrayList.size() == (-28291 & 24580) ? 1 & 16409 : -16252 & 12800;
        int n2 = n;
        if (n != 0) {
            for (String string3 : arrayList) {
                try {
                    int n3 = Integer.parseInt(string3);
                    if (n3 >= 0 && n3 <= (25599 & -31489)) {
                        continue;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
                n = 8332 & 6978;
                break;
            }
        }
        if (n == 0 && Class_38936.Method_38964("*." + string)) {
            return (10249 & 263) != 0;
        }
        do {
            if (arrayList.size() <= (775 & -32727)) {
                return (18443 & -28512) != 0;
            }
            arrayList.remove(n != 0 ? arrayList.size() - (-32759 & 17509) : 420 & -8704);
        } while (!Class_38936.Method_38964(string2 = n != 0 ? Field_38941.join((Iterable)arrayList) + ".*" : "*." + Field_38941.join((Iterable)arrayList)));
        return (8209 & -11231) != 0;
    }

    public String Method_38954() {
        if (this.Field_38939 == null) {
            return super.Method_35861();
        }
        StringBuilder stringBuilder = new StringBuilder(super.Method_35861());
        stringBuilder.setLength(stringBuilder.length() - (5253 & 547));
        stringBuilder.append(", remoteAddress: ");
        stringBuilder.append(this.Field_38939);
        stringBuilder.append((char)(-24021 & 5417));
        return stringBuilder.toString();
    }

    public Class_27581 Method_38955() {
        this.Method_38946();
        SocketAddress socketAddress = this.Field_38939;
        if (socketAddress == null) {
            throw new IllegalStateException("remoteAddress not set");
        }
        return this.Method_38951(socketAddress, this.localAddress());
    }

    public Class_38936 Method_38956() {
        return new Class_38936(this);
    }

    public Class_27581 Method_38957(InetAddress inetAddress, int n, boolean bl) {
        return this.Method_38947(new InetSocketAddress(inetAddress, n), bl);
    }

    private Class_27581 Method_38958(SocketAddress socketAddress, SocketAddress socketAddress2, boolean bl) {
        Class_27581 class_27581 = this.initAndRegister();
        Class_26095 class_26095 = class_27581.Method_27590();
        if (class_27581.cause() != null) {
            return class_27581;
        }
        if (!bl) {
            Class_37748 class_37748 = class_26095.Method_26108();
            if (class_27581.isDone()) {
                Class_38936.Method_38960(class_27581, class_26095, socketAddress, socketAddress2, class_37748);
            } else {
                class_27581.Method_27583(new Class_23115(this, class_27581, class_26095, socketAddress, socketAddress2, class_37748));
            }
            return class_37748;
        }
        Class_44076 class_44076 = new Class_44076(class_26095, Class_46724.Field_46725);
        Class_21065 class_21065 = this.Method_38950(socketAddress);
        class_21065.Method_21068(new Class_21104(this, class_44076, class_26095, class_27581, socketAddress, socketAddress2));
        return class_44076;
    }

    public Object Method_38959() {
        return this.Method_38956();
    }

    private static void Method_38960(Class_27581 class_27581, Class_26095 class_26095, SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        class_26095.Method_26113().execute(new Class_14437(class_27581, socketAddress2, class_26095, socketAddress, class_37748));
    }

    private static String Method_38961(String string) {
        int n = 7650;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38936.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_27581 Method_38962(String string, int n, boolean bl) {
        return this.Method_38947(new InetSocketAddress(string, n), bl);
    }

    public Class_35837 Method_38963() {
        return this.Method_38946();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean Method_38964(String string) {
        Set set = Field_38938;
        synchronized (set) {
            return Field_38938.contains(Hashing.sha1().hashBytes(string.toLowerCase().getBytes(Charset.forName("ISO-8859-1"))).toString());
        }
    }

    public Class_27581 Method_38965(String string, int n) {
        return this.Method_38962(string, n, (2052 & -23168) != 0);
    }

    static {
        Field_38941 = Joiner.on((char)(-20929 & 430));
        Field_38942 = Splitter.on((char)(1646 & 16686));
        Field_38938 = Sets.newHashSet();
        Field_38937 = Class_10201.Method_10203(Class_38936.class);
        Field_38940 = new ScheduledThreadPoolExecutor(2600 & 13352, new ThreadFactoryBuilder().setNameFormat(Class_38936.Method_38961("\u1159\u1148\u111b\u1153\u1154\u1154\u115e\u1156\u1158\u1118\u115b\u1152\u115c\u115d\u1156\u1156\u1140\u1159\u115b\u110a\u115d\u115d\u1147\u1146\u1148\u1158\u110b\u110b\u110c\u114c")).setDaemon((4105 & 18563) != 0).build());
        new Class_18040().start();
    }
}

