/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12102 {
    private final String Field_12103;
    private final String Field_12104;

    public String Method_12105() {
        return this.Field_12104;
    }

    public String Method_12106() {
        return this.Field_12103;
    }

    private void Method_12107() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_12102(String string, Object object) {
        this.Field_12104 = string;
        if (object == null) {
            this.Field_12103 = "~~NULL~~";
        } else if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            this.Field_12103 = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            this.Field_12103 = object.toString();
        }
    }
}

