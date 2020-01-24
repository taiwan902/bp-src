/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.concurrent.ScheduledFuture;

public abstract class Class_41102
extends Class_31282 {
    private static final Class_6113 Field_41103;
    private ScheduledFuture Field_41104;
    private boolean Field_41105;
    SelectionKey Field_41106;
    private final SelectableChannel Field_41107;
    static final boolean Field_41108;
    private Class_37748 Field_41109;
    private SocketAddress Field_41110;
    protected final int Field_41111;
    private boolean Field_41112;

    static SocketAddress Method_41113(Class_41102 class_41102, SocketAddress socketAddress) {
        class_41102.Field_41110 = socketAddress;
        return class_41102.Field_41110;
    }

    protected Class_41102(Class_26095 class_26095, SelectableChannel selectableChannel, int n) {
        super(class_26095);
        this.Field_41107 = selectableChannel;
        this.Field_41111 = n;
        try {
            selectableChannel.configureBlocking((1281 & -28038) != 0);
        }
        catch (IOException iOException) {
            block4 : {
                try {
                    selectableChannel.close();
                }
                catch (IOException iOException2) {
                    if (!Field_41103.Method_6119()) break block4;
                    Field_41103.Method_6127("Failed to close a partially initialized socket.", iOException2);
                }
            }
            throw new Class_31422("Failed to enter non-blocking mode.", iOException);
        }
    }

    protected abstract boolean Method_41114(SocketAddress var1, SocketAddress var2);

    public Class_26558 Method_41115() {
        return (Class_26558)super.Method_31325();
    }

    public boolean Method_41116() {
        return this.Field_41107.isOpen();
    }

    static {
        Field_41108 = !Class_41102.class.desiredAssertionStatus() ? -32735 & 13593 : -32384 & 8740;
        Field_41103 = Class_10201.Method_10203(Class_41102.class);
    }

    public Class_47307 Method_41117() {
        return (Class_47307)super.Method_31339();
    }

    protected boolean Method_41118(Class_38541 class_38541) {
        return class_38541 instanceof Class_47307;
    }

    protected void Method_41119() {
        int n = 8 & 548;
        do {
            try {
                this.Field_41106 = this.Method_41135().register(this.Method_41117().Field_47308, 16416 & -17918, this);
                return;
            }
            catch (CancelledKeyException cancelledKeyException) {
                if (n == 0) {
                    this.Method_41117().Method_47320();
                    n = -27377 & 8817;
                    continue;
                }
                throw cancelledKeyException;
            }
            break;
        } while (true);
    }

    static Class_37748 Method_41120(Class_41102 class_41102) {
        return class_41102.Field_41109;
    }

    protected SelectionKey Method_41121() {
        if (!Field_41108 && this.Field_41106 == null) {
            throw new AssertionError();
        }
        return this.Field_41106;
    }

    static ScheduledFuture Method_41122(Class_41102 class_41102, ScheduledFuture scheduledFuture) {
        class_41102.Field_41104 = scheduledFuture;
        return class_41102.Field_41104;
    }

    protected void Method_41123() {
        this.Method_41117().Method_47342(this.Method_41121());
    }

    protected void Method_41124() {
        if (this.Field_41105) {
            return;
        }
        SelectionKey selectionKey = this.Field_41106;
        if (!selectionKey.isValid()) {
            return;
        }
        this.Field_41112 = 17 & 16709;
        int n = selectionKey.interestOps();
        if ((n & this.Field_41111) == 0) {
            selectionKey.interestOps(n | this.Field_41111);
        }
    }

    static ScheduledFuture Method_41125(Class_41102 class_41102) {
        return class_41102.Field_41104;
    }

    static SocketAddress Method_41126(Class_41102 class_41102) {
        return class_41102.Field_41110;
    }

    private void Method_41127() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    void Method_41128() {
        this.Field_41105 = 8979 & 77;
    }

    protected boolean Method_41129() {
        return this.Field_41112;
    }

    protected void Method_41130(boolean bl) {
        this.Field_41112 = bl;
    }

    protected abstract void Method_41131();

    static Class_37748 Method_41132(Class_41102 class_41102, Class_37748 class_37748) {
        class_41102.Field_41109 = class_37748;
        return class_41102.Field_41109;
    }

    protected final Class_22553 Method_41133(Class_22553 class_22553) {
        int n = class_22553.Method_22564();
        if (n == 0) {
            Class_24761.Method_24766(class_22553);
            return Class_16620.Field_16622;
        }
        Class_22837 class_22837 = this.alloc();
        if (class_22837.Method_22839()) {
            Class_22553 class_225532 = class_22837.Method_22843(n);
            class_225532.Method_22585(class_22553, class_22553.Method_22582(), n);
            Class_24761.Method_24766(class_22553);
            return class_225532;
        }
        Class_22553 class_225533 = Class_10346.Method_10369();
        if (class_225533 != null) {
            class_225533.Method_22585(class_22553, class_22553.Method_22582(), n);
            Class_24761.Method_24766(class_22553);
            return class_225533;
        }
        return class_22553;
    }

    public Class_7311 Method_41134() {
        return this.Method_41115();
    }

    protected SelectableChannel Method_41135() {
        return this.Field_41107;
    }

    public Class_38541 Method_41136() {
        return this.Method_41117();
    }
}

