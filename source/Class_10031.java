/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public final class Class_10031
extends URLStreamHandler {
    final Class_2080 Field_10032;
    final String Field_10033;
    final String Field_10034;

    Class_10031(String string, String string2, Class_2080 class_2080) {
        this.Field_10034 = string;
        this.Field_10033 = string2;
        this.Field_10032 = class_2080;
    }

    private void Method_10035() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected URLConnection Method_10036(URL uRL) {
        return new Class_16079(this, uRL);
    }
}

