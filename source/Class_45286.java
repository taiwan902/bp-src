/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public final class Class_45286
extends Class_43683 {
    private final AtomicLong Field_45287 = new AtomicLong();
    private final boolean Field_45288;
    private boolean Field_45289;
    private final Queue Field_45290 = new ArrayDeque();

    private void Method_45291() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static boolean Method_45292(Class_45286 class_45286, boolean bl) {
        class_45286.Field_45289 = bl;
        return class_45286.Field_45289;
    }

    static boolean Method_45293(Class_45286 class_45286) {
        return class_45286.Field_45289;
    }

    public Class_45286() {
        this(4532 & 5121, -22455 & 24576, 13700 & 10337, (-29600 & 393) != 0);
    }

    static boolean Method_45294(Class_45286 class_45286) {
        return class_45286.Field_45288;
    }

    static AtomicLong Method_45295(Class_45286 class_45286) {
        return class_45286.Field_45287;
    }

    public Class_45286(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.init((Class_35822)new Class_47675(this, n, n2, n3, bl2), (Class_31877)new Class_47451(this, null));
        this.Field_45288 = bl;
    }

    static Queue Method_45296(Class_45286 class_45286) {
        return class_45286.Field_45290;
    }

    public Class_45286(int n, int n2, int n3, boolean bl) {
        this(n, n2, n3, bl, (83 & 8609) != 0);
    }
}

