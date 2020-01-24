/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40258
extends Class_38064 {
    private void Method_40259() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_40258(Class_859 class_859, Class_859 class_8592) {
        super("player_combat");
        this.\u0000strictfp("player", class_859.\u0000, `());
        if (class_8592 != null) {
            this.\u0000strictfp("primary_opponent", class_8592.\u0000, `());
        }
        if (class_8592 != null) {
            this.\u0000strictfp("Combat between " + class_859.\u0000, `() + " and " + class_8592.\u0000, `());
        } else {
            this.\u0000strictfp("Combat between " + class_859.\u0000, `() + " and others");
        }
    }
}

