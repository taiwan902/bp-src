/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38587
extends Class_38064 {
    private void Method_38588() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_38587(Class_859 class_859, Class_859 class_8592) {
        super("player_death");
        if (class_859 != null) {
            this.\u0000strictfp("player", class_859.\u0000, `());
        }
        if (class_8592 != null) {
            this.\u0000strictfp("killer", class_8592.\u0000, `());
        }
    }
}

