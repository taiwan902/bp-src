/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.spi.SelectorProvider;

public class Class_47482
extends Class_41410
implements Class_43291 {
    private static final Class_10290 Field_47483 = new Class_10290((8710 & 16688) != 0);
    private static final SelectorProvider Field_47484 = SelectorProvider.provider();
    private final Class_23921 Field_47485;

    protected void Method_47486() {
        this.Method_47497();
    }

    public Class_47482() {
        this(Class_47482.Method_47492(Field_47484));
    }

    protected long Method_47487(Class_23060 class_23060) {
        long l = class_23060.Method_23061();
        return class_23060.Method_23062(this.Method_47505(), l);
    }

    protected int Method_47488(Class_22553 class_22553) {
        int n = class_22553.Method_22564();
        return class_22553.Method_22591(this.Method_47505(), n);
    }

    protected int Method_47489(Class_22553 class_22553) {
        return class_22553.Method_22566(this.Method_47505(), class_22553.Method_22574());
    }

    protected void Method_47490(SocketAddress socketAddress) {
        this.Method_47505().socket().bind(socketAddress);
    }

    private void Method_47491() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static SocketChannel Method_47492(SelectorProvider selectorProvider) {
        try {
            return selectorProvider.openSocketChannel();
        }
        catch (IOException iOException) {
            throw new Class_31422("Failed to open a socket.", iOException);
        }
    }

    static void Method_47493(Class_47482 class_47482, boolean bl) {
        class_47482.setReadPending(bl);
    }

    protected SelectableChannel Method_47494() {
        return this.Method_47505();
    }

    public InetSocketAddress Method_47495() {
        return (InetSocketAddress)super.localAddress();
    }

    public Class_23921 Method_47496() {
        return this.Field_47485;
    }

    protected void Method_47497() {
        this.Method_47505().close();
    }

    protected void Method_47498(Class_18249 class_18249) {
        block10 : {
            int n;
            int n2;
            do {
                int n3;
                if ((n3 = class_18249.Method_18269()) == 0) {
                    this.clearOpWrite();
                    break block10;
                }
                long l = 2948609156324004042L & -2948609156719820764L;
                n2 = 20696 & 8452;
                n = 6591 & 0;
                ByteBuffer[] arrbyteBuffer = class_18249.Method_18274();
                int n4 = class_18249.Method_18271();
                long l2 = class_18249.Method_18265();
                SocketChannel socketChannel = this.Method_47505();
                block0 : switch (n4) {
                    case 0: {
                        super.Method_41420(class_18249);
                        return;
                    }
                    case 1: {
                        int n5;
                        long l3;
                        ByteBuffer byteBuffer = arrbyteBuffer[20659 & 8192];
                        for (n5 = this.Method_47496().getWriteSpinCount() - (8201 & 21521); n5 >= 0; --n5) {
                            l3 = socketChannel.write(byteBuffer);
                            if (l3 == false) {
                                n = 16977 & 3209;
                                break block0;
                            }
                            l += (long)l3;
                            if ((l2 -= (long)l3) != (587946596856025474L & 1617497168L)) continue;
                            n2 = 545 & 21913;
                            break block0;
                        }
                        break;
                    }
                    default: {
                        int n5;
                        long l3;
                        for (n5 = this.Method_47496().getWriteSpinCount() - (17953 & -32319); n5 >= 0; --n5) {
                            l3 = socketChannel.write(arrbyteBuffer, 72 & 4277, n4);
                            if (l3 == (654312608L & 1209274957L)) {
                                n = -16381 & 73;
                                break block0;
                            }
                            l += l3;
                            if ((l2 -= l3) != (1094852616L & 268502288L)) continue;
                            n2 = 6145 & -24375;
                            break block0;
                        }
                    }
                }
                class_18249.Method_18284(l);
            } while (n2 != 0);
            this.incompleteWrite(n != 0);
        }
    }

    public Class_10290 Method_47499() {
        return Field_47483;
    }

    public SocketAddress Method_47500() {
        return this.Method_47495();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected boolean Method_47501(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            this.Method_47505().socket().bind(socketAddress2);
        }
        int n = 1026 & 6880;
        try {
            boolean bl = this.Method_47505().connect(socketAddress);
            if (!bl) {
                this.selectionKey().interestOps(74 & 6152);
            }
            n = 8195 & 1717;
            boolean bl2 = bl;
            return bl2;
        }
        finally {
            if (n == 0) {
                this.Method_47497();
            }
        }
    }

    public SocketAddress Method_47502() {
        return this.Method_47510();
    }

    protected void Method_47503() {
        if (!this.Method_47505().finishConnect()) {
            throw new Error();
        }
    }

    public Class_26095 Method_47504() {
        return this.Method_47509();
    }

    public Class_47482(SocketChannel socketChannel) {
        this(null, socketChannel);
    }

    public Class_47482(Class_26095 class_26095, SocketChannel socketChannel) {
        super(class_26095, socketChannel);
        this.Field_47485 = new Class_29421(this, this, socketChannel.socket(), null);
    }

    protected SocketChannel Method_47505() {
        return (SocketChannel)super.javaChannel();
    }

    protected SocketAddress Method_47506() {
        return this.Method_47505().socket().getLocalSocketAddress();
    }

    protected SocketAddress Method_47507() {
        return this.Method_47505().socket().getRemoteSocketAddress();
    }

    public Class_27581 Method_47508(Class_37748 class_37748) {
        Class_47307 class_47307 = this.eventLoop();
        if (class_47307.inEventLoop()) {
            try {
                this.Method_47505().socket().shutdownOutput();
                class_37748.Method_37762();
            }
            catch (Throwable throwable) {
                class_37748.Method_37763(throwable);
            }
        } else {
            class_47307.execute(new Class_32113(this, class_37748));
        }
        return class_37748;
    }

    public Class_30368 Method_47509() {
        return (Class_30368)super.parent();
    }

    public InetSocketAddress Method_47510() {
        return (InetSocketAddress)super.remoteAddress();
    }

    public Class_19087 Method_47511() {
        return this.Method_47496();
    }

    public boolean Method_47512() {
        SocketChannel socketChannel = this.Method_47505();
        return (socketChannel.isOpen() && socketChannel.isConnected() ? 2383 & -8143 : 24772 & 513) != 0;
    }
}

