/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_2804
implements Class_2801 {
    protected final Map Field_2805 = this.Method_2807();
    private static final Logger Field_2806 = LogManager.getLogger();

    protected Map Method_2807() {
        return Maps.newHashMap();
    }

    public boolean Method_2808(Object object) {
        return this.Field_2805.containsKey(object);
    }

    public Object Method_2809(Object object) {
        return this.Field_2805.get(object);
    }

    public Set Method_2810() {
        return Collections.unmodifiableSet(this.Field_2805.keySet());
    }

    private void Method_2811() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_2812(Object object, Object object2) {
        Validate.notNull((Object)object);
        Validate.notNull((Object)object2);
        if (this.Field_2805.containsKey(object)) {
            Field_2806.debug("Adding duplicate key '" + object + "' to registry");
        }
        this.Field_2805.put(object, object2);
    }

    public Iterator Method_2813() {
        return this.Field_2805.values().iterator();
    }
}

