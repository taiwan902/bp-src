/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_16635 {
    int Field_16636;
    int Field_16637;
    Class_4595 Field_16638;
    Class_6176 Field_16639;

    public final void Method_16640(int n) {
        this.Field_16636 |= (25649 & 4165) << n;
    }

    private void Method_16641() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final boolean Method_16642(int n) {
        return ((this.Field_16636 & (14425 & -14973) << n) != 0 ? 8965 & -31743 : -10096 & 864) != 0;
    }

    public void Method_16643(Class_6176 class_6176, Class_4595 class_4595, int n) {
        this.Field_16639 = class_6176;
        this.Field_16638 = class_4595;
        this.Field_16637 = n;
        this.Field_16636 = 10820 & 264;
    }

    public Class_16635(Class_6176 class_6176, Class_4595 class_4595, int n) {
        this.Method_16643(class_6176, class_4595, n);
    }

    public final void Method_16644(Class_16635 class_16635) {
        this.Field_16636 |= class_16635.Field_16636;
    }
}

