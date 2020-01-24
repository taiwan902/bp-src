/*
 * Decompiled with CFR 0.145.
 */
import java.awt.Rectangle;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_25605
implements Class_23295 {
    public String[] Method_25606(Class_42376 class_42376, int n) {
        if (!(class_42376 instanceof Class_22776)) {
            return null;
        }
        Class_22776 class_22776 = (Class_22776)((Object)class_42376);
        Class_6340 class_6340 = class_22776.Method_22777();
        String[] arrstring = Class_25605.Method_25609(class_6340.Method_6533());
        return arrstring;
    }

    public boolean Method_25607() {
        return (-24576 & 5513) != 0;
    }

    private void Method_25608() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String[] Method_25609(String string) {
        String string2;
        String string3;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 6441 & 1170; i < (6158 & -32757) && (string3 = Class_14688.Method_14698(string2 = string + ".tooltip." + (i + (-22107 & 515)), null)) != null; ++i) {
            arrayList.add(string3);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    public Rectangle Method_25610(Class_1490 class_1490, int n, int n2) {
        int n3 = class_1490.Field_1507 / (16458 & 2706) - (7318 & -32354);
        int n4 = class_1490.Field_1493 / (10279 & 4702) - (4111 & 8711);
        if (n2 <= n4 + (4198 & 8290)) {
            n4 += 105;
        }
        int n5 = n3 + (478 & 663) + (20631 & -24362);
        int n6 = n4 + (4180 & -29474) + (15246 & -16358);
        return new Rectangle(n3, n4, n5 - n3, n6 - n4);
    }
}

