/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_36459
extends Class_33077 {
    int Field_36460;
    private Class_34093 Field_36461;
    private Class_283 Field_36462;
    private static final Predicate Field_36463 = Class_7506.Method_7511(Class_9265.Field_9278).Method_7513(Class_5320.Field_5321, Predicates.equalTo((Object)Class_5341.Field_5345));

    public void Method_36464() {
        this.Field_36460 = 19496 & 4268;
        this.Field_36462.Method_483(this.Field_36461, (byte)(2127 & 8218));
        this.Field_36461.Method_34145().Method_7643();
    }

    public int Method_36465() {
        return this.Field_36460;
    }

    public void Method_36466() {
        this.Field_36460 = Math.max(4225 & 2116, this.Field_36460 - (-28671 & 16489));
        if (this.Field_36460 == (3396 & -16355)) {
            Class_4751 class_4751 = new Class_4751(this.Field_36461.\u0000= package, this.Field_36461.\u0000, for(), this.Field_36461.\u0000= switch);
            if (Field_36463.apply((Object)this.Field_36462.Method_375(class_4751))) {
                if (this.Field_36462.Method_522().Method_7529("mobGriefing")) {
                    this.Field_36462.Method_541(class_4751, (16808 & -32768) != 0);
                }
                this.Field_36461.Method_34128();
            } else {
                Class_4751 class_47512 = class_4751.Method_4782();
                if (this.Field_36462.Method_375(class_47512).Method_3442() == Class_9265.Field_9319) {
                    if (this.Field_36462.Method_522().Method_7529("mobGriefing")) {
                        this.Field_36462.Method_502(4059 & 18389, class_47512, Class_3238.Method_3435(Class_9265.Field_9319));
                        this.Field_36462.Method_462(class_47512, Class_9265.Field_9272.Method_3293(), -28194 & 2051);
                    }
                    this.Field_36461.Method_34128();
                }
            }
        }
    }

    private void Method_36467() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_36459(Class_34093 class_34093) {
        this.Field_36461 = class_34093;
        this.Field_36462 = class_34093.\u0000strictfp;
        this.\u0000strictfp(-7337 & 7207);
    }

    public boolean Method_36468() {
        if (this.Field_36461.\u0000strictfp().nextInt(this.Field_36461.\u0000, for() ? 310 & 8762 : -23574 & 1000) != 0) {
            return (-30719 & 1280) != 0;
        }
        Class_4751 class_4751 = new Class_4751(this.Field_36461.\u0000= package, this.Field_36461.\u0000, for(), this.Field_36461.\u0000= switch);
        return (Field_36463.apply((Object)this.Field_36462.Method_375(class_4751)) ? -30717 & 8609 : (this.Field_36462.Method_375(class_4751.Method_4782()).Method_3442() == Class_9265.Field_9319 ? 2113 & -18913 : 536 & 14496)) != 0;
    }

    public void Method_36469() {
        this.Field_36460 = 24808 & 3590;
    }

    public boolean Method_36470() {
        return (this.Field_36460 > 0 ? 4545 & -31691 : 396 & 17411) != 0;
    }
}

