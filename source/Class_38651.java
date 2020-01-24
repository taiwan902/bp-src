/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public abstract class Class_38651
extends Class_38126
implements Class_32692 {
    private Class_18300 Field_38652;
    private final Class_17103 Field_38653;

    public Class_18300 Method_38654() {
        return this.Field_38652;
    }

    public Class_17103 Method_38655() {
        return this.Field_38653;
    }

    void Method_38656(StringBuilder stringBuilder) {
        for (Map.Entry entry : this.Method_38655()) {
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append((String)entry.getValue());
            stringBuilder.append(Class_22304.Field_22308);
        }
    }

    public String Method_38657() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Class_22304.Method_22312(this));
        stringBuilder.append("(version: ");
        stringBuilder.append(this.Method_38654().Method_18312());
        stringBuilder.append(", keepAlive: ");
        stringBuilder.append(Class_17103.Method_17132(this));
        stringBuilder.append((char)(17577 & 6201));
        stringBuilder.append(Class_22304.Field_22308);
        this.Method_38656(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - Class_22304.Field_22308.length());
        return stringBuilder.toString();
    }

    protected Class_38651(Class_18300 class_18300, boolean bl) {
        if (class_18300 == null) {
            throw new NullPointerException("version");
        }
        this.Field_38652 = class_18300;
        this.Field_38653 = new Class_45721(bl);
    }

    private void Method_38658() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

