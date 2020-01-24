/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47937
extends Class_44024
implements Class_46594 {
    private final Class_17103 Field_47938;
    private final Class_22553 Field_47939;
    private final boolean Field_47940;

    public boolean Method_47941() {
        return this.Field_47939.release();
    }

    public Class_22553 Method_47942() {
        return this.Field_47939;
    }

    public Class_47937(Class_18300 class_18300, Class_16725 class_16725, String string, Class_22553 class_22553, boolean bl) {
        super(class_18300, class_16725, string, bl);
        if (class_22553 == null) {
            throw new NullPointerException("content");
        }
        this.Field_47939 = class_22553;
        this.Field_47938 = new Class_45721(bl);
        this.Field_47940 = bl;
    }

    public Class_47937(Class_18300 class_18300, Class_16725 class_16725, String string) {
        this(class_18300, class_16725, string, Class_16620.Method_16627(8224 & 5632));
    }

    private void Method_47943() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21482 Method_47944() {
        return this.Method_47945();
    }

    public Class_46594 Method_47945() {
        this.Field_47939.Method_22637();
        return this;
    }

    public Class_41723 Method_47946() {
        return this.Method_47945();
    }

    public Class_17103 Method_47947() {
        return this.Field_47938;
    }

    public Class_23010 Method_47948() {
        return this.Method_47945();
    }

    public Class_45034 Method_47949() {
        return this.Method_47945();
    }

    public Class_44416 Method_47950() {
        return this.Method_47945();
    }

    public int Method_47951() {
        return this.Field_47939.refCnt();
    }

    public Class_47937(Class_18300 class_18300, Class_16725 class_16725, String string, Class_22553 class_22553) {
        this(class_18300, class_16725, string, class_22553, (-32383 & 5137) != 0);
    }
}

