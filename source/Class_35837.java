/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Class_35837
implements Cloneable {
    private Class_31885 Field_35838;
    private Class_18163 Field_35839;
    private Class_8126 Field_35840;
    private final Map Field_35841 = new LinkedHashMap<K, V>();
    private final Map Field_35842 = new LinkedHashMap<K, V>();
    private SocketAddress Field_35843;

    public Class_35837 Method_35844() {
        if (this.Field_35839 == null) {
            throw new IllegalStateException("group not set");
        }
        if (this.Field_35840 == null) {
            throw new IllegalStateException("channel or channelFactory not set");
        }
        return this;
    }

    public final Class_18163 Method_35845() {
        return this.Field_35839;
    }

    static void Method_35846(Class_27581 class_27581, Class_26095 class_26095, SocketAddress socketAddress, Class_37748 class_37748) {
        Class_35837.Method_35849(class_27581, class_26095, socketAddress, class_37748);
    }

    abstract void Method_35847(Class_26095 var1);

    public Class_35837 Method_35848(InetAddress inetAddress, int n) {
        return this.Method_35868(new InetSocketAddress(inetAddress, n));
    }

    private static void Method_35849(Class_27581 class_27581, Class_26095 class_26095, SocketAddress socketAddress, Class_37748 class_37748) {
        class_26095.Method_26113().execute(new Class_7461(class_27581, class_26095, socketAddress, class_37748));
    }

    private void Method_35850() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_35837 Method_35851(Class_31885 class_31885) {
        if (class_31885 == null) {
            throw new NullPointerException("handler");
        }
        this.Field_35838 = class_31885;
        return this;
    }

    public Class_35837 Method_35852(Class_8126 class_8126) {
        if (class_8126 == null) {
            throw new NullPointerException("channelFactory");
        }
        if (this.Field_35840 != null) {
            throw new IllegalStateException("channelFactory set already");
        }
        this.Field_35840 = class_8126;
        return this;
    }

    Class_35837() {
    }

    public abstract Class_35837 Method_35853();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Class_35837(Class_35837 class_35837) {
        this.Field_35839 = class_35837.Field_35839;
        this.Field_35840 = class_35837.Field_35840;
        this.Field_35838 = class_35837.Field_35838;
        this.Field_35843 = class_35837.Field_35843;
        Map map = class_35837.Field_35841;
        synchronized (map) {
            this.Field_35841.putAll(class_35837.Field_35841);
        }
        map = class_35837.Field_35842;
        synchronized (map) {
            this.Field_35842.putAll(class_35837.Field_35842);
        }
    }

    public Class_35837 Method_35854(Class_18163 class_18163) {
        if (class_18163 == null) {
            throw new NullPointerException("group");
        }
        if (this.Field_35839 != null) {
            throw new IllegalStateException("group set already");
        }
        this.Field_35839 = class_18163;
        return this;
    }

    final Class_8126 Method_35855() {
        return this.Field_35840;
    }

    public Class_35837 Method_35856(Class class_) {
        if (class_ == null) {
            throw new NullPointerException("channelClass");
        }
        return this.Method_35852(new Class_17039(class_));
    }

    final Class_31885 Method_35857() {
        return this.Field_35838;
    }

    final Class_27581 Method_35858() {
        Class_26095 class_26095 = this.Method_35855().Method_8127();
        try {
            this.Method_35847(class_26095);
        }
        catch (Throwable throwable) {
            class_26095.Method_26101().Method_7312();
            return new Class_44076(class_26095, Class_46724.Field_46725).Method_44107(throwable);
        }
        Class_27581 class_27581 = this.Method_35845().Method_18165(class_26095);
        if (class_27581.cause() != null) {
            if (class_26095.Method_26112()) {
                class_26095.Method_26111();
            } else {
                class_26095.Method_26101().Method_7312();
            }
        }
        return class_27581;
    }

    private Class_27581 Method_35859(SocketAddress socketAddress) {
        Class_37748 class_37748;
        Class_27581 class_27581 = this.Method_35858();
        Class_26095 class_26095 = class_27581.Method_27590();
        if (class_27581.cause() != null) {
            return class_27581;
        }
        if (class_27581.isDone()) {
            class_37748 = class_26095.Method_26108();
            Class_35837.Method_35849(class_27581, class_26095, socketAddress, class_37748);
        } else {
            class_37748 = new Class_46150(class_26095, null);
            class_27581.Method_27583(new Class_26125(this, class_27581, class_26095, socketAddress, class_37748));
        }
        return class_37748;
    }

    final Map Method_35860() {
        return this.Field_35841;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String Method_35861() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Class_22304.Method_22312(this));
        stringBuilder.append((char)(18408 & 6188));
        if (this.Field_35839 != null) {
            stringBuilder.append("group: ");
            stringBuilder.append(Class_22304.Method_22312(this.Field_35839));
            stringBuilder.append(", ");
        }
        if (this.Field_35840 != null) {
            stringBuilder.append("channelFactory: ");
            stringBuilder.append(this.Field_35840);
            stringBuilder.append(", ");
        }
        if (this.Field_35843 != null) {
            stringBuilder.append("localAddress: ");
            stringBuilder.append(this.Field_35843);
            stringBuilder.append(", ");
        }
        Map map = this.Field_35841;
        synchronized (map) {
            if (!this.Field_35841.isEmpty()) {
                stringBuilder.append("options: ");
                stringBuilder.append(this.Field_35841);
                stringBuilder.append(", ");
            }
        }
        map = this.Field_35842;
        synchronized (map) {
            if (!this.Field_35842.isEmpty()) {
                stringBuilder.append("attrs: ");
                stringBuilder.append(this.Field_35842);
                stringBuilder.append(", ");
            }
        }
        if (this.Field_35838 != null) {
            stringBuilder.append("handler: ");
            stringBuilder.append(this.Field_35838);
            stringBuilder.append(", ");
        }
        if (stringBuilder.charAt(stringBuilder.length() - (131 & -18079)) == (2616 & -27479)) {
            stringBuilder.append((char)(-31831 & 3129));
        } else {
            stringBuilder.setCharAt(stringBuilder.length() - (4867 & 74), (char)(43 & -27475));
            stringBuilder.setLength(stringBuilder.length() - (2137 & 8193));
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_35837 Method_35862(Class_28213 class_28213, Object object) {
        Object object2;
        if (class_28213 == null) {
            throw new NullPointerException("key");
        }
        if (object == null) {
            object2 = this.Field_35842;
            synchronized (object2) {
                this.Field_35842.remove(class_28213);
            }
        }
        object2 = this.Field_35842;
        synchronized (object2) {
            this.Field_35842.put(class_28213, object);
        }
        object2 = this;
        return object2;
    }

    public Class_27581 Method_35863() {
        this.Method_35844();
        SocketAddress socketAddress = this.Field_35843;
        if (socketAddress == null) {
            throw new IllegalStateException("localAddress not set");
        }
        return this.Method_35859(socketAddress);
    }

    final Map Method_35864() {
        return this.Field_35842;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_35837 Method_35865(Class_25272 class_25272, Object object) {
        if (class_25272 == null) {
            throw new NullPointerException("option");
        }
        if (object == null) {
            Map map = this.Field_35841;
            synchronized (map) {
                this.Field_35841.remove(class_25272);
            }
        }
        Map map = this.Field_35841;
        synchronized (map) {
            this.Field_35841.put(class_25272, object);
        }
        return this;
    }

    public Object Method_35866() {
        return this.Method_35853();
    }

    final SocketAddress Method_35867() {
        return this.Field_35843;
    }

    public Class_35837 Method_35868(SocketAddress socketAddress) {
        this.Field_35843 = socketAddress;
        return this;
    }
}

