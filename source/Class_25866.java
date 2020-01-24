/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class Class_25866
implements Class_9953 {
    private final InputStream Field_25867;
    private final Class_2080 Field_25868;
    private final Map Field_25869 = Maps.newHashMap();
    private JsonObject Field_25870;
    private boolean Field_25871;
    private final Class_2793 Field_25872;
    private final String Field_25873;
    private final InputStream Field_25874;

    public int Method_25875() {
        int n = this.Field_25873 != null ? this.Field_25873.hashCode() : 20996 & -32621;
        n = (8287 & 4287) * n + (this.Field_25868 != null ? this.Field_25868.Method_2089() : -32734 & 5440);
        return n;
    }

    public String Method_25876() {
        return this.Field_25873;
    }

    private void Method_25877() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_25878(Object object) {
        if (this == object) {
            return (-30655 & 12577) != 0;
        }
        if (!(object instanceof Class_25866)) {
            return (-11868 & 11272) != 0;
        }
        Class_25866 class_25866 = (Class_25866)object;
        if (this.Field_25868 != null) {
            if (!this.Field_25868.Method_2087(class_25866.Field_25868)) {
                return (-14144 & 8452) != 0;
            }
        } else if (class_25866.Field_25868 != null) {
            return (16576 & 48) != 0;
        }
        if (this.Field_25873 != null) {
            if (!this.Field_25873.equals(class_25866.Field_25873)) {
                return (25350 & 2065) != 0;
            }
        } else if (class_25866.Field_25873 != null) {
            return (-15744 & 15477) != 0;
        }
        return (14609 & 39) != 0;
    }

    public Class_2080 Method_25879() {
        return this.Field_25868;
    }

    public boolean Method_25880() {
        return (this.Field_25874 != null ? -30719 & 8261 : 3234 & 1) != 0;
    }

    public InputStream Method_25881() {
        return this.Field_25867;
    }

    public Class_25866(String string, Class_2080 class_2080, InputStream inputStream, InputStream inputStream2, Class_2793 class_2793) {
        this.Field_25873 = string;
        this.Field_25868 = class_2080;
        this.Field_25867 = inputStream;
        this.Field_25874 = inputStream2;
        this.Field_25872 = class_2793;
    }

    public Class_25993 Method_25882(String string) {
        Object object;
        if (!this.Method_25880()) {
            return null;
        }
        if (this.Field_25870 == null && !this.Field_25871) {
            this.Field_25871 = 9 & 659;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.Field_25874));
                this.Field_25870 = new JsonParser().parse((Reader)object).getAsJsonObject();
            }
            finally {
                IOUtils.closeQuietly((Reader)object);
            }
        }
        if ((object = (Class_25993)this.Field_25869.get(string)) == null) {
            object = this.Field_25872.Method_2798(string, this.Field_25870);
        }
        return object;
    }
}

