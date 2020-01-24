/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15266
extends Thread {
    final String Field_15267;
    final Class_24595 Field_15268;

    Class_15266(Class_24595 class_24595, String string) {
        this.Field_15268 = class_24595;
        this.Field_15267 = string;
    }

    public void Method_15269() {
        Class_24595.Method_24633("Connecting to " + this.Field_15267 + "...");
        ((Class_38936)((Class_38936)((Class_38936)((Class_38936)((Class_38936)new Class_38936().group((Class_18163)Class_24595.Field_24601)).channel(Class_47482.class)).handler((Class_31885)new Class_44847(this))).option(Class_25272.Field_25287, (Object)((1297 & 8321) != 0))).option(Class_25272.Field_25281, (Object)(7048 & 29672))).Method_38965(this.Field_15267, -7233 & 5563).Method_27583(Class_21832.Field_21833);
    }

    private void Method_15270() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

