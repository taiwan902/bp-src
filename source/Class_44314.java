/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.ConnectException;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.util.concurrent.TimeUnit;

public abstract class Class_44314
extends Class_44175
implements Class_26558 {
    final Class_41102 Field_44315;
    static final boolean Field_44316 = !Class_41102.class.desiredAssertionStatus() ? 16913 & -24317 : 24642 & 261;

    public final void Method_44317() {
        super.Method_44182();
    }

    protected final void Method_44318() {
        SelectionKey selectionKey = this.Field_44315.Method_41121();
        if (!selectionKey.isValid()) {
            return;
        }
        int n = selectionKey.interestOps();
        if ((n & this.Field_44315.Field_41111) != 0) {
            selectionKey.interestOps(n & (this.Field_44315.Field_41111 ^ -1 & -1));
        }
    }

    private boolean Method_44319() {
        SelectionKey selectionKey = this.Field_44315.Method_41121();
        return (selectionKey.isValid() && (selectionKey.interestOps() & (-26465 & 516)) != 0 ? 18519 & -32255 : 2180 & -31688) != 0;
    }

    public final void Method_44320() {
        if (!Field_44316 && !this.Field_44315.Method_41117().inEventLoop()) {
            throw new AssertionError();
        }
        try {
            boolean bl = this.Field_44315.isActive();
            this.Field_44315.Method_41131();
            this.Method_44325(Class_41102.Method_41120(this.Field_44315), bl);
        }
        catch (Throwable throwable) {
            try {
                ConnectException connectException;
                if (throwable instanceof ConnectException) {
                    ConnectException connectException2 = new ConnectException(throwable.getMessage() + ": " + Class_41102.Method_41126(this.Field_44315));
                    connectException2.setStackTrace(throwable.getStackTrace());
                    connectException = connectException2;
                }
                this.Method_44324(Class_41102.Method_41120(this.Field_44315), connectException);
            }
            catch (Throwable throwable2) {
                if (Class_41102.Method_41125(this.Field_44315) != null) {
                    Class_41102.Method_41125(this.Field_44315).cancel((2128 & -19803) != 0);
                }
                Class_41102.Method_41132(this.Field_44315, null);
                throw throwable2;
            }
            if (Class_41102.Method_41125(this.Field_44315) != null) {
                Class_41102.Method_41125(this.Field_44315).cancel((1082 & 7044) != 0);
            }
            Class_41102.Method_41132(this.Field_44315, null);
        }
        if (Class_41102.Method_41125(this.Field_44315) != null) {
            Class_41102.Method_41125(this.Field_44315).cancel((4176 & 17408) != 0);
        }
        Class_41102.Method_41132(this.Field_44315, null);
    }

    protected final void Method_44321() {
        if (this.Method_44319()) {
            return;
        }
        super.Method_44182();
    }

    private void Method_44322() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final void Method_44323(SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        if (!class_37748.setUncancellable() || !this.ensureOpen(class_37748)) {
            return;
        }
        try {
            if (Class_41102.Method_41120(this.Field_44315) != null) {
                throw new IllegalStateException("connection attempt already made");
            }
            boolean bl = this.Field_44315.isActive();
            if (this.Field_44315.Method_41114(socketAddress, socketAddress2)) {
                this.Method_44325(class_37748, bl);
            } else {
                Class_41102.Method_41132(this.Field_44315, class_37748);
                Class_41102.Method_41113(this.Field_44315, socketAddress);
                int n = this.Field_44315.config().Method_19088();
                if (n > 0) {
                    Class_41102.Method_41122(this.Field_44315, this.Field_44315.Method_41117().schedule((Runnable)new Class_26239(this, socketAddress), (long)n, TimeUnit.MILLISECONDS));
                }
                class_37748.Method_37766(new Class_33428(this));
            }
        }
        catch (Throwable throwable) {
            ConnectException connectException;
            if (throwable instanceof ConnectException) {
                ConnectException connectException2 = new ConnectException(throwable.getMessage() + ": " + socketAddress);
                connectException2.setStackTrace(throwable.getStackTrace());
                connectException = connectException2;
            }
            class_37748.tryFailure((Throwable)connectException);
            this.closeIfClosed();
        }
    }

    private void Method_44324(Class_37748 class_37748, Throwable throwable) {
        if (class_37748 == null) {
            return;
        }
        class_37748.tryFailure(throwable);
        this.closeIfClosed();
    }

    protected Class_44314(Class_41102 class_41102) {
        this.Field_44315 = class_41102;
        super(class_41102);
    }

    private void Method_44325(Class_37748 class_37748, boolean bl) {
        if (class_37748 == null) {
            return;
        }
        boolean bl2 = class_37748.Method_37757();
        if (!bl && this.Field_44315.isActive()) {
            this.Field_44315.pipeline().Method_6278();
        }
        if (!bl2) {
            this.close(this.voidPromise());
        }
    }
}

