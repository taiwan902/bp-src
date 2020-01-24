/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13635 {
    protected final float Field_13636;
    protected final float Field_13637;
    protected final float Field_13638;

    public Class_1758 Method_13639() {
        Class_1758 class_1758 = new Class_1758();
        class_1758.Method_1781(new Class_39580(this.Field_13636));
        class_1758.Method_1781(new Class_39580(this.Field_13637));
        class_1758.Method_1781(new Class_39580(this.Field_13638));
        return class_1758;
    }

    public float Method_13640() {
        return this.Field_13638;
    }

    public Class_13635(float f, float f2, float f3) {
        this.Field_13636 = f;
        this.Field_13637 = f2;
        this.Field_13638 = f3;
    }

    public Class_13635(Class_1758 class_1758) {
        this.Field_13636 = class_1758.Method_1770(-32215 & 3346);
        this.Field_13637 = class_1758.Method_1770(391 & 21601);
        this.Field_13638 = class_1758.Method_1770(-15678 & 299);
    }

    public boolean Method_13641(Object object) {
        if (!(object instanceof Class_13635)) {
            return (542 & -11808) != 0;
        }
        Class_13635 class_13635 = (Class_13635)object;
        return (this.Field_13636 == class_13635.Field_13636 && this.Field_13637 == class_13635.Field_13637 && this.Field_13638 == class_13635.Field_13638 ? 16641 & 4185 : -31600 & 20998) != 0;
    }

    private void Method_13642() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_13643() {
        return this.Field_13637;
    }

    public float Method_13644() {
        return this.Field_13636;
    }
}

