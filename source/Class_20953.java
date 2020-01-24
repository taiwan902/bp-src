/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20953
implements Class_7434 {
    private Class_14517 Field_20954;
    private Class_626 Field_20955;
    private Class_43918 Field_20956;
    private Class_1782 Field_20957;

    public Class_20953(Class_626 class_626, Class_1782 class_1782) {
        this.Field_20955 = class_626;
        this.Field_20957 = class_1782;
        this.Field_20956 = new Class_43918(class_626, this);
    }

    public void Method_20958(Class_14517 class_14517) {
        this.Field_20954 = class_14517;
    }

    public Class_14517 Method_20959(Class_626 class_626) {
        return this.Field_20954;
    }

    public void Method_20960(Class_23823 class_23823) {
    }

    public Class_1782 Method_20961() {
        return this.Field_20957 != null ? this.Field_20957 : new Class_2849("entity.Villager.name", new Object[-31720 & 2182]);
    }

    public Class_626 Method_20962() {
        return this.Field_20955;
    }

    public void Method_20963(Class_626 class_626) {
    }

    private void Method_20964() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20965(Class_6757 class_6757) {
        class_6757.Method_6771();
    }
}

