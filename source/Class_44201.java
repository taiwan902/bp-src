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
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_44201
implements Class_2045 {
    private Map Field_44202 = Maps.newHashMap();
    private final Class_2793 Field_44203;
    private String Field_44204;
    private static final Logger Field_44205 = LogManager.getLogger();
    protected static final Class_15291 Field_44206 = new Class_15291();

    public boolean Method_44207() {
        return Field_44206.Method_15300();
    }

    public void Method_44208(Class_279 class_279) {
        Object[] arrobject = new String[24587 & 6181];
        arrobject[1255 & -32512] = "en_US";
        ArrayList arrayList = Lists.newArrayList((Object[])arrobject);
        if (!"en_US".equals(this.Field_44204)) {
            arrayList.add(this.Field_44204);
        }
        Field_44206.Method_15298(class_279, arrayList);
        Class_31699.Method_31713(Class_44201.Field_44206.Field_15292);
    }

    public SortedSet Method_44209() {
        return Sets.newTreeSet(this.Field_44202.values());
    }

    public void Method_44210(Class_15247 class_15247) {
        this.Field_44204 = class_15247.Method_15258();
    }

    public Class_15247 Method_44211() {
        return this.Field_44202.containsKey(this.Field_44204) ? (Class_15247)this.Field_44202.get(this.Field_44204) : (Class_15247)this.Field_44202.get("en_US");
    }

    public Class_44201(Class_2793 class_2793, String string) {
        this.Field_44203 = class_2793;
        this.Field_44204 = string;
        Class_9802.Method_9807(Field_44206);
    }

    public boolean Method_44212() {
        return (this.Method_44211() != null && this.Method_44211().Method_15253() ? 769 & -28621 : 577 & -32484) != 0;
    }

    public void Method_44213(List list) {
        this.Field_44202.clear();
        for (Class_2035 class_2035 : list) {
            try {
                Class_36321 class_36321 = (Class_36321)class_2035.Method_2040(this.Field_44203, "language");
                if (class_36321 == null) continue;
                for (Class_15247 class_15247 : class_36321.Method_36323()) {
                    if (this.Field_44202.containsKey(class_15247.Method_15258())) continue;
                    this.Field_44202.put(class_15247.Method_15258(), class_15247);
                }
            }
            catch (RuntimeException runtimeException) {
                Field_44205.warn("Unable to parse metadata section of resourcepack: " + class_2035.Method_2036(), (Throwable)runtimeException);
            }
            catch (IOException iOException) {
                Field_44205.warn("Unable to parse metadata section of resourcepack: " + class_2035.Method_2036(), (Throwable)iOException);
            }
        }
    }

    private void Method_44214() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

