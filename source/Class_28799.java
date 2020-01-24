/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_28799
implements Class_1486 {
    private byte[] Field_28800;
    private Class_29900 Field_28801;
    private String Field_28802;

    private void Method_28803() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_28799(String string, Class_29900 class_29900) {
        this.Field_28802 = string;
        this.Field_28801 = class_29900;
        if (class_29900.Method_29958() > (32767 & 32767)) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    public Class_28799(String string, byte[] arrby) {
        Class_29900 class_29900 = new Class_29900(Class_16620.Method_16632(arrby));
        this.Field_28802 = string;
        this.Field_28801 = class_29900;
        if (class_29900.Method_29958() > (-1 & 32767)) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    public Class_28799(byte[] arrby, byte[] arrby2) {
        Class_29900 class_29900 = new Class_29900(Class_16620.Method_16632(arrby2));
        this.Field_28800 = arrby;
        this.Field_28801 = class_29900;
        if (class_29900.Method_29958() > (32767 & -1)) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    public void Method_28804(Class_10930 class_10930) {
        class_10930.Method_10951(this);
    }

    public void Method_28805(Class_10954 class_10954) {
        this.Method_28804((Class_10930)class_10954);
    }

    public Class_29900 Method_28806() {
        return this.Field_28801;
    }

    public void Method_28807(Class_29900 class_29900) {
        this.Field_28802 = class_29900.Method_29991(-24044 & 16413);
        int n = class_29900.Method_30014();
        if (n < 0 || n > (-1 & 32767)) {
            throw new IOException("Payload may not be larger than 32767 bytes");
        }
        this.Field_28801 = new Class_29900(class_29900.Method_29951(n));
    }

    public String Method_28808() {
        return this.Field_28802;
    }

    public Class_28799() {
    }

    public void Method_28809(Class_29900 class_29900) {
        if (this.Field_28802 != null) {
            class_29900.Method_29960(this.Field_28802);
        } else {
            class_29900.Method_29946(this.Field_28800);
        }
        class_29900.Method_29909(this.Field_28801);
    }
}

