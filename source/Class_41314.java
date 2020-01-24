/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_41314
extends Class_36381 {
    public void Method_41315(Class_13400 class_13400, List list, Random random) {
        if (this.\u0000strictfp != Class_4595.Field_4598 && this.\u0000strictfp != Class_4595.Field_4603) {
            this.\u0000, `((Class_45837)class_13400, list, random, 275 & 17441, 4193 & -24571);
        } else {
            this.\u0000strictfp((Class_45837)class_13400, list, random, 16793 & -17405, 27809 & -32255);
        }
    }

    public Class_41314() {
    }

    private void Method_41316() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_41317(Class_283 class_283, Random random, Class_42666 class_42666) {
        if (this.\u0000strictfp(class_283, class_42666)) {
            return (18721 & 16) != 0;
        }
        this.\u0000strictfp(class_283, class_42666, 1668 & -32504, 64 & 7456, 3089 & 132, 21636 & -23724, 10543 & 4, -12523 & 6, (6417 & 18083) != 0, random, (Class_18176)Class_8238.Method_8250());
        this.\u0000strictfp(class_283, random, class_42666, this.\u0000strictfp, 26633 & -27231, 9861 & 97, -7662 & 448);
        if (this.\u0000strictfp != Class_4595.Field_4598 && this.\u0000strictfp != Class_4595.Field_4603) {
            this.\u0000strictfp(class_283, class_42666, -16380 & 8870, 9859 & 20513, -31631 & 8707, 10310 & 524, -32741 & 17667, 12435 & -30365, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-32700 & 16555) != 0);
        } else {
            this.\u0000strictfp(class_283, class_42666, 1209 & 16646, -21759 & 17411, 19457 & 13007, 12290 & -31204, 107 & 26755, 3675 & -32633, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (1026 & 16584) != 0);
        }
        return (12453 & -14309) != 0;
    }

    public Class_41314(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.\u0000strictfp = class_4595;
        this.\u0000strictfp = this.\u0000strictfp(random);
        this.\u0000strictfp = class_42666;
    }

    public static Class_41314 Method_41318(List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        Class_42666 class_42666 = Class_42666.Method_42682(n, n2, n3, -1 & -1, -1 & -1, 5055 & 2048, -28633 & 25109, -15339 & 111, 8711 & 20861, class_4595);
        return Class_41314.\u0000strictfp((Class_42666)class_42666) && Class_13400.Method_13426(list, class_42666) == null ? new Class_41314(n4, random, class_42666, class_4595) : null;
    }
}

