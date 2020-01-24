/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_37389
implements Class_279 {
    private static final Logger Field_37390 = LogManager.getLogger();
    private final Class_2793 Field_37391;
    protected final List Field_37392 = Lists.newArrayList();

    private void Method_37393() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37389(Class_2793 class_2793) {
        this.Field_37391 = class_2793;
    }

    public Set Method_37394() {
        return null;
    }

    protected InputStream Method_37395(Class_2080 class_2080, Class_2035 class_2035) {
        InputStream inputStream = class_2035.Method_2039(class_2080);
        return Field_37390.isDebugEnabled() ? new Class_7351(inputStream, class_2080, class_2035.Method_2036()) : inputStream;
    }

    public List Method_37396(Class_2080 class_2080) {
        ArrayList arrayList = Lists.newArrayList();
        Class_2080 class_20802 = Class_37389.Method_37399(class_2080);
        for (Class_2035 class_2035 : this.Field_37392) {
            if (!class_2035.Method_2041(class_2080)) continue;
            InputStream inputStream = class_2035.Method_2041(class_20802) ? this.Method_37395(class_20802, class_2035) : null;
            arrayList.add(new Class_25866(class_2035.Method_2036(), class_2080, this.Method_37395(class_2080, class_2035), inputStream, this.Field_37391));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(class_2080.Method_2086());
        }
        return arrayList;
    }

    public Class_9953 Method_37397(Class_2080 class_2080) {
        Class_2035 class_2035 = null;
        Class_2080 class_20802 = Class_37389.Method_37399(class_2080);
        for (int i = this.Field_37392.size() - (-5999 & 4365); i >= 0; --i) {
            if (!class_2080.Method_2084().contains("models/armor") && class_2080.Method_2084().contains("models/") && i != 0) continue;
            Class_2035 class_20352 = (Class_2035)this.Field_37392.get(i);
            if (class_2035 == null && class_20352.Method_2041(class_20802)) {
                class_2035 = class_20352;
            }
            if (!class_20352.Method_2041(class_2080)) continue;
            InputStream inputStream = null;
            if (class_2035 != null) {
                inputStream = this.Method_37395(class_20802, class_2035);
            }
            return new Class_25866(class_20352.Method_2036(), class_2080, this.Method_37395(class_2080, class_20352), inputStream, this.Field_37391);
        }
        throw new FileNotFoundException(class_2080.Method_2086());
    }

    public void Method_37398(Class_2035 class_2035) {
        this.Field_37392.add(class_2035);
    }

    static Class_2080 Method_37399(Class_2080 class_2080) {
        return new Class_2080(class_2080.Method_2085(), class_2080.Method_2084() + ".mcmeta");
    }

    static Logger Method_37400() {
        return Field_37390;
    }
}

