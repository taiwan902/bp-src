/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14445 {
    int Field_14446;
    short[] Field_14447;

    public Class_14445(int n) {
        this.Field_14446 = n;
        this.Field_14447 = new short[(5925 & 3) << n];
    }

    public void Method_14448() {
        Class_17779.Method_17784(this.Field_14447);
    }

    public int Method_14449(Class_17779 class_17779) {
        int n = 41 & 9861;
        for (int i = this.Field_14446; i != 0; --i) {
            n = (n << (549 & 20673)) + class_17779.Method_17785(this.Field_14447, n);
        }
        return n - ((21 & -32605) << this.Field_14446);
    }

    public static int Method_14450(short[] arrs, int n, Class_17779 class_17779, int n2) {
        int n3 = 6145 & 67;
        int n4 = 7432 & 16417;
        for (int i = 12288 & 16900; i < n2; ++i) {
            int n5 = class_17779.Method_17785(arrs, n + n3);
            n3 <<= 17537 & 10277;
            n3 += n5;
            n4 |= n5 << i;
        }
        return n4;
    }

    private void Method_14451() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_14452(Class_17779 class_17779) {
        int n = 11317 & -32383;
        int n2 = 2337 & -32188;
        for (int i = 2176 & 8193; i < this.Field_14446; ++i) {
            int n3 = class_17779.Method_17785(this.Field_14447, n);
            n <<= 1681 & -12253;
            n += n3;
            n2 |= n3 << i;
        }
        return n2;
    }
}

