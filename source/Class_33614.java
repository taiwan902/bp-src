/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33614
extends Class_4879 {
    public final Class_1782[] Field_33615;
    public String[] Field_33616;
    private Class_626 Field_33617;
    public int Field_33618;
    private final Class_8719 Field_33619;
    private boolean Field_33620;

    static Class_8719 Method_33621(Class_33614 class_33614) {
        return class_33614.Field_33619;
    }

    public Class_8719 Method_33622() {
        return this.Field_33619;
    }

    public boolean Method_33623() {
        return this.Field_33620;
    }

    public void Method_33624(Class_1699 class_1699) {
        this.Field_33620 = -32160 & 261;
        super.Method_4911(class_1699);
        Class_39487 class_39487 = new Class_39487(this);
        for (int i = 129 & 25928; i < (-32508 & 30406); ++i) {
            String string = class_1699.Method_1708("Text" + (i + (-12279 & 1281)));
            try {
                Class_1782 class_1782 = Class_2814.Method_2819(string);
                try {
                    this.Field_33615[i] = Class_21303.Method_21304(class_39487, class_1782, null);
                }
                catch (Class_30034 class_30034) {
                    this.Field_33615[i] = class_1782;
                }
                continue;
            }
            catch (JsonParseException jsonParseException) {
                this.Field_33615[i] = new Class_2840(string);
            }
        }
        this.Method_33631();
        this.Field_33619.Method_8724(class_1699);
    }

    public void Method_33625(Class_626 class_626) {
        this.Field_33617 = class_626;
    }

    public Class_33614() {
        Class_1782[] arrclass_1782 = new Class_1782[16900 & 8390];
        arrclass_1782[2562 & 21505] = new Class_2840("");
        arrclass_1782[-27647 & 2181] = new Class_2840("");
        arrclass_1782[20771 & 514] = new Class_2840("");
        arrclass_1782[1171 & 24579] = new Class_2840("");
        this.Field_33615 = arrclass_1782;
        String[] arrstring = new String[17868 & 516];
        arrstring[208 & -26616] = null;
        arrstring[26657 & 1097] = null;
        arrstring[1571 & 2] = null;
        arrstring[267 & 19475] = null;
        this.Field_33616 = arrstring;
        this.Field_33618 = -1 & -1;
        this.Field_33620 = 8257 & 6305;
        this.Field_33619 = new Class_8719();
    }

    public boolean Method_33626() {
        return (1 & 29191) != 0;
    }

    public void Method_33627(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        for (int i = -29344 & 20504; i < (-14330 & 13573); ++i) {
            String string = Class_2814.Method_2821(this.Field_33615[i]);
            class_1699.Method_1702("Text" + (i + (17417 & 6145)), string);
        }
        this.Field_33619.Method_8725(class_1699);
    }

    public Class_626 Method_33628() {
        return this.Field_33617;
    }

    private void Method_33629() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_33630(Class_626 class_626) {
        Class_36409 class_36409 = new Class_36409(this, class_626);
        for (int i = 20513 & 2388; i < this.Field_33615.length; ++i) {
            Class_2893 class_2893;
            Class_21230 class_21230;
            Class_2893 class_28932 = class_2893 = this.Field_33615[i] == null ? null : this.Field_33615[i].Method_1789();
            if (class_2893 == null || class_2893.Method_2913() == null || (class_21230 = class_2893.Method_2913()).Method_21236() != Class_17245.Field_17246) continue;
            Class_2457.Method_2530().Method_2553().Method_2756(class_36409, class_21230.Method_21237());
        }
        return (4225 & 16403) != 0;
    }

    public void Method_33631() {
        for (int i = 1034 & -27920; i < this.Field_33616.length; ++i) {
            this.Field_33616[i] = null;
        }
    }

    public Class_1486 Method_33632() {
        Class_1782[] arrclass_1782 = new Class_1782[-16355 & 6404];
        System.arraycopy(this.Field_33615, -13648 & 5189, arrclass_1782, 36 & 320, -14828 & 6468);
        return new Class_35754(this.\u0000strictfp, this.\u0000strictfp, arrclass_1782);
    }

    public void Method_33633(boolean bl) {
        this.Field_33620 = bl;
        if (!bl) {
            this.Field_33617 = null;
        }
    }
}

