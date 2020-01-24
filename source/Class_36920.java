/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.AbstractCollection;
import java.util.Iterator;

public abstract class Class_36920
extends AbstractCollection
implements Class_33455 {
    private void Method_36921() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_36922() {
        StringBuilder stringBuilder = new StringBuilder();
        Class_20759 class_20759 = this.Method_36923();
        int n = this.size();
        int n2 = 133 & 577;
        stringBuilder.append("{");
        while (n-- != 0) {
            if (n2 != 0) {
                n2 = -28670 & 3369;
            } else {
                stringBuilder.append(", ");
            }
            Object e = class_20759.next();
            if (this == e) {
                stringBuilder.append("(this collection)");
                continue;
            }
            stringBuilder.append(String.valueOf(e));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    protected Class_36920() {
    }

    public abstract Class_20759 Method_36923();

    public Iterator Method_36924() {
        return this.Method_36923();
    }
}

