/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17080 {
    private double Field_17081;
    private int Field_17082;
    private boolean Field_17083;
    private String Field_17084;
    private final Class_21147 Field_17085;

    private void Method_17086() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21147 Method_17087() {
        return this.Field_17085;
    }

    public String Method_17088() {
        return this.Field_17084;
    }

    public Class_17080(String string, Class_21147 class_21147) {
        this.Field_17085 = class_21147;
        this.Method_17091(string);
    }

    public boolean Method_17089() {
        return this.Field_17083;
    }

    public int Method_17090() {
        return this.Field_17082;
    }

    public void Method_17091(String string) {
        this.Field_17084 = string;
        if (string != null) {
            if (string.equals("false")) {
                this.Field_17083 = -32229 & 24800;
                return;
            }
            if (string.equals("true")) {
                this.Field_17083 = -32567 & 9253;
                return;
            }
        }
        this.Field_17083 = Boolean.parseBoolean(string);
        this.Field_17082 = this.Field_17083 ? 17 & 21541 : 2124 & -31616;
        try {
            this.Field_17082 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.Field_17081 = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }
}

