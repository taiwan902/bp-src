/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.ReadableVector3f
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import internal.org.lwjgl.util.vector.ReadableVector3f;
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12058 {
    public final Vector3f Field_12059;
    public final Vector3f Field_12060;
    public static final Class_12058 Field_12061 = new Class_12058(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    public final Vector3f Field_12062;

    private void Method_12063() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_12064(Object object) {
        if (this == object) {
            return (-16379 & 3457) != 0;
        }
        if (this.getClass() != object.getClass()) {
            return (10848 & 0) != 0;
        }
        Class_12058 class_12058 = (Class_12058)object;
        return (!this.Field_12062.equals((Object)class_12058.Field_12062) ? 24834 & 545 : (!this.Field_12059.equals((Object)class_12058.Field_12059) ? 12868 & -31743 : (int)(this.Field_12060.equals((Object)class_12058.Field_12060) ? 1 : 0))) != 0;
    }

    public int Method_12065() {
        int n = this.Field_12062.hashCode();
        n = (415 & 5759) * n + this.Field_12060.hashCode();
        n = (8287 & 19775) * n + this.Field_12059.hashCode();
        return n;
    }

    public Class_12058(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        this.Field_12062 = new Vector3f((ReadableVector3f)vector3f);
        this.Field_12060 = new Vector3f((ReadableVector3f)vector3f2);
        this.Field_12059 = new Vector3f((ReadableVector3f)vector3f3);
    }
}

