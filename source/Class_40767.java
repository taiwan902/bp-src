/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_40767
extends Class_36381 {
    private int Field_40768;

    private void Method_40769() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_40767() {
    }

    public Class_40767(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.\u0000strictfp = class_4595;
        this.\u0000strictfp = class_42666;
        this.Field_40768 = class_4595 != Class_4595.Field_4598 && class_4595 != Class_4595.Field_4613 ? class_42666.Method_42687() : class_42666.Method_42676();
    }

    protected void Method_40770(Class_1699 class_1699) {
        super.Method_36390(class_1699);
        this.Field_40768 = class_1699.Method_1738("Steps");
    }

    protected void Method_40771(Class_1699 class_1699) {
        super.Method_36389(class_1699);
        class_1699.Method_1739("Steps", this.Field_40768);
    }

    public boolean Method_40772(Class_283 class_283, Random random, Class_42666 class_42666) {
        if (this.\u0000strictfp(class_283, class_42666)) {
            return (8456 & 2641) != 0;
        }
        for (int i = 1936 & -22516; i < this.Field_40768; ++i) {
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), 4274 & -14016, 73 & -30462, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), -30687 & 1541, 1290 & 22544, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), 2467 & 30226, 10754 & 4173, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), -3449 & 11, 17418 & 8468, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), -30412 & 16388, 8200 & 481, i, class_42666);
            for (int j = 3153 & 9; j <= (-21453 & 4739); ++j) {
                this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), -32748 & 32578, j, i, class_42666);
                this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9351.Method_3293(), 8965 & 4161, j, i, class_42666);
                this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9351.Method_3293(), 22786 & -32109, j, i, class_42666);
                this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9351.Method_3293(), 16451 & 4251, j, i, class_42666);
                this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), 2116 & -15099, j, i, class_42666);
            }
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), 152 & 26144, 8358 & 20484, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), -32765 & 21505, -28554 & 8580, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), 12422 & 339, -30036 & 1351, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), -4057 & 2755, 6172 & 16454, i, class_42666);
            this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9300.Method_3293(), -32604 & 11524, 6183 & 1164, i, class_42666);
        }
        return (3125 & 8707) != 0;
    }

    public static Class_42666 Method_40773(List list, Random random, int n, int n2, int n3, Class_4595 class_4595) {
        int n4 = 151 & 9283;
        Class_42666 class_42666 = Class_42666.Method_42682(n, n2, n3, -1 & -1, -1 & -1, 34 & 29833, 4613 & 2365, 18503 & -19411, 4172 & -7497, class_4595);
        Class_13400 class_13400 = Class_13400.Method_13426(list, class_42666);
        if (class_13400 == null) {
            return null;
        }
        if (class_13400.Method_13415().Field_42672 == class_42666.Field_42672) {
            for (int i = 259 & 2647; i >= (18435 & 1497); --i) {
                class_42666 = Class_42666.Method_42682(n, n2, n3, -1 & -1, -1 & -1, -30662 & 12545, -31675 & 165, 14477 & -32155, i - (-24423 & 5665), class_4595);
                if (class_13400.Method_13415().Method_42680(class_42666)) continue;
                return Class_42666.Method_42682(n, n2, n3, -1 & -1, -1 & -1, 14706 & 16385, -32699 & 20997, -28635 & 11021, i, class_4595);
            }
        }
        return null;
    }
}

