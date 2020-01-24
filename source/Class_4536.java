/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.UnmodifiableIterator
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4536
extends Class_3238 {
    private void Method_4537() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_4538(Class_3436 class_3436) {
        return this == Class_9265.Field_9332 ? Class_5393.Field_5406.Method_5436() : 3372 & 28865;
    }

    public Class_1956 Method_4539(Class_3436 class_3436, Random random, int n) {
        return this == Class_9265.Field_9268 ? Class_10527.Field_10698 : (this == Class_9265.Field_9287 ? Class_10527.Field_10673 : (this == Class_9265.Field_9332 ? Class_10527.Field_10623 : (this == Class_9265.Field_9327 ? Class_10527.Field_10707 : (this == Class_9265.Field_9448 ? Class_10527.Field_10532 : Class_1956.Method_1981(this)))));
    }

    public int Method_4540(Random random) {
        return this == Class_9265.Field_9332 ? (-32700 & 8988) + random.nextInt(-19435 & 389) : -15103 & 709;
    }

    public Class_4536(Class_3779 class_3779) {
        super(Class_3713.Field_3721, class_3779);
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public int Method_4541(int n, Random random) {
        if (n > 0 && Class_1956.Method_1981(this) != this.Method_4539((Class_3436)this.\u0000, `().Method_3865().iterator().next(), random, n)) {
            int n2 = random.nextInt(n + (178 & 3330)) - (-32557 & 20769);
            if (n2 < 0) {
                n2 = 7683 & -32632;
            }
            return this.Method_4540(random) * (n2 + (2769 & 12545));
        }
        return this.Method_4540(random);
    }

    public void Method_4542(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        super.Method_3361(class_283, class_4751, class_3436, f, n);
        if (this.Method_4539(class_3436, class_283.Field_307, n) != Class_1956.Method_1981(this)) {
            int n2 = 40 & 64;
            if (this == Class_9265.Field_9268) {
                n2 = Class_13337.Method_13379(class_283.Field_307, -30440 & 20485, -30366 & 16407);
            } else if (this == Class_9265.Field_9287) {
                n2 = Class_13337.Method_13379(class_283.Field_307, 391 & 26643, 12663 & 1679);
            } else if (this == Class_9265.Field_9327) {
                n2 = Class_13337.Method_13379(class_283.Field_307, 16387 & -32597, 10887 & 263);
            } else if (this == Class_9265.Field_9332) {
                n2 = Class_13337.Method_13379(class_283.Field_307, 4354 & -32757, -23545 & 6405);
            } else if (this == Class_9265.Field_9448) {
                n2 = Class_13337.Method_13379(class_283.Field_307, -32438 & 647, 8869 & -28585);
            }
            this.\u0000strictfp(class_283, class_4751, n2);
        }
    }

    public Class_4536() {
        this(Class_3713.Field_3721.Method_3760());
    }

    public int Method_4543(Class_283 class_283, Class_4751 class_4751) {
        return -28480 & 16912;
    }
}

