/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Class_5568
extends Class_4879
implements Class_5591 {
    private float Field_5569;
    private float Field_5570;
    private Class_4595 Field_5571;
    private List Field_5572 = Lists.newArrayList();
    private boolean Field_5573;
    private Class_3436 Field_5574;
    private boolean Field_5575;

    public boolean Method_5576() {
        return this.Field_5575;
    }

    public Class_5568(Class_3436 class_3436, Class_4595 class_4595, boolean bl, boolean bl2) {
        this.Field_5574 = class_3436;
        this.Field_5571 = class_4595;
        this.Field_5573 = bl;
        this.Field_5575 = bl2;
    }

    public void Method_5577(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        class_1699.Method_1739("blockId", Class_3238.Method_3435(this.Field_5574.Method_3442()));
        class_1699.Method_1739("blockData", this.Field_5574.Method_3442().Method_3434(this.Field_5574));
        class_1699.Method_1739("facing", this.Field_5571.Method_4648());
        class_1699.Method_1704("progress", this.Field_5570);
        class_1699.Method_1706("extending", this.Field_5573);
    }

    public void Method_5578() {
        if (this.Field_5570 < 1.0f && this.\u0000strictfp != null) {
            this.Field_5569 = 1.0f;
            this.Field_5570 = 1.0f;
            this.\u0000strictfp.Method_456(this.\u0000strictfp);
            this.\u0000
            ();
            if (this.\u0000strictfp.Method_375(this.\u0000strictfp).Method_3442() == Class_9265.Field_9457) {
                this.\u0000strictfp.Method_462(this.\u0000strictfp, this.Field_5574, 32003 & -32617);
                this.\u0000strictfp.Method_459(this.\u0000strictfp, this.Field_5574.Method_3442());
            }
        }
    }

    public int Method_5579() {
        return 5248 & -6138;
    }

    public void Method_5580() {
        this.Field_5570 = this.Field_5569;
        if (this.Field_5570 >= 1.0f) {
            this.Method_5586(1.0f, 19.6f * 0.012755102f);
            this.\u0000strictfp.Method_456(this.\u0000strictfp);
            this.\u0000
            ();
            if (this.\u0000strictfp.Method_375(this.\u0000strictfp).Method_3442() == Class_9265.Field_9457) {
                this.\u0000strictfp.Method_462(this.\u0000strictfp, this.Field_5574, -16057 & 12291);
                this.\u0000strictfp.Method_459(this.\u0000strictfp, this.Field_5574.Method_3442());
            }
        } else {
            this.Field_5569 += 1.5517242f * 0.3222222f;
            if (this.Field_5569 >= 1.0f) {
                this.Field_5569 = 1.0f;
            }
            if (this.Field_5573) {
                this.Method_5586(this.Field_5569, this.Field_5569 - this.Field_5570 + 0.125f * 0.5f);
            }
        }
    }

    public float Method_5581(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        return this.Field_5570 + (this.Field_5569 - this.Field_5570) * f;
    }

    public float Method_5582(float f) {
        return this.Field_5573 ? (this.Method_5581(f) - 1.0f) * (float)this.Field_5571.Method_4633() : (1.0f - this.Method_5581(f)) * (float)this.Field_5571.Method_4633();
    }

    public float Method_5583(float f) {
        return this.Field_5573 ? (this.Method_5581(f) - 1.0f) * (float)this.Field_5571.Method_4656() : (1.0f - this.Method_5581(f)) * (float)this.Field_5571.Method_4656();
    }

    public boolean Method_5584() {
        return this.Field_5573;
    }

    public void Method_5585(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        this.Field_5574 = Class_3238.Method_3323(class_1699.Method_1738("blockId")).Method_3342(class_1699.Method_1738("blockData"));
        this.Field_5571 = Class_4595.Method_4637(class_1699.Method_1738("facing"));
        this.Field_5570 = this.Field_5569 = class_1699.Method_1745("progress");
        this.Field_5573 = class_1699.Method_1733("extending");
    }

    private void Method_5586(float f, float f2) {
        ArrayList arrayList;
        f = this.Field_5573 ? 1.0f - f : (f -= 1.0f);
        Class_10997 class_10997 = Class_9265.Field_9457.Method_3528(this.\u0000strictfp, this.\u0000strictfp, this.Field_5574, f, this.Field_5571);
        if (class_10997 != null && !(arrayList = this.\u0000strictfp.Method_473(null, class_10997)).isEmpty()) {
            this.Field_5572.addAll(arrayList);
            for (Class_1061 class_1061 : this.Field_5572) {
                if (this.Field_5574.Method_3442() == Class_9265.Field_9406 && this.Field_5573) {
                    switch (Class_11774.Field_11775[this.Field_5571.Method_4640().ordinal()]) {
                        case 1: {
                            class_1061.Field_1071 = this.Field_5571.Method_4654();
                            break;
                        }
                        case 2: {
                            class_1061.Method_1161(this.Field_5571.Method_4633());
                            break;
                        }
                        case 3: {
                            class_1061.Field_1072 = this.Field_5571.Method_4656();
                        }
                    }
                    continue;
                }
                class_1061.Method_1348(f2 * (float)this.Field_5571.Method_4654(), f2 * (float)this.Field_5571.Method_4633(), f2 * (float)this.Field_5571.Method_4656());
            }
            this.Field_5572.clear();
        }
    }

    public float Method_5587(float f) {
        return this.Field_5573 ? (this.Method_5581(f) - 1.0f) * (float)this.Field_5571.Method_4654() : (1.0f - this.Method_5581(f)) * (float)this.Field_5571.Method_4654();
    }

    public Class_5568() {
    }

    public Class_4595 Method_5588() {
        return this.Field_5571;
    }

    public Class_3436 Method_5589() {
        return this.Field_5574;
    }

    private void Method_5590() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

