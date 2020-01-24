/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Set;
import java.util.TreeMap;

public class Class_7523 {
    private TreeMap Field_7524 = new TreeMap();

    public String Method_7525(String string) {
        Class_17080 class_17080 = (Class_17080)this.Field_7524.get(string);
        return class_17080 != null ? class_17080.Method_17088() : "";
    }

    public boolean Method_7526(String string, Class_21147 class_21147) {
        Class_17080 class_17080 = (Class_17080)this.Field_7524.get(string);
        return (class_17080 != null && (class_17080.Method_17087() == class_21147 || class_21147 == Class_21147.Field_21152) ? -31711 & 19013 : -24252 & 6313) != 0;
    }

    public void Method_7527(String string, String string2, Class_21147 class_21147) {
        this.Field_7524.put(string, new Class_17080(string2, class_21147));
    }

    public void Method_7528(String string, String string2) {
        Class_17080 class_17080 = (Class_17080)this.Field_7524.get(string);
        if (class_17080 != null) {
            class_17080.Method_17091(string2);
        } else {
            this.Method_7527(string, string2, Class_21147.Field_21152);
        }
    }

    public boolean Method_7529(String string) {
        Class_17080 class_17080 = (Class_17080)this.Field_7524.get(string);
        return (class_17080 != null ? class_17080.Method_17089() : 2 & -7419) != 0;
    }

    private void Method_7530() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_7531(String string) {
        Class_17080 class_17080 = (Class_17080)this.Field_7524.get(string);
        return class_17080 != null ? class_17080.Method_17090() : 4125 & -31902;
    }

    public Class_7523() {
        this.Method_7527("doFireTick", "true", Class_21147.Field_21149);
        this.Method_7527("mobGriefing", "true", Class_21147.Field_21149);
        this.Method_7527("keepInventory", "false", Class_21147.Field_21149);
        this.Method_7527("doMobSpawning", "true", Class_21147.Field_21149);
        this.Method_7527("doMobLoot", "true", Class_21147.Field_21149);
        this.Method_7527("doTileDrops", "true", Class_21147.Field_21149);
        this.Method_7527("doEntityDrops", "true", Class_21147.Field_21149);
        this.Method_7527("commandBlockOutput", "true", Class_21147.Field_21149);
        this.Method_7527("naturalRegeneration", "true", Class_21147.Field_21149);
        this.Method_7527("doDaylightCycle", "true", Class_21147.Field_21149);
        this.Method_7527("logAdminCommands", "true", Class_21147.Field_21149);
        this.Method_7527("showDeathMessages", "true", Class_21147.Field_21149);
        this.Method_7527("randomTickSpeed", "3", Class_21147.Field_21148);
        this.Method_7527("sendCommandFeedback", "true", Class_21147.Field_21149);
        this.Method_7527("reducedDebugInfo", "false", Class_21147.Field_21149);
    }

    public void Method_7532(Class_1699 class_1699) {
        for (String string : class_1699.Method_1710()) {
            String string2 = class_1699.Method_1708(string);
            this.Method_7528(string, string2);
        }
    }

    public boolean Method_7533(String string) {
        return this.Field_7524.containsKey(string);
    }

    public String[] Method_7534() {
        Set set = this.Field_7524.keySet();
        return set.toArray(new String[set.size()]);
    }

    public Class_1699 Method_7535() {
        Class_1699 class_1699 = new Class_1699();
        for (Object k : this.Field_7524.keySet()) {
            Class_17080 class_17080 = (Class_17080)this.Field_7524.get(k);
            class_1699.Method_1702((String)k, class_17080.Method_17088());
        }
        return class_1699;
    }
}

