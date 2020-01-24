/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.Callable;

public class Class_27947
implements Callable {
    final Class_18 Field_27948;

    Class_27947(Class_18 class_18) {
        this.Field_27948 = class_18;
    }

    public String Method_27949() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object e : this.Field_27948.Field_84.Field_39875) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(e);
            if (!this.Field_27948.Field_84.Field_39737.contains(e)) continue;
            stringBuilder.append(" (incompatible)");
        }
        return stringBuilder.toString();
    }

    public Object Method_27950() {
        return this.Method_27949();
    }

    private void Method_27951() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

