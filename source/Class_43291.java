/*
 * Decompiled with CFR 0.145.
 */
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public interface Class_43291
extends Class_26095 {
    public InetSocketAddress Method_43292();

    public InetSocketAddress Method_43293();

    public Class_23921 Method_43294();

    default public SocketAddress Method_43295() {
        return this.Method_43293();
    }

    default public Class_19087 Method_43296() {
        return this.Method_43294();
    }

    default public SocketAddress Method_43297() {
        return this.Method_43292();
    }
}

