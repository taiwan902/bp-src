/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Class_40032
extends Class_6841 {
    private final List Field_40033;
    final Class_16456 Field_40034;

    protected boolean Method_40035(int n) {
        return (-15832 & 10644) != 0;
    }

    protected int Method_40036() {
        return this.Field_40033.size();
    }

    protected int Method_40037() {
        Class_16456.Method_16478(this.Field_40034);
        return this.Method_40036() * (22029 & 10251) * (10548 & 1669);
    }

    public Class_40032(Class_16456 class_16456, Class_18 class_18) {
        this.Field_40034 = class_16456;
        Class_16456.Method_16482(class_16456);
        super(class_18, class_16456.\u0000= final, class_16456.\u0000, `, 2338 & -24480, class_16456.\u0000, ` - (88 & -32031), (1421 & 4217) * (27653 & -32314));
        this.Field_40033 = Lists.newArrayList();
        this.\u0000= final((-7008 & 280) != 0);
        for (Class_7898 class_7898 : Class_15516.Field_15520.values()) {
            if (Class_16456.Method_16469(class_16456).Method_25501(class_7898.Field_7901) <= 0 && Class_16456.Method_16469(class_16456).Method_25501(class_7898.Field_7903) <= 0) continue;
            this.Field_40033.add(class_7898);
        }
    }

    private void Method_40038() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_40039(int n, boolean bl, int n2, int n3) {
    }

    protected void Method_40040(int n, int n2, int n3, int n4, int n5, int n6) {
        Class_7898 class_7898 = (Class_7898)this.Field_40033.get(n);
        String string = Class_9802.Method_9806("entity." + Class_15516.Method_15571(class_7898.Field_7899) + ".name", new Object[24610 & -30700]);
        int n7 = Class_16456.Method_16469(this.Field_40034).Method_25501(class_7898.Field_7901);
        int n8 = Class_16456.Method_16469(this.Field_40034).Method_25501(class_7898.Field_7903);
        Object[] arrobject = new Object[4746 & 10498];
        arrobject[12812 & 192] = n7;
        arrobject[10513 & -32153] = string;
        String string2 = Class_9802.Method_9806("stat.entityKills", arrobject);
        Object[] arrobject2 = new Object[23698 & 330];
        arrobject2[15360 & 336] = string;
        arrobject2[1077 & 643] = n8;
        String string3 = Class_9802.Method_9806("stat.entityKilledBy", arrobject2);
        if (n7 == 0) {
            Object[] arrobject3 = new Object[-30715 & 4465];
            arrobject3[320 & 16514] = string;
            string2 = Class_9802.Method_9806("stat.entityKills.none", arrobject3);
        }
        if (n8 == 0) {
            Object[] arrobject4 = new Object[-15999 & 12299];
            arrobject4[1122 & -14312] = string;
            string3 = Class_9802.Method_9806("stat.entityKilledBy.none", arrobject4);
        }
        this.Field_40034.\u0000, `(Class_16456.Method_16483(this.Field_40034), string, n2 + (4262 & 19738) - (16394 & 10522), n3 + (17641 & 531), -1593835521 & 1140850687);
        Class_16456.Method_16475(this.Field_40034);
        this.Field_40034.\u0000, `(Class_16456.Method_16468(this.Field_40034), string2, n2 + (25190 & -31717), n3 + (16897 & 69) + (1193 & -20449), n7 == 0 ? -1067392928 & 157573736 : 330346652 & 10262163);
        Class_16456.Method_16476(this.Field_40034);
        this.Field_40034.\u0000, `(Class_16456.Method_16488(this.Field_40034), string3, n2 + (4114 & -16126), n3 + (12353 & 19093) + (9245 & 841) * (-3542 & 3334), n8 == 0 ? 1794668157 & 6316128 : 11662480 & 1222283928);
    }

    protected void Method_40041() {
        this.Field_40034.\u0000, 2();
    }
}

