/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Class_46074
extends Class_31144 {
    private int Field_46075 = -3996 & 3986;
    private final Class_18 Field_46076;
    private final Class_16252 Field_46077;
    private final Class_14246[] Field_46078;

    public Class_46074(Class_16252 class_16252, Class_18 class_18) {
        super(class_18, class_16252.\u0000= final, class_16252.\u0000, `, 703 & 9599, class_16252.\u0000, ` - (3633 & -32736), 1047 & 52);
        this.Field_46077 = class_16252;
        this.Field_46076 = class_18;
        Class_8264[] arrclass_8264 = (Class_8264[])ArrayUtils.clone((Object[])class_18.Field_84.Field_39758);
        this.Field_46078 = new Class_14246[arrclass_8264.length + Class_8264.Method_8278().size()];
        Arrays.sort(arrclass_8264);
        int n = 24581 & -26336;
        String string = null;
        Class_8264[] arrclass_82642 = arrclass_8264;
        int n2 = arrclass_82642.length;
        for (int i = -30520 & 24881; i < n2; ++i) {
            int n3;
            Class_8264 class_8264 = arrclass_82642[i];
            String string2 = class_8264.Method_8285();
            if (!string2.equals(string)) {
                string = string2;
                this.Field_46078[n++] = new Class_19160(this, string2);
            }
            if ((n3 = class_18.Field_27.Method_28715(Class_9802.Method_9806(class_8264.Method_8286(), new Object[16608 & -29691]))) > this.Field_46075) {
                this.Field_46075 = n3;
            }
            this.Field_46078[n++] = new Class_23945(this, class_8264, null);
        }
    }

    public Class_14246 Method_46079(int n) {
        return this.Field_46078[n];
    }

    static int Method_46080(Class_46074 class_46074) {
        return class_46074.Field_46075;
    }

    private void Method_46081() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_18 Method_46082(Class_46074 class_46074) {
        return class_46074.Field_46076;
    }

    public int Method_46083() {
        return super.\u0000= final() + (-21976 & 17712);
    }

    static Class_16252 Method_46084(Class_46074 class_46074) {
        return class_46074.Field_46077;
    }

    protected int Method_46085() {
        return this.Field_46078.length;
    }

    protected int Method_46086() {
        return super.\u0000strictfp() + (1231 & 12335);
    }
}

