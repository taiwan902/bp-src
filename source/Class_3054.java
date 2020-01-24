/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_3054
implements Class_2754 {
    private final Map Field_3055 = Maps.newHashMap();
    private final Set Field_3056 = Sets.newHashSet();
    private static final Logger Field_3057 = LogManager.getLogger();

    public List Method_3058(Class_1367 class_1367, String string, Class_4751 class_4751) {
        Class_26550 class_26550;
        String[] arrstring = string.split(" ", -1 & -1);
        String string2 = arrstring[-32762 & 14905];
        if (arrstring.length == (513 & 5131)) {
            ArrayList arrayList = Lists.newArrayList();
            for (Map.Entry entry : this.Field_3055.entrySet()) {
                if (!Class_36787.Method_36813(string2, (String)entry.getKey()) || !((Class_26550)entry.getValue()).Method_26553(class_1367)) continue;
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
        if (arrstring.length > (-14271 & 8209) && (class_26550 = (Class_26550)this.Field_3055.get(string2)) != null && class_26550.Method_26553(class_1367)) {
            return class_26550.Method_26557(class_1367, Class_3054.Method_3060(arrstring), class_4751);
        }
        return null;
    }

    public Class_26550 Method_3059(Class_26550 class_26550) {
        this.Field_3055.put(class_26550.Method_26556(), class_26550);
        this.Field_3056.add(class_26550);
        for (String string : class_26550.Method_26554()) {
            Class_26550 class_265502 = (Class_26550)this.Field_3055.get(string);
            if (class_265502 != null && class_265502.Method_26556().equals(string)) continue;
            this.Field_3055.put(string, class_26550);
        }
        return class_26550;
    }

    private static String[] Method_3060(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length - (9 & -32731)];
        System.arraycopy(arrstring, 2209 & 1347, arrstring2, 8194 & 21504, arrstring.length - (-31991 & 11299));
        return arrstring2;
    }

    public int Method_3061(Class_1367 class_1367, String string) {
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(-30203 & 12497);
        }
        String[] arrstring = string.split(" ");
        String string2 = arrstring[18449 & -31168];
        arrstring = Class_3054.Method_3060(arrstring);
        Class_26550 class_26550 = (Class_26550)this.Field_3055.get(string2);
        int n = this.Method_3063(class_26550, arrstring);
        int n2 = 64 & -9336;
        if (class_26550 == null) {
            Class_2849 class_2849 = new Class_2849("commands.generic.notFound", new Object[456 & -28620]);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            class_1367.Method_1373(class_2849);
        } else if (class_26550.Method_26553(class_1367)) {
            if (n > (-1 & -1)) {
                List list = Class_16350.Method_16386(class_1367, arrstring[n], Class_1061.class);
                String string3 = arrstring[n];
                class_1367.Method_1374(Class_26261.Field_26268, list.size());
                for (Class_1061 class_1061 : list) {
                    arrstring[n] = class_1061.Method_1194().toString();
                    if (!this.Method_3062(class_1367, arrstring, class_26550, string)) continue;
                    ++n2;
                }
                arrstring[n] = string3;
            } else {
                class_1367.Method_1374(Class_26261.Field_26268, 1557 & -14327);
                if (this.Method_3062(class_1367, arrstring, class_26550, string)) {
                    ++n2;
                }
            }
        } else {
            Class_2849 class_2849 = new Class_2849("commands.generic.permission", new Object[304 & 9794]);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            class_1367.Method_1373(class_2849);
        }
        class_1367.Method_1374(Class_26261.Field_26262, n2);
        return n2;
    }

    protected boolean Method_3062(Class_1367 class_1367, String[] arrstring, Class_26550 class_26550, String string) {
        try {
            class_26550.Method_26551(class_1367, arrstring);
            return (5 & 26851) != 0;
        }
        catch (Class_34974 class_34974) {
            Object[] arrobject = new Object[1 & -9947];
            arrobject[1056 & 4487] = new Class_2849(class_34974.getMessage(), class_34974.\u0000strictfp());
            Class_2849 class_2849 = new Class_2849("commands.generic.usage", arrobject);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            class_1367.Method_1373(class_2849);
        }
        catch (Class_30034 class_30034) {
            Class_2849 class_2849 = new Class_2849(class_30034.getMessage(), class_30034.Method_30037());
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            class_1367.Method_1373(class_2849);
        }
        catch (Throwable throwable) {
            Class_2849 class_2849 = new Class_2849("commands.generic.exception", new Object[29736 & 199]);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            class_1367.Method_1373(class_2849);
            Field_3057.warn("Couldn't process command: '" + string + "'");
        }
        return (-30720 & 13408) != 0;
    }

    private int Method_3063(Class_26550 class_26550, String[] arrstring) {
        if (class_26550 == null) {
            return -1 & -1;
        }
        for (int i = 149 & 8256; i < arrstring.length; ++i) {
            if (!class_26550.Method_26552(arrstring, i) || !Class_16350.Method_16381(arrstring[i])) continue;
            return i;
        }
        return -1 & -1;
    }

    public Map Method_3064() {
        return this.Field_3055;
    }

    private void Method_3065() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_3066(Class_1367 class_1367) {
        ArrayList arrayList = Lists.newArrayList();
        for (Class_26550 class_26550 : this.Field_3056) {
            if (!class_26550.Method_26553(class_1367)) continue;
            arrayList.add(class_26550);
        }
        return arrayList;
    }
}

