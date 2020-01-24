/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class Class_6017 {
    private int Field_6018 = 0 & 66;
    private int[] Field_6019 = null;
    private String Field_6020 = null;
    private String Field_6021 = null;
    private String[] Field_6022 = null;
    private int Field_6023 = 1039 & 6656;
    private String[] Field_6024 = null;

    public String Method_6025() {
        return "" + this.Field_6021 + "=" + this.Method_6028() + " [" + Class_19426.Method_19555(this.Field_6022) + "], value: " + this.Field_6018;
    }

    private void Method_6026() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6017(String string, String[] arrstring, String string2, String[] arrstring2, int n) {
        this.Field_6021 = string;
        this.Field_6022 = arrstring;
        this.Field_6020 = string2;
        this.Field_6024 = arrstring2;
        this.Field_6023 = n;
        if (arrstring.length != arrstring2.length) {
            throw new IllegalArgumentException("Property and user values have different lengths: " + arrstring.length + " != " + arrstring2.length);
        }
        if (n < 0 || n >= arrstring.length) {
            throw new IllegalArgumentException("Invalid default value: " + n);
        }
        this.Field_6018 = n;
    }

    public boolean Method_6027(Properties properties) {
        this.Method_6030();
        if (properties == null) {
            return (16974 & -24304) != 0;
        }
        String string = properties.getProperty(this.Field_6021);
        return (string == null ? 8450 & 6312 : (int)(this.Method_6033(string) ? 1 : 0)) != 0;
    }

    public String Method_6028() {
        return this.Field_6022[this.Field_6018];
    }

    public String Method_6029() {
        return this.Field_6024[this.Field_6018];
    }

    public void Method_6030() {
        this.Field_6018 = this.Field_6023;
    }

    public int Method_6031() {
        return this.Field_6018;
    }

    public void Method_6032() {
        this.Field_6018 += 6403 & 8709;
        if (this.Field_6018 < 0 || this.Field_6018 >= this.Field_6022.length) {
            this.Field_6018 = 128 & 0;
        }
    }

    public boolean Method_6033(String string) {
        if (string == null) {
            this.Field_6018 = this.Field_6023;
            return (4109 & 16640) != 0;
        }
        this.Field_6018 = ArrayUtils.indexOf((Object[])this.Field_6022, (Object)string);
        if (this.Field_6018 >= 0 && this.Field_6018 < this.Field_6022.length) {
            return (597 & 289) != 0;
        }
        this.Field_6018 = this.Field_6023;
        return (-14784 & 8200) != 0;
    }
}

