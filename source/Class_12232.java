/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;

public class Class_12232 {
    private boolean Field_12233 = 16538 & -30656;
    private Field Field_12234 = null;
    private Class_21269 Field_12235 = null;
    private String Field_12236 = null;

    public Class_12232(Class_21269 class_21269, String string) {
        this.Field_12235 = class_21269;
        this.Field_12236 = string;
        Field field = this.Method_12238();
    }

    public boolean Method_12237() {
        return (this.Field_12233 ? (this.Field_12234 != null ? -20429 & 1409 : -30511 & 4096) : (this.Method_12238() != null ? -32127 & 29793 : -32755 & 5696)) != 0;
    }

    public Field Method_12238() {
        if (this.Field_12233) {
            return this.Field_12234;
        }
        this.Field_12233 = 16525 & 11041;
        Class class_ = this.Field_12235.Method_21274();
        if (class_ == null) {
            return null;
        }
        try {
            this.Field_12234 = class_.getDeclaredField(this.Field_12236);
            if (!this.Field_12234.isAccessible()) {
                this.Field_12234.setAccessible((-14831 & 14601) != 0);
            }
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Class_19426.Method_19497("(Reflector) Field not present: " + class_.getName() + "." + this.Field_12236);
        }
        return this.Field_12234;
    }

    private void Method_12239() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

