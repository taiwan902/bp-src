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
import java.util.Collection;
import java.util.List;

public class Class_11076 {
    private final Class_4751 Field_11077;
    private final List Field_11078 = Lists.newArrayList();
    private final Class_283 Field_11079;
    private final Class_4751 Field_11080;
    private final Class_4595 Field_11081;
    private final List Field_11082 = Lists.newArrayList();

    private void Method_11083() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_11084(Class_4751 class_4751) {
        Class_4751 class_47512;
        int n;
        Class_3238 class_3238 = this.Field_11079.Method_375(class_4751).Method_3442();
        if (class_3238.Method_3373() == Class_3713.Field_3718) {
            return (261 & 11267) != 0;
        }
        if (!Class_5257.Method_5268(class_3238, this.Field_11079, class_4751, this.Field_11081, (27909 & 522) != 0)) {
            return (-16127 & 8335) != 0;
        }
        if (class_4751.equals(this.Field_11080)) {
            return (3105 & 12421) != 0;
        }
        if (this.Field_11078.contains(class_4751)) {
            return (-19821 & 2085) != 0;
        }
        int n2 = 73 & 3201;
        if (n2 + this.Field_11078.size() > (4175 & 1308)) {
            return (-31672 & 2576) != 0;
        }
        while (class_3238 == Class_9265.Field_9406 && (class_3238 = this.Field_11079.Method_375(class_47512 = class_4751.Method_4776(this.Field_11081.Method_4660(), n2)).Method_3442()).Method_3373() != Class_3713.Field_3718 && Class_5257.Method_5268(class_3238, this.Field_11079, class_47512, this.Field_11081, (3348 & 4105) != 0) && !class_47512.equals(this.Field_11080)) {
            if (++n2 + this.Field_11078.size() <= (-14292 & 30)) continue;
            return (28768 & -31612) != 0;
        }
        int n3 = 104 & -16256;
        for (n = n2 - (20545 & -21473); n >= 0; --n) {
            this.Field_11078.add(class_4751.Method_4776(this.Field_11081.Method_4660(), n));
            ++n3;
        }
        n = 513 & 1481;
        do {
            int n4;
            Class_4751 class_47513;
            if ((n4 = this.Field_11078.indexOf(class_47513 = class_4751.Method_4776(this.Field_11081, n))) > (-1 & -1)) {
                this.Method_11088(n3, n4);
                for (int i = 60 & 3587; i <= n4 + n3; ++i) {
                    Class_4751 class_47514 = (Class_4751)this.Field_11078.get(i);
                    if (this.Field_11079.Method_375(class_47514).Method_3442() != Class_9265.Field_9406 || this.Method_11085(class_47514)) continue;
                    return (256 & 17944) != 0;
                }
                return (-32495 & 1665) != 0;
            }
            class_3238 = this.Field_11079.Method_375(class_47513).Method_3442();
            if (class_3238.Method_3373() == Class_3713.Field_3718) {
                return (4801 & 41) != 0;
            }
            if (!Class_5257.Method_5268(class_3238, this.Field_11079, class_47513, this.Field_11081, (2561 & 225) != 0) || class_47513.equals(this.Field_11080)) {
                return (8238 & -31728) != 0;
            }
            if (class_3238.Method_3340() == (28681 & 549)) {
                this.Field_11082.add(class_47513);
                return (14731 & 37) != 0;
            }
            if (this.Field_11078.size() >= (12 & 3517)) {
                return (448 & -20433) != 0;
            }
            this.Field_11078.add(class_47513);
            ++n3;
            ++n;
        } while (true);
    }

    private boolean Method_11085(Class_4751 class_4751) {
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n = arrclass_4595.length;
        for (int i = 8310 & 18696; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            if (class_4595.Method_4640() == this.Field_11081.Method_4640() || this.Method_11084(class_4751.Method_4765(class_4595))) continue;
            return (13865 & 2048) != 0;
        }
        return (-32761 & 4361) != 0;
    }

    public boolean Method_11086() {
        this.Field_11078.clear();
        this.Field_11082.clear();
        Class_3238 class_3238 = this.Field_11079.Method_375(this.Field_11077).Method_3442();
        if (!Class_5257.Method_5268(class_3238, this.Field_11079, this.Field_11077, this.Field_11081, (1036 & 21408) != 0)) {
            if (class_3238.Method_3340() != (-32495 & 677)) {
                return (-14312 & 386) != 0;
            }
            this.Field_11082.add(this.Field_11077);
            return (833 & -31719) != 0;
        }
        if (!this.Method_11084(this.Field_11077)) {
            return (1024 & 16704) != 0;
        }
        for (int i = 8 & -22608; i < this.Field_11078.size(); ++i) {
            Class_4751 class_4751 = (Class_4751)this.Field_11078.get(i);
            if (this.Field_11079.Method_375(class_4751).Method_3442() != Class_9265.Field_9406 || this.Method_11085(class_4751)) continue;
            return (2064 & -24572) != 0;
        }
        return (13 & 113) != 0;
    }

    public List Method_11087() {
        return this.Field_11078;
    }

    private void Method_11088(int n, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.Field_11078.subList(-31447 & 20484, n2));
        arrayList2.addAll(this.Field_11078.subList(this.Field_11078.size() - n, this.Field_11078.size()));
        arrayList3.addAll(this.Field_11078.subList(n2, this.Field_11078.size() - n));
        this.Field_11078.clear();
        this.Field_11078.addAll(arrayList);
        this.Field_11078.addAll(arrayList2);
        this.Field_11078.addAll(arrayList3);
    }

    public Class_11076(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, boolean bl) {
        this.Field_11079 = class_283;
        this.Field_11080 = class_4751;
        if (bl) {
            this.Field_11081 = class_4595;
            this.Field_11077 = class_4751.Method_4765(class_4595);
        } else {
            this.Field_11081 = class_4595.Method_4660();
            this.Field_11077 = class_4751.Method_4776(class_4595, -31614 & 270);
        }
    }

    public List Method_11089() {
        return this.Field_11082;
    }
}

