/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_15024
extends Class_7905 {
    public boolean Method_15025(SocketAddress socketAddress) {
        String string = this.Method_15026(socketAddress);
        return this.\u0000strictfp((Object)string);
    }

    private String Method_15026(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (string.contains("/")) {
            string = string.substring(string.indexOf(9455 & 2095) + (18947 & 1477));
        }
        if (string.contains(":")) {
            string = string.substring(-24380 & 265, string.indexOf(4922 & 122));
        }
        return string;
    }

    protected Class_9848 Method_15027(JsonObject jsonObject) {
        return new Class_27129(jsonObject);
    }

    public Class_27129 Method_15028(SocketAddress socketAddress) {
        String string = this.Method_15026(socketAddress);
        return (Class_27129)this.\u0000strictfp((Object)string);
    }

    private void Method_15029() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15024(File file) {
        super(file);
    }
}

