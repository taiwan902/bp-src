/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44146
extends Class_4879 {
    private Class_23823 Field_44147;

    private void Method_44148() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_44149() {
        return this.Field_44147;
    }

    public void Method_44150(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        if (class_1699.Method_1715("RecordItem", 42 & 3210)) {
            this.Method_44151(Class_23823.Method_23840(class_1699.Method_1703("RecordItem")));
        } else if (class_1699.Method_1738("Record") > 0) {
            this.Method_44151(new Class_23823(Class_1956.Method_1978(class_1699.Method_1738("Record")), 2113 & 16445, 4224 & 8271));
        }
    }

    public void Method_44151(Class_23823 class_23823) {
        this.Field_44147 = class_23823;
        this.\u0000, for();
    }

    public void Method_44152(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        if (this.Method_44149() != null) {
            class_1699.Method_1744("RecordItem", this.Method_44149().Method_23841(new Class_1699()));
        }
    }
}

