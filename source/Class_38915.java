/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.Color
 */
import internal.org.lwjgl.util.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_38915
extends Class_38779 {
    private final Color Field_38916;
    private int Field_38917;
    private int Field_38918;
    private int Field_38919;
    private final Class_8135 Field_38920;

    public void Method_38921(Class_1551 class_1551) {
        float f = Class_14952.Method_14954(this.Field_38920.Method_8141());
        int n = this.Field_38919 - this.Field_38917;
        if (f != 0.0f) {
            int n2 = this.Field_38916.getAlpha();
            if (n2 == 0) {
                n2 = (int)(Class_12155.Method_12156(this.Field_38920) * (96.333336f * 2.6470587f));
            }
            if (n2 != 0) {
                int n3 = Class_14952.Method_14955(n2, this.Field_38916.getRed(), this.Field_38916.getGreen(), this.Field_38916.getBlue());
                this.Method_38926(class_1551, this.Field_38917, this.Field_38917 + (int)((float)n * f), this.Field_38918, n3);
            }
        }
    }

    public void Method_38922(int n) {
        this.Field_38918 = n;
    }

    public void Method_38923(int n) {
        this.Field_38919 = n;
    }

    public int Method_38924() {
        return this.Field_38918;
    }

    public Class_38915(int n, int n2, int n3, Class_8135 class_8135, Color color) {
        this.Field_38917 = n;
        this.Field_38918 = n2;
        this.Field_38919 = n3;
        this.Field_38920 = class_8135;
        this.Field_38916 = color;
    }

    private void Method_38925() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public abstract void Method_38926(Class_1551 var1, int var2, int var3, int var4, int var5);

    public void Method_38927(int n) {
        this.Field_38917 = n;
    }
}

