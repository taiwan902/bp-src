/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_16850 {
    private static final Logger Field_16851 = LogManager.getLogger();
    private final Class_2767 Field_16852;
    private int Field_16853 = 16647 & 10243;
    private List Field_16854 = Lists.newArrayList();
    private List Field_16855 = Lists.newArrayList();
    private int Field_16856;

    private boolean Method_16857(Class_14192 class_14192) {
        for (Class_14192 class_141922 : this.Field_16854) {
            if (class_141922 == class_14192) continue;
            if (class_14192.Field_14195 >= class_141922.Field_14195) {
                if (this.Method_16861(class_14192, class_141922) || !this.Field_16855.contains(class_141922)) continue;
                return (17536 & 4353) != 0;
            }
            if (class_141922.Field_14194.Method_33079() || !this.Field_16855.contains(class_141922)) continue;
            return (-22400 & 17968) != 0;
        }
        return (16677 & -26623) != 0;
    }

    public void Method_16858(int n, Class_33077 class_33077) {
        this.Field_16854.add(new Class_14192(this, n, class_33077));
    }

    public void Method_16859() {
        this.Field_16852.Method_2789("goalSetup");
        int n = this.Field_16856;
        this.Field_16856 = n + (1165 & -16381);
        if (n % this.Field_16853 == 0) {
            for (Class_14192 class_14192 : this.Field_16854) {
                boolean bl = this.Field_16855.contains(class_14192);
                if (bl) {
                    if (this.Method_16857(class_14192) && this.Method_16860(class_14192)) continue;
                    class_14192.Field_14194.Method_33083();
                    this.Field_16855.remove(class_14192);
                }
                if (!this.Method_16857(class_14192) || !class_14192.Field_14194.Method_33087()) continue;
                class_14192.Field_14194.Method_33080();
                this.Field_16855.add(class_14192);
            }
        } else {
            Iterator iterator = this.Field_16855.iterator();
            while (iterator.hasNext()) {
                Class_14192 class_14192;
                class_14192 = (Class_14192)iterator.next();
                if (this.Method_16860(class_14192)) continue;
                class_14192.Field_14194.Method_33083();
                iterator.remove();
            }
        }
        this.Field_16852.Method_2790();
        this.Field_16852.Method_2789("goalTick");
        for (Class_14192 class_14192 : this.Field_16855) {
            class_14192.Field_14194.Method_33082();
        }
        this.Field_16852.Method_2790();
    }

    private boolean Method_16860(Class_14192 class_14192) {
        boolean bl = class_14192.Field_14194.Method_33084();
        return bl;
    }

    private boolean Method_16861(Class_14192 class_14192, Class_14192 class_141922) {
        return ((class_14192.Field_14194.Method_33081() & class_141922.Field_14194.Method_33081()) == 0 ? -22431 & 259 : -32764 & 16561) != 0;
    }

    private void Method_16862() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_16850(Class_2767 class_2767) {
        this.Field_16852 = class_2767;
    }

    public void Method_16863(Class_33077 class_33077) {
        Iterator iterator = this.Field_16854.iterator();
        while (iterator.hasNext()) {
            Class_14192 class_14192 = (Class_14192)iterator.next();
            Class_33077 class_330772 = class_14192.Field_14194;
            if (class_330772 != class_33077) continue;
            if (this.Field_16855.contains(class_14192)) {
                class_330772.Method_33083();
                this.Field_16855.remove(class_14192);
            }
            iterator.remove();
        }
    }
}

