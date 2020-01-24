/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_23737
implements Callable {
    final Class_31566 Field_23738;
    final Class_22849 Field_23739;

    Class_23737(Class_22849 class_22849, Class_31566 class_31566) {
        this.Field_23739 = class_22849;
        this.Field_23738 = class_31566;
    }

    private void Method_23740() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_23741() {
        Object[] arrobject = new Object[2063 & 9237];
        arrobject[-30716 & 12800] = this.Field_23738.Method_31574();
        arrobject[5625 & 513] = this.Field_23738.Method_31575();
        arrobject[810 & -30634] = Class_22849.Method_22946((Class_22849)this.Field_23739).Field_80;
        arrobject[4667 & 8455] = Class_22849.Method_22946((Class_22849)this.Field_23739).Field_44;
        arrobject[7236 & -16121] = this.Field_23738.Method_31572();
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", arrobject);
    }

    public Object Method_23742() {
        return this.Method_23741();
    }
}

