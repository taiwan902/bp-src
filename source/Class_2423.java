/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class Class_2423 {
    private final String Field_2424 = UUID.randomUUID().toString();
    private final Map Field_2425 = Maps.newHashMap();
    private final URL Field_2426;
    private boolean Field_2427;
    private final Timer Field_2428 = new Timer("Snooper Timer", (26945 & -28531) != 0);
    private int Field_2429;
    private final long Field_2430;
    private final Object Field_2431 = new Object();
    private final Map Field_2432 = Maps.newHashMap();
    public final Class_272 Field_2433;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_2434(String string, Object object) {
        Object object2 = this.Field_2431;
        synchronized (object2) {
            this.Field_2425.put(string, object);
        }
    }

    public Class_2423(String string, Class_272 class_272, long l) {
        try {
            this.Field_2426 = new URL("http://snoop.minecraft.net/" + string + "?version=" + (11491 & 4870));
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.Field_2433 = class_272;
        this.Field_2430 = l;
    }

    static String Method_2435(Class_2423 class_2423) {
        return class_2423.Field_2424;
    }

    static Map Method_2436(Class_2423 class_2423) {
        return class_2423.Field_2432;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_2437(String string, Object object) {
        Object object2 = this.Field_2431;
        synchronized (object2) {
            this.Field_2432.put(string, object);
        }
    }

    public void Method_2438() {
        this.Method_2437("memory_total", Runtime.getRuntime().totalMemory());
        this.Method_2437("memory_max", Runtime.getRuntime().maxMemory());
        this.Method_2437("memory_free", Runtime.getRuntime().freeMemory());
        this.Method_2437("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.Field_2433.Method_275(this);
    }

    static int Method_2439(Class_2423 class_2423) {
        int n = class_2423.Field_2429;
        class_2423.Field_2429 = n + (8579 & 6209);
        return n;
    }

    public String Method_2440() {
        return this.Field_2424;
    }

    public boolean Method_2441() {
        return this.Field_2427;
    }

    public void Method_2442() {
        this.Field_2428.cancel();
    }

    public void Method_2443() {
        if (!this.Field_2427) {
            this.Field_2427 = 4209 & 2307;
            this.Method_2449();
            this.Field_2428.schedule((TimerTask)new Class_2453(this), 1068438489175166464L & -1068438490585136952L, 2559398796132727718L & -2559398797206750303L);
        }
    }

    private void Method_2444() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Object Method_2445(Class_2423 class_2423) {
        return class_2423.Field_2431;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map Method_2446() {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        Object object = this.Field_2431;
        synchronized (object) {
            this.Method_2438();
            for (Map.Entry entry : this.Field_2432.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            for (Map.Entry entry : this.Field_2425.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
    }

    static URL Method_2447(Class_2423 class_2423) {
        return class_2423.Field_2426;
    }

    public long Method_2448() {
        return this.Field_2430;
    }

    private void Method_2449() {
        this.Method_2452();
        this.Method_2434("snooper_token", this.Field_2424);
        this.Method_2437("snooper_token", this.Field_2424);
        this.Method_2437("os_name", System.getProperty("os.name"));
        this.Method_2437("os_version", System.getProperty("os.version"));
        this.Method_2437("os_architecture", System.getProperty("os.arch"));
        this.Method_2437("java_version", System.getProperty("java.version"));
        this.Method_2434("version", "1.8.8");
        this.Field_2433.Method_274(this);
    }

    static Map Method_2450(Class_2423 class_2423) {
        return class_2423.Field_2425;
    }

    static int Method_2451(Class_2423 class_2423) {
        return class_2423.Field_2429;
    }

    private void Method_2452() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n = 40 & 10496;
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            this.Method_2434("jvm_arg[" + n++ + "]", string);
        }
        this.Method_2434("jvm_args", n);
    }
}

