/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
import com.google.common.collect.ComparisonChain;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_40456
extends Class_26535
implements Comparable {
    protected final Class_31211 Field_40457;

    private void Method_40458() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_40459(Class_40456 class_40456) {
        return ComparisonChain.start().compare(class_40456.\u0000, `, this.\u0000, `).compare(this.Method_40462(), class_40456.Method_40462()).result();
    }

    public int Method_40460(Object object) {
        return this.Method_40459((Class_40456)object);
    }

    public String Method_40461() {
        return "MyWeighedRandomItem{weight=" + this.\u0000, ` + ", model=" + this.Field_40457 + (char)(9341 & 4221);
    }

    public Class_40456(Class_31211 class_31211, int n) {
        super(n);
        this.Field_40457 = class_31211;
    }

    protected int Method_40462() {
        int n = this.Field_40457.Method_31214().size();
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n2 = arrclass_4595.length;
        for (int i = 23666 & 8205; i < n2; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            n += this.Field_40457.Method_31218(class_4595).size();
        }
        return n;
    }
}

