/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_46406
extends Class_45052
implements Class_44416 {
    private final boolean Field_46407;
    private final Class_17103 Field_46408;

    public Class_41723 Method_46409() {
        return this.Method_46414();
    }

    public Class_21482 Method_46410() {
        return this.Method_46414();
    }

    public Class_46406(Class_22553 class_22553, boolean bl) {
        super(class_22553);
        this.Field_46408 = new Class_46948(bl);
        this.Field_46407 = bl;
    }

    public Class_17103 Method_46411() {
        return this.Field_46408;
    }

    public Class_23010 Method_46412() {
        return this.Method_46414();
    }

    private void Method_46413() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_46406(Class_22553 class_22553) {
        this(class_22553, (513 & 11537) != 0);
    }

    public Class_44416 Method_46414() {
        super.Method_45057();
        return this;
    }

    private void Method_46415(StringBuilder stringBuilder) {
        for (Map.Entry entry : this.Method_46411()) {
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append((String)entry.getValue());
            stringBuilder.append(Class_22304.Field_22308);
        }
    }

    public Class_46406() {
        this(Class_16620.Method_16627(16542 & 8544));
    }

    public String Method_46416() {
        StringBuilder stringBuilder = new StringBuilder(super.Method_45061());
        stringBuilder.append(Class_22304.Field_22308);
        this.Method_46415(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - Class_22304.Field_22308.length());
        return stringBuilder.toString();
    }
}

