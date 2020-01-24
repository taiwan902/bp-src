/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_18129
extends Class_11220 {
    public boolean Field_18130 = 196 & 8482;
    public boolean Field_18131 = 2144 & 29697;
    public final Class_8264 Field_18132;

    public String Method_18133() {
        String string;
        String string2 = string = this.\u0000strictfp() == null ? "(null)" : Class_39702.Method_39914((Integer)this.\u0000strictfp());
        if (this.Field_18130) {
            return (Object)((Object)Class_5478.Field_5491) + "> " + (Object)((Object)Class_5478.Field_5485) + string + (Object)((Object)Class_5478.Field_5491) + " <";
        }
        this.Field_18131 = 4128 & 2335;
        if (this.Field_18132.Method_8274() != 0) {
            for (Class_8264 class_8264 : Class_8264.Field_8269) {
                if (class_8264 == this.Field_18132 || class_8264.Method_8274() != this.Field_18132.Method_8274()) continue;
                this.Field_18131 = -22499 & 35;
                break;
            }
        }
        if (this.Field_18131) {
            return (Object)((Object)Class_5478.Field_5505) + string;
        }
        return string;
    }

    public void Method_18134() {
        super.Method_11243();
        this.Field_18130 = -16375 & 8260;
        this.Field_18132.Method_8284((Integer)this.\u0000strictfp());
        Class_8264.Method_8281();
        Class_1490 class_1490 = Class_18.Field_89.Field_36;
        if (class_1490 instanceof Class_33358) {
            ((Class_33358)class_1490).Field_33360 = null;
        }
        this.Method_18138();
        for (Class_11220 class_11220 : Class_18.Field_89.Field_84.Field_39732.Field_8868) {
            if (!(class_11220 instanceof Class_18129)) continue;
            ((Class_18129)class_11220).Method_18138();
        }
    }

    public void Method_18135() {
        this.Field_18132.Method_8284((Integer)this.\u0000strictfp());
        Class_8264.Method_8281();
    }

    public Class_18129(Class_8838 class_8838, String string, int n, Class_19364 class_19364) {
        super(class_8838, string, n, class_19364);
        this.Field_18132 = new Class_8264("key.bp." + string, n, null);
    }

    private void Method_18136() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_18137() {
        Class_1490 class_1490 = Class_18.Field_89.Field_36;
        if (class_1490 instanceof Class_33358) {
            ((Class_33358)class_1490).Field_33360 = this;
            this.Field_18130 = 1 & 21309;
            this.Method_18138();
        }
    }

    public void Method_18138() {
        this.\u0000, `().Field_42381 = this.\u0000, `();
    }

    public void Method_18139(int n) {
        this.Field_18130 = -18416 & 2019;
        this.Field_18132.Method_8284(n);
        Class_8264.Method_8281();
        this.\u0000, `().Field_42381 = this.\u0000, `();
        this.\u0000, `((Object)n);
        for (Class_11220 class_11220 : Class_18.Field_89.Field_84.Field_39732.Field_8868) {
            if (!(class_11220 instanceof Class_18129)) continue;
            ((Class_18129)class_11220).Method_18138();
        }
    }
}

