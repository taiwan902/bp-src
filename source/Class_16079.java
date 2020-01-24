/*
 * Decompiled with CFR 0.145.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLConnection;

public class Class_16079
extends URLConnection {
    final Class_10031 Field_16080;

    private void Method_16081() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_16082() {
    }

    public InputStream Method_16083() {
        if (this.Field_16080.Field_10034.equals("blazingpack")) {
            Class_9924 class_9924 = Class_12251.Method_12255(this.Field_16080.Field_10033);
            if (class_9924 != null && class_9924.Field_9927 != null) {
                return new ByteArrayInputStream(class_9924.Field_9927.Method_22599(), 4097 & 930, class_9924.Field_9927.Method_22564());
            }
            return null;
        }
        return Class_18.Field_89.Method_208().Method_282(this.Field_16080.Field_10032).Method_9958();
    }

    Class_16079(Class_10031 class_10031, URL uRL) {
        this.Field_16080 = class_10031;
        super(uRL);
    }
}

