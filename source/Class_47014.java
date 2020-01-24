/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.lang3.StringUtils;

public class Class_47014
implements Class_1486 {
    private String Field_47015;
    private Class_4751 Field_47016;

    public String Method_47017() {
        return this.Field_47015;
    }

    public Class_47014() {
    }

    public Class_47014(String string, Class_4751 class_4751) {
        this.Field_47015 = string;
        this.Field_47016 = class_4751;
    }

    public void Method_47018(Class_29900 class_29900) {
        this.Field_47015 = class_29900.Method_29991(32767 & 32767);
        boolean bl = class_29900.Method_29962();
        if (bl) {
            this.Field_47016 = class_29900.Method_29910();
        }
    }

    public void Method_47019(Class_29900 class_29900) {
        class_29900.Method_29960(StringUtils.substring((String)this.Field_47015, (int)(4353 & 2052), (int)(32767 & -1)));
        int n = this.Field_47016 != null ? -32587 & 7425 : 32 & -11775;
        class_29900.Method_29980(n != 0);
        if (n != 0) {
            class_29900.Method_29996(this.Field_47016);
        }
    }

    public void Method_47020(Class_10930 class_10930) {
        class_10930.Method_10932(this);
    }

    public void Method_47021(Class_10954 class_10954) {
        this.Method_47020((Class_10930)class_10954);
    }

    public Class_4751 Method_47022() {
        return this.Field_47016;
    }

    private void Method_47023() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

