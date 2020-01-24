/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_13665 {
    private String Field_13666;
    private boolean Field_13667;
    private String Field_13668;
    private UUID Field_13669;
    private boolean Field_13670;
    private String Field_13671;
    private String Field_13672;
    private int Field_13673;
    private int Field_13674;
    private boolean Field_13675;

    public boolean Method_13676() {
        return this.Field_13667;
    }

    public String Method_13677() {
        return this.Field_13666;
    }

    public int Method_13678() {
        return this.Field_13673;
    }

    public String Method_13679() {
        return "TeamInfo{uuidOrEid=" + this.Field_13667 + ", uuid=" + this.Field_13669 + ", eid=" + this.Field_13673 + ", prefix=" + this.Field_13668 + ", displayTag=" + this.Field_13675 + ", tag=" + this.Field_13666 + ", suffix=" + this.Field_13671 + ", displayPoints=" + this.Field_13670 + ", points=" + this.Field_13674 + ", pointsName=" + this.Field_13672 + (char)(2429 & -7555);
    }

    public UUID Method_13680() {
        return this.Field_13669;
    }

    public String Method_13681() {
        return this.Field_13668;
    }

    public String Method_13682() {
        return this.Field_13671;
    }

    public boolean Method_13683() {
        return this.Field_13670;
    }

    public static Class_13665 Method_13684(Class_22553 class_22553) {
        Class_29900 class_29900 = new Class_29900(class_22553);
        Class_13665 class_13665 = new Class_13665();
        class_13665.Field_13667 = class_29900.Method_29962();
        if (class_13665.Field_13667) {
            class_13665.Field_13669 = new UUID(class_29900.Method_30001(), class_29900.Method_30001());
        } else {
            class_13665.Field_13673 = class_29900.Method_29914();
        }
        class_13665.Field_13668 = class_29900.Method_29991(173 & 24672);
        class_13665.Field_13675 = class_29900.Method_29962();
        if (class_13665.Field_13675) {
            class_13665.Field_13666 = class_29900.Method_29991(10272 & -28304);
        }
        class_13665.Field_13671 = class_29900.Method_29991(318 & 1248);
        class_13665.Field_13670 = class_29900.Method_29962();
        if (class_13665.Field_13670) {
            class_13665.Field_13674 = class_29900.Method_29914();
            class_13665.Field_13672 = class_29900.Method_29991(-31568 & 4640);
        }
        return class_13665;
    }

    public String Method_13685() {
        return this.Field_13672;
    }

    private void Method_13686() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_13687() {
        return this.Field_13674;
    }
}

