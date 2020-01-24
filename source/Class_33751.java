/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33751
extends Class_33077 {
    private Class_41853 Field_33752;
    private Class_38163 Field_33753;

    public Class_33751(Class_41853 class_41853) {
        this.Field_33752 = class_41853;
        if (!(class_41853.\u0000strictfp() instanceof Class_25797)) {
            throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
        }
    }

    public boolean Method_33754() {
        if (this.Field_33752.\u0000strictfp.Method_347()) {
            return (2065 & 1312) != 0;
        }
        Class_4751 class_4751 = new Class_4751(this.Field_33752);
        Class_20407 class_20407 = this.Field_33752.\u0000strictfp.Method_558().Method_41910(class_4751, 8984 & 4273);
        if (class_20407 == null) {
            return (-25216 & 516) != 0;
        }
        this.Field_33753 = class_20407.Method_20421(class_4751);
        return (this.Field_33753 == null ? -20352 & 17674 : ((double)this.Field_33753.Method_38184(class_4751) < 0.6875 * 3.272727272727273 ? 2353 & 24641 : 6402 & 25092)) != 0;
    }

    public void Method_33755() {
        ((Class_25797)this.Field_33752.\u0000strictfp()).Method_25807((-23959 & 17541) != 0);
        ((Class_25797)this.Field_33752.\u0000strictfp()).Method_25810((-32631 & 2055) != 0);
        this.Field_33753 = null;
    }

    private void Method_33756() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33757() {
        ((Class_25797)this.Field_33752.\u0000strictfp()).Method_25807((-20471 & 336) != 0);
        ((Class_25797)this.Field_33752.\u0000strictfp()).Method_25810((9280 & 530) != 0);
    }

    public boolean Method_33758() {
        return (this.Field_33752.\u0000strictfp.Method_347() ? 105 & 6144 : (!this.Field_33753.Method_38181() && this.Field_33753.Method_38172(new Class_4751(this.Field_33752)) ? 1409 & 545 : 8404 & 4899)) != 0;
    }

    public void Method_33759() {
        this.Field_33753.Method_38173();
    }
}

