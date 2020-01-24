/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.IDN;

public class Class_26193
implements Predicate {
    final Class_20150 Field_26194;

    public boolean Method_26195(Object object) {
        return this.Method_26196((String)object);
    }

    public boolean Method_26196(String string) {
        if (string.length() == 0) {
            return (18633 & 5175) != 0;
        }
        String[] arrstring = string.split(":");
        if (arrstring.length == 0) {
            return (-32511 & 7177) != 0;
        }
        try {
            String string2 = IDN.toASCII(arrstring[8496 & 1026]);
            return (2693 & -28293) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return (2048 & -6560) != 0;
        }
    }

    private void Method_26197() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26193(Class_20150 class_20150) {
        this.Field_26194 = class_20150;
    }
}

