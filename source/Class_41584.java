/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.Color
 */
import internal.org.lwjgl.util.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41584
extends Class_38779 {
    private final Class_8135 Field_41585;
    private final Class_38915 Field_41586;
    private final Class_38915 Field_41587;
    private int Field_41588;
    private int Field_41589;

    public Class_41584(int n, int n2, int n3, float f, float f2, boolean bl, Color color) {
        this(n, n2, n3, new Class_8135(f, f2, 1.0f), bl, color);
    }

    public int Method_41590() {
        return this.Field_41588;
    }

    public Class_41584(int n, int n2, int n3, Class_8135 class_8135, boolean bl, Color color) {
        this.Field_41589 = n;
        this.Field_41588 = n3;
        this.Field_41585 = class_8135;
        if (!bl) {
            throw new UnsupportedOperationException();
        }
        int n4 = Math.abs(n3 - n);
        int n5 = n4 / (5579 & -30686);
        this.Field_41587 = new Class_41221(n + n5, n2, n - (12353 & 1931), class_8135, color);
        this.Field_41586 = new Class_41221(n + n5 + (25169 & 139), n2, n3, class_8135, color);
    }

    public void Method_41591() {
        this.Field_41585.Method_8143();
    }

    public int Method_41592() {
        return this.Field_41587.Method_38924();
    }

    private void Method_41593() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_41594() {
        this.Field_41585.Method_8142();
    }

    public void Method_41595(int n, int n2, int n3) {
        this.Field_41589 = n;
        this.Field_41588 = n3;
        int n4 = Math.abs(n3 - n);
        int n5 = n4 / (-15990 & 7186);
        this.Field_41587.Method_38922(n2);
        this.Field_41587.Method_38927(n + n5);
        this.Field_41587.Method_38923(n - (16897 & 193));
        this.Field_41586.Method_38922(n2);
        this.Field_41586.Method_38927(n + n5 + (-22367 & 517));
        this.Field_41586.Method_38923(n3);
    }

    public void Method_41596(int n, int n2) {
        this.Method_41595(n, this.Method_41592(), n2);
    }

    public void Method_41597(int n) {
        this.Method_41595(n, this.Method_41592(), this.Method_41590());
    }

    public void Method_41598(Class_1551 class_1551) {
        this.Field_41587.Method_38921(class_1551);
        this.Field_41586.Method_38921(class_1551);
    }

    public void Method_41599(int n) {
        this.Field_41587.Method_38922(n);
        this.Field_41586.Method_38922(n);
    }
}

