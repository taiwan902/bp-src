/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class Class_10375 {
    private boolean Field_10376 = 8711 & 3481;
    public final UUID Field_10377;
    private final String Field_10378;
    private final Class_2190 Field_10379;
    private final int Field_10380;

    public UUID Method_10381() {
        return this.Field_10377;
    }

    public double Method_10382() {
        return this.Field_10379.Method_2199();
    }

    public Class_10375(UUID uUID, String string, double d, int n) {
        this.Field_10377 = uUID;
        this.Field_10378 = string;
        this.Field_10379 = new Class_2190(d, Class_2205.Field_2234);
        this.Field_10380 = n;
        Validate.notEmpty((CharSequence)string, (String)"Modifier name cannot be empty", (Object[])new Object[10496 & -27622]);
        Validate.inclusiveBetween((Object)(-6956202068444826368L & 6956202067751108640L), (Object)(-163826416493684990L & 163826416346333190L), (Comparable)Long.valueOf(n), (String)"Invalid operation", (Object[])new Object[2048 & 4235]);
    }

    public Class_10375(String string, double d, int n) {
        this(Class_13337.Method_13390(Class_32341.Method_32350()), string, d, n);
    }

    public String Method_10383() {
        return "AttributeModifier{amount=" + this.Field_10379 + ", operation=" + this.Field_10380 + ", name='" + this.Field_10378 + (char)(4143 & -16073) + ", id=" + this.Field_10377 + ", serialize=" + this.Field_10376 + (char)(13437 & -16001);
    }

    public boolean Method_10384() {
        return this.Field_10376;
    }

    public boolean Method_10385(Object object) {
        if (this == object) {
            return (1281 & 2593) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Class_10375 class_10375 = (Class_10375)object;
            if (this.Field_10377 != null) {
                if (!this.Field_10377.equals(class_10375.Field_10377)) {
                    return (-32604 & 8962) != 0;
                }
            } else if (class_10375.Field_10377 != null) {
                return (1 & 4098) != 0;
            }
            return (-30717 & 1889) != 0;
        }
        return (28745 & 1300) != 0;
    }

    public Class_10375 Method_10386(boolean bl) {
        this.Field_10376 = bl;
        return this;
    }

    public int Method_10387() {
        return this.Field_10377 != null ? this.Field_10377.hashCode() : -16188 & 2067;
    }

    public String Method_10388() {
        return this.Field_10378;
    }

    public int Method_10389() {
        return this.Field_10380;
    }

    private void Method_10390() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

