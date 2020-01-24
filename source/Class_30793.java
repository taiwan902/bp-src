/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_30793
extends Class_17281 {
    private static final Class_4379 Field_30794 = new Class_4379((24836 & 4096) != 0);

    protected Class_30793(int n) {
        super(n);
        this.\u0000
        .add(new Class_31871(Class_46199.class, 14689 & 1041, -29913 & 5122, 7687 & 14));
        this.\u0000strictfp.Field_15901 = 4689 & -23295;
        this.\u0000strictfp.Field_15891 = 16582 & 2348;
        this.\u0000strictfp.Field_15896 = 14868 & 17853;
    }

    public void Method_30795(Class_283 class_283, Random random, Class_4751 class_4751) {
        \u0000strictfp.Method_29142(Class_37289.Field_37300);
        for (int i = 1075 & -26620; i < (-27065 & 8239); ++i) {
            int n = random.nextInt(16400 & 13328) + (14348 & 122);
            int n2 = random.nextInt(-32104 & 17718) + (-7672 & 4120);
            int n3 = random.nextInt(class_283.Method_549(class_4751.Method_4791(n, -31063 & 8452, n2)).\u0000, `() + (4262 & 17776));
            \u0000strictfp.Method_29143(class_283, random, class_4751.Method_4791(n, n3, n2));
        }
        super.Method_17368(class_283, random, class_4751);
    }

    public Class_4286 Method_30796(Random random) {
        return random.nextInt(18471 & -31611) > 0 ? Field_30794 : this.\u0000strictfp;
    }

    private void Method_30797() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_17281 Method_30798(int n) {
        Class_27505 class_27505 = new Class_27505(n, this);
        class_27505.Field_17300 = (this.\u0000
         + 1.0f) * (0.5f * 1.0f);
        class_27505.Field_17316 = this.\u0000, ` * (0.4516129f * 1.1071429f) + 0.43283582f * 0.6931035f;
        class_27505.Field_17302 = this.\u0000= final * (0.023255814f * 21.5f) + 0.1627907f * 7.3714285f;
        return class_27505;
    }
}

