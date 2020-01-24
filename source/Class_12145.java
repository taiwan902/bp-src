/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Properties;

public class Class_12145 {
    public Class_21124[] Field_12146 = null;
    public String Field_12147 = null;
    public String Field_12148 = null;
    public Class_2080[] Field_12149 = null;

    private Class_21124[] Method_12150(Properties properties, Class_2080 class_2080, Class_25611 class_25611) {
        ArrayList<Class_21124> arrayList = new ArrayList<Class_21124>();
        int n = properties.size();
        for (int i = 18529 & -27626; i < n; ++i) {
            int n2 = i + (2049 & 12771);
            String string = properties.getProperty("skins." + n2);
            if (string == null) continue;
            int[] arrn = class_25611.Method_25613(string);
            int[] arrn2 = class_25611.Method_25613(properties.getProperty("weights." + n2));
            Class_17281[] arrclass_17281 = class_25611.Method_25622(properties.getProperty("biomes." + n2));
            Class_27481 class_27481 = class_25611.Method_25627(properties.getProperty("heights." + n2));
            if (class_27481 == null) {
                class_27481 = this.Method_12151(properties, n2);
            }
            Class_21124 class_21124 = new Class_21124(class_2080, arrn, arrn2, arrclass_17281, class_27481);
            arrayList.add(class_21124);
        }
        Class_21124[] arrclass_21124 = arrayList.toArray(new Class_21124[arrayList.size()]);
        return arrclass_21124;
    }

    public Class_12145(String string, Class_2080[] arrclass_2080) {
        Class_25611 class_25611 = new Class_25611("RandomMobs");
        this.Field_12148 = class_25611.Method_25621(string);
        this.Field_12147 = class_25611.Method_25632(string);
        this.Field_12149 = arrclass_2080;
    }

    public Class_12145(Properties properties, String string, Class_2080 class_2080) {
        Class_25611 class_25611 = new Class_25611("RandomMobs");
        this.Field_12148 = class_25611.Method_25621(string);
        this.Field_12147 = class_25611.Method_25632(string);
        this.Field_12146 = this.Method_12150(properties, class_2080, class_25611);
    }

    private Class_27481 Method_12151(Properties properties, int n) {
        String string = properties.getProperty("minHeight." + n);
        String string2 = properties.getProperty("maxHeight." + n);
        if (string == null && string2 == null) {
            return null;
        }
        int n2 = 1030 & 4832;
        if (string != null && (n2 = Class_19426.Method_19502(string, -1 & -1)) < 0) {
            Class_19426.Method_19610("Invalid minHeight: " + string);
            return null;
        }
        int n3 = 304 & -31349;
        if (string2 != null && (n3 = Class_19426.Method_19502(string2, -1 & -1)) < 0) {
            Class_19426.Method_19610("Invalid maxHeight: " + string2);
            return null;
        }
        if (n3 < 0) {
            Class_19426.Method_19610("Invalid minHeight, maxHeight: " + string + ", " + string2);
            return null;
        }
        Class_27481 class_27481 = new Class_27481();
        class_27481.Method_27486(new Class_17230(n2, n3));
        return class_27481;
    }

    public Class_2080 Method_12152(Class_2080 class_2080, Class_34093 class_34093) {
        int n;
        if (this.Field_12146 != null) {
            for (n = 17220 & 9376; n < this.Field_12146.length; ++n) {
                Class_21124 class_21124 = this.Field_12146[n];
                if (!class_21124.Method_21136(class_34093)) continue;
                return class_21124.Method_21133(class_2080, class_34093.Field_34102);
            }
        }
        if (this.Field_12149 != null) {
            n = class_34093.Field_34102;
            int n2 = n % this.Field_12149.length;
            return this.Field_12149[n2];
        }
        return class_2080;
    }

    public boolean Method_12153(String string) {
        int n;
        Object object;
        if (this.Field_12149 == null && this.Field_12146 == null) {
            Class_19426.Method_19610("No skins specified: " + string);
            return (10402 & 68) != 0;
        }
        if (this.Field_12146 != null) {
            for (n = -23664 & 102; n < this.Field_12146.length; ++n) {
                object = this.Field_12146[n];
                if (((Class_21124)object).Method_21134(string)) continue;
                return (1538 & 22793) != 0;
            }
        }
        if (this.Field_12149 != null) {
            for (n = 18709 & -31712; n < this.Field_12149.length; ++n) {
                object = this.Field_12149[n];
                if (Class_19426.Method_19594((Class_2080)object)) continue;
                Class_19426.Method_19610("Texture not found: " + ((Class_2080)object).Method_2084());
                return (25604 & -31853) != 0;
            }
        }
        return (24593 & 1665) != 0;
    }

    private void Method_12154() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

