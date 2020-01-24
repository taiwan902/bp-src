/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_2871
extends Class_2824 {
    private String Field_2872 = "";
    private final String Field_2873;
    private final String Field_2874;

    private void Method_2875() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_2871(String string, String string2) {
        this.Field_2873 = string;
        this.Field_2874 = string2;
    }

    public String Method_2876() {
        Class_2457 class_2457 = Class_2457.Method_2530();
        if (class_2457 != null && class_2457.Method_2596() && Class_35310.Method_35315(this.Field_2872)) {
            Class_7873 class_7873;
            Class_20976 class_20976 = class_2457.Method_2550(20776 & 145).\u0000strictfp();
            if (class_20976.Method_21011(this.Field_2873, class_7873 = class_20976.Method_21003(this.Field_2874))) {
                Class_21696 class_21696 = class_20976.Method_20993(this.Field_2873, class_7873);
                Object[] arrobject = new Object[145 & 19525];
                arrobject[4108 & 16786] = class_21696.Method_21706();
                this.Method_2881(String.format("%d", arrobject));
            } else {
                this.Field_2872 = "";
            }
        }
        return this.Field_2872;
    }

    public Class_2871 Method_2877() {
        Class_2871 class_2871 = new Class_2871(this.Field_2873, this.Field_2874);
        class_2871.Method_2881(this.Field_2872);
        class_2871.\u0000strictfp(this.\u0000strictfp().Method_2947());
        for (Class_1782 class_1782 : this.\u0000strictfp()) {
            class_2871.\u0000strictfp(class_1782.Method_1790());
        }
        return class_2871;
    }

    public String Method_2878() {
        return this.Field_2874;
    }

    public boolean Method_2879(Object object) {
        if (this == object) {
            return (515 & 25769) != 0;
        }
        if (!(object instanceof Class_2871)) {
            return (15760 & 587) != 0;
        }
        Class_2871 class_2871 = (Class_2871)object;
        return (this.Field_2873.equals(class_2871.Field_2873) && this.Field_2874.equals(class_2871.Field_2874) && super.Method_2837(object) ? 9 & 18353 : 1280 & 13002) != 0;
    }

    public String Method_2880() {
        return "ScoreComponent{name='" + this.Field_2873 + (char)(-12249 & 2151) + "objective='" + this.Field_2874 + (char)(295 & -26577) + ", siblings=" + this.\u0000strictfp + ", style=" + this.\u0000strictfp() + (char)(2173 & 765);
    }

    public void Method_2881(String string) {
        this.Field_2872 = string;
    }

    public Class_1782 Method_2882() {
        return this.Method_2877();
    }

    public String Method_2883() {
        return this.Field_2873;
    }
}

