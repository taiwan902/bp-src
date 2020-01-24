/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

public class Class_24008
implements Callable {
    final Class_18 Field_24009;

    public Object Method_24010() {
        return this.Method_24011();
    }

    public String Method_24011() {
        String string = ClientBrandRetriever.\u0000strictfp();
        return !string.equals("vanilla") ? "Definitely; Client brand changed to '" + string + "'" : (Class_18.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.");
    }

    Class_24008(Class_18 class_18) {
        this.Field_24009 = class_18;
    }

    private void Method_24012() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

