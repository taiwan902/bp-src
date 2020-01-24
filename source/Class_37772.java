/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_37772
extends Class_17281 {
    private static final Class_3436 Field_37773;
    private boolean Field_37774;
    private static final Class_3436 Field_37775;
    private static final Class_3436 Field_37776;

    public Class_37772(int n, boolean bl) {
        super(n);
        this.Field_37774 = bl;
        this.\u0000strictfp.Field_15901 = bl ? -12217 & 10 : -7682 & 3122;
        this.\u0000strictfp.Field_15896 = -32743 & 1049;
        this.\u0000strictfp.Field_15891 = 8198 & -12044;
        if (!bl) {
            this.\u0000= final.add(new Class_31871(Class_47883.class, 803 & 6170, 10501 & -32767, -18155 & 1));
        }
        this.\u0000
        .add(new Class_31871(Class_46796.class, 4571 & -16342, 27406 & 1188, -6905 & 6284));
    }

    private void Method_37777() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4286 Method_37778(Random random) {
        return random.nextInt(10 & -20466) == 0 ? this.\u0000strictfp : (random.nextInt(19458 & -24537) == 0 ? new Class_21119(Field_37776, Field_37775) : (!this.Field_37774 && random.nextInt(-6965 & 4391) == 0 ? new Class_4374((128 & -13276) != 0, 394 & 8782, 3094 & 285, Field_37776, Field_37773) : new Class_4328((8358 & 1561) != 0, (10284 & 21511) + random.nextInt(-27633 & 25447), Field_37776, Field_37773, (-16253 & 9229) != 0)));
    }

    public Class_4291 Method_37779(Random random) {
        return random.nextInt(-31162 & 18476) == 0 ? new Class_41275(Class_5341.Field_5348) : new Class_41275(Class_5341.Field_5345);
    }

    static {
        Field_37776 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4235));
        Field_37773 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4235)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((2368 & 25219) != 0));
        Field_37775 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4238)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((-25207 & 0) != 0));
    }

    public void Method_37780(Class_283 class_283, Random random, Class_4751 class_4751) {
        super.Method_17368(class_283, random, class_4751);
        int n = random.nextInt(8349 & 2578) + (6264 & -32504);
        int n2 = random.nextInt(-10088 & 8818) + (4424 & -31700);
        int n3 = random.nextInt(class_283.Method_549(class_4751.Method_4791(n, 314 & 2052, n2)).\u0000, `() * (-29689 & 8578));
        new Class_29521().Method_29522(class_283, random, class_4751.Method_4791(n, n3, n2));
        Class_32246 class_32246 = new Class_32246();
        for (n2 = 11789 & -32542; n2 < (12722 & 575); ++n2) {
            n3 = random.nextInt(20762 & 176) + (-16328 & 1289);
            int n4 = 652 & -28544;
            int n5 = random.nextInt(12533 & -28910) + (20044 & -32502);
            class_32246.Method_32247(class_283, random, class_4751.Method_4791(n3, 188 & 128, n5));
        }
    }
}

