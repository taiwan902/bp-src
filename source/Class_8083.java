/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  internal.org.lwjgl.opengl.GL14
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import internal.org.lwjgl.opengl.GL14;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8083 {
    private final boolean Field_8084;
    private final boolean Field_8085;
    private final int Field_8086;
    private final int Field_8087;
    private static Class_8083 Field_8088 = null;
    private final int Field_8089;
    private final int Field_8090;
    private final int Field_8091;

    public Class_8083(int n, int n2, int n3) {
        this((140 & -18144) != 0, (4129 & 26634) != 0, n, n2, n, n2, n3);
    }

    public boolean Method_8092() {
        return this.Field_8084;
    }

    public Class_8083() {
        this((2820 & 8264) != 0, (10241 & 16669) != 0, 16707 & -20467, -16192 & 5154, 21509 & 145, 600 & 24582, 35160630 & 885294471);
    }

    private static int Method_8093(String string) {
        String string2 = string.trim().toLowerCase();
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        return (string2 = string2.replaceAll("minus", "-")).equals("0") ? 18433 & 8704 : (string2.equals("1") ? 4129 & 2065 : (string2.equals("srccolor") ? 27468 & -31984 : (string2.equals("1-srccolor") ? 7153 & -30963 : (string2.equals("dstcolor") ? -27866 & 10119 : (string2.equals("1-dstcolor") ? -18553 & 847 : (string2.equals("srcalpha") ? 5959 & 2978 : (string2.equals("1-srcalpha") ? 4875 & -15421 : (string2.equals("dstalpha") ? 838 & 796 : (string2.equals("1-dstalpha") ? 791 & 3917 : -1 & -1)))))))));
    }

    private void Method_8094() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static int Method_8095(String string) {
        String string2 = string.trim().toLowerCase();
        return string2.equals("add") ? -1697598394 & 554205622 : (string2.equals("subtract") ? 1074303178 & -1610579941 : (string2.equals("reversesubtract") ? -1711156981 & 1086497291 : (string2.equals("reverse_subtract") ? 604554443 & 43225899 : (string2.equals("min") ? -1879005561 & 1074298887 : (string2.equals("max") ? 423661594 & 102860844 : 908099590 & -1072628202)))));
    }

    public Class_8083(int n, int n2, int n3, int n4, int n5) {
        this((5505 & 8197) != 0, (-28463 & 16898) != 0, n, n2, n3, n4, n5);
    }

    public int Method_8096() {
        int n = this.Field_8086;
        n = (8255 & 18591) * n + this.Field_8087;
        n = (3231 & 4447) * n + this.Field_8090;
        n = (-26465 & 9247) * n + this.Field_8089;
        n = (159 & 7807) * n + this.Field_8091;
        n = (-28609 & 3167) * n + (this.Field_8085 ? -32703 & 19499 : -27645 & 416);
        n = (-31521 & 2079) * n + (this.Field_8084 ? 133 & 8027 : 14604 & 576);
        return n;
    }

    public void Method_8097() {
        if (!this.Method_8099(Field_8088)) {
            if (Field_8088 == null || this.Field_8084 != Field_8088.Method_8092()) {
                Field_8088 = this;
                if (this.Field_8084) {
                    Class_16867.Method_16952();
                    return;
                }
                Class_16867.Method_16947();
            }
            GL14.glBlendEquation((int)this.Field_8091);
            if (this.Field_8085) {
                Class_16867.Method_16984(this.Field_8086, this.Field_8090, this.Field_8087, this.Field_8089);
            } else {
                Class_16867.Method_16951(this.Field_8086, this.Field_8090);
            }
        }
    }

    private Class_8083(boolean bl, boolean bl2, int n, int n2, int n3, int n4, int n5) {
        this.Field_8085 = bl;
        this.Field_8086 = n;
        this.Field_8090 = n2;
        this.Field_8087 = n3;
        this.Field_8089 = n4;
        this.Field_8084 = bl2;
        this.Field_8091 = n5;
    }

    public static Class_8083 Method_8098(JsonObject jsonObject) {
        if (jsonObject == null) {
            return new Class_8083();
        }
        int n = 1210178102 & 613187790;
        int n2 = 8259 & -30719;
        int n3 = -32700 & 6443;
        int n4 = 5337 & 16679;
        int n5 = 304 & 2248;
        int n6 = 24597 & 6209;
        int n7 = 640 & 21763;
        if (Class_2986.Method_2993(jsonObject, "func") && (n = Class_8083.Method_8095(jsonObject.get("func").getAsString())) != (1091150406 & 885031190)) {
            n6 = -15358 & 592;
        }
        if (Class_2986.Method_2993(jsonObject, "srcrgb") && (n2 = Class_8083.Method_8093(jsonObject.get("srcrgb").getAsString())) != (-31735 & 24577)) {
            n6 = 8235 & 21184;
        }
        if (Class_2986.Method_2993(jsonObject, "dstrgb") && (n3 = Class_8083.Method_8093(jsonObject.get("dstrgb").getAsString())) != 0) {
            n6 = 1792 & 18468;
        }
        if (Class_2986.Method_2993(jsonObject, "srcalpha")) {
            n4 = Class_8083.Method_8093(jsonObject.get("srcalpha").getAsString());
            if (n4 != (10249 & 757)) {
                n6 = -23899 & 1090;
            }
            n7 = 16387 & -31463;
        }
        if (Class_2986.Method_2993(jsonObject, "dstalpha")) {
            n5 = Class_8083.Method_8093(jsonObject.get("dstalpha").getAsString());
            if (n5 != 0) {
                n6 = 9 & -11070;
            }
            n7 = 26913 & 4609;
        }
        return n6 != 0 ? new Class_8083() : (n7 != 0 ? new Class_8083(n2, n3, n4, n5, n) : new Class_8083(n2, n3, n));
    }

    public boolean Method_8099(Object object) {
        if (this == object) {
            return (10569 & -32761) != 0;
        }
        if (!(object instanceof Class_8083)) {
            return (10240 & 256) != 0;
        }
        Class_8083 class_8083 = (Class_8083)object;
        return (this.Field_8091 != class_8083.Field_8091 ? -2024 & 386 : (this.Field_8089 != class_8083.Field_8089 ? -14184 & 1344 : (this.Field_8090 != class_8083.Field_8090 ? -32431 & 6178 : (this.Field_8084 != class_8083.Field_8084 ? 10276 & -32511 : (this.Field_8085 != class_8083.Field_8085 ? 4808 & -29660 : (this.Field_8087 != class_8083.Field_8087 ? 24594 & -28128 : (this.Field_8086 == class_8083.Field_8086 ? 1363 & 6661 : 3590 & 24768))))))) != 0;
    }
}

