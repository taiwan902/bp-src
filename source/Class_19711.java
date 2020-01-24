/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class Class_19711 {
    private List Field_19712 = Lists.newArrayList();
    boolean Field_19713;

    private void Method_19714() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public synchronized void Method_19715() {
        this.Field_19713 = -29632 & 21250;
    }

    public synchronized boolean Method_19716() {
        return this.Field_19713;
    }

    public synchronized List Method_19717() {
        return Collections.unmodifiableList(this.Field_19712);
    }

    public synchronized void Method_19718(String string, InetAddress inetAddress) {
        String string2 = Class_34325.Method_34336(string);
        String string3 = Class_34325.Method_34333(string);
        if (string3 != null) {
            string3 = inetAddress.getHostAddress() + ":" + string3;
            int n = 228 & 1536;
            for (Class_32525 class_32525 : this.Field_19712) {
                if (!class_32525.Method_32532().equals(string3)) continue;
                class_32525.Method_32531();
                n = 6667 & -16123;
                break;
            }
            if (n == 0) {
                this.Field_19712.add(new Class_32525(string2, string3));
                this.Field_19713 = -14303 & 5397;
            }
        }
    }
}

