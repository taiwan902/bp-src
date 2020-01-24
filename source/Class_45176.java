/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_45176
extends Class_36381 {
    private boolean Field_45177;
    private boolean Field_45178;

    public Class_45176(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.\u0000strictfp = class_4595;
        this.\u0000strictfp = this.\u0000strictfp(random);
        this.\u0000strictfp = class_42666;
        this.Field_45177 = random.nextInt(130 & 9231) == 0 ? 24849 & 4101 : -16245 & 10336;
        this.Field_45178 = random.nextInt(1830 & -16366) == 0 ? 4101 & 18585 : 4 & 28737;
    }

    public Class_45176() {
    }

    public void Method_45179(Class_13400 class_13400, List list, Random random) {
        this.\u0000= final((Class_45837)class_13400, list, random, 20865 & 1089, 2089 & 12289);
        if (this.Field_45177) {
            this.\u0000strictfp((Class_45837)class_13400, list, random, 2309 & 5123, 4103 & -16334);
        }
        if (this.Field_45178) {
            this.\u0000, `((Class_45837)class_13400, list, random, -32685 & 6029, -24486 & 17026);
        }
    }

    protected void Method_45180(Class_1699 class_1699) {
        super.Method_36389(class_1699);
        class_1699.Method_1706("Left", this.Field_45177);
        class_1699.Method_1706("Right", this.Field_45178);
    }

    private void Method_45181() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_45182(Class_1699 class_1699) {
        super.Method_36390(class_1699);
        this.Field_45177 = class_1699.Method_1733("Left");
        this.Field_45178 = class_1699.Method_1733("Right");
    }

    public boolean Method_45183(Class_283 class_283, Random random, Class_42666 class_42666) {
        if (this.\u0000strictfp(class_283, class_42666)) {
            return (6306 & -32688) != 0;
        }
        this.\u0000strictfp(class_283, class_42666, -24544 & 3668, -32232 & 21572, 28674 & -31452, -32625 & 21508, 8324 & 565, 855 & -6130, (-31487 & 19161) != 0, random, (Class_18176)Class_8238.Method_8250());
        this.\u0000strictfp(class_283, random, class_42666, this.\u0000strictfp, 11989 & 4353, 16473 & 8067, 4126 & -30464);
        this.\u0000strictfp(class_283, random, class_42666, Class_13439.Field_13443, -16351 & 9035, 9 & -24445, 16623 & 2566);
        this.\u0000strictfp(class_283, class_42666, random, 0.05f * 2.0f, 2049 & 625, -29278 & 16915, -28659 & 8401, (Class_3436)Class_9265.Field_9293.Method_3293());
        this.\u0000strictfp(class_283, class_42666, random, 1.018868f * 0.098148145f, -20981 & 4167, 17410 & -24058, 1 & 1027, (Class_3436)Class_9265.Field_9293.Method_3293());
        this.\u0000strictfp(class_283, class_42666, random, 0.47435898f * 0.21081081f, 2185 & -32431, 714 & 21522, 1029 & -32243, (Class_3436)Class_9265.Field_9293.Method_3293());
        this.\u0000strictfp(class_283, class_42666, random, 0.0063492064f * 15.75f, -28125 & 10511, 1494 & -30718, 25861 & 4117, (Class_3436)Class_9265.Field_9293.Method_3293());
        if (this.Field_45177) {
            this.\u0000strictfp(class_283, class_42666, 212 & -13056, 17 & 25545, 8194 & 2386, 0 & 8226, 18711 & -23517, 2564 & -8067, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (21513 & -30302) != 0);
        }
        if (this.Field_45178) {
            this.\u0000strictfp(class_283, class_42666, 2124 & 4485, 17027 & -20187, 514 & -28637, 4996 & 11270, -20349 & 331, 8340 & 6764, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-30651 & 25856) != 0);
        }
        return (139 & 9749) != 0;
    }

    public static Class_45176 Method_45184(List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        Class_42666 class_42666 = Class_42666.Method_42682(n, n2, n3, -1 & -1, -1 & -1, -32736 & 30221, 4357 & 9773, 37 & -23033, 1415 & 16911, class_4595);
        return Class_45176.\u0000strictfp((Class_42666)class_42666) && Class_13400.Method_13426(list, class_42666) == null ? new Class_45176(n4, random, class_42666, class_4595) : null;
    }
}

