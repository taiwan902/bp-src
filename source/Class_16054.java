/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public final class Class_16054
implements Map.Entry {
    CharSequence Field_16055;
    Class_16054 Field_16056;
    Class_16054 Field_16057;
    Class_16054 Field_16058;
    final int Field_16059;
    final Class_45721 Field_16060;
    final CharSequence Field_16061;

    public String Method_16062(String string) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        Class_17103.Method_17160(string);
        CharSequence charSequence = this.Field_16055;
        this.Field_16055 = string;
        return charSequence.toString();
    }

    Class_16054(Class_45721 class_45721) {
        this.Field_16060 = class_45721;
        this.Field_16059 = -1 & -1;
        this.Field_16061 = null;
        this.Field_16055 = null;
    }

    public String Method_16063() {
        return this.Field_16061.toString();
    }

    private void Method_16064() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_16065() {
        return this.Field_16055.toString();
    }

    public Object Method_16066(Object object) {
        return this.Method_16062((String)object);
    }

    Class_16054(Class_45721 class_45721, int n, CharSequence charSequence, CharSequence charSequence2) {
        this.Field_16060 = class_45721;
        this.Field_16059 = n;
        this.Field_16061 = charSequence;
        this.Field_16055 = charSequence2;
    }

    void Method_16067() {
        this.Field_16056.Field_16057 = this.Field_16057;
        this.Field_16057.Field_16056 = this.Field_16056;
    }

    public Object Method_16068() {
        return this.Method_16065();
    }

    public String Method_16069() {
        return this.Field_16061.toString() + (char)(17213 & 10431) + this.Field_16055.toString();
    }

    void Method_16070(Class_22553 class_22553) {
        Class_17103.Method_17143(this.Field_16061, this.Field_16055, class_22553);
    }

    void Method_16071(Class_16054 class_16054) {
        this.Field_16057 = class_16054;
        this.Field_16056 = class_16054.Field_16056;
        this.Field_16056.Field_16057 = this;
        this.Field_16057.Field_16056 = this;
    }

    public Object Method_16072() {
        return this.Method_16063();
    }
}

