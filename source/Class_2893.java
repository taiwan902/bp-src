/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_2893 {
    private Boolean Field_2894;
    private Class_21230 Field_2895;
    private Boolean Field_2896;
    private String Field_2897;
    private Boolean Field_2898;
    private Boolean Field_2899;
    private Class_5478 Field_2900;
    private Class_2893 Field_2901;
    private Class_44868 Field_2902;
    private static final Class_2893 Field_2903 = new Class_16562();
    private Boolean Field_2904;

    static Boolean Method_2905(Class_2893 class_2893) {
        return class_2893.Field_2898;
    }

    public boolean Method_2906() {
        return this.Field_2904 == null ? this.Method_2932().Method_2906() : this.Field_2904.booleanValue();
    }

    public boolean Method_2907(Object object) {
        if (this == object) {
            return (-30591 & 17245) != 0;
        }
        if (!(object instanceof Class_2893)) {
            return (-30495 & 21504) != 0;
        }
        Class_2893 class_2893 = (Class_2893)object;
        if (this.Method_2925() != class_2893.Method_2925() || this.Method_2942() != class_2893.Method_2942() || this.Method_2929() != class_2893.Method_2929() || this.Method_2949() != class_2893.Method_2949() || this.Method_2906() != class_2893.Method_2906() || this.Method_2911() != class_2893.Method_2911() || (this.Method_2913() == null ? class_2893.Method_2913() != null : !this.Method_2913().Method_21234(class_2893.Method_2913())) || (this.Method_2921() == null ? class_2893.Method_2921() != null : !this.Method_2921().Method_44871(class_2893.Method_2921())) || !(this.Method_2931() != null ? this.Method_2931().equals(class_2893.Method_2931()) : class_2893.Method_2931() == null)) {
            boolean bl = 4098 & -21439;
            return bl;
        }
        boolean bl = 12299 & -32475;
        return bl;
    }

    static Boolean Method_2908(Class_2893 class_2893, Boolean bl) {
        class_2893.Field_2896 = bl;
        return class_2893.Field_2896;
    }

    static Boolean Method_2909(Class_2893 class_2893, Boolean bl) {
        class_2893.Field_2899 = bl;
        return class_2893.Field_2899;
    }

    public Class_2893 Method_2910(Boolean bl) {
        this.Field_2896 = bl;
        return this;
    }

    public boolean Method_2911() {
        return this.Field_2894 == null ? this.Method_2932().Method_2911() : this.Field_2894.booleanValue();
    }

    public String Method_2912() {
        if (this.Method_2916()) {
            return this.Field_2901 != null ? this.Field_2901.Method_2912() : "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.Method_2942() != null) {
            stringBuilder.append((Object)this.Method_2942());
        }
        if (this.Method_2925()) {
            stringBuilder.append((Object)Class_5478.Field_5486);
        }
        if (this.Method_2929()) {
            stringBuilder.append((Object)Class_5478.Field_5495);
        }
        if (this.Method_2911()) {
            stringBuilder.append((Object)Class_5478.Field_5506);
        }
        if (this.Method_2949()) {
            stringBuilder.append((Object)Class_5478.Field_5490);
        }
        if (this.Method_2906()) {
            stringBuilder.append((Object)Class_5478.Field_5487);
        }
        return stringBuilder.toString();
    }

    public Class_21230 Method_2913() {
        return this.Field_2895 == null ? this.Method_2932().Method_2913() : this.Field_2895;
    }

    static Class_44868 Method_2914(Class_2893 class_2893, Class_44868 class_44868) {
        class_2893.Field_2902 = class_44868;
        return class_2893.Field_2902;
    }

    public Class_2893 Method_2915(Class_21230 class_21230) {
        this.Field_2895 = class_21230;
        return this;
    }

    public boolean Method_2916() {
        return (this.Field_2896 == null && this.Field_2899 == null && this.Field_2904 == null && this.Field_2894 == null && this.Field_2898 == null && this.Field_2900 == null && this.Field_2895 == null && this.Field_2902 == null ? 5125 & 9051 : 1099 & 28960) != 0;
    }

    public Class_2893 Method_2917(Class_5478 class_5478) {
        this.Field_2900 = class_5478;
        return this;
    }

    static Class_44868 Method_2918(Class_2893 class_2893) {
        return class_2893.Field_2902;
    }

    static Boolean Method_2919(Class_2893 class_2893, Boolean bl) {
        class_2893.Field_2898 = bl;
        return class_2893.Field_2898;
    }

    static Boolean Method_2920(Class_2893 class_2893) {
        return class_2893.Field_2894;
    }

    public Class_44868 Method_2921() {
        return this.Field_2902 == null ? this.Method_2932().Method_2921() : this.Field_2902;
    }

    public Class_2893 Method_2922(Boolean bl) {
        this.Field_2898 = bl;
        return this;
    }

    public Class_2893 Method_2923(Boolean bl) {
        this.Field_2904 = bl;
        return this;
    }

    static String Method_2924(Class_2893 class_2893) {
        return class_2893.Field_2897;
    }

    public boolean Method_2925() {
        return this.Field_2896 == null ? this.Method_2932().Method_2925() : this.Field_2896.booleanValue();
    }

    public Class_2893 Method_2926(String string) {
        this.Field_2897 = string;
        return this;
    }

    static Boolean Method_2927(Class_2893 class_2893, Boolean bl) {
        class_2893.Field_2904 = bl;
        return class_2893.Field_2904;
    }

    public Class_2893 Method_2928(Boolean bl) {
        this.Field_2899 = bl;
        return this;
    }

    public boolean Method_2929() {
        return this.Field_2899 == null ? this.Method_2932().Method_2929() : this.Field_2899.booleanValue();
    }

    static Boolean Method_2930(Class_2893 class_2893) {
        return class_2893.Field_2904;
    }

    public String Method_2931() {
        return this.Field_2897 == null ? this.Method_2932().Method_2931() : this.Field_2897;
    }

    private Class_2893 Method_2932() {
        return this.Field_2901 == null ? Field_2903 : this.Field_2901;
    }

    public int Method_2933() {
        int n = this.Field_2900.hashCode();
        n = (-24129 & 7775) * n + this.Field_2896.hashCode();
        n = (27295 & -28385) * n + this.Field_2899.hashCode();
        n = (-8161 & 2591) * n + this.Field_2894.hashCode();
        n = (12703 & 1087) * n + this.Field_2904.hashCode();
        n = (20639 & 8799) * n + this.Field_2898.hashCode();
        n = (-30945 & 8287) * n + this.Field_2895.Method_21233();
        n = (4159 & -24545) * n + this.Field_2902.Method_44872();
        n = (1247 & 8255) * n + this.Field_2897.hashCode();
        return n;
    }

    public Class_2893 Method_2934() {
        Class_2893 class_2893 = new Class_2893();
        class_2893.Method_2910(this.Method_2925());
        class_2893.Method_2928(this.Method_2929());
        class_2893.Method_2923(this.Method_2906());
        class_2893.Method_2945(this.Method_2911());
        class_2893.Method_2922(this.Method_2949());
        class_2893.Method_2917(this.Method_2942());
        class_2893.Method_2915(this.Method_2913());
        class_2893.Method_2936(this.Method_2921());
        class_2893.Method_2926(this.Method_2931());
        return class_2893;
    }

    static Boolean Method_2935(Class_2893 class_2893) {
        return class_2893.Field_2899;
    }

    public Class_2893 Method_2936(Class_44868 class_44868) {
        this.Field_2902 = class_44868;
        return this;
    }

    static Class_21230 Method_2937(Class_2893 class_2893, Class_21230 class_21230) {
        class_2893.Field_2895 = class_21230;
        return class_2893.Field_2895;
    }

    static Class_5478 Method_2938(Class_2893 class_2893, Class_5478 class_5478) {
        class_2893.Field_2900 = class_5478;
        return class_2893.Field_2900;
    }

    static Boolean Method_2939(Class_2893 class_2893, Boolean bl) {
        class_2893.Field_2894 = bl;
        return class_2893.Field_2894;
    }

    static Class_5478 Method_2940(Class_2893 class_2893) {
        return class_2893.Field_2900;
    }

    public Class_2893 Method_2941(Class_2893 class_2893) {
        this.Field_2901 = class_2893;
        return this;
    }

    public Class_5478 Method_2942() {
        return this.Field_2900 == null ? this.Method_2932().Method_2942() : this.Field_2900;
    }

    static String Method_2943(Class_2893 class_2893, String string) {
        class_2893.Field_2897 = string;
        return class_2893.Field_2897;
    }

    static Boolean Method_2944(Class_2893 class_2893) {
        return class_2893.Field_2896;
    }

    public Class_2893 Method_2945(Boolean bl) {
        this.Field_2894 = bl;
        return this;
    }

    private void Method_2946() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_2893 Method_2947() {
        Class_2893 class_2893 = new Class_2893();
        class_2893.Field_2896 = this.Field_2896;
        class_2893.Field_2899 = this.Field_2899;
        class_2893.Field_2904 = this.Field_2904;
        class_2893.Field_2894 = this.Field_2894;
        class_2893.Field_2898 = this.Field_2898;
        class_2893.Field_2900 = this.Field_2900;
        class_2893.Field_2895 = this.Field_2895;
        class_2893.Field_2902 = this.Field_2902;
        class_2893.Field_2901 = this.Field_2901;
        class_2893.Field_2897 = this.Field_2897;
        return class_2893;
    }

    public String Method_2948() {
        return "Style{hasParent=" + ((this.Field_2901 != null ? -31711 & 83 : -26026 & 0) != 0) + ", color=" + (Object)((Object)this.Field_2900) + ", bold=" + this.Field_2896 + ", italic=" + this.Field_2899 + ", underlined=" + this.Field_2894 + ", obfuscated=" + this.Field_2898 + ", clickEvent=" + this.Method_2913() + ", hoverEvent=" + this.Method_2921() + ", insertion=" + this.Method_2931() + (char)(4991 & 3325);
    }

    public boolean Method_2949() {
        return this.Field_2898 == null ? this.Method_2932().Method_2949() : this.Field_2898.booleanValue();
    }

    static Class_21230 Method_2950(Class_2893 class_2893) {
        return class_2893.Field_2895;
    }
}

