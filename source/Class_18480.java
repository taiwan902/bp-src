/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

public abstract class Class_18480 {
    private String Field_18481 = null;
    private String Field_18482 = null;
    private String Field_18483 = null;
    private boolean Field_18484 = 8085 & 97;
    private String Field_18485 = null;
    private String[] Field_18486 = null;
    private boolean Field_18487 = -15863 & 85;
    private String[] Field_18488 = null;

    public void Method_18489() {
        int n = Class_18480.Method_18501(this.Field_18482, this.Field_18488);
        if (n >= 0) {
            n = (n + (26241 & 2067)) % this.Field_18488.length;
            this.Field_18482 = this.Field_18488[n];
        }
    }

    public void Method_18490(String string) {
        this.Field_18483 = string;
    }

    public String Method_18491() {
        return null;
    }

    public String Method_18492() {
        return this.Field_18483;
    }

    public String Method_18493() {
        return this.Field_18482;
    }

    public void Method_18494(boolean bl) {
        this.Field_18487 = bl;
    }

    private void Method_18495() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_18496(String string) {
        return (-14182 & 289) != 0;
    }

    public void Method_18497(float f) {
        if (this.Field_18488.length > (13067 & -16239)) {
            f = Class_19426.Method_19565(f, 0.0f, 1.0f);
            int n = Math.round(f * (float)(this.Field_18488.length - (-7863 & 2069)));
            this.Field_18482 = this.Field_18488[n];
        }
    }

    public boolean Method_18498() {
        return (!Class_19426.Method_19529(this.Field_18482, this.Field_18481) ? 19265 & 1027 : 5387 & -15760) != 0;
    }

    public float Method_18499() {
        if (this.Field_18488.length <= (16513 & -32747)) {
            return 0.0f;
        }
        int n = Class_18480.Method_18501(this.Field_18482, this.Field_18488);
        if (n < 0) {
            return 0.0f;
        }
        float f = 1.0f * (float)n / ((float)this.Field_18488.length - 1.0f);
        return f;
    }

    public void Method_18500(String[] arrstring) {
        List<String> list = Arrays.asList(this.Field_18486);
        for (int i = 28680 & 256; i < arrstring.length; ++i) {
            String string = arrstring[i];
            if (list.contains(string)) continue;
            this.Field_18486 = (String[])Class_19426.Method_19469(this.Field_18486, string);
        }
    }

    private static int Method_18501(String string, String[] arrstring) {
        for (int i = -6140 & 1185; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!string2.equals(string)) continue;
            return i;
        }
        return -1 & -1;
    }

    public boolean Method_18502(String string) {
        return (2049 & -32722) != 0;
    }

    public void Method_18503() {
        int n = Class_18480.Method_18501(this.Field_18482, this.Field_18488);
        if (n >= 0) {
            n = (n - (-26411 & 8195) + this.Field_18488.length) % this.Field_18488.length;
            this.Field_18482 = this.Field_18488[n];
        }
    }

    public String Method_18504() {
        return this.Field_18485;
    }

    public String Method_18505() {
        return Class_12440.Method_12859("option." + this.Field_18485, this.Field_18485);
    }

    public String Method_18506(String string) {
        return "";
    }

    public String Method_18507() {
        String string = Class_19426.Method_19539(this.Field_18483);
        string = Class_35556.Method_35566(string, "//");
        string = Class_12440.Method_12859("option." + this.Method_18504() + ".comment", string);
        return string;
    }

    public boolean Method_18508() {
        return this.Field_18484;
    }

    public String[] Method_18509() {
        return (String[])this.Field_18488.clone();
    }

    public boolean Method_18510(String string) {
        return (Class_18480.Method_18501(string, this.Field_18488) >= 0 ? 4487 & -7135 : -32748 & 12608) != 0;
    }

    public boolean Method_18511(String string) {
        int n = Class_18480.Method_18501(string, this.Field_18488);
        if (n < 0) {
            return (72 & 28928) != 0;
        }
        this.Field_18482 = string;
        return (-32255 & 7373) != 0;
    }

    public Class_18480(String string, String string2, String string3, String[] arrstring, String string4, String string5) {
        this.Field_18485 = string;
        this.Field_18483 = string2;
        this.Field_18482 = string3;
        this.Field_18488 = arrstring;
        this.Field_18481 = string4;
        if (string5 != null) {
            String[] arrstring2 = new String[24601 & 3201];
            arrstring2[-30304 & 2] = string5;
            this.Field_18486 = arrstring2;
        }
    }

    public boolean Method_18512() {
        return this.Field_18487;
    }

    public String Method_18513() {
        return "" + this.Field_18485 + ", value: " + this.Field_18482 + ", valueDefault: " + this.Field_18481 + ", paths: " + Class_19426.Method_19555(this.Field_18486);
    }

    public String Method_18514() {
        return this.Field_18481;
    }

    public void Method_18515(boolean bl) {
        this.Field_18484 = bl;
    }

    public String[] Method_18516() {
        return this.Field_18486;
    }

    public boolean Method_18517() {
        return (-32759 & 14470) != 0;
    }

    public void Method_18518() {
        this.Field_18482 = this.Field_18481;
    }

    public String Method_18519(String string) {
        return Class_12440.Method_12859("value." + this.Field_18485 + "." + string, string);
    }
}

