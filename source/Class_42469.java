/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.util.Map;

public abstract class Class_42469
extends Class_28010
implements Class_39158 {
    private final String Field_42470;
    private final Class_24814 Field_42471;
    private final Class_31282 Field_42472;
    Class_42469 Field_42473;
    Class_42469 Field_42474;
    private Runnable Field_42475;
    private Runnable Field_42476;
    private final boolean Field_42477;
    private final boolean Field_42478;
    final Class_37082 Field_42479;
    private Runnable Field_42480;
    private Runnable Field_42481;
    private boolean Field_42482;

    private void Method_42483(Object object) {
        try {
            ((Class_35822)this.handler()).Method_35831(this, object);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    public Class_27581 Method_42484(SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        }
        if (!this.Method_42487(class_37748, (259 & 11936) != 0)) {
            return class_37748;
        }
        Class_42469 class_42469 = this.Method_42500();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42509(socketAddress, socketAddress2, class_37748);
        } else {
            Class_42469.Method_42511(class_37082, new Class_26962(this, class_42469, socketAddress, socketAddress2, class_37748), class_37748, null);
        }
        return class_37748;
    }

    private void Method_42485() {
        try {
            ((Class_35822)this.handler()).Method_35830(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    public Class_27581 Method_42486(Object object) {
        return this.Method_42557(object, this.Method_42531());
    }

    private boolean Method_42487(Class_37748 class_37748, boolean bl) {
        if (class_37748 == null) {
            throw new NullPointerException("promise");
        }
        if (class_37748.isDone()) {
            if (class_37748.isCancelled()) {
                return (68 & -26574) != 0;
            }
            throw new IllegalArgumentException("promise already done: " + class_37748);
        }
        if (class_37748.Method_37749() != this.Method_42494()) {
            Object[] arrobject = new Object[514 & 12610];
            arrobject[-32252 & 264] = class_37748.Method_37749();
            arrobject[7297 & -16117] = this.Method_42494();
            throw new IllegalArgumentException(String.format("promise.channel does not match: %s (expected: %s)", arrobject));
        }
        if (class_37748.getClass() == Class_44076.class) {
            return (17689 & 2593) != 0;
        }
        if (!bl && class_37748 instanceof Class_40957) {
            throw new IllegalArgumentException(Class_22304.Method_22309(Class_40957.class) + " not allowed for this operation");
        }
        if (class_37748 instanceof Class_47462) {
            throw new IllegalArgumentException(Class_22304.Method_22309(Class_47462.class) + " not allowed in a pipeline");
        }
        return (12801 & 3297) != 0;
    }

    private void Method_42488() {
        try {
            ((Class_31877)this.handler()).Method_31882(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    private void Method_42489() {
        try {
            ((Class_35822)this.handler()).Method_35827(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    public Class_39158 Method_42490() {
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42547();
        } else {
            class_37082.execute(new Class_32996(this, class_42469));
        }
        return this;
    }

    public Class_27581 Method_42491(Class_37748 class_37748) {
        if (!this.Method_42487(class_37748, (4110 & 8192) != 0)) {
            return class_37748;
        }
        Class_42469 class_42469 = this.Method_42500();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            if (!this.Method_42494().Method_26105().Method_10293()) {
                class_42469.Method_42499(class_37748);
            } else {
                class_42469.Method_42549(class_37748);
            }
        } else {
            Class_42469.Method_42511(class_37082, new Class_25860(this, class_42469, class_37748), class_37748, null);
        }
        return class_37748;
    }

    public Class_27581 Method_42492(SocketAddress socketAddress, Class_37748 class_37748) {
        if (socketAddress == null) {
            throw new NullPointerException("localAddress");
        }
        if (!this.Method_42487(class_37748, (1028 & 2659) != 0)) {
            return class_37748;
        }
        Class_42469 class_42469 = this.Method_42500();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42501(socketAddress, class_37748);
        } else {
            Class_42469.Method_42511(class_37082, new Class_26987(this, class_42469, socketAddress, class_37748), class_37748, null);
        }
        return class_37748;
    }

    public Class_39158 Method_42493() {
        Class_42469 class_42469 = this.Method_42500();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42527();
        } else {
            Runnable runnable = class_42469.Field_42475;
            if (runnable == null) {
                class_42469.Field_42475 = runnable = new Class_18394(this, class_42469);
            }
            Class_42469.Method_42511(class_37082, runnable, this.Field_42472.Method_31313(), null);
        }
        return this;
    }

    public Class_26095 Method_42494() {
        return this.Field_42472;
    }

    private void Method_42495() {
        try {
            ((Class_35822)this.handler()).Method_35824(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    public Class_37748 Method_42496() {
        return this.Field_42472.Method_31313();
    }

    public Class_39158 Method_42497() {
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42485();
        } else {
            class_37082.execute(new Class_26287(this, class_42469));
        }
        return this;
    }

    static void Method_42498(Class_42469 class_42469) {
        class_42469.Method_42485();
    }

    private void Method_42499(Class_37748 class_37748) {
        try {
            ((Class_31877)this.handler()).Method_31878(this, class_37748);
        }
        catch (Throwable throwable) {
            Class_42469.Method_42512(throwable, class_37748);
        }
    }

    private Class_42469 Method_42500() {
        Class_42469 class_42469 = this;
        do {
            class_42469 = class_42469.Field_42473;
        } while (!class_42469.Field_42478);
        return class_42469;
    }

    private void Method_42501(SocketAddress socketAddress, Class_37748 class_37748) {
        try {
            ((Class_31877)this.handler()).Method_31883(this, socketAddress, class_37748);
        }
        catch (Throwable throwable) {
            Class_42469.Method_42512(throwable, class_37748);
        }
    }

    static void Method_42502(Class_42469 class_42469) {
        class_42469.Method_42522();
    }

    static void Method_42503(Class_42469 class_42469) {
        class_42469.Method_42489();
    }

    static void Method_42504(Class_42469 class_42469, Object object) {
        class_42469.Method_42483(object);
    }

    static void Method_42505(Class_42469 class_42469, Class_37748 class_37748) {
        class_42469.Method_42499(class_37748);
    }

    static void Method_42506(Class_42469 class_42469, Class_37748 class_37748) {
        class_42469.Method_42549(class_37748);
    }

    public String Method_42507() {
        return this.Field_42470;
    }

    public Class_39158 Method_42508(Object object) {
        if (object == null) {
            throw new NullPointerException("event");
        }
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42483(object);
        } else {
            class_37082.execute(new Class_32361(this, class_42469, object));
        }
        return this;
    }

    private void Method_42509(SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        try {
            ((Class_31877)this.handler()).Method_31880(this, socketAddress, socketAddress2, class_37748);
        }
        catch (Throwable throwable) {
            Class_42469.Method_42512(throwable, class_37748);
        }
    }

    void Method_42510() {
        this.Field_42482 = 1123 & 2073;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void Method_42511(Class_37082 class_37082, Runnable runnable, Class_37748 class_37748, Object object) {
        try {
            class_37082.execute(runnable);
        }
        catch (Throwable throwable) {
            try {
                class_37748.Method_37763(throwable);
            }
            finally {
                if (object != null) {
                    Class_24761.Method_24765(object);
                }
            }
        }
    }

    private static void Method_42512(Throwable throwable, Class_37748 class_37748) {
        if (class_37748 instanceof Class_40957) {
            return;
        }
        if (!class_37748.tryFailure(throwable) && Class_24814.Field_24819.Method_6119()) {
            Class_24814.Field_24819.Method_6123("Failed to fail the promise because it's done already: {}", class_37748, throwable);
        }
    }

    public Class_39158 Method_42513(Throwable throwable) {
        block5 : {
            if (throwable == null) {
                throw new NullPointerException("cause");
            }
            Class_42469 class_42469 = this.Field_42474;
            Class_37082 class_37082 = class_42469.Method_42521();
            if (class_37082.Method_37084()) {
                class_42469.Method_42526(throwable);
            } else {
                try {
                    class_37082.execute(new Class_40693(this, class_42469, throwable));
                }
                catch (Throwable throwable2) {
                    if (!Class_24814.Field_24819.Method_6119()) break block5;
                    Class_24814.Field_24819.Method_6127("Failed to submit an exceptionCaught() event.", throwable2);
                    Class_24814.Field_24819.Method_6127("The exceptionCaught() event that was failed to submit was:", throwable);
                }
            }
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_42514() {
        Class_42469 class_42469 = this.Field_42473;
        if (class_42469 != null) {
            Class_24814 class_24814 = this.Field_42471;
            synchronized (class_24814) {
                this.Field_42471.Method_24846(this);
            }
            class_42469.Method_42542();
        }
    }

    public Class_39158 Method_42515() {
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42555();
        } else {
            Runnable runnable = class_42469.Field_42476;
            if (runnable == null) {
                class_42469.Field_42476 = runnable = new Class_10015(this, class_42469);
            }
            class_37082.execute(runnable);
        }
        return this;
    }

    private void Method_42516() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6274 Method_42517() {
        return this.Field_42471;
    }

    static void Method_42518(Class_42469 class_42469) {
        class_42469.Method_42514();
    }

    public Class_27581 Method_42519(SocketAddress socketAddress, Class_37748 class_37748) {
        return this.Method_42484(socketAddress, null, class_37748);
    }

    Class_42469(Class_24814 class_24814, Class_17563 class_17563, String string, boolean bl, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        this.Field_42472 = class_24814.Field_24817;
        this.Field_42471 = class_24814;
        this.Field_42470 = string;
        if (class_17563 != null) {
            Class_37082 class_37082 = (Class_37082)class_24814.Field_24822.get(class_17563);
            if (class_37082 == null) {
                class_37082 = class_17563.Method_17576();
                class_24814.Field_24822.put(class_17563, class_37082);
            }
            this.Field_42479 = class_37082;
        } else {
            this.Field_42479 = null;
        }
        this.Field_42477 = bl;
        this.Field_42478 = bl2;
    }

    public Class_27581 Method_42520(Object object, Class_37748 class_37748) {
        if (object == null) {
            throw new NullPointerException("msg");
        }
        if (!this.Method_42487(class_37748, (-31719 & 4487) != 0)) {
            Class_24761.Method_24765(object);
            return class_37748;
        }
        this.Method_42523(object, (7233 & 16419) != 0, class_37748);
        return class_37748;
    }

    public Class_37082 Method_42521() {
        if (this.Field_42479 == null) {
            return this.Method_42494().Method_26113();
        }
        return this.Field_42479;
    }

    private void Method_42522() {
        try {
            ((Class_35822)this.handler()).Method_35829(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    private void Method_42523(Object object, boolean bl, Class_37748 class_37748) {
        Class_42469 class_42469 = this.Method_42500();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42530(object, class_37748);
            if (bl) {
                class_42469.Method_42527();
            }
        } else {
            Object object2;
            int n = this.Field_42472.Method_31305().Method_11650(object);
            if (n > 0 && (object2 = this.Field_42472.Method_31325().Method_7321()) != null) {
                ((Class_18249)object2).Method_18285(n);
            }
            object2 = bl ? Class_39989.Method_39995(class_42469, object, n, class_37748) : Class_45062.Method_45064(class_42469, object, n, class_37748);
            Class_42469.Method_42511(class_37082, (Runnable)object2, class_37748, object);
        }
    }

    private static boolean Method_42524(Throwable throwable) {
        do {
            StackTraceElement[] arrstackTraceElement;
            StackTraceElement stackTraceElement;
            if ((arrstackTraceElement = throwable.getStackTrace()) == null) continue;
            StackTraceElement[] arrstackTraceElement2 = arrstackTraceElement;
            int n = arrstackTraceElement2.length;
            for (int i = 80 & 419; i < n && (stackTraceElement = arrstackTraceElement2[i]) != null; ++i) {
                if (!"exceptionCaught".equals(stackTraceElement.getMethodName())) continue;
                return (-32735 & 17409) != 0;
            }
        } while ((throwable = throwable.getCause()) != null);
        return (-25084 & 457) != 0;
    }

    static void Method_42525(Class_42469 class_42469, Object object, Class_37748 class_37748) {
        class_42469.Method_42530(object, class_37748);
    }

    private void Method_42526(Throwable throwable) {
        block2 : {
            try {
                this.handler().Method_31888(this, throwable);
            }
            catch (Throwable throwable2) {
                if (!Class_24814.Field_24819.Method_6119()) break block2;
                Class_24814.Field_24819.Method_6127("An exception was thrown by a user handler's exceptionCaught() method while handling the following exception:", throwable);
            }
        }
    }

    private void Method_42527() {
        try {
            ((Class_31877)this.handler()).Method_31884(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    public Class_39158 Method_42528() {
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42495();
        } else {
            class_37082.execute(new Class_33528(this, class_42469));
        }
        return this;
    }

    static void Method_42529(Class_42469 class_42469) {
        class_42469.Method_42527();
    }

    private void Method_42530(Object object, Class_37748 class_37748) {
        try {
            ((Class_31877)this.handler()).Method_31881(this, object, class_37748);
        }
        catch (Throwable throwable) {
            Class_42469.Method_42512(throwable, class_37748);
        }
    }

    public Class_37748 Method_42531() {
        return new Class_44076(this.Method_42494(), this.Method_42521());
    }

    public Class_39158 Method_42532() {
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42489();
        } else {
            Runnable runnable = class_42469.Field_42480;
            if (runnable == null) {
                class_42469.Field_42480 = runnable = new Class_33088(this, class_42469);
            }
            class_37082.execute(runnable);
        }
        return this;
    }

    static void Method_42533(Class_42469 class_42469, Throwable throwable) {
        class_42469.Method_42526(throwable);
    }

    static void Method_42534(Class_42469 class_42469) {
        class_42469.Method_42547();
    }

    public Class_22837 Method_42535() {
        return this.Method_42494().Method_26110().Method_19095();
    }

    public Class_27581 Method_42536(Object object) {
        return this.Method_42520(object, this.Method_42531());
    }

    public Class_27581 Method_42537() {
        return this.Method_42543(this.Method_42531());
    }

    public Class_39158 Method_42538() {
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42522();
        } else {
            class_37082.execute(new Class_25582(this, class_42469));
        }
        return this;
    }

    static void Method_42539(Class_42469 class_42469, SocketAddress socketAddress, Class_37748 class_37748) {
        class_42469.Method_42501(socketAddress, class_37748);
    }

    static Class_31282 Method_42540(Class_42469 class_42469) {
        return class_42469.Field_42472;
    }

    public Class_39158 Method_42541(Object object) {
        if (object == null) {
            throw new NullPointerException("msg");
        }
        Class_42469 class_42469 = this.Method_42556();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42550(object);
        } else {
            class_37082.execute(new Class_26406(this, class_42469, object));
        }
        return this;
    }

    void Method_42542() {
        Class_37082 class_37082 = this.Method_42521();
        if (class_37082.Method_37084()) {
            this.Method_42514();
        } else {
            class_37082.execute(new Class_15116(this));
        }
    }

    public Class_27581 Method_42543(Class_37748 class_37748) {
        if (!this.Method_42487(class_37748, (16916 & -30581) != 0)) {
            return class_37748;
        }
        Class_42469 class_42469 = this.Method_42500();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42499(class_37748);
        } else {
            Class_42469.Method_42511(class_37082, new Class_34410(this, class_42469, class_37748), class_37748, null);
        }
        return class_37748;
    }

    private void Method_42544(Throwable throwable) {
        if (Class_42469.Method_42524(throwable)) {
            if (Class_24814.Field_24819.Method_6119()) {
                Class_24814.Field_24819.Method_6127("An exception was thrown by a user handler while handling an exceptionCaught event", throwable);
            }
            return;
        }
        this.Method_42526(throwable);
    }

    static void Method_42545(Class_42469 class_42469, Object object) {
        class_42469.Method_42550(object);
    }

    static void Method_42546(Class_42469 class_42469) {
        class_42469.Method_42488();
    }

    private void Method_42547() {
        try {
            ((Class_35822)this.handler()).Method_35825(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    static void Method_42548(Class_42469 class_42469) {
        class_42469.Method_42495();
    }

    private void Method_42549(Class_37748 class_37748) {
        try {
            ((Class_31877)this.handler()).Method_31879(this, class_37748);
        }
        catch (Throwable throwable) {
            Class_42469.Method_42512(throwable, class_37748);
        }
    }

    private void Method_42550(Object object) {
        try {
            ((Class_35822)this.handler()).Method_35823(this, object);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    static void Method_42551(Class_42469 class_42469, SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        class_42469.Method_42509(socketAddress, socketAddress2, class_37748);
    }

    static void Method_42552(Class_42469 class_42469) {
        class_42469.Method_42555();
    }

    public Class_39158 Method_42553() {
        Class_42469 class_42469 = this.Method_42500();
        Class_37082 class_37082 = class_42469.Method_42521();
        if (class_37082.Method_37084()) {
            class_42469.Method_42488();
        } else {
            Runnable runnable = class_42469.Field_42481;
            if (runnable == null) {
                class_42469.Field_42481 = runnable = new Class_17092(this, class_42469);
            }
            class_37082.execute(runnable);
        }
        return this;
    }

    public boolean Method_42554() {
        return this.Field_42482;
    }

    private void Method_42555() {
        try {
            ((Class_35822)this.handler()).Method_35828(this);
        }
        catch (Throwable throwable) {
            this.Method_42544(throwable);
        }
    }

    private Class_42469 Method_42556() {
        Class_42469 class_42469 = this;
        do {
            class_42469 = class_42469.Field_42474;
        } while (!class_42469.Field_42477);
        return class_42469;
    }

    public Class_27581 Method_42557(Object object, Class_37748 class_37748) {
        if (object == null) {
            throw new NullPointerException("msg");
        }
        if (!this.Method_42487(class_37748, (17665 & -24333) != 0)) {
            Class_24761.Method_24765(object);
            return class_37748;
        }
        this.Method_42523(object, (144 & 17455) != 0, class_37748);
        return class_37748;
    }
}

