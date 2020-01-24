/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_36853
implements Class_1486 {
    private int Field_36854;
    private int Field_36855;
    private boolean Field_36856;
    private Class_6101 Field_36857;

    public void Method_36858(Class_29900 class_29900) {
        this.Field_36855 = class_29900.Method_29914();
        this.Field_36854 = class_29900.Method_29914();
        this.Field_36856 = class_29900.Method_29962();
        this.Field_36857 = new Class_6101();
        this.Field_36857.Field_6103 = class_29900.Method_30008();
        this.Field_36857.Field_6102 = class_29900.Method_29950();
    }

    public static Class_6101 Method_36859(Class_17665 class_17665, boolean bl, boolean bl2, int n) {
        int n2;
        Class_30238[] arrclass_30238 = class_17665.Method_17713();
        Class_6101 class_6101 = new Class_6101();
        ArrayList arrayList = Lists.newArrayList();
        for (n2 = 6674 & -16064; n2 < arrclass_30238.length; ++n2) {
            Class_30238 class_30238 = arrclass_30238[n2];
            if (class_30238 == null || bl && class_30238.Method_30258() || (n & (1 & 17013) << n2) == 0) continue;
            class_6101.Field_6103 |= (1 & -15351) << n2;
            arrayList.add(class_30238);
        }
        class_6101.Field_6102 = new byte[Class_36853.Method_36864(Integer.bitCount(class_6101.Field_6103), bl2, bl)];
        n2 = -15592 & 8199;
        for (Class_30238 class_30238 : arrayList) {
            char[] arrc;
            char[] arrc2 = arrc = class_30238.Method_30252();
            int n3 = arrc2.length;
            for (int i = 1408 & 601; i < n3; ++i) {
                char c = arrc2[i];
                class_6101.Field_6102[n2++] = (byte)(c & (16639 & 9983));
                class_6101.Field_6102[n2++] = (byte)(c >> (-29588 & 16794) & (4351 & 8447));
            }
        }
        for (Class_30238 class_30238 : arrayList) {
            n2 = Class_36853.Method_36860(class_30238.Method_30254().Method_14605(), class_6101.Field_6102, n2);
        }
        if (bl2) {
            for (Class_30238 class_30238 : arrayList) {
                n2 = Class_36853.Method_36860(class_30238.Method_30250().Method_14605(), class_6101.Field_6102, n2);
            }
        }
        if (bl) {
            Class_36853.Method_36860(class_17665.Method_17743(), class_6101.Field_6102, n2);
        }
        return class_6101;
    }

    private static int Method_36860(byte[] arrby, byte[] arrby2, int n) {
        System.arraycopy(arrby, 802 & 20608, arrby2, n, arrby.length);
        return n + arrby.length;
    }

    public void Method_36861(Class_10954 class_10954) {
        this.Method_36870((Class_14856)class_10954);
    }

    public Class_36853() {
    }

    public int Method_36862() {
        return this.Field_36857.Field_6103;
    }

    public int Method_36863() {
        return this.Field_36855;
    }

    protected static int Method_36864(int n, boolean bl, boolean bl2) {
        int n2 = n * (24619 & 1174) * (2396 & -32718) * (2100 & 4121) * (8218 & -24816);
        int n3 = n * (464 & -6120) * (-32206 & 2064) * (-32750 & 8241) / (-23034 & 426);
        int n4 = bl ? n * (-22960 & 2070) * (4919 & 80) * (4304 & 8208) / (4611 & 18438) : -28342 & 8321;
        int n5 = bl2 ? 258 & -16120 : -30712 & 838;
        return n2 + n3 + n4 + n5;
    }

    public boolean Method_36865() {
        return this.Field_36856;
    }

    private void Method_36866() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_36867() {
        return this.Field_36854;
    }

    public Class_36853(Class_17665 class_17665, boolean bl, int n) {
        this.Field_36855 = class_17665.Field_17666;
        this.Field_36854 = class_17665.Field_17668;
        this.Field_36856 = bl;
        this.Field_36857 = Class_36853.Method_36859(class_17665, bl, (!class_17665.Method_17708().Field_284.Method_18370() ? 39 & 73 : 38 & -8184) != 0, n);
    }

    public byte[] Method_36868() {
        return this.Field_36857.Field_6102;
    }

    public void Method_36869(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_36855);
        class_29900.Method_30010(this.Field_36854);
        class_29900.Method_29980(this.Field_36856);
        class_29900.Method_29922((short)(this.Field_36857.Field_6103 & (1669398527 & -2075525121)));
        class_29900.Method_29946(this.Field_36857.Field_6102);
    }

    public void Method_36870(Class_14856 class_14856) {
        class_14856.Method_14881(this);
    }
}

