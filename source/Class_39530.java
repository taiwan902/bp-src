/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_39530
extends Class_36787 {
    private void Method_39531() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_39532() {
        return "blockdata";
    }

    public void Method_39533(Class_1367 class_1367, String[] arrstring) {
        Class_1699 class_1699;
        if (arrstring.length < (644 & 2100)) {
            throw new Class_34974("commands.blockdata.usage", new Object[22607 & 160]);
        }
        class_1367.Method_1374(Class_26261.Field_26265, 16940 & 17);
        Class_4751 class_4751 = Class_39530.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(564 & -12096), (8832 & -28416) != 0);
        Class_283 class_283 = class_1367.Method_1375();
        if (!class_283.Method_368(class_4751)) {
            throw new Class_30034("commands.blockdata.outOfWorld", new Object[4224 & 257]);
        }
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 == null) {
            throw new Class_30034("commands.blockdata.notValid", new Object[16898 & -25159]);
        }
        Class_1699 class_16992 = new Class_1699();
        class_4879.Method_4929(class_16992);
        Class_1699 class_16993 = (Class_1699)class_16992.Method_1732();
        try {
            class_1699 = Class_10981.Method_10996(Class_39530.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(515 & -24569)).Method_1788());
        }
        catch (Class_34310 class_34310) {
            Object[] arrobject = new Object[1603 & 24577];
            arrobject[-15356 & 14354] = class_34310.getMessage();
            throw new Class_30034("commands.blockdata.tagError", arrobject);
        }
        class_16992.Method_1730(class_1699);
        class_16992.Method_1739("x", class_4751.\u0000= final());
        class_16992.Method_1739("y", class_4751.\u0000, `());
        class_16992.Method_1739("z", class_4751.\u0000strictfp());
        if (class_16992.Method_1734(class_16993)) {
            Object[] arrobject = new Object[14153 & -30687];
            arrobject[8848 & 7201] = class_16992.Method_1729();
            throw new Class_30034("commands.blockdata.failed", arrobject);
        }
        class_4879.Method_4911(class_16992);
        class_4879.Method_4922();
        class_283.Method_416(class_4751);
        class_1367.Method_1374(Class_26261.Field_26265, -32495 & 2565);
        Object[] arrobject = new Object[4139 & 3905];
        arrobject[-22464 & 0] = class_16992.Method_1729();
        Class_39530.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.blockdata.success", (Object[])arrobject);
    }

    public int Method_39534() {
        return 22986 & 518;
    }

    public List Method_39535(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length > 0 && arrstring.length <= (3 & -25713) ? Class_39530.\u0000strictfp((String[])arrstring, (int)(-27782 & 25600), (Class_4751)class_4751) : null;
    }

    public String Method_39536(Class_1367 class_1367) {
        return "commands.blockdata.usage";
    }
}

