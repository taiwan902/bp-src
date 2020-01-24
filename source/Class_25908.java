/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.concurrent.Callable;

public class Class_25908
implements Callable {
    final Class_13268 Field_25909;

    public Object Method_25910() {
        return this.Method_25912();
    }

    private void Method_25911() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_25912() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n = 16802 & 4160;
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            if (n++ > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append((Object)string);
        }
        Object[] arrobject = new Object[-28654 & 554];
        arrobject[2048 & -32747] = n;
        arrobject[1 & 5327] = stringBuilder.toString();
        return String.format("%d total; %s", arrobject);
    }

    Class_25908(Class_13268 class_13268) {
        this.Field_25909 = class_13268;
    }
}

