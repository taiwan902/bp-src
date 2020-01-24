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
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_20715
implements Class_12166 {
    private Class_27450 Field_20716 = new Class_27450();
    private static final Logger Field_20717 = LogManager.getLogger();
    private ArrayList Field_20718 = Lists.newArrayList();
    private Class_17665 Field_20719;
    private Class_283 Field_20720;

    public void Method_20721(int n, int n2) {
        Class_17665 class_17665 = this.Method_20737(n, n2);
        if (!class_17665.Method_17728()) {
            class_17665.Method_17716();
        }
        this.Field_20716.Method_27466(Class_26994.Method_26995(n, n2));
        this.Field_20718.remove(class_17665);
    }

    public void Method_20722(Class_17665 class_17665, int n, int n2) {
    }

    public boolean Method_20723() {
        return (-30334 & 585) != 0;
    }

    public Class_4751 Method_20724(Class_283 class_283, String string, Class_4751 class_4751) {
        return null;
    }

    public boolean Method_20725() {
        long l = System.currentTimeMillis();
        for (Class_17665 class_17665 : this.Field_20718) {
            class_17665.Method_17761((System.currentTimeMillis() - l > (-1442884583308190187L & 807952581L) ? 2253 & 1043 : 2056 & -28063) != 0);
        }
        if (System.currentTimeMillis() - l > (-5869367164476694428L & 5869367163892012773L)) {
            Object[] arrobject = new Object[19 & -23647];
            arrobject[-29576 & 4356] = System.currentTimeMillis() - l;
            Field_20717.info("Warning: Clientside chunk ticking took {} ms", arrobject);
        }
        return (-32694 & 9600) != 0;
    }

    public Class_20715(Class_283 class_283) {
        this.Field_20719 = new Class_44969(class_283, -22518 & 1409, 5638 & -22263);
        this.Field_20720 = class_283;
    }

    public List Method_20726(Class_13693 class_13693, Class_4751 class_4751) {
        return null;
    }

    public void Method_20727() {
    }

    public int Method_20728() {
        return this.Field_20718.size();
    }

    public Class_17665 Method_20729(Class_4751 class_4751) {
        return this.Method_20737(class_4751.\u0000= final() >> (20 & -18619), class_4751.\u0000strictfp() >> (30743 & 268));
    }

    public Class_17665 Method_20730(int n, int n2) {
        Class_17665 class_17665 = new Class_17665(this.Field_20720, n, n2);
        this.Field_20716.Method_27468(Class_26994.Method_26995(n, n2), class_17665);
        this.Field_20718.add(class_17665);
        class_17665.Method_17723((9029 & 2083) != 0);
        return class_17665;
    }

    public String Method_20731() {
        return "MultiplayerChunkCache: " + this.Field_20716.Method_27462() + ", " + this.Field_20718.size();
    }

    public boolean Method_20732(boolean bl, Class_2748 class_2748) {
        return (2587 & -20219) != 0;
    }

    public void Method_20733(Class_12166 class_12166, int n, int n2) {
    }

    private void Method_20734() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_20735(Class_12166 class_12166, Class_17665 class_17665, int n, int n2) {
        return (4160 & -23551) != 0;
    }

    public boolean Method_20736(int n, int n2) {
        return (-32735 & 24579) != 0;
    }

    public Class_17665 Method_20737(int n, int n2) {
        Class_17665 class_17665 = (Class_17665)this.Field_20716.Method_27465(Class_26994.Method_26995(n, n2));
        return class_17665 == null ? this.Field_20719 : class_17665;
    }
}

