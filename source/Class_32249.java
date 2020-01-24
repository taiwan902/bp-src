/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_32249
implements Class_1486 {
    private UUID Field_32250;

    public void Method_32251(Class_10954 class_10954) {
        this.Method_32252((Class_10930)class_10954);
    }

    public void Method_32252(Class_10930 class_10930) {
        class_10930.Method_10937(this);
    }

    public Class_32249(UUID uUID) {
        this.Field_32250 = uUID;
    }

    public void Method_32253(Class_29900 class_29900) {
        class_29900.Method_29997(this.Field_32250);
    }

    public void Method_32254(Class_29900 class_29900) {
        this.Field_32250 = class_29900.Method_30011();
    }

    public Class_1061 Method_32255(Class_2651 class_2651) {
        return class_2651.Method_2675(this.Field_32250);
    }

    public Class_32249() {
    }

    private void Method_32256() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

