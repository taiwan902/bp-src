/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38498
extends Class_38064 {
    private void Method_38499() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_38498(Class_14225 class_14225) {
        super("achievement");
        this.\u0000strictfp("achievement_id", class_14225.\u0000strictfp);
        this.\u0000strictfp("achievement_name", class_14225.Method_14242().Method_1788());
        this.\u0000strictfp("achievement_description", class_14225.Method_14241());
        this.\u0000strictfp("Achievement '" + class_14225.Method_14242().Method_1788() + "' obtained!");
    }
}

