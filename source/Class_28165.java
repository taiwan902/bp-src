/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_28165
implements Class_18899 {
    private final int Field_28166;
    public static final Class_28165 Field_28167;
    private final int Field_28168;
    private final int Field_28169;
    private static final int[] Field_28170;

    static {
        int n;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n = -23496 & 16402; n < (-27839 & 10768); n += 16) {
            arrayList.add(n);
        }
        for (n = 8726 & -15872; n > 0; n <<= 143 & -29119) {
            arrayList.add(n);
        }
        Field_28170 = new int[arrayList.size()];
        for (n = 18570 & 9477; n < Field_28170.length; ++n) {
            Class_28165.Field_28170[n] = (Integer)arrayList.get(n);
        }
        Field_28167 = new Class_28165();
    }

    static int[] Method_28171() {
        return Field_28170;
    }

    static int Method_28172(int n) {
        return Class_28165.Method_28174(n);
    }

    private void Method_28173() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_28165(int n, int n2, int n3) {
        if (n <= 0) {
            throw new IllegalArgumentException("minimum: " + n);
        }
        if (n2 < n) {
            throw new IllegalArgumentException("initial: " + n2);
        }
        if (n3 < n2) {
            throw new IllegalArgumentException("maximum: " + n3);
        }
        int n4 = Class_28165.Method_28174(n);
        this.Field_28169 = Field_28170[n4] < n ? n4 + (183 & 16641) : n4;
        int n5 = Class_28165.Method_28174(n3);
        this.Field_28168 = Field_28170[n5] > n3 ? n5 - (13337 & 2279) : n5;
        this.Field_28166 = n2;
    }

    private static int Method_28174(int n) {
        int n2;
        int n3;
        int n4 = 8465 & -32702;
        int n5 = Field_28170.length - (9 & 225);
        do {
            if (n5 < n4) {
                return n4;
            }
            if (n5 == n4) {
                return n5;
            }
            n2 = n4 + n5 >>> (-32749 & 6145);
            n3 = Field_28170[n2];
            int n6 = Field_28170[n2 + (1291 & 8273)];
            if (n > n6) {
                n4 = n2 + (22785 & 641);
                continue;
            }
            if (n >= n3) break;
            n5 = n2 - (1 & -28151);
        } while (true);
        if (n == n3) {
            return n2;
        }
        return n2 + (-32735 & 8835);
    }

    public Class_16073 Method_28175() {
        return new Class_29675(this.Field_28169, this.Field_28168, this.Field_28166);
    }

    private Class_28165() {
        this(-11404 & 8384, 19588 & -31743, 1141444868 & -2111749518);
    }
}

