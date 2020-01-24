/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;

public abstract class Class_31282
extends Class_28010
implements Class_26095 {
    private Class_38541 Field_31283;
    private final Class_26095 Field_31284;
    private final Class_40957 Field_31285 = new Class_40957(this, (2626 & 16) != 0);
    private SocketAddress Field_31286;
    private final Class_40957 Field_31287 = new Class_40957(this, (1 & -29407) != 0);
    private boolean Field_31288;
    static final NotYetConnectedException Field_31289;
    private Class_11649 Field_31290;
    static final ClosedChannelException Field_31291;
    private final Class_47462 Field_31292 = new Class_47462(this);
    private final Class_27581 Field_31293 = new Class_46897(this, null);
    private final long Field_31294 = Class_32341.Method_32350().nextLong();
    private String Field_31295;
    private final Class_7311 Field_31296;
    private final Class_24814 Field_31297;
    private SocketAddress Field_31298;
    private static final Class_6113 Field_31299;
    private boolean Field_31300;

    public Class_27581 Method_31301() {
        return this.Field_31297.Method_24836();
    }

    static Class_24814 Method_31302(Class_31282 class_31282) {
        return class_31282.Field_31297;
    }

    static Class_40957 Method_31303(Class_31282 class_31282) {
        return class_31282.Field_31285;
    }

    public Class_27581 Method_31304(SocketAddress socketAddress, Class_37748 class_37748) {
        return this.Field_31297.Method_24849(socketAddress, class_37748);
    }

    final Class_11649 Method_31305() {
        if (this.Field_31290 == null) {
            this.Field_31290 = this.config().Method_19101().Method_25566();
        }
        return this.Field_31290;
    }

    protected void Method_31306() {
    }

    public Class_26095 Method_31307() {
        this.Field_31297.Method_24826();
        return this;
    }

    public final int Method_31308() {
        return (int)this.Field_31294;
    }

    protected Class_31282(Class_26095 class_26095) {
        this.Field_31284 = class_26095;
        this.Field_31296 = this.Method_31319();
        this.Field_31297 = new Class_24814(this);
    }

    public Class_26095 Method_31309() {
        this.Field_31297.Method_24862();
        return this;
    }

    public Class_27581 Method_31310(SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        return this.Field_31297.Method_24863(socketAddress, socketAddress2, class_37748);
    }

    static Class_6113 Method_31311() {
        return Field_31299;
    }

    static Class_47462 Method_31312(Class_31282 class_31282) {
        return class_31282.Field_31292;
    }

    public final Class_37748 Method_31313() {
        return this.Field_31287;
    }

    protected Object Method_31314(Object object) {
        return object;
    }

    public Class_22837 Method_31315() {
        return this.config().Method_19095();
    }

    protected abstract SocketAddress Method_31316();

    public int Method_31317(Object object) {
        return this.Method_31343((Class_26095)object);
    }

    public final boolean Method_31318(Object object) {
        return (this == object ? 517 & 4355 : 128 & 9314) != 0;
    }

    protected abstract Class_44175 Method_31319();

    public boolean Method_31320() {
        return this.Field_31300;
    }

    public Class_27581 Method_31321(Object object) {
        return this.Field_31297.Method_24877(object);
    }

    public boolean Method_31322() {
        Class_18249 class_18249 = this.Field_31296.Method_7321();
        return (class_18249 != null && class_18249.Method_18286() ? 16425 & 11607 : 1409 & 12358) != 0;
    }

    static boolean Method_31323(Class_31282 class_31282, boolean bl) {
        class_31282.Field_31300 = bl;
        return class_31282.Field_31300;
    }

    public String Method_31324() {
        boolean bl = this.isActive();
        if (this.Field_31288 == bl && this.Field_31295 != null) {
            return this.Field_31295;
        }
        SocketAddress socketAddress = this.Method_31338();
        SocketAddress socketAddress2 = this.Method_31327();
        if (socketAddress != null) {
            SocketAddress socketAddress3;
            SocketAddress socketAddress4;
            if (this.Field_31284 == null) {
                socketAddress3 = socketAddress2;
                socketAddress4 = socketAddress;
            } else {
                socketAddress3 = socketAddress;
                socketAddress4 = socketAddress2;
            }
            Object[] arrobject = new Object[-27236 & 26692];
            arrobject[72 & -13049] = (int)this.Field_31294;
            arrobject[-32647 & 27137] = socketAddress3;
            arrobject[2819 & 16618] = bl ? "=>" : ":>";
            arrobject[-28217 & 3595] = socketAddress4;
            this.Field_31295 = String.format("[id: 0x%08x, %s %s %s]", arrobject);
        } else if (socketAddress2 != null) {
            Object[] arrobject = new Object[7235 & 10];
            arrobject[418 & 6721] = (int)this.Field_31294;
            arrobject[8263 & 20521] = socketAddress2;
            this.Field_31295 = String.format("[id: 0x%08x, %s]", arrobject);
        } else {
            Object[] arrobject = new Object[25879 & -26527];
            arrobject[24736 & -31146] = (int)this.Field_31294;
            this.Field_31295 = String.format("[id: 0x%08x]", arrobject);
        }
        this.Field_31288 = bl;
        return this.Field_31295;
    }

    public Class_7311 Method_31325() {
        return this.Field_31296;
    }

    protected abstract SocketAddress Method_31326();

    public SocketAddress Method_31327() {
        SocketAddress socketAddress = this.Field_31298;
        if (socketAddress == null) {
            try {
                this.Field_31298 = socketAddress = this.Method_31325().Method_7314();
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        return socketAddress;
    }

    private void Method_31328() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26095 Method_31329() {
        return this.Field_31284;
    }

    protected abstract void Method_31330();

    protected abstract void Method_31331(Class_18249 var1);

    static {
        Field_31299 = Class_10201.Method_10203(Class_31282.class);
        Field_31291 = new ClosedChannelException();
        Field_31289 = new NotYetConnectedException();
        Field_31291.setStackTrace(Class_23808.Field_23809);
        Field_31289.setStackTrace(Class_23808.Field_23809);
    }

    protected abstract void Method_31332(SocketAddress var1);

    protected void Method_31333() {
    }

    protected abstract void Method_31334();

    public Class_27581 Method_31335(SocketAddress socketAddress, Class_37748 class_37748) {
        return this.Field_31297.Method_24857(socketAddress, class_37748);
    }

    static Class_38541 Method_31336(Class_31282 class_31282, Class_38541 class_38541) {
        class_31282.Field_31283 = class_38541;
        return class_31282.Field_31283;
    }

    protected abstract void Method_31337();

    public SocketAddress Method_31338() {
        SocketAddress socketAddress = this.Field_31286;
        if (socketAddress == null) {
            try {
                this.Field_31286 = socketAddress = this.Method_31325().Method_7317();
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        return socketAddress;
    }

    public Class_38541 Method_31339() {
        Class_38541 class_38541 = this.Field_31283;
        if (class_38541 == null) {
            throw new IllegalStateException("channel not registered to an event loop");
        }
        return class_38541;
    }

    protected abstract boolean Method_31340(Class_38541 var1);

    static boolean Method_31341(Class_31282 class_31282) {
        return class_31282.Field_31300;
    }

    public Class_37748 Method_31342() {
        return new Class_44076(this);
    }

    public final int Method_31343(Class_26095 class_26095) {
        if (this == class_26095) {
            return 20496 & 2720;
        }
        long l = this.Field_31294 - (long)class_26095.hashCode();
        if (l > (74785L & 3229094655362859656L)) {
            return 17427 & 5;
        }
        if (l < (6325634L & 9531392L)) {
            return -1 & -1;
        }
        l = System.identityHashCode(this) - System.identityHashCode(class_26095);
        if (l != (24117904L & -4428906044331383808L)) {
            return (int)l;
        }
        throw new Error();
    }

    public Class_6274 Method_31344() {
        return this.Field_31297;
    }
}

