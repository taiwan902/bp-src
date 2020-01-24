/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

public class Class_2453
extends TimerTask {
    final Class_2423 Field_2454;

    private void Method_2455() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_2456() {
        if (this.Field_2454.Field_2433.Method_273()) {
            HashMap hashMap;
            Object object = Class_2423.Method_2445(this.Field_2454);
            synchronized (object) {
                hashMap = Maps.newHashMap((Map)Class_2423.Method_2450(this.Field_2454));
                if (Class_2423.Method_2451(this.Field_2454) == 0) {
                    hashMap.putAll(Class_2423.Method_2436(this.Field_2454));
                }
                hashMap.put("snooper_count", Class_2423.Method_2439(this.Field_2454));
                hashMap.put("snooper_token", Class_2423.Method_2435(this.Field_2454));
            }
            Class_32476.Method_32487(Class_2423.Method_2447(this.Field_2454), hashMap, (133 & -4503) != 0);
        }
    }

    Class_2453(Class_2423 class_2423) {
        this.Field_2454 = class_2423;
    }
}

