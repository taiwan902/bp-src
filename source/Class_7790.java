/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7790
implements Callable {
    final Class_570 Field_7791;

    private void Method_7792() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_7793() {
        return this.Field_7791.Field_580.Method_180() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
    }

    Class_7790(Class_570 class_570) {
        this.Field_7791 = class_570;
    }

    public Object Method_7794() {
        return this.Method_7793();
    }
}

