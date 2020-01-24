/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_35240
implements Class_1549 {
    final Class_15594 Field_35241;

    Class_35240(Class_15594 class_15594) {
        this.Field_35241 = class_15594;
    }

    public void Method_35242(boolean bl, int n) {
        List list = this.Field_35241.Field_15598.Method_24694(this.Field_35241);
        this.Field_35241.Field_15599.Method_218(this.Field_35241.Field_15598);
        if (bl) {
            list.remove(this.Field_35241);
            this.Field_35241.Field_15598.Method_24698().add(8353 & -31994, this.Field_35241);
        }
    }

    private void Method_35243() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

