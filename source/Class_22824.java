/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

public class Class_22824 {
    private final Field Field_22825;
    private final Field Field_22826;
    private final Field Field_22827;
    private final Field Field_22828 = ClassLoader.class.getDeclaredField("loadedLibraryNames");
    private final Field Field_22829;

    public Class_22824() {
        this.Field_22828.setAccessible((2069 & 24769) != 0);
        this.Field_22827 = ClassLoader.class.getDeclaredField("systemNativeLibraries");
        this.Field_22827.setAccessible((-10993 & 129) != 0);
        this.Field_22829 = ClassLoader.class.getDeclaredField("nativeLibraries");
        this.Field_22829.setAccessible((-32507 & 13355) != 0);
        Class<?> class_ = null;
        Class<?>[] arrclass = ClassLoader.class.getDeclaredClasses();
        int n = arrclass.length;
        for (int i = 6216 & -15728; i < n; ++i) {
            Class<?> class_2 = arrclass[i];
            if (!class_2.getSimpleName().equals("NativeLibrary")) continue;
            class_ = class_2;
            break;
        }
        this.Field_22826 = class_.getDeclaredField("fromClass");
        this.Field_22826.setAccessible((21785 & 129) != 0);
        this.Field_22825 = class_.getDeclaredField("name");
        this.Field_22825.setAccessible((16939 & 2049) != 0);
    }

    private void Method_22830() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_22831() {
        try {
            Vector vector = (Vector)this.Field_22828.get(null);
            return vector;
        }
        catch (IllegalAccessException | IllegalArgumentException exception) {
            throw new AssertionError(exception);
        }
    }
}

