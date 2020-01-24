/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43116
extends Class_42376 {
    private Class_43116 Field_43117;
    private int Field_43118;
    private int Field_43119;
    private Class_43116 Field_43120;
    private static Class_43116 Field_43121;

    protected void Method_43122(int n) {
        this.Field_43118 = n;
    }

    protected void Method_43123(int n, int n2, int n3, int n4) {
        this.\u0000= final = n;
        this.\u0000, for = n2;
        this.\u0000, ` = n3;
        this.\u0000strictfp = n4;
    }

    public boolean Method_43124(Class_18 class_18, int n, int n2) {
        if (n >= this.\u0000= final && n < this.\u0000= final + this.\u0000, ` && n2 >= this.\u0000, for && n2 < this.\u0000, for + this.\u0000strictfp) {
            this.Method_43136();
        }
        return (4296 & 3) != 0;
    }

    public Class_43116() {
        super(12420 & 368, 4103 & 19008, 1096 & -32732, 2656 & -32767, 16642 & 6181, "");
        this.Field_43119 = 17541 & 10322;
    }

    private void Method_43125() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_43126(Class_18 class_18, char c, int n) {
        int n2;
        String string;
        if (this.Field_43118 == 0 && (Keyboard.isKeyDown((int)(2333 & -32131)) || Keyboard.isKeyDown((int)(-20291 & 157))) && n == (175 & 111)) {
            string = Class_1490.Method_1523();
            if (string == null) {
                return;
            }
            int n3 = string.length();
            for (n2 = 10256 & -28672; n2 < n3; ++n2) {
                String string2;
                char c2 = string.charAt(n2);
                if (c2 == (-16307 & 11805) || c2 == (-29810 & 12346)) continue;
                if (c2 == (16894 & -29126)) {
                    c2 = 25919 & 2235;
                }
                if (class_18.Field_27.Method_28715(string2 = this.\u0000strictfp + c2) >= this.\u0000, ` - (13674 & 2566)) break;
                this.\u0000strictfp = string2;
            }
        }
        if (n != (16671 & 16014) && n != (6355 & 759)) {
            if (n == (2127 & 17055)) {
                if (!Keyboard.isKeyDown((int)(42 & -22358)) && !Keyboard.isKeyDown((int)(22902 & 1086))) {
                    Class_43116.Method_43132();
                } else {
                    Class_43116.Method_43133();
                }
            }
            if (n == (19517 & -23906)) {
                Class_43116.Method_43132();
            }
            if (this.Method_43129(c) && class_18.Field_27.Method_28715(string = this.\u0000strictfp + c) < this.\u0000, ` - (-23033 & 274)) {
                try {
                    if (this.Field_43118 == (20801 & -32751)) {
                        n2 = Integer.parseInt(string);
                        String string3 = n2 < (-29999444 & -29966911) ? "-30000000" : (string = n2 > (1375464336 & 97112972) ? "30000000" : Integer.toString(n2));
                    }
                    if (this.Field_43118 == (-16298 & 8459)) {
                        n2 = Integer.parseInt(string);
                        string = n2 < 0 ? "0" : (n2 > Class_38196.Field_38285.Method_38441() + (2307 & -16254) ? Integer.toString(Class_38196.Field_38285.Method_38441() + (8194 & 18578)) : Integer.toString(n2));
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
                this.\u0000strictfp = string;
            }
        } else if (!this.\u0000strictfp.isEmpty()) {
            this.\u0000strictfp = this.\u0000strictfp.substring(73 & 20480, this.\u0000strictfp.length() - (16897 & 1225));
        }
    }

    protected static Class_43116 Method_43127() {
        return Field_43121;
    }

    public void Method_43128(Class_18 class_18, int n, int n2) {
        int n3 = Field_43121 == this ? -1547384632 & -2065578542 : -529440671 & -1629197198;
        Class_43116.\u0000, `((int)this.\u0000= final, (int)this.\u0000, for, (int)(this.\u0000= final + this.\u0000, `), (int)(this.\u0000, for + this.\u0000strictfp), (int)n3);
        if (this.Field_43118 == 0) {
            this.\u0000strictfp(class_18.Field_27, this.\u0000strictfp, this.\u0000= final + this.\u0000, ` / (-16286 & 11398), this.\u0000, for + (-11247 & 2657), -1 & -1);
        } else {
            int n4 = class_18.Field_27.Method_28715(this.\u0000strictfp);
            this.\u0000, `(class_18.Field_27, this.\u0000strictfp, this.\u0000= final + this.\u0000, ` - n4 - (1185 & 5), this.\u0000, for + (81 & -23039), -1 & -1);
        }
    }

    protected boolean Method_43129(char c) {
        switch (this.Field_43118) {
            case 0: {
                return (" !\"#$%&'()*+,-./0123456789;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb".indexOf(c) != (-1 & -1) ? -3991 & 3601 : -2560 & 64) != 0;
            }
            case 1: {
                return ((this.\u0000strictfp.isEmpty() ? "-0123456789" : "0123456789").indexOf(c) != (-1 & -1) ? 1041 & 8865 : -28572 & 25112) != 0;
            }
            case 2: {
                return ("0123456789".indexOf(c) != (-1 & -1) ? 9033 & -31741 : 9252 & 273) != 0;
            }
        }
        return (100 & 17152) != 0;
    }

    public Class_43116(String string) {
        super(3158 & 4097, -31294 & 18469, -20480 & 18772, 32 & 25164, 8480 & 1045, string);
        this.Field_43119 = 2336 & 8211;
    }

    protected void Method_43130(int n) {
        this.Field_43119 = n;
    }

    protected static void Method_43131(Class_18 class_18, char c, int n) {
        if (Field_43121 != null) {
            Field_43121.Method_43126(class_18, c, n);
        }
    }

    protected static void Method_43132() {
        if (Field_43121 != null) {
            Field_43121.Method_43134();
            Field_43121 = Class_43116.Field_43121.Field_43120;
        }
    }

    protected static void Method_43133() {
        if (Field_43121 != null) {
            Field_43121.Method_43134();
            Field_43121 = Class_43116.Field_43121.Field_43117;
        }
    }

    protected void Method_43134() {
        String string = this.\u0000strictfp;
        try {
            int n;
            if (this.Field_43118 == (20561 & -32755)) {
                n = Integer.parseInt(string);
                String string2 = n < (-29999998 & -29999404) ? "-30000000" : (string = n > (231327706 & -2115378304) ? "30000000" : Integer.toString(n));
            }
            if (this.Field_43118 == (2331 & 9282)) {
                n = Integer.parseInt(string);
                string = n < 0 ? "0" : (n > Class_38196.Field_38285.Method_38441() + (14498 & 23) ? Integer.toString(Class_38196.Field_38285.Method_38441() + (16931 & 4122)) : Integer.toString(n));
            }
        }
        catch (NumberFormatException numberFormatException) {
            string = Integer.toString(this.Field_43119);
        }
        this.\u0000strictfp = string;
    }

    protected void Method_43135(Class_43116 class_43116) {
        this.Field_43120 = class_43116;
    }

    public void Method_43136() {
        if (Field_43121 != null) {
            Field_43121.Method_43134();
        }
        Field_43121 = this;
    }

    protected void Method_43137(Class_43116 class_43116) {
        this.Field_43117 = class_43116;
    }
}

