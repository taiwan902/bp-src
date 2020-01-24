/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34772 {
    private final short Field_34773;
    final Class_24560 Field_34774;
    private final Class_3436 Field_34775;

    private void Method_34776() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34772(Class_24560 class_24560, short s, Class_17665 class_17665) {
        this.Field_34774 = class_24560;
        this.Field_34773 = s;
        this.Field_34775 = class_17665.Method_17709(this.Method_34778());
    }

    public Class_3436 Method_34777() {
        return this.Field_34775;
    }

    public Class_4751 Method_34778() {
        return new Class_4751(Class_24560.Method_24566(this.Field_34774).Method_29493(this.Field_34773 >> (8221 & -32628) & (335 & 13375), this.Field_34773 & (511 & -31489), this.Field_34773 >> (9 & 27660) & (2959 & 21567)));
    }

    public Class_34772(Class_24560 class_24560, short s, Class_3436 class_3436) {
        this.Field_34774 = class_24560;
        this.Field_34773 = s;
        this.Field_34775 = class_3436;
    }

    public short Method_34779() {
        return this.Field_34773;
    }
}

