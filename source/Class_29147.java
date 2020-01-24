/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_29147
implements Callable {
    final int[][] Field_29148;
    final Class_11372 Field_29149;

    private void Method_29150() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_29147(Class_11372 class_11372, int[][] arrn) {
        this.Field_29149 = class_11372;
        this.Field_29148 = arrn;
    }

    public String Method_29151() {
        StringBuilder stringBuilder = new StringBuilder();
        int[][] arrn = this.Field_29148;
        int n = arrn.length;
        for (int i = 16456 & -26607; i < n; ++i) {
            int[] arrn2 = arrn[i];
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arrn2 == null ? "null" : Integer.valueOf(arrn2.length));
        }
        return stringBuilder.toString();
    }

    public Object Method_29152() {
        return this.Method_29151();
    }
}

