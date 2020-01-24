/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7306
implements Callable {
    final Class_18 Field_7307;

    private void Method_7308() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_7309() {
        return this.Method_7310();
    }

    Class_7306(Class_18 class_18) {
        this.Field_7307 = class_18;
    }

    public String Method_7310() {
        return this.Field_7307.Field_25.Field_2773 ? this.Field_7307.Field_25.Method_2784() : "N/A (disabled)";
    }
}

