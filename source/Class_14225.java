/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_14225
extends Class_13017 {
    private Class_2057 Field_14226;
    public final int Field_14227;
    private boolean Field_14228;
    public final Class_23823 Field_14229;
    private final String Field_14230;
    public final Class_14225 Field_14231;
    public final int Field_14232;

    public Class_14225 Method_14233() {
        this.\u0000strictfp = 16465 & 9769;
        return this;
    }

    public boolean Method_14234() {
        return this.Field_14228;
    }

    public Class_14225 Method_14235() {
        this.Field_14228 = 2885 & 8321;
        return this;
    }

    public Class_14225 Method_14236(Class class_) {
        return (Class_14225)super.Method_13034(class_);
    }

    public Class_14225(String string, String string2, int n, int n2, Class_23823 class_23823, Class_14225 class_14225) {
        super(string, new Class_2849("achievement." + string2, new Object[6440 & -32704]));
        this.Field_14229 = class_23823;
        this.Field_14230 = "achievement." + string2 + ".desc";
        this.Field_14232 = n;
        this.Field_14227 = n2;
        if (n < Class_21905.Field_21908) {
            Class_21905.Field_21908 = n;
        }
        if (n2 < Class_21905.Field_21932) {
            Class_21905.Field_21932 = n2;
        }
        if (n > Class_21905.Field_21931) {
            Class_21905.Field_21931 = n;
        }
        if (n2 > Class_21905.Field_21923) {
            Class_21905.Field_21923 = n2;
        }
        this.Field_14231 = class_14225;
    }

    public Class_14225(String string, String string2, int n, int n2, Class_3238 class_3238, Class_14225 class_14225) {
        this(string, string2, n, n2, new Class_23823(class_3238), class_14225);
    }

    public Class_13017 Method_14237() {
        return this.Method_14233();
    }

    public boolean Method_14238() {
        return (14617 & -32767) != 0;
    }

    private void Method_14239() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_13017 Method_14240() {
        return this.Method_14245();
    }

    public String Method_14241() {
        return this.Field_14226 != null ? this.Field_14226.Method_2058(Class_7594.Method_7602(this.Field_14230)) : Class_7594.Method_7602(this.Field_14230);
    }

    public Class_1782 Method_14242() {
        Class_1782 class_1782 = super.Method_13040();
        class_1782.Method_1789().Method_2917(this.Method_14234() ? Class_5478.Field_5484 : Class_5478.Field_5497);
        return class_1782;
    }

    public Class_14225 Method_14243(Class_2057 class_2057) {
        this.Field_14226 = class_2057;
        return this;
    }

    public Class_13017 Method_14244(Class class_) {
        return this.Method_14236(class_);
    }

    public Class_14225(String string, String string2, int n, int n2, Class_1956 class_1956, Class_14225 class_14225) {
        this(string, string2, n, n2, new Class_23823(class_1956), class_14225);
    }

    public Class_14225 Method_14245() {
        super.Method_13045();
        Class_21905.Field_21929.add(this);
        return this;
    }
}

