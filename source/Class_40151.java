/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40151
implements Class_1486 {
    private int Field_40152;
    private byte Field_40153;
    private byte Field_40154;
    private byte Field_40155;
    private int Field_40156;

    public boolean Method_40157() {
        return (this.Field_40156 == (32767 & 32767) ? 4355 & -32667 : 15874 & 384) != 0;
    }

    public boolean Method_40158() {
        return (this.Field_40153 != 0 ? -23295 & 2593 : 2178 & 4193) != 0;
    }

    public void Method_40159(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_40152);
        class_29900.Method_29949(this.Field_40154);
        class_29900.Method_29949(this.Field_40155);
        class_29900.Method_29982(this.Field_40156);
        class_29900.Method_29949(this.Field_40153);
    }

    public Class_40151() {
    }

    public void Method_40160(Class_14856 class_14856) {
        class_14856.Method_14866(this);
    }

    private void Method_40161() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_40151(int n, Class_25240 class_25240) {
        this.Field_40152 = n;
        this.Field_40154 = (byte)(class_25240.Method_25253() & (255 & 1279));
        this.Field_40155 = (byte)(class_25240.Method_25257() & (14591 & 767));
        this.Field_40156 = class_25240.Method_25251() > (32767 & 32767) ? 32767 & 32767 : class_25240.Method_25251();
        this.Field_40153 = (byte)(class_25240.Method_25256() ? 23559 & -32511 : 19460 & -32654);
    }

    public int Method_40162() {
        return this.Field_40152;
    }

    public byte Method_40163() {
        return this.Field_40155;
    }

    public int Method_40164() {
        return this.Field_40156;
    }

    public void Method_40165(Class_29900 class_29900) {
        this.Field_40152 = class_29900.Method_30004();
        this.Field_40154 = class_29900.Method_29944();
        this.Field_40155 = class_29900.Method_29944();
        this.Field_40156 = class_29900.Method_30004();
        this.Field_40153 = class_29900.Method_29944();
    }

    public byte Method_40166() {
        return this.Field_40154;
    }

    public void Method_40167(Class_10954 class_10954) {
        this.Method_40160((Class_14856)class_10954);
    }
}

