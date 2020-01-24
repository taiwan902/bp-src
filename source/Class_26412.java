/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashSet;

public class Class_26412 {
    private int Field_26413;
    private Class_30305[] Field_26414;

    public int[] Method_26415() {
        int[] arrn;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 9216 & -30362; i < this.Field_26414.length; ++i) {
            arrn = this.Field_26414[i];
            int n = arrn.Method_30308();
            hashSet.add(n);
        }
        Integer[] arrinteger = hashSet.toArray(new Integer[hashSet.size()]);
        arrn = Class_19426.Method_19547(arrinteger);
        return arrn;
    }

    private void Method_26416() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_26417(int n, int n2) {
        for (int i = 1536 & 20; i < this.Field_26414.length; ++i) {
            Class_30305 class_30305 = this.Field_26414[i];
            if (!class_30305.Method_30309(n, n2)) continue;
            return (6149 & -16047) != 0;
        }
        return (-32720 & 8) != 0;
    }

    public String Method_26418() {
        return "block." + this.Field_26413 + "=" + Class_19426.Method_19555(this.Field_26414);
    }

    public int Method_26419() {
        return this.Field_26413;
    }

    public Class_26412(int n, Class_30305[] arrclass_30305) {
        this.Field_26413 = n;
        this.Field_26414 = arrclass_30305;
    }

    public Class_30305[] Method_26420(int n) {
        ArrayList<Class_30305> arrayList = new ArrayList<Class_30305>();
        for (int i = 1619 & 136; i < this.Field_26414.length; ++i) {
            Class_30305 class_30305 = this.Field_26414[i];
            if (class_30305.Method_30308() != n) continue;
            arrayList.add(class_30305);
        }
        Class_30305[] arrclass_30305 = arrayList.toArray(new Class_30305[arrayList.size()]);
        return arrclass_30305;
    }
}

