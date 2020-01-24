/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_34695
implements Class_2060,
Class_2045 {
    private final Map Field_34696 = new HashMap();
    private final List Field_34697 = new ArrayList();
    private Class_279 Field_34698;
    private final HashMap Field_34699 = new HashMap();
    private static final Logger Field_34700 = LogManager.getLogger();

    public void Method_34701(Class_279 class_279) {
        Object object;
        Class_18.Field_89.Field_54 = 8721 & -25149;
        Class_18.Field_89.Field_66 = 6416 & 1632;
        Class_19426.Method_19526("*** Reloading textures ***");
        Class_19426.Method_19497("Resource packs: " + Class_19426.Method_19614());
        Iterator iterator = this.Field_34699.keySet().iterator();
        while (iterator.hasNext()) {
            Class_2080 class_2080 = (Class_2080)iterator.next();
            if (!class_2080.Method_2084().startsWith("mcpatcher/")) continue;
            Class_2062 object2 = (Class_2062)this.Field_34699.get(class_2080);
            if (object2 instanceof Class_23424) {
                object = (Class_23424)object2;
                ((Class_23424)object).Method_23437();
            }
            iterator.remove();
        }
        for (Object e : this.Field_34699.entrySet()) {
            object = (Class_2080)((Map.Entry)e).getKey();
            try {
                this.Method_34704((Class_2080)object, (Class_2062)((Map.Entry)e).getValue());
            }
            catch (Exception exception) {
                Class_18.Method_205(new Class_2840("Can't reload texture " + ((Class_2080)object).Method_2084()));
                Field_34700.warn("can't reload texture: ", (Throwable)exception);
            }
        }
    }

    public void Method_34702(Class_2080 class_2080) {
        Class_2062 class_2062 = this.Method_34709(class_2080);
        if (class_2062 != null) {
            Class_18695.Method_18720(class_2062.Method_2063());
        }
    }

    public void Method_34703() {
        for (Object e : this.Field_34697) {
            ((Class_2060)e).Method_2061();
        }
    }

    public boolean Method_34704(Class_2080 class_2080, Class_2062 class_2062) {
        int n = 7823 & 16385;
        Class_2062 class_20622 = class_2062;
        try {
            class_2062.Method_2066(this.Field_34698);
        }
        catch (IOException iOException) {
            class_20622 = Class_18695.Field_18702;
            this.Field_34699.put(class_2080, class_20622);
            n = -32759 & 10752;
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Registering texture");
            Class_13220 class_13220 = class_13268.Method_13280("Resource location being registered");
            class_13220.Method_13231("Resource location", class_2080);
            class_13220.Method_13232("Texture object class", new Class_31843(this, class_2062));
            throw new Class_1809(class_13268);
        }
        this.Field_34699.put(class_2080, class_20622);
        return n != 0;
    }

    public boolean Method_34705(Class_2080 class_2080, Class_24752 class_24752) {
        int n = 20739 & 613;
        Class_24752 class_247522 = class_24752;
        try {
            class_24752.Method_24760(this.Field_34698);
        }
        catch (IOException iOException) {
            Field_34700.warn("Failed to preload texture: " + class_2080, (Throwable)iOException);
            n = 16424 & -31868;
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Registering texture");
            Class_13220 class_13220 = class_13268.Method_13280("Resource location being registered");
            class_13220.Method_13231("Resource location", class_2080);
            class_13220.Method_13232("Texture object class", new Class_19753(this, class_24752));
            throw new Class_1809(class_13268);
        }
        return n != 0;
    }

    public boolean Method_34706(Class_2080 class_2080, Class_2059 class_2059) {
        if (this.Method_34704(class_2080, class_2059)) {
            this.Field_34697.add(class_2059);
            return (8209 & -13823) != 0;
        }
        return (-15360 & 68) != 0;
    }

    public Class_2062 Method_34707(Class_2080 class_2080) {
        Class_2062 class_2062;
        if (Class_19426.Method_19492()) {
            class_2080 = Class_24158.Method_24182(class_2080);
        }
        if ((class_2062 = (Class_2062)this.Field_34699.get(class_2080)) == null) {
            class_2062 = new Class_24752(class_2080);
            this.Method_34704(class_2080, class_2062);
        }
        if (Class_19426.Method_19570()) {
            Class_8049.Method_8077(class_2062);
        } else {
            Class_18695.Method_18729(class_2062.Method_2063());
        }
        return class_2062;
    }

    public Class_2080 Method_34708(String string, Class_47630 class_47630) {
        Integer n = (Integer)this.Field_34696.get(string);
        n = n == null ? Integer.valueOf(16385 & -21375) : Integer.valueOf(n + (-21495 & 20483));
        this.Field_34696.put(string, n);
        Object[] arrobject = new Object[17946 & 2051];
        arrobject[69 & 18432] = string;
        arrobject[6921 & 163] = n;
        Class_2080 class_2080 = new Class_2080(String.format("dynamic/%s_%d", arrobject));
        this.Method_34704(class_2080, class_47630);
        return class_2080;
    }

    public Class_2062 Method_34709(Class_2080 class_2080) {
        return (Class_2062)this.Field_34699.get(class_2080);
    }

    private void Method_34710() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34695(Class_279 class_279) {
        this.Field_34698 = class_279;
    }
}

