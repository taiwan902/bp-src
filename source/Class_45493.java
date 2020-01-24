/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.List;

public class Class_45493
extends Class_41600
implements Class_30368 {
    private static final Class_6113 Field_45494;
    private static final SelectorProvider Field_45495;
    private static final Class_10290 Field_45496;
    private final Class_20080 Field_45497 = new Class_38092(this, this, this.Method_45508().socket(), null);

    private static ServerSocketChannel Method_45498(SelectorProvider selectorProvider) {
        try {
            return selectorProvider.openServerSocketChannel();
        }
        catch (IOException iOException) {
            throw new Class_31422("Failed to open a server socket.", iOException);
        }
    }

    public SocketAddress Method_45499() {
        return this.Method_45517();
    }

    protected SocketAddress Method_45500() {
        return null;
    }

    protected SelectableChannel Method_45501() {
        return this.Method_45508();
    }

    protected SocketAddress Method_45502() {
        return this.Method_45508().socket().getLocalSocketAddress();
    }

    public boolean Method_45503() {
        return this.Method_45508().socket().isBound();
    }

    protected boolean Method_45504(Object object, Class_18249 class_18249) {
        throw new UnsupportedOperationException();
    }

    protected void Method_45505() {
        throw new UnsupportedOperationException();
    }

    public Class_19087 Method_45506() {
        return this.Method_45516();
    }

    static {
        Field_45496 = new Class_10290((-7550 & 4) != 0);
        Field_45495 = SelectorProvider.provider();
        Field_45494 = Class_10201.Method_10203(Class_45493.class);
    }

    static void Method_45507(Class_45493 class_45493, boolean bl) {
        class_45493.setReadPending(bl);
    }

    protected ServerSocketChannel Method_45508() {
        return (ServerSocketChannel)super.javaChannel();
    }

    private void Method_45509() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public SocketAddress Method_45510() {
        return this.Method_45511();
    }

    public InetSocketAddress Method_45511() {
        return (InetSocketAddress)super.localAddress();
    }

    protected void Method_45512() {
        this.Method_45508().close();
    }

    protected void Method_45513(SocketAddress socketAddress) {
        this.Method_45508().socket().bind(socketAddress, this.Field_45497.Method_20082());
    }

    protected int Method_45514(List list) {
        SocketChannel socketChannel = this.Method_45508().accept();
        try {
            if (socketChannel != null) {
                list.add(new Class_47482(this, socketChannel));
                return 1059 & -5947;
            }
        }
        catch (Throwable throwable) {
            Field_45494.Method_6127("Failed to create a new channel from an accepted socket.", throwable);
            try {
                socketChannel.close();
            }
            catch (Throwable throwable2) {
                Field_45494.Method_6127("Failed to close a socket.", throwable2);
            }
        }
        return -30205 & 8308;
    }

    protected final Object Method_45515(Object object) {
        throw new UnsupportedOperationException();
    }

    public Class_20080 Method_45516() {
        return this.Field_45497;
    }

    public InetSocketAddress Method_45517() {
        return null;
    }

    public Class_45493(ServerSocketChannel serverSocketChannel) {
        super(null, serverSocketChannel, -32688 & 9879);
    }

    protected void Method_45518() {
        throw new UnsupportedOperationException();
    }

    public Class_10290 Method_45519() {
        return Field_45496;
    }

    protected boolean Method_45520(SocketAddress socketAddress, SocketAddress socketAddress2) {
        throw new UnsupportedOperationException();
    }

    public Class_45493() {
        this(Class_45493.Method_45498(Field_45495));
    }
}

