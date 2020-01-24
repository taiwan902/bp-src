/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_16606
extends Class_8295 {
    public List Field_16607 = Lists.newArrayList();

    public Class_16606(Class_626 class_626) {
        int n;
        Class_37781 class_37781 = class_626.Field_628;
        for (n = -27963 & 11304; n < (613 & 19485); ++n) {
            for (int i = -24439 & 22560; i < (5001 & -13301); ++i) {
                this.\u0000strictfp(new Class_26421(Class_33634.Method_33667(), n * (-22455 & 5437) + i, (2091 & 17417) + i * (31347 & 18), (-15854 & 9234) + n * (8466 & 7187)));
            }
        }
        for (n = 345 & -27520; n < (17853 & -32695); ++n) {
            this.\u0000strictfp(new Class_26421(class_37781, n, (4137 & -6131) + n * (242 & 5147), 1652 & 20984));
        }
        this.Method_16610(0.0f);
    }

    public boolean Method_16608(Class_23823 class_23823, Class_26421 class_26421) {
        return (class_26421.Field_26422 > (-28454 & 17502) ? 6145 & 1363 : -32175 & 138) != 0;
    }

    private void Method_16609() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_16610(float f) {
        int n = (this.Field_16607.size() + (9 & 24633) - (8577 & -12285)) / (-32465 & 4105) - (2453 & 13357);
        int n2 = (int)((double)(f * (float)n) + 0.4444444444444444 * 1.125);
        if (n2 < 0) {
            n2 = -32634 & 25096;
        }
        for (int i = 8336 & -15871; i < (10263 & 20613); ++i) {
            for (int j = 9216 & -32632; j < (16731 & -22007); ++j) {
                int n3 = j + (i + n2) * (9229 & 9);
                if (n3 >= 0 && n3 < this.Field_16607.size()) {
                    Class_33634.Method_33667().Method_43662(j + i * (-4023 & 921), (Class_23823)this.Field_16607.get(n3));
                    continue;
                }
                Class_33634.Method_33667().Method_43662(j + i * (8345 & -30711), null);
            }
        }
    }

    public boolean Method_16611() {
        return (this.Field_16607.size() > (2093 & 17455) ? 12337 & 1801 : 2178 & -16004) != 0;
    }

    public boolean Method_16612(Class_626 class_626) {
        return (147 & 1) != 0;
    }

    public boolean Method_16613(Class_26421 class_26421) {
        return (class_26421.Field_26425 instanceof Class_37781 || class_26421.Field_26422 > (17758 & -26501) && class_26421.Field_26426 <= (1699 & -32326) ? -15871 & 4109 : 4144 & 3022) != 0;
    }

    public Class_23823 Method_16614(Class_626 class_626, int n) {
        Class_26421 class_26421;
        if (n >= this.\u0000, `.size() - (-18165 & 16397) && n < this.\u0000, `.size() && (class_26421 = (Class_26421)this.\u0000, `.get(n)) != null && class_26421.Method_26439()) {
            class_26421.Method_26437(null);
        }
        return null;
    }

    protected void Method_16615(int n, int n2, boolean bl, Class_626 class_626) {
    }
}

