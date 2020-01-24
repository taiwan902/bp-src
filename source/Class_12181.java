/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import java.util.Set;

public class Class_12181 {
    private static final int Field_12182 = Class_4595.Method_4630().length;
    private final BitSet Field_12183 = new BitSet(Field_12182 * Field_12182);

    public String Method_12184() {
        Class_4595 class_4595;
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char)(1059 & 2208));
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n2 = arrclass_4595.length;
        for (n = 17920 & 2; n < n2; ++n) {
            class_4595 = arrclass_4595[n];
            stringBuilder.append((char)(25632 & 4136)).append(class_4595.Method_4621().toUpperCase().charAt(132 & 5442));
        }
        stringBuilder.append((char)(-32374 & 19034));
        arrclass_4595 = Class_4595.Method_4630();
        n2 = arrclass_4595.length;
        for (n = -24570 & 4608; n < n2; ++n) {
            class_4595 = arrclass_4595[n];
            stringBuilder.append(class_4595.Method_4621().toUpperCase().charAt(-29947 & 20482));
            Class_4595[] arrclass_45952 = Class_4595.Method_4630();
            int n3 = arrclass_45952.length;
            for (int i = 14788 & -31743; i < n3; ++i) {
                boolean bl;
                Class_4595 class_45952 = arrclass_45952[i];
                if (class_4595 == class_45952) {
                    stringBuilder.append("  ");
                    continue;
                }
                stringBuilder.append((char)(-12124 & 113)).append((char)((bl = this.Method_12186(class_4595, class_45952)) ? -14213 & 9565 : 366 & 11374));
            }
            stringBuilder.append((char)(8811 & -16358));
        }
        return stringBuilder.toString();
    }

    public void Method_12185(boolean bl) {
        this.Field_12183.set(2186 & 16, this.Field_12183.size(), bl);
    }

    public boolean Method_12186(Class_4595 class_4595, Class_4595 class_45952) {
        return this.Field_12183.get(class_4595.ordinal() + class_45952.ordinal() * Field_12182);
    }

    public void Method_12187(Set set) {
        for (Class_4595 class_4595 : set) {
            for (Class_4595 class_45952 : set) {
                this.Method_12188(class_4595, class_45952, (525 & 12417) != 0);
            }
        }
    }

    public void Method_12188(Class_4595 class_4595, Class_4595 class_45952, boolean bl) {
        this.Field_12183.set(class_4595.ordinal() + class_45952.ordinal() * Field_12182, bl);
        this.Field_12183.set(class_45952.ordinal() + class_4595.ordinal() * Field_12182, bl);
    }

    private void Method_12189() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

