/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Set;

public class Class_22057
extends Class_9665 {
    private String Field_22058;
    private String Field_22059 = "";
    private final String Field_22060;
    private final Set Field_22061 = Sets.newHashSet();
    private String Field_22062 = "";
    private final Class_20976 Field_22063;
    private Class_5478 Field_22064 = Class_5478.Field_5507;
    private boolean Field_22065 = 1195 & -14267;
    private boolean Field_22066 = 29129 & 3073;
    private Class_31355 Field_22067 = Class_31355.Field_31361;
    private Class_31355 Field_22068 = Class_31355.Field_31361;

    public Class_31355 Method_22069() {
        return this.Field_22068;
    }

    private void Method_22070() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22071(String string) {
        this.Field_22062 = string;
        this.Field_22063.Method_20991(this);
    }

    public void Method_22072(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.Field_22059 = string;
        this.Field_22063.Method_20991(this);
    }

    public void Method_22073(Class_31355 class_31355) {
        this.Field_22067 = class_31355;
        this.Field_22063.Method_20991(this);
    }

    public void Method_22074(Class_5478 class_5478) {
        this.Field_22064 = class_5478;
    }

    public String Method_22075() {
        return this.Field_22060;
    }

    public void Method_22076(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.Field_22058 = string;
        this.Field_22063.Method_20991(this);
    }

    public int Method_22077() {
        int n = 4130 & 10388;
        if (this.Method_22079()) {
            n |= 1 & 12331;
        }
        if (this.Method_22090()) {
            n |= 5295 & 594;
        }
        return n;
    }

    public void Method_22078(int n) {
        this.Method_22085(((n & (8321 & 5189)) > 0 ? -6119 & 641 : 130 & 4193) != 0);
        this.Method_22091(((n & (-15669 & 13362)) > 0 ? 1049 & 6183 : 1220 & -10230) != 0);
    }

    public boolean Method_22079() {
        return this.Field_22066;
    }

    public String Method_22080() {
        return this.Field_22058;
    }

    public Class_5478 Method_22081() {
        return this.Field_22064;
    }

    public static String Method_22082(Class_9665 class_9665, String string) {
        return class_9665 == null ? string : class_9665.Method_9666(string);
    }

    public String Method_22083() {
        return this.Field_22059;
    }

    public String Method_22084(String string) {
        return this.Method_22083() + string + this.Method_22089();
    }

    public void Method_22085(boolean bl) {
        this.Field_22066 = bl;
        this.Field_22063.Method_20991(this);
    }

    public void Method_22086(Class_31355 class_31355) {
        this.Field_22068 = class_31355;
        this.Field_22063.Method_20991(this);
    }

    public Collection Method_22087() {
        return this.Field_22061;
    }

    public Class_31355 Method_22088() {
        return this.Field_22067;
    }

    public String Method_22089() {
        return this.Field_22062;
    }

    public boolean Method_22090() {
        return this.Field_22065;
    }

    public Class_22057(Class_20976 class_20976, String string) {
        this.Field_22063 = class_20976;
        this.Field_22060 = string;
        this.Field_22058 = string;
    }

    public void Method_22091(boolean bl) {
        this.Field_22065 = bl;
        this.Field_22063.Method_20991(this);
    }
}

