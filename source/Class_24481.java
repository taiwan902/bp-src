/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Class_24481 {
    private String Field_24482 = null;
    private final List Field_24483 = Lists.newArrayList();

    static String Method_24484(Class_24481 class_24481, String string) {
        class_24481.Field_24482 = string;
        return class_24481.Field_24482;
    }

    public String Method_24485() {
        return this.Field_24482 != null ? (!this.Field_24483.isEmpty() ? this.Field_24482 + " " + this.Method_24488() : this.Field_24482) : (!this.Field_24483.isEmpty() ? "(Unknown file) " + this.Method_24488() : "(Unknown file)");
    }

    Class_24481(Class_30866 class_30866) {
        this();
    }

    private Class_24481() {
    }

    private void Method_24486() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24487(String string) {
        this.Field_24483.add(1060 & 4360, string);
    }

    public String Method_24488() {
        return StringUtils.join((Iterable)this.Field_24483, (String)"->");
    }
}

