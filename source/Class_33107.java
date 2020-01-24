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

public class Class_33107
extends Class_31428 {
    private List Field_33108 = Lists.newArrayList();

    protected boolean Method_33109(int n, int n2) {
        int n3 = n >> (36 & 2060);
        int n4 = n2 >> (3084 & 596);
        this.\u0000strictfp.setSeed((long)(n3 ^ n4 << (1284 & -22410)) ^ this.\u0000strictfp.Method_392());
        this.\u0000strictfp.nextInt();
        return (this.\u0000strictfp.nextInt(9443 & 16899) != 0 ? 3112 & 8833 : (n != (n3 << (2596 & 24973)) + (8213 & 2310) + this.\u0000strictfp.nextInt(200 & -6851) ? 25617 & -28032 : (n2 == (n4 << (-31643 & 18444)) + (-18428 & 261) + this.\u0000strictfp.nextInt(24 & 22603) ? 7233 & -32351 : 64 & 7573))) != 0;
    }

    public List Method_33110() {
        return this.Field_33108;
    }

    protected Class_18019 Method_33111(int n, int n2) {
        return new Class_29857(this.\u0000strictfp, this.\u0000strictfp, n, n2);
    }

    public String Method_33112() {
        return "Fortress";
    }

    private void Method_33113() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_33107() {
        this.Field_33108.add(new Class_31871(Class_42260.class, 2650 & 1034, 2691 & -28402, -15597 & 8331));
        this.Field_33108.add(new Class_31871(Class_46429.class, 2087 & 26333, 726 & 2052, 16901 & 308));
        this.Field_33108.add(new Class_31871(Class_43151.class, 3274 & 16414, 8358 & 17428, 24582 & 1092));
        this.Field_33108.add(new Class_31871(Class_36060.class, -32477 & 12311, -32700 & 5132, 292 & -29483));
    }
}

