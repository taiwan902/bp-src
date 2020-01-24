/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Mouse
 */
import internal.org.lwjgl.input.Mouse;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_11991
implements Callable {
    final int Field_11992;
    final int Field_11993;
    final Class_22849 Field_11994;

    Class_11991(Class_22849 class_22849, int n, int n2) {
        this.Field_11994 = class_22849;
        this.Field_11992 = n;
        this.Field_11993 = n2;
    }

    public Object Method_11995() {
        return this.Method_11996();
    }

    public String Method_11996() {
        Object[] arrobject = new Object[24581 & 52];
        arrobject[-16304 & 12298] = this.Field_11992;
        arrobject[-31663 & 6177] = this.Field_11993;
        arrobject[7234 & 8195] = Mouse.getX();
        arrobject[12803 & 3387] = Mouse.getY();
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", arrobject);
    }

    private void Method_11997() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

