/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Objects;

public class Class_15474 {
    private String Field_15475;
    private boolean Field_15476;
    public boolean Field_15477;
    boolean Field_15478 = 64 & 1551;
    public String Field_15479;
    public int Field_15480 = 47 & 1343;
    private Class_17874 Field_15481 = Class_17874.Field_17879;
    public String Field_15482;
    public String Field_15483;
    public String Field_15484;
    public long Field_15485;
    private boolean Field_15486 = 9284 & 35;
    public String Field_15487 = "1.8.8";
    public boolean Field_15488 = 8225 & 19668;
    public String Field_15489;
    private boolean Field_15490;
    private boolean Field_15491;

    public String Method_15492() {
        return "ServerData{serverName=" + this.Field_15482 + ", serverIP=" + this.Field_15484 + ", promoted=" + this.Field_15486 + (char)(16765 & 2173);
    }

    public boolean Method_15493() {
        return Class_29539.Method_29547(Class_32037.Method_32040(this.Field_15484));
    }

    public boolean Method_15494() {
        return this.Field_15490;
    }

    public void Method_15495(Class_15474 class_15474) {
        this.Field_15484 = class_15474.Field_15484;
        this.Field_15482 = class_15474.Field_15482;
        this.Method_15497(class_15474.Method_15502());
        this.Field_15475 = class_15474.Field_15475;
        this.Field_15476 = class_15474.Field_15476;
    }

    public boolean Method_15496() {
        return this.Field_15476;
    }

    public void Method_15497(Class_17874 class_17874) {
        this.Field_15481 = class_17874;
    }

    public Class_1699 Method_15498() {
        return this.Method_15504((-28024 & 17507) != 0);
    }

    public boolean Method_15499(Object object) {
        if (this == object) {
            return (8513 & -15723) != 0;
        }
        if (object == null) {
            return (19120 & 4364) != 0;
        }
        if (this.getClass() != object.getClass()) {
            return (2066 & -28152) != 0;
        }
        Class_15474 class_15474 = (Class_15474)object;
        if (this.Field_15480 != class_15474.Field_15480) {
            return (-26492 & 8267) != 0;
        }
        if (this.Field_15486 != class_15474.Field_15486) {
            return (8210 & -12252) != 0;
        }
        if (!Objects.equals(this.Field_15482, class_15474.Field_15482)) {
            return (4234 & 17152) != 0;
        }
        if (!Objects.equals(this.Field_15484, class_15474.Field_15484)) {
            return (6804 & -7094) != 0;
        }
        return (8457 & 4609) != 0;
    }

    public void Method_15500(boolean bl) {
        this.Field_15486 = bl;
    }

    public void Method_15501(String string) {
        this.Field_15475 = string;
    }

    public Class_15474(String string, String string2, boolean bl) {
        this.Field_15482 = string;
        this.Field_15484 = string2;
        this.Field_15476 = bl;
        this.Field_15491 = 8195 & 21096;
        this.Field_15490 = 769 & 12418;
    }

    public Class_17874 Method_15502() {
        return this.Field_15481;
    }

    public void Method_15503(boolean bl) {
        this.Field_15491 = bl;
    }

    public Class_1699 Method_15504(boolean bl) {
        Class_1699 class_1699 = new Class_1699();
        class_1699.Method_1702("name", this.Field_15482 + (bl ? "\u00a72\u00a74\u00a71" : ""));
        class_1699.Method_1702("ip", this.Field_15484);
        if (this.Field_15475 != null) {
            class_1699.Method_1702("icon", this.Field_15475);
        }
        if (this.Field_15481 == Class_17874.Field_17878) {
            class_1699.Method_1706("acceptTextures", (1 & -30679) != 0);
        } else if (this.Field_15481 == Class_17874.Field_17877) {
            class_1699.Method_1706("acceptTextures", (4165 & 17152) != 0);
        }
        return class_1699;
    }

    public boolean Method_15505() {
        return this.Field_15491;
    }

    private void Method_15506() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_15474 Method_15507(Class_1699 class_1699) {
        Class_15474 class_15474 = new Class_15474(class_1699.Method_1708("name"), class_1699.Method_1708("ip"), (6826 & 1025) != 0);
        if (class_1699.Method_1715("icon", 4106 & 2220)) {
            class_15474.Method_15501(class_1699.Method_1708("icon"));
        }
        if (class_1699.Method_1715("acceptTextures", 9873 & -11965)) {
            if (class_1699.Method_1733("acceptTextures")) {
                class_15474.Method_15497(Class_17874.Field_17878);
            } else {
                class_15474.Method_15497(Class_17874.Field_17877);
            }
        } else {
            class_15474.Method_15497(Class_17874.Field_17879);
        }
        if (class_15474.Field_15482.endsWith("\u00a72\u00a74\u00a71")) {
            class_15474.Field_15488 = 6145 & 1025;
        }
        return class_15474;
    }

    public void Method_15508(boolean bl) {
        this.Field_15490 = bl;
    }

    public String Method_15509() {
        return this.Field_15475;
    }

    public boolean Method_15510() {
        return this.Field_15486;
    }
}

