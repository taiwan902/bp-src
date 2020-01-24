/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_23945
implements Class_14246 {
    private final Class_42376 Field_23946;
    private final Class_42376 Field_23947;
    private final String Field_23948;
    private final Class_8264 Field_23949;
    final Class_46074 Field_23950;

    Class_23945(Class_46074 class_46074, Class_8264 class_8264, Class_10492 class_10492) {
        this(class_46074, class_8264);
    }

    public boolean Method_23951(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.Field_23946.Method_42404(Class_46074.Method_46082(this.Field_23950), n2, n3)) {
            Class_46074.Method_46084((Class_46074)this.Field_23950).Field_16255 = this.Field_23949;
            return (-31743 & 16467) != 0;
        }
        if (this.Field_23947.Method_42404(Class_46074.Method_46082(this.Field_23950), n2, n3)) {
            Class_46074.Method_46082((Class_46074)this.Field_23950).Field_84.Method_39921(this.Field_23949, this.Field_23949.Method_8289());
            Class_8264.Method_8281();
            return (775 & 1153) != 0;
        }
        return (4972 & 3201) != 0;
    }

    public void Method_23952(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8 = Class_46074.Method_46084((Class_46074)this.Field_23950).Field_16255 == this.Field_23949 ? 16963 & -28663 : 3499 & 16400;
        Class_46074.Method_46082((Class_46074)this.Field_23950).Field_27.Method_28692(this.Field_23948, n2 + (28890 & 894) - Class_46074.Method_46080(this.Field_23950), n3 + n5 / (11 & -15870) - (2607 & 137) / (782 & -32750), 553648127 & 218103807);
        this.Field_23947.Field_42391 = n2 + (2239 & 16574);
        this.Field_23947.Field_42390 = n3;
        this.Field_23947.Field_42388 = this.Field_23949.Method_8274() != this.Field_23949.Method_8289() ? 3109 & 16393 : 2225 & 578;
        this.Field_23947.Method_42401(Class_46074.Method_46082(this.Field_23950), n6, n7);
        this.Field_23946.Field_42391 = n2 + (-30999 & 16747);
        this.Field_23946.Field_42390 = n3;
        this.Field_23946.Field_42381 = Class_39702.Method_39914(this.Field_23949.Method_8274());
        int n9 = -32220 & 16513;
        if (this.Field_23949.Method_8274() != 0) {
            for (Class_8264 class_8264 : Class_8264.Field_8269) {
                if (class_8264 == this.Field_23949 || class_8264.Method_8274() != this.Field_23949.Method_8274()) continue;
                n9 = 6657 & -31447;
                break;
            }
        }
        if (n8 != 0) {
            this.Field_23946.Field_42381 = (Object)((Object)Class_5478.Field_5491) + "> " + (Object)((Object)Class_5478.Field_5485) + this.Field_23946.Field_42381 + (Object)((Object)Class_5478.Field_5491) + " <";
        } else if (n9 != 0) {
            this.Field_23946.Field_42381 = (Object)((Object)Class_5478.Field_5505) + this.Field_23946.Field_42381;
        }
        this.Field_23946.Method_42401(Class_46074.Method_46082(this.Field_23950), n6, n7);
    }

    private Class_23945(Class_46074 class_46074, Class_8264 class_8264) {
        this.Field_23950 = class_46074;
        this.Field_23949 = class_8264;
        this.Field_23948 = Class_9802.Method_9806(class_8264.Method_8286(), new Object[-27517 & 10560]);
        this.Field_23946 = new Class_42376(18560 & -28158, 3080 & -20313, -23948 & 21769, -7221 & 3195, 4116 & 18197, Class_9802.Method_9806(class_8264.Method_8286(), new Object[8250 & 1344]));
        this.Field_23947 = new Class_42376(48 & 2052, 1601 & 8194, -23605 & 2048, -14670 & 54, 5172 & -23914, Class_9802.Method_9806("controls.reset", new Object[17991 & -24272]));
    }

    public void Method_23953(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field_23946.Method_42393(n2, n3);
        this.Field_23947.Method_42393(n2, n3);
    }

    private void Method_23954() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23955(int n, int n2, int n3) {
    }
}

