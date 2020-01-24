/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Class_19810 {
    private int Field_19811;
    private final List Field_19812 = Lists.newArrayListWithCapacity((int)(18817 & 1332));
    private final int Field_19813;
    private final int Field_19814;
    private final int Field_19815;
    private final boolean Field_19816;
    private final Set Field_19817 = Sets.newHashSetWithExpectedSize((int)(352 & -32364));
    private int Field_19818;
    private final int Field_19819;

    public int Method_19820() {
        return this.Field_19811;
    }

    public void Method_19821() {
        Class_10057[] arrclass_10057 = this.Field_19817.toArray(new Class_10057[this.Field_19817.size()]);
        Arrays.sort(arrclass_10057);
        Class_10057[] arrclass_100572 = arrclass_10057;
        int n = arrclass_100572.length;
        for (int i = 17061 & 1282; i < n; ++i) {
            Class_10057 class_10057 = arrclass_100572[i];
            if (this.Method_19828(class_10057)) continue;
            Object[] arrobject = new Object[12815 & 3079];
            arrobject[-31716 & 27426] = class_10057.Method_10065().Method_11438();
            arrobject[-32735 & 6659] = class_10057.Method_10065().Method_11431();
            arrobject[2234 & 29703] = class_10057.Method_10065().Method_11424();
            arrobject[-9301 & 1027] = this.Field_19811;
            arrobject[1804 & -32764] = this.Field_19818;
            arrobject[8199 & 4685] = this.Field_19813;
            arrobject[-32594 & 263] = this.Field_19819;
            String string = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", arrobject);
            throw new Class_33711(class_10057, string);
        }
        if (this.Field_19816) {
            this.Field_19811 = Class_13337.Method_13380(this.Field_19811);
            this.Field_19818 = Class_13337.Method_13380(this.Field_19818);
        }
    }

    public List Method_19822() {
        ArrayList arrayList = new ArrayList();
        for (Object object : this.Field_19812) {
            ((Class_21486)object).Method_21499(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object e : arrayList) {
            Class_21486 class_21486 = (Class_21486)e;
            Class_10057 class_10057 = class_21486.Method_21498();
            Class_11372 class_11372 = class_10057.Method_10065();
            class_11372.Method_11409(this.Field_19811, this.Field_19818, class_21486.Method_21494(), class_21486.Method_21496(), class_10057.Method_10072());
            arrayList2.add(class_11372);
        }
        return arrayList2;
    }

    private boolean Method_19823(Class_10057 class_10057) {
        int n;
        int n2;
        int n3;
        int n4;
        Class_21486 class_21486;
        int n5 = Math.min(class_10057.Method_10070(), class_10057.Method_10068());
        int n6 = n2 = this.Field_19811 == 0 && this.Field_19818 == 0 ? -32183 & 6529 : 8 & 22785;
        if (this.Field_19816) {
            int n7;
            int n8;
            n4 = Class_13337.Method_13380(this.Field_19811);
            n3 = Class_13337.Method_13380(this.Field_19818);
            int n9 = Class_13337.Method_13380(this.Field_19811 + n5);
            int n10 = Class_13337.Method_13380(this.Field_19818 + n5);
            int n11 = n9 <= this.Field_19813 ? 65 & 4609 : -29163 & 480;
            int n12 = n7 = n10 <= this.Field_19819 ? 18631 & -28135 : 4874 & -22528;
            if (n11 == 0 && n7 == 0) {
                return (298 & -20460) != 0;
            }
            int n13 = n4 != n9 ? -30207 & 8199 : 1024 & 8900;
            int n14 = n8 = n3 != n10 ? 513 & 8259 : -29848 & 130;
            n = (n13 ^ n8) != 0 ? (n13 == 0 ? 523 & 24641 : 8770 & 1156) : (n11 != 0 && n4 <= n3 ? 77 & 18449 : -5887 & 4744);
        } else {
            n4 = this.Field_19811 + n5 <= this.Field_19813 ? -28575 & 9361 : 6276 & -32688;
            int n15 = n3 = this.Field_19818 + n5 <= this.Field_19819 ? 205 & -31743 : -31595 & 8962;
            if (n4 == 0 && n3 == 0) {
                return (12298 & 32) != 0;
            }
            n = n4 != 0 && (n2 != 0 || this.Field_19811 <= this.Field_19818) ? -30679 & 583 : 17600 & -24055;
        }
        n4 = Math.max(class_10057.Method_10070(), class_10057.Method_10068());
        if (Class_13337.Method_13380((n == 0 ? this.Field_19818 : this.Field_19811) + n4) > (n == 0 ? this.Field_19819 : this.Field_19813)) {
            return (-28672 & 9253) != 0;
        }
        if (n != 0) {
            if (class_10057.Method_10070() > class_10057.Method_10068()) {
                class_10057.Method_10071();
            }
            if (this.Field_19818 == 0) {
                this.Field_19818 = class_10057.Method_10068();
            }
            class_21486 = new Class_21486(this.Field_19811, -30335 & 4164, class_10057.Method_10070(), this.Field_19818);
            this.Field_19811 += class_10057.Method_10070();
        } else {
            class_21486 = new Class_21486(600 & -16351, this.Field_19818, this.Field_19811, class_10057.Method_10068());
            this.Field_19818 += class_10057.Method_10068();
        }
        class_21486.Method_21495(class_10057);
        this.Field_19812.add(class_21486);
        return (2099 & 649) != 0;
    }

    private static int Method_19824(int n, int n2) {
        return (n >> n2) + ((n & ((-23487 & 265) << n2) - (1 & -24177)) == 0 ? 3089 & 24608 : 7173 & 8233) << n2;
    }

    private void Method_19825() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_19810(int n, int n2, boolean bl, int n3, int n4) {
        this.Field_19814 = n4;
        this.Field_19813 = n;
        this.Field_19819 = n2;
        this.Field_19816 = bl;
        this.Field_19815 = n3;
    }

    static int Method_19826(int n, int n2) {
        return Class_19810.Method_19824(n, n2);
    }

    public void Method_19827(Class_11372 class_11372) {
        Class_10057 class_10057 = new Class_10057(class_11372, this.Field_19814);
        if (this.Field_19815 > 0) {
            class_10057.Method_10067(this.Field_19815);
        }
        this.Field_19817.add(class_10057);
    }

    private boolean Method_19828(Class_10057 class_10057) {
        for (int i = 2536 & -16381; i < this.Field_19812.size(); ++i) {
            if (((Class_21486)this.Field_19812.get(i)).Method_21495(class_10057)) {
                return (-15095 & 2085) != 0;
            }
            class_10057.Method_10071();
            if (((Class_21486)this.Field_19812.get(i)).Method_21495(class_10057)) {
                return (513 & 5191) != 0;
            }
            class_10057.Method_10071();
        }
        return this.Method_19823(class_10057);
    }

    public int Method_19829() {
        return this.Field_19818;
    }
}

