/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.Color
 */
import internal.org.lwjgl.util.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40903
extends Class_38779 {
    private final Class_41221 Field_40904;
    private final Class_41221 Field_40905;
    private final Class_8135 Field_40906;
    public static final Color Field_40907 = new Color(117 & -27932, 622 & 21989, 1140 & 101, 4171 & -30716);

    public void Method_40908() {
        this.Field_40906.Method_8143();
    }

    public void Method_40909() {
        this.Field_40906.Method_8142();
    }

    public void Method_40910(Class_1551 class_1551) {
        this.Field_40905.\u0000strictfp(class_1551);
        this.Field_40904.\u0000strictfp(class_1551);
    }

    private void Method_40911() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40912(int n, int n2) {
        this.Field_40905.\u0000= final(n);
        this.Field_40905.\u0000strictfp(n2);
        this.Field_40904.\u0000= final(n2);
        this.Field_40904.\u0000strictfp(n);
    }

    public float Method_40913() {
        return this.Field_40906.Method_8141();
    }

    public Class_40903(int n, int n2, int n3, int n4, float f, float f2, float f3) {
        this.Field_40906 = new Class_8135(f3, f, f2);
        this.Field_40905 = new Class_41221(n, n2, n3, this.Field_40906, Field_40907);
        this.Field_40904 = new Class_41221(n3, n4, n, this.Field_40906, Field_40907);
    }

    public void Method_40914(int n, int n2) {
        this.Field_40905.\u0000, `(n);
        this.Field_40904.\u0000, `(n2);
    }
}

