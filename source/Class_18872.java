/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_18872
implements Class_2042 {
    private final Set Field_18873 = Sets.newLinkedHashSet();
    private static final Joiner Field_18874;
    private final Map Field_18875 = Maps.newHashMap();
    private final List Field_18876 = Lists.newArrayList();
    private final Class_2793 Field_18877;
    private static final Logger Field_18878;

    public Class_18872(Class_2793 class_2793) {
        this.Field_18877 = class_2793;
    }

    public void Method_18879(Class_2045 class_2045) {
        this.Field_18876.add(class_2045);
        class_2045.Method_2046(this);
    }

    public void Method_18880(Class_2035 class_2035) {
        for (String string : class_2035.Method_2037()) {
            this.Field_18873.add(string);
            Class_37389 class_37389 = (Class_37389)this.Field_18875.get(string);
            if (class_37389 == null) {
                class_37389 = new Class_37389(this.Field_18877);
                this.Field_18875.put(string, class_37389);
            }
            class_37389.Method_37398(class_2035);
        }
    }

    private static String Method_18881(String string) {
        int n = 5518;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18872.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_18882() {
        for (Class_2045 class_2045 : this.Field_18876) {
            class_2045.Method_2046(this);
        }
    }

    private void Method_18883() {
        this.Field_18875.clear();
        this.Field_18873.clear();
    }

    public void Method_18884(List list) {
        this.Method_18883();
        Field_18878.info("Reloading ResourceManager: " + Field_18874.join(Iterables.transform((Iterable)list, (Function)new Class_8146(this))));
        for (Class_2035 class_2035 : list) {
            this.Method_18880(class_2035);
        }
        this.Method_18882();
    }

    public List Method_18885(Class_2080 class_2080) {
        Class_279 class_279 = (Class_279)this.Field_18875.get(class_2080.Method_2085());
        if (class_279 != null) {
            return class_279.Method_280(class_2080);
        }
        throw new FileNotFoundException(class_2080.Method_2086());
    }

    private void Method_18886() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_9953 Method_18887(Class_2080 class_2080) {
        Class_279 class_279 = (Class_279)this.Field_18875.get(class_2080.Method_2085());
        if (class_279 != null) {
            return class_279.Method_282(class_2080);
        }
        throw new FileNotFoundException(class_2080.Method_2086());
    }

    public Set Method_18888() {
        return this.Field_18873;
    }

    static {
        Field_18878 = LogManager.getLogger();
        Field_18874 = Joiner.on((String)Class_18872.Method_18881("\u2008\u2004"));
    }
}

