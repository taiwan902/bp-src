/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27681
extends Class_26535 {
    final Class_20870 Field_27682;
    private final Class_1699 Field_27683;
    private final String Field_27684;

    private void Method_27685() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27681(Class_20870 class_20870, Class_1699 class_1699) {
        this(class_20870, class_1699.Method_1703("Properties"), class_1699.Method_1708("Type"), class_1699.Method_1738("Weight"));
    }

    static String Method_27686(Class_27681 class_27681) {
        return class_27681.Field_27684;
    }

    static Class_1699 Method_27687(Class_27681 class_27681) {
        return class_27681.Field_27683;
    }

    public Class_27681(Class_20870 class_20870, Class_1699 class_1699, String string) {
        this(class_20870, class_1699, string, -19867 & 1035);
    }

    public Class_1699 Method_27688() {
        Class_1699 class_1699 = new Class_1699();
        class_1699.Method_1744("Properties", this.Field_27683);
        class_1699.Method_1702("Type", this.Field_27684);
        class_1699.Method_1739("Weight", this.\u0000, `);
        return class_1699;
    }

    private Class_27681(Class_20870 class_20870, Class_1699 class_1699, String string, int n) {
        this.Field_27682 = class_20870;
        super(n);
        if (string.equals("Minecart")) {
            string = class_1699 != null ? Class_15120.Method_15150(class_1699.Method_1738("Type")).Method_15145() : "MinecartRideable";
        }
        this.Field_27683 = class_1699;
        this.Field_27684 = string;
    }
}

