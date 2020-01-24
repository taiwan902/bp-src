/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36744
extends Class_25797 {
    private Class_4751 Field_36745;

    private void Method_36746() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15832 Method_36747(Class_4751 class_4751) {
        this.Field_36745 = class_4751;
        return super.\u0000strictfp(class_4751);
    }

    public Class_36744(Class_34093 class_34093, Class_283 class_283) {
        super(class_34093, class_283);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Method_36748() {
        block4 : {
            block5 : {
                if (!this.\u0000= final()) {
                    super.\u0000
                    ();
                    return;
                }
                if (this.Field_36745 == null) return;
                double d = this.\u0000strictfp.\u0000= int() * this.\u0000strictfp.\u0000= int();
                if (!(this.\u0000strictfp.\u0000, `(this.Field_36745) >= d)) break block4;
                if (this.\u0000strictfp.\u0000, for() <= (double)this.Field_36745.\u0000, `()) break block5;
                Class_4751 class_4751 = new Class_4751(this.Field_36745.\u0000= final(), Class_13337.Method_13371(this.\u0000strictfp.\u0000, for()), this.Field_36745.\u0000strictfp());
                if (!(this.\u0000strictfp.\u0000, `(class_4751) >= d)) break block4;
            }
            this.\u0000strictfp.Method_34182().Method_27094(this.Field_36745.\u0000= final(), this.Field_36745.\u0000, `(), this.Field_36745.\u0000strictfp(), this.\u0000strictfp);
            return;
        }
        this.Field_36745 = null;
    }

    public Class_15832 Method_36749(Class_1061 class_1061) {
        this.Field_36745 = new Class_4751(class_1061);
        return super.\u0000strictfp(class_1061);
    }

    public boolean Method_36750(Class_1061 class_1061, double d) {
        Class_15832 class_15832 = this.Method_36749(class_1061);
        if (class_15832 != null) {
            return this.\u0000strictfp(class_15832, d);
        }
        this.Field_36745 = new Class_4751(class_1061);
        this.\u0000strictfp = d;
        return (17425 & -32059) != 0;
    }
}

