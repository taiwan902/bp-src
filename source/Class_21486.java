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

public class Class_21486 {
    private Class_10057 Field_21487;
    private final int Field_21488;
    private List Field_21489;
    private final int Field_21490;
    private final int Field_21491;
    private final int Field_21492;

    public String Method_21493() {
        return "Slot{originX=" + this.Field_21488 + ", originY=" + this.Field_21491 + ", width=" + this.Field_21490 + ", height=" + this.Field_21492 + ", texture=" + this.Field_21487 + ", subSlots=" + this.Field_21489 + (char)(24701 & -28035);
    }

    public int Method_21494() {
        return this.Field_21488;
    }

    public boolean Method_21495(Class_10057 class_10057) {
        if (this.Field_21487 != null) {
            return (-30384 & 1033) != 0;
        }
        int n = class_10057.Method_10070();
        int n2 = class_10057.Method_10068();
        if (n <= this.Field_21490 && n2 <= this.Field_21492) {
            if (n == this.Field_21490 && n2 == this.Field_21492) {
                this.Field_21487 = class_10057;
                return (17415 & 6769) != 0;
            }
            if (this.Field_21489 == null) {
                this.Field_21489 = Lists.newArrayListWithCapacity((int)(57 & -27581));
                this.Field_21489.add(new Class_21486(this.Field_21488, this.Field_21491, n, n2));
                int n3 = this.Field_21490 - n;
                int n4 = this.Field_21492 - n2;
                if (n4 > 0 && n3 > 0) {
                    int n5;
                    int n6 = Math.max(this.Field_21492, n3);
                    if (n6 >= (n5 = Math.max(this.Field_21490, n4))) {
                        this.Field_21489.add(new Class_21486(this.Field_21488, this.Field_21491 + n2, n, n4));
                        this.Field_21489.add(new Class_21486(this.Field_21488 + n, this.Field_21491, n3, this.Field_21492));
                    } else {
                        this.Field_21489.add(new Class_21486(this.Field_21488 + n, this.Field_21491, n3, n2));
                        this.Field_21489.add(new Class_21486(this.Field_21488, this.Field_21491 + n2, this.Field_21490, n4));
                    }
                } else if (n3 == 0) {
                    this.Field_21489.add(new Class_21486(this.Field_21488, this.Field_21491 + n2, n, n4));
                } else if (n4 == 0) {
                    this.Field_21489.add(new Class_21486(this.Field_21488 + n, this.Field_21491, n3, n2));
                }
            }
            for (Object e : this.Field_21489) {
                if (!((Class_21486)e).Method_21495(class_10057)) continue;
                return (4099 & 9189) != 0;
            }
            return (-15421 & 16) != 0;
        }
        return (26656 & 537) != 0;
    }

    public int Method_21496() {
        return this.Field_21491;
    }

    private void Method_21497() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21486(int n, int n2, int n3, int n4) {
        this.Field_21488 = n;
        this.Field_21491 = n2;
        this.Field_21490 = n3;
        this.Field_21492 = n4;
    }

    public Class_10057 Method_21498() {
        return this.Field_21487;
    }

    public void Method_21499(List list) {
        if (this.Field_21487 != null) {
            list.add(this);
        } else if (this.Field_21489 != null) {
            for (Object e : this.Field_21489) {
                ((Class_21486)e).Method_21499(list);
            }
        }
    }
}

