/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

public class Class_8472
extends Class_6841 {
    final Class_28810 Field_8473;

    protected void Method_8474(int n, int n2, int n3, int n4, int n5, int n6) {
        Class_40879 class_40879 = (Class_40879)Class_28810.Method_28842(this.Field_8473).get(n);
        String string = class_40879.Method_40889();
        if (StringUtils.isEmpty((CharSequence)string)) {
            string = Class_28810.Method_28849(this.Field_8473) + " " + (n + (4129 & 1181));
        }
        String string2 = class_40879.Method_40893();
        string2 = string2 + " (" + Class_28810.Method_28828(this.Field_8473).format(new Date(class_40879.Method_40897()));
        string2 = string2 + ")";
        String string3 = "";
        if (class_40879.Method_40895()) {
            string3 = Class_28810.Method_28846(this.Field_8473) + " " + string3;
        } else {
            string3 = Class_28810.Method_28834(this.Field_8473)[class_40879.Method_40891().Method_35660()];
            if (class_40879.Method_40892()) {
                string3 = (Object)((Object)Class_5478.Field_5502) + Class_9802.Method_9806("gameMode.hardcore", new Object[292 & 22600]) + (Object)((Object)Class_5478.Field_5507);
            }
            if (class_40879.Method_40888()) {
                string3 = string3 + ", " + Class_9802.Method_9806("selectWorld.cheats", new Object[1536 & 18483]);
            }
        }
        this.Field_8473.\u0000, `(this.Field_8473.\u0000strictfp, string, n2 + (8330 & 6438), n3 + (1135 & -32623), 184549375 & 553648127);
        this.Field_8473.\u0000, `(this.Field_8473.\u0000strictfp, string2, n2 + (-15357 & 358), n3 + (8236 & -30050), 146834592 & 630030736);
        this.Field_8473.\u0000, `(this.Field_8473.\u0000strictfp, string3, n2 + (2202 & -24574), n3 + (686 & -32755) + (-32678 & 1450), 1269011608 & 281586116);
    }

    protected void Method_8475() {
        this.Field_8473.\u0000, 2();
    }

    protected boolean Method_8476(int n) {
        return (n == Class_28810.Method_28829(this.Field_8473) ? 10625 & 5151 : 18640 & -24288) != 0;
    }

    protected void Method_8477(int n, boolean bl, int n2, int n3) {
        Class_28810.Method_28838(this.Field_8473, n);
        int n4 = Class_28810.Method_28829(this.Field_8473) >= 0 && Class_28810.Method_28829(this.Field_8473) < this.Method_8479() ? 9209 & 2051 : 32533 & -32702;
        Class_28810.Method_28827((Class_28810)this.Field_8473).Field_42388 = n4;
        Class_28810.Method_28848((Class_28810)this.Field_8473).Field_42388 = n4;
        Class_28810.Method_28835((Class_28810)this.Field_8473).Field_42388 = n4;
        Class_28810.Method_28844((Class_28810)this.Field_8473).Field_42388 = n4;
        if (bl && n4 != 0) {
            this.Field_8473.Method_28833(n);
        }
    }

    private void Method_8478() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int Method_8479() {
        return Class_28810.Method_28842(this.Field_8473).size();
    }

    public Class_8472(Class_28810 class_28810, Class_18 class_18) {
        this.Field_8473 = class_28810;
        super(class_18, class_28810.\u0000= final, class_28810.\u0000, `, 1074 & -30432, class_28810.\u0000, ` - (16476 & -29984), 16508 & 38);
    }

    protected int Method_8480() {
        return Class_28810.Method_28842(this.Field_8473).size() * (-32468 & 100);
    }
}

