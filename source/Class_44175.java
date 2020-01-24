/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.util.concurrent.RejectedExecutionException;

public abstract class Class_44175
implements Class_7311 {
    private boolean Field_44176;
    final Class_31282 Field_44177;
    private Class_18249 Field_44178;

    public final Class_37748 Method_44179() {
        return Class_31282.Method_31303(this.Field_44177);
    }

    public final void Method_44180(Class_37748 class_37748) {
        if (!class_37748.setUncancellable()) {
            return;
        }
        if (!Class_31282.Method_31341(this.Field_44177)) {
            this.Method_44185(class_37748);
            return;
        }
        try {
            this.Field_44177.Method_31333();
        }
        catch (Throwable throwable) {
            try {
                Class_31282.Method_31311().Method_6127("Unexpected exception occurred while deregistering a channel.", throwable);
            }
            catch (Throwable throwable2) {
                if (Class_31282.Method_31341(this.Field_44177)) {
                    Class_31282.Method_31323(this.Field_44177, (-32022 & 16401) != 0);
                    this.Method_44181(new Class_26797(this));
                    this.Method_44185(class_37748);
                } else {
                    this.Method_44185(class_37748);
                }
                throw throwable2;
            }
            if (Class_31282.Method_31341(this.Field_44177)) {
                Class_31282.Method_31323(this.Field_44177, (680 & 12548) != 0);
                this.Method_44181(new Class_26797(this));
                this.Method_44185(class_37748);
            } else {
                this.Method_44185(class_37748);
            }
        }
        if (Class_31282.Method_31341(this.Field_44177)) {
            Class_31282.Method_31323(this.Field_44177, (2352 & 8704) != 0);
            this.Method_44181(new Class_26797(this));
            this.Method_44185(class_37748);
        } else {
            this.Method_44185(class_37748);
        }
    }

    private void Method_44181(Runnable runnable) {
        try {
            this.Field_44177.Method_31339().execute(runnable);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            Class_31282.Method_31311().Method_6127("Can't invoke task later as EventLoop rejected it", rejectedExecutionException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void Method_44182() {
        if (this.Field_44176) {
            return;
        }
        Class_18249 class_18249 = this.Field_44178;
        if (class_18249 == null) return;
        if (class_18249.Method_18281()) {
            return;
        }
        this.Field_44176 = 67 & -14047;
        if (!this.Field_44177.isActive()) {
            block10 : {
                try {
                    if (this.Field_44177.isOpen()) {
                        class_18249.Method_18277(Class_31282.Field_31289);
                        break block10;
                    }
                    class_18249.Method_18277(Class_31282.Field_31291);
                }
                catch (Throwable throwable) {
                    this.Field_44176 = -5248 & 67;
                    throw throwable;
                }
            }
            this.Field_44176 = -32763 & 16;
            return;
        }
        try {
            this.Field_44177.Method_31331(class_18249);
        }
        catch (Throwable throwable) {
            block11 : {
                try {
                    class_18249.Method_18277(throwable);
                    if (!(throwable instanceof IOException) || !this.Field_44177.config().Method_19092()) break block11;
                    this.Method_44189(this.Method_44179());
                }
                catch (Throwable throwable2) {
                    this.Field_44176 = -14984 & 644;
                    throw throwable2;
                }
            }
            this.Field_44176 = -32680 & 3232;
            return;
        }
        this.Field_44176 = 8708 & -32598;
        return;
    }

    protected final void Method_44183(Class_37748 class_37748, Throwable throwable) {
        if (!(class_37748 instanceof Class_40957) && !class_37748.tryFailure(throwable)) {
            Class_31282.Method_31311().Method_6123("Failed to mark a promise as failure because it's done already: {}", class_37748, throwable);
        }
    }

    static void Method_44184(Class_44175 class_44175, Class_37748 class_37748) {
        class_44175.Method_44200(class_37748);
    }

    protected final void Method_44185(Class_37748 class_37748) {
        if (!(class_37748 instanceof Class_40957) && !class_37748.Method_37757()) {
            Class_31282.Method_31311().Method_6125("Failed to mark a promise as success because it is done already: {}", class_37748);
        }
    }

    protected final boolean Method_44186(Class_37748 class_37748) {
        if (this.Field_44177.isOpen()) {
            return (17473 & 8449) != 0;
        }
        this.Method_44183(class_37748, Class_31282.Field_31291);
        return (17474 & -22503) != 0;
    }

    public final void Method_44187() {
        Class_18249 class_18249 = this.Field_44178;
        if (class_18249 == null) {
            return;
        }
        class_18249.Method_18291();
        this.Method_44182();
    }

    public final void Method_44188() {
        if (!this.Field_44177.isActive()) {
            return;
        }
        try {
            this.Field_44177.Method_31334();
        }
        catch (Exception exception) {
            this.Method_44181(new Class_43859(this, exception));
            this.Method_44189(this.Method_44179());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void Method_44189(Class_37748 class_37748) {
        if (!class_37748.setUncancellable()) {
            return;
        }
        if (this.Field_44176) {
            this.Method_44181(new Class_37011(this, class_37748));
            return;
        }
        if (Class_31282.Method_31312(this.Field_44177).isDone()) {
            this.Method_44185(class_37748);
            return;
        }
        boolean bl = this.Field_44177.isActive();
        Class_18249 class_18249 = this.Field_44178;
        this.Field_44178 = null;
        try {
            this.Field_44177.Method_31330();
            Class_31282.Method_31312(this.Field_44177).Method_47466();
            this.Method_44185(class_37748);
        }
        catch (Throwable throwable) {
            Class_31282.Method_31312(this.Field_44177).Method_47466();
            this.Method_44183(class_37748, throwable);
        }
        try {
            class_18249.Method_18277(Class_31282.Field_31291);
            class_18249.Method_18280(Class_31282.Field_31291);
        }
        finally {
            if (bl && !this.Field_44177.isActive()) {
                this.Method_44181(new Class_32128(this));
            }
            this.Method_44180(this.Method_44179());
        }
    }

    private void Method_44190() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final void Method_44191(Class_38541 class_38541, Class_37748 class_37748) {
        if (class_38541 == null) {
            throw new NullPointerException("eventLoop");
        }
        if (this.Field_44177.Method_31320()) {
            class_37748.Method_37763(new IllegalStateException("registered to an event loop already"));
            return;
        }
        if (!this.Field_44177.Method_31340(class_38541)) {
            class_37748.Method_37763(new IllegalStateException("incompatible event loop type: " + class_38541.getClass().getName()));
            return;
        }
        Class_31282.Method_31336(this.Field_44177, class_38541);
        if (class_38541.inEventLoop()) {
            this.Method_44200(class_37748);
        } else {
            try {
                class_38541.execute(new Class_29637(this, class_37748));
            }
            catch (Throwable throwable) {
                Class_31282.Method_31311().Method_6123("Force-closing a channel whose registration task was not accepted by an event loop: {}", this.Field_44177, throwable);
                this.Method_44192();
                Class_31282.Method_31312(this.Field_44177).Method_47466();
                this.Method_44183(class_37748, throwable);
            }
        }
    }

    public final void Method_44192() {
        try {
            this.Field_44177.Method_31330();
        }
        catch (Exception exception) {
            Class_31282.Method_31311().Method_6127("Failed to close a channel.", exception);
        }
    }

    protected Class_44175(Class_31282 class_31282) {
        this.Field_44177 = class_31282;
        this.Field_44178 = new Class_18249(this.Field_44177);
    }

    protected final void Method_44193() {
        if (this.Field_44177.isOpen()) {
            return;
        }
        this.Method_44189(this.Method_44179());
    }

    public final void Method_44194(Class_37748 class_37748) {
        if (!class_37748.setUncancellable()) {
            return;
        }
        boolean bl = this.Field_44177.isActive();
        try {
            this.Field_44177.Method_31337();
        }
        catch (Throwable throwable) {
            this.Method_44183(class_37748, throwable);
            this.Method_44193();
            return;
        }
        if (bl && !this.Field_44177.isActive()) {
            this.Method_44181(new Class_29729(this));
        }
        this.Method_44185(class_37748);
        this.Method_44193();
    }

    public final void Method_44195(Object object, Class_37748 class_37748) {
        int n;
        Class_18249 class_18249 = this.Field_44178;
        if (class_18249 == null) {
            this.Method_44183(class_37748, Class_31282.Field_31291);
            Class_24761.Method_24765(object);
            return;
        }
        try {
            object = this.Field_44177.Method_31314(object);
            n = this.Field_44177.Method_31305().Method_11650(object);
            if (n < 0) {
                n = 3401 & 8224;
            }
        }
        catch (Throwable throwable) {
            this.Method_44183(class_37748, throwable);
            Class_24761.Method_24765(object);
            return;
        }
        class_18249.Method_18288(object, n, class_37748);
    }

    public final SocketAddress Method_44196() {
        return this.Field_44177.Method_31316();
    }

    public final void Method_44197(SocketAddress socketAddress, Class_37748 class_37748) {
        if (!class_37748.setUncancellable() || !this.Method_44186(class_37748)) {
            return;
        }
        if (!Class_7799.Method_7840() && !Class_7799.Method_7822() && Boolean.TRUE.equals(this.Field_44177.config().Method_19090(Class_25272.Field_25288)) && socketAddress instanceof InetSocketAddress && !((InetSocketAddress)socketAddress).getAddress().isAnyLocalAddress()) {
            Class_31282.Method_31311().Method_6132("A non-root user can't receive a broadcast packet if the socket is not bound to a wildcard address; binding to a non-wildcard address (" + socketAddress + ") anyway as requested.");
        }
        boolean bl = this.Field_44177.isActive();
        try {
            this.Field_44177.Method_31332(socketAddress);
        }
        catch (Throwable throwable) {
            this.Method_44183(class_37748, throwable);
            this.Method_44193();
            return;
        }
        if (!bl && this.Field_44177.isActive()) {
            this.Method_44181(new Class_25793(this));
        }
        this.Method_44185(class_37748);
    }

    public final Class_18249 Method_44198() {
        return this.Field_44178;
    }

    public final SocketAddress Method_44199() {
        return this.Field_44177.Method_31326();
    }

    private void Method_44200(Class_37748 class_37748) {
        try {
            if (!class_37748.setUncancellable() || !this.Method_44186(class_37748)) {
                return;
            }
            this.Field_44177.Method_31306();
            Class_31282.Method_31323(this.Field_44177, (-22253 & 4097) != 0);
            this.Method_44185(class_37748);
            Class_31282.Method_31302(this.Field_44177).Method_24856();
            if (this.Field_44177.isActive()) {
                Class_31282.Method_31302(this.Field_44177).Method_24825();
            }
        }
        catch (Throwable throwable) {
            this.Method_44192();
            Class_31282.Method_31312(this.Field_44177).Method_47466();
            this.Method_44183(class_37748, throwable);
        }
    }
}

