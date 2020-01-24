/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class Class_41559
extends Class_6841 {
    final Class_25504 Field_41560;
    private final List Field_41561;
    private final Map Field_41562;

    protected int Method_41563() {
        return this.Field_41561.size();
    }

    protected void Method_41564(int n, boolean bl, int n2, int n3) {
        Class_15247 class_15247 = (Class_15247)this.Field_41562.get(this.Field_41561.get(n));
        Class_25504.Method_25515(this.Field_41560).Method_44210(class_15247);
        Class_25504.Method_25518((Class_25504)this.Field_41560).Field_39826 = class_15247.Method_15258();
        this.\u0000, `.Method_225();
        this.Field_41560.\u0000strictfp.Method_28689((Class_25504.Method_25515(this.Field_41560).Method_44207() || Class_25504.Method_25518((Class_25504)this.Field_41560).Field_39851 ? 135 & 4369 : -30720 & 4736) != 0);
        this.Field_41560.\u0000strictfp.Method_28701(Class_25504.Method_25515(this.Field_41560).Method_44212());
        Class_25504.Method_25511((Class_25504)this.Field_41560).\u0000strictfp = Class_9802.Method_9806("gui.done", new Object[-31360 & 10305]);
        Class_25504.Method_25514((Class_25504)this.Field_41560).\u0000strictfp = Class_25504.Method_25518(this.Field_41560).Method_39885(Class_6340.Field_6369);
        Class_25504.Method_25518(this.Field_41560).Method_39903();
    }

    protected void Method_41565(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field_41560.\u0000strictfp.Method_28701((659 & -8155) != 0);
        this.Field_41560.\u0000strictfp(this.Field_41560.\u0000strictfp, ((Class_15247)this.Field_41562.get(this.Field_41561.get(n))).Method_15256(), this.\u0000, ` / (-32413 & 29702), n3 + (13489 & -32181), 385875967 & -922746881);
        this.Field_41560.\u0000strictfp.Method_28701(Class_25504.Method_25515(this.Field_41560).Method_44211().Method_15253());
    }

    public Class_41559(Class_25504 class_25504, Class_18 class_18) {
        this.Field_41560 = class_25504;
        super(class_18, class_25504.\u0000= final, class_25504.\u0000, `, 5436 & 16416, class_25504.\u0000, ` - (-32439 & 3313) + (16390 & 596), 29330 & 18);
        this.Field_41561 = Lists.newArrayList();
        this.Field_41562 = Maps.newHashMap();
        for (Class_15247 class_15247 : Class_25504.Method_25515(class_25504).Method_44209()) {
            this.Field_41562.put(class_15247.Method_15258(), class_15247);
            this.Field_41561.add(class_15247.Method_15258());
        }
    }

    protected boolean Method_41566(int n) {
        return ((String)this.Field_41561.get(n)).equals(Class_25504.Method_25515(this.Field_41560).Method_44211().Method_15258());
    }

    protected void Method_41567() {
        this.Field_41560.\u0000, 2();
    }

    private void Method_41568() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int Method_41569() {
        return this.Method_41563() * (9362 & 4119);
    }
}

