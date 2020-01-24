/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_37381
extends Class_34936 {
    private boolean Field_37382;
    private Class_4595 Field_37383;
    private final Class_45373 Field_37384;

    private void Method_37385() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_37386() {
        return (this.Field_37382 ? 1297 & -11762 : super.Method_34945()) != 0;
    }

    public Class_37381(Class_45373 class_45373) {
        super(class_45373, 1.0, 26703 & 5658);
        this.Field_37384 = class_45373;
        this.\u0000strictfp(-26509 & 385);
    }

    public boolean Method_37387() {
        if (this.Field_37384.\u0000strictfp() != null) {
            return (64 & -15992) != 0;
        }
        if (!this.Field_37384.\u0000strictfp().Method_7641()) {
            return (27586 & 4104) != 0;
        }
        Random random = this.Field_37384.\u0000strictfp();
        if (random.nextInt(26634 & 1066) == 0) {
            this.Field_37383 = Class_4595.Method_4642(random);
            Class_4751 class_4751 = new Class_4751(this.Field_37384.\u0000= package, this.Field_37384.\u0000, for() + 0.5416666666666666 * 0.9230769230769231, this.Field_37384.\u0000= switch).Method_4765(this.Field_37383);
            Class_3436 class_3436 = this.Field_37384.\u0000strictfp.Method_375(class_4751);
            if (Class_25738.Method_25749(class_3436)) {
                this.Field_37382 = 1 & 14857;
                return (26657 & 73) != 0;
            }
        }
        this.Field_37382 = -15356 & 4387;
        return super.Method_34949();
    }

    public void Method_37388() {
        if (!this.Field_37382) {
            super.Method_34947();
        } else {
            Class_283 class_283 = this.Field_37384.\u0000strictfp;
            Class_4751 class_4751 = new Class_4751(this.Field_37384.\u0000= package, this.Field_37384.\u0000, for() + 0.43 * 1.1627906976744187, this.Field_37384.\u0000= switch).Method_4765(this.Field_37383);
            Class_3436 class_3436 = class_283.Method_375(class_4751);
            if (Class_25738.Method_25749(class_3436)) {
                class_283.Method_462(class_4751, Class_9265.Field_9384.Method_3293().Method_3685(Class_25738.Field_25739, (Comparable)((Object)Class_30961.Method_30995(class_3436))), 16787 & -29077);
                this.Field_37384.\u0000= `();
                this.Field_37384.\u0000break();
            }
        }
    }
}

