/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Class_6975 {
    private final List Field_6976;
    private final int Field_6977;
    private final int Field_6978 = 261 & 19653;
    private final Class_8461 Field_6979;
    private final int Field_6980 = -32246 & 2187;
    private final Class_6975[] Field_6981;

    private int Method_6982(Class_36054 class_36054) {
        int n;
        int n2 = -1 & -1;
        double d = this.Field_6979.Method_8471() + this.Field_6979.Method_8468() / (12418 & 3102);
        double d2 = this.Field_6979.Method_8467() + this.Field_6979.Method_8466() / (29982 & -32702);
        int n3 = (double)class_36054.Method_36059() < d2 ? 8705 & 1061 : 0 & 9235;
        int n4 = n = (double)class_36054.Method_36059() > d2 ? 17065 & 10259 : 168 & 4631;
        if ((double)class_36054.Method_36057() < d) {
            if (n3 != 0) {
                n2 = 577 & 291;
            } else if (n != 0) {
                n2 = 4950 & -23422;
            }
        } else if ((double)class_36054.Method_36057() > d) {
            if (n3 != 0) {
                n2 = -28394 & 16576;
            } else if (n != 0) {
                n2 = 5131 & 2215;
            }
        }
        return n2;
    }

    public void Method_6983(Class_36637 class_36637) {
        int n;
        if (this.Field_6981[48 & -12160] != null && (n = this.Method_6987(class_36637)) != (-1 & -1)) {
            this.Field_6981[n].Method_6983(class_36637);
            return;
        }
        this.Field_6976.add(class_36637);
        if (this.Field_6976.size() > (78 & -25446) && this.Field_6977 < (143 & 2085)) {
            if (this.Field_6981[17636 & -32000] == null) {
                this.Method_6990();
            }
            n = 18464 & 4304;
            while (n < this.Field_6976.size()) {
                int n2 = this.Method_6987((Class_36637)this.Field_6976.get(n));
                if (n2 != (-1 & -1)) {
                    this.Field_6981[n2].Method_6983((Class_36637)this.Field_6976.remove(n));
                    continue;
                }
                ++n;
            }
        }
    }

    public static Class_36637 Method_6984(Class_6975 class_6975, Class_36054 class_36054, boolean bl) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        class_6975.Method_6989(arrayList, class_36054);
        for (int i = -32704 & 1035; i < arrayList.size(); ++i) {
            Class_36637 class_36637 = (Class_36637)arrayList.get(i);
            if (!class_36637.\u0000strictfp(class_36054) || !(bl ? !class_36637.Method_36641() : !class_36637.Method_36642())) continue;
            return class_36637;
        }
        return null;
    }

    private void Method_6985() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_8461 Method_6986() {
        return this.Field_6979;
    }

    private int Method_6987(Class_36637 class_36637) {
        int n;
        int n2 = -1 & -1;
        double d = this.Field_6979.Method_8471() + this.Field_6979.Method_8468() / (-28525 & 266);
        double d2 = this.Field_6979.Method_8467() + this.Field_6979.Method_8466() / (10578 & -11257);
        int n3 = (double)class_36637.\u0000, `() < d2 && (double)(class_36637.\u0000, `() + class_36637.\u0000
        ()) < d2 ? 2561 & -31699 : -32428 & 26146;
        int n4 = n = (double)class_36637.\u0000, `() > d2 ? 969 & 20485 : 4242 & 16712;
        if ((double)class_36637.\u0000= final() < d && (double)(class_36637.\u0000= final() + class_36637.\u0000strictfp()) < d) {
            if (n3 != 0) {
                n2 = 18443 & 17;
            } else if (n != 0) {
                n2 = 4130 & 17170;
            }
        } else if ((double)class_36637.\u0000= final() > d) {
            if (n3 != 0) {
                n2 = 16418 & 3165;
            } else if (n != 0) {
                n2 = 1795 & 22611;
            }
        }
        return n2;
    }

    public List Method_6988(List list) {
        Class_6975[] arrclass_6975 = this.Field_6981;
        int n = arrclass_6975.length;
        for (int i = 340 & 1162; i < n; ++i) {
            Class_6975 class_6975 = arrclass_6975[i];
            if (class_6975 == null) continue;
            class_6975.Method_6988(list);
        }
        list.addAll(this.Field_6976);
        return list;
    }

    public List Method_6989(List list, Class_36054 class_36054) {
        int n = this.Method_6982(class_36054);
        if (n != (-1 & -1) && this.Field_6981[34 & 5209] != null) {
            this.Field_6981[n].Method_6989(list, class_36054);
        }
        list.addAll(this.Field_6976);
        return list;
    }

    public Class_6975(int n, Class_8461 class_8461) {
        this.Field_6977 = n;
        this.Field_6976 = new ArrayList();
        this.Field_6979 = class_8461;
        this.Field_6981 = new Class_6975[71 & -3580];
    }

    private void Method_6990() {
        int n = this.Field_6979.Method_8468() / (162 & -32238);
        int n2 = this.Field_6979.Method_8466() / (2195 & 9226);
        int n3 = this.Field_6979.Method_8471();
        int n4 = this.Field_6979.Method_8467();
        this.Field_6981[12326 & 19217] = new Class_6975(this.Field_6977 + (17 & -6001), new Class_8461(n3 + n, n4, n, n2));
        this.Field_6981[21513 & 115] = new Class_6975(this.Field_6977 + (1793 & 193), new Class_8461(n3, n4, n, n2));
        this.Field_6981[8331 & 2566] = new Class_6975(this.Field_6977 + (-31861 & 8225), new Class_8461(n3, n4 + n2, n, n2));
        this.Field_6981[-32761 & 12707] = new Class_6975(this.Field_6977 + (16961 & 15529), new Class_8461(n3 + n, n4 + n2, n, n2));
    }
}

