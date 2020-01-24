/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public class Class_27909
implements Class_14175 {
    final Class_11777 Field_27910;
    final Set Field_27911;

    private void Method_27912() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_27909(Class_11777 class_11777, Set set) {
        this.Field_27910 = class_11777;
        this.Field_27911 = set;
    }

    public void Method_27913(Class_24069 class_24069) {
        for (Class_2080 class_2080 : this.Field_27911) {
            Class_11372 class_11372 = class_24069.Method_24105(class_2080);
            Class_11777.Method_11852(this.Field_27910).put(class_2080, class_11372);
        }
    }
}

