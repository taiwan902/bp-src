/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

public class Class_15173
implements Callable {
    final Class_3013 Field_15174;

    Class_15173(Class_3013 class_3013) {
        this.Field_15174 = class_3013;
    }

    private void Method_15175() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_15176() {
        String string = ClientBrandRetriever.\u0000strictfp();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.Field_15174.\u0000
        ();
        return !string.equals("vanilla") ? "Definitely; Server brand changed to '" + string + "'" : (Class_18.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.");
    }

    public Object Method_15177() {
        return this.Method_15176();
    }
}

