/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42987
extends Class_36787 {
    private void Method_42988() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_42989(Class_1367 class_1367, String[] arrstring) {
        Class_1699 class_1699;
        if (arrstring.length < (2347 & 24642)) {
            throw new Class_34974("commands.entitydata.usage", new Object[-32447 & 20482]);
        }
        Class_1061 class_1061 = Class_42987.\u0000strictfp((Class_1367)class_1367, (String)arrstring[2947 & -15356]);
        if (class_1061 instanceof Class_626) {
            Object[] arrobject = new Object[1 & 16551];
            arrobject[4096 & 544] = class_1061.Method_1232();
            throw new Class_30034("commands.entitydata.noPlayers", arrobject);
        }
        Class_1699 class_16992 = new Class_1699();
        class_1061.Method_1263(class_16992);
        Class_1699 class_16993 = (Class_1699)class_16992.Method_1732();
        try {
            class_1699 = Class_10981.Method_10996(Class_42987.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(16391 & 8361)).Method_1788());
        }
        catch (Class_34310 class_34310) {
            Object[] arrobject = new Object[8609 & -26533];
            arrobject[128 & 17422] = class_34310.getMessage();
            throw new Class_30034("commands.entitydata.tagError", arrobject);
        }
        class_1699.Method_1740("UUIDMost");
        class_1699.Method_1740("UUIDLeast");
        class_16992.Method_1730(class_1699);
        if (class_16992.Method_1734(class_16993)) {
            Object[] arrobject = new Object[4289 & 10273];
            arrobject[12869 & -32752] = class_16992.Method_1729();
            throw new Class_30034("commands.entitydata.failed", arrobject);
        }
        class_1061.Method_1318(class_16992);
        Object[] arrobject = new Object[18697 & 4115];
        arrobject[464 & -32764] = class_16992.Method_1729();
        Class_42987.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.entitydata.success", (Object[])arrobject);
    }

    public boolean Method_42990(String[] arrstring, int n) {
        return (n == 0 ? 193 & -15333 : 17680 & -30207) != 0;
    }

    public String Method_42991(Class_1367 class_1367) {
        return "commands.entitydata.usage";
    }

    public int Method_42992() {
        return -32762 & 20499;
    }

    public String Method_42993() {
        return "entitydata";
    }
}

