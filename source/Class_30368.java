/*
 * Decompiled with CFR 0.145.
 */
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public interface Class_30368
extends Class_28228 {
    public InetSocketAddress Method_30369();

    default public Class_19087 Method_30370() {
        return this.Method_30372();
    }

    default public SocketAddress Method_30371() {
        return this.Method_30374();
    }

    public Class_20080 Method_30372();

    default public SocketAddress Method_30373() {
        return this.Method_30369();
    }

    public InetSocketAddress Method_30374();
}

