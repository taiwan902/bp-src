/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_41963
extends Class_41875 {
    public List Field_41964 = Lists.newArrayList();
    public List Field_41965;
    public Class_7452 Field_41966;
    public List Field_41967;

    private void Method_41968() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_41963(Random random, int n, int n2) {
        super(random, n, n2);
        Class_7452 class_7452;
        int n3;
        this.Field_41967 = Lists.newArrayList();
        Class_7452[] arrclass_7452 = Class_9675.Method_9678();
        int n4 = arrclass_7452.length;
        for (n3 = 2582 & 1089; n3 < n4; ++n3) {
            class_7452 = arrclass_7452[n3];
            class_7452.Field_7457 = -31736 & 6144;
            this.Field_41967.add(class_7452);
        }
        this.Field_41965 = Lists.newArrayList();
        arrclass_7452 = Class_9675.Method_9683();
        n4 = arrclass_7452.length;
        for (n3 = 898 & -21496; n3 < n4; ++n3) {
            class_7452 = arrclass_7452[n3];
            class_7452.Field_7457 = -26572 & 1291;
            this.Field_41965.add(class_7452);
        }
    }

    protected void Method_41969(Class_1699 class_1699) {
        super.\u0000, `(class_1699);
    }

    protected void Method_41970(Class_1699 class_1699) {
        super.\u0000strictfp(class_1699);
    }

    public Class_41963() {
    }
}

