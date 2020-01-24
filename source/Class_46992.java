/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;

public class Class_46992
extends Class_40059 {
    private final Class_19169 Field_46993;

    private void Method_46994() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_46995(Class_39158 class_39158, Object object, List list) {
        this.Method_46996(class_39158, (Class_22553)object, list);
    }

    protected void Method_46996(Class_39158 class_39158, Class_22553 class_22553, List list) {
        list.add(this.Field_46993.Method_19174(class_39158, class_22553));
    }

    public Class_46992(Cipher cipher) {
        this.Field_46993 = new Class_19169(cipher);
    }
}

