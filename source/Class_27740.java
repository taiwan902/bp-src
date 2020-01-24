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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Class_27740
extends Class_1490 {
    private String Field_27741;
    private final Class_1490 Field_27742;
    private Class_18140 Field_27743;
    private final Class_39702 Field_27744;
    private final List Field_27745 = Lists.newArrayList();
    private Class_42376 Field_27746;
    private final List Field_27747 = Lists.newArrayList();
    private String[] Field_27748;

    private void Method_27749() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27740(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_27742 = class_1490;
        this.Field_27744 = class_39702;
    }

    public void Method_27750() {
        super.Method_1544();
        this.Field_27743.\u0000, for();
    }

    static List Method_27751(Class_27740 class_27740) {
        return class_27740.Field_27747;
    }

    public void Method_27752(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_27743.\u0000strictfp(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_27741, this.\u0000= final / (18443 & 1110), 41 & 25736, 50331647 & 100663295);
        int n3 = 951 & 8286;
        String[] arrstring = this.Field_27748;
        int n4 = arrstring.length;
        for (int i = -26670 & 8192; i < n4; ++i) {
            String string = arrstring[i];
            this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (-32077 & 17478), n3, 76661632 & -1564440411);
            n3 += -9187 & 905;
        }
        super.Method_1545(n, n2, f);
    }

    public void Method_27753() {
        this.Field_27741 = Class_9802.Method_9806("options.snooper.title", new Object[2182 & 1120]);
        String string = Class_9802.Method_9806("options.snooper.desc", new Object[1032 & 68]);
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.\u0000strictfp.Method_28733(string, this.\u0000= final - (16670 & -22370))) {
            arrayList.add((String)object);
        }
        this.Field_27748 = arrayList.toArray(new String[arrayList.size()]);
        this.Field_27747.clear();
        this.Field_27745.clear();
        this.Field_27746 = new Class_42376(14401 & 1929, this.\u0000= final / (3142 & -20470) - (-30823 & 6296), this.\u0000, ` - (63 & 14366), -21065 & 662, 8893 & 1044, this.Field_27744.Method_39885(Class_6340.Field_6348));
        this.\u0000strictfp.add(this.Field_27746);
        this.\u0000strictfp.add(new Class_42376(4114 & 25410, this.\u0000= final / (30770 & 7) + (-32694 & 25095), this.\u0000, ` - (5663 & 16734), 150 & -30786, 1300 & 4116, Class_9802.Method_9806("gui.done", new Object[5221 & 8330])));
        int n = this.\u0000strictfp.Method_180() != null && this.\u0000strictfp.Method_180().\u0000strictfp() != null ? 1041 & 20709 : -16368 & 481;
        for (Map.Entry entry : new TreeMap(this.\u0000strictfp.Method_190().Method_2446()).entrySet()) {
            this.Field_27747.add((n != 0 ? "C " : "") + (String)entry.getKey());
            this.Field_27745.add(this.\u0000strictfp.Method_28691((String)entry.getValue(), this.\u0000= final - (10463 & -31524)));
        }
        if (n != 0) {
            for (Map.Entry entry : new TreeMap(this.\u0000strictfp.Method_180().\u0000strictfp().Method_2446()).entrySet()) {
                this.Field_27747.add("S " + (String)entry.getKey());
                this.Field_27745.add(this.\u0000strictfp.Method_28691((String)entry.getValue(), this.\u0000= final - (8956 & 1244)));
            }
        }
        this.Field_27743 = new Class_18140(this);
    }

    static List Method_27754(Class_27740 class_27740) {
        return class_27740.Field_27745;
    }

    protected void Method_27755(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (8202 & -31082)) {
                this.Field_27744.Method_39903();
                this.Field_27744.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_27742);
            }
            if (class_42376.Field_42392 == (11825 & -16121)) {
                this.Field_27744.Method_39923(Class_6340.Field_6348, -30389 & 1025);
                this.Field_27746.Field_42381 = this.Field_27744.Method_39885(Class_6340.Field_6348);
            }
        }
    }
}

