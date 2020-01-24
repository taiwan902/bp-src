/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public final class Class_47675
extends Class_47455 {
    final Class_45286 Field_47676;

    protected boolean Method_47677(Class_32692 class_32692) {
        int n = ((Class_37974)class_32692).Method_37975().Method_7129();
        if (n == (2668 & -24330)) {
            return (19 & -10235) != 0;
        }
        Class_16725 class_16725 = (Class_16725)Class_45286.Method_45296(this.Field_47676).poll();
        char c = class_16725.Method_16749().charAt(1155 & 6932);
        switch (c) {
            case 'H': {
                if (!Class_16725.Field_16734.Method_16744(class_16725)) break;
                return (137 & 2113) != 0;
            }
            case 'C': {
                if (n != (-19768 & 2248) || !Class_16725.Field_16729.Method_16744(class_16725)) break;
                Class_45286.Method_45292(this.Field_47676, (16529 & 8965) != 0);
                Class_45286.Method_45296(this.Field_47676).clear();
                return (13993 & 19) != 0;
            }
        }
        return super.isContentAlwaysEmpty(class_32692);
    }

    public void Method_47678(Class_39158 class_39158) {
        long l;
        super.channelInactive(class_39158);
        if (Class_45286.Method_45294(this.Field_47676) && (l = Class_45286.Method_45295(this.Field_47676).get()) > (135948557L & -4303826889006120448L)) {
            class_39158.Method_39162(new Class_12031("channel gone inactive with " + l + " missing response(s)"));
        }
    }

    protected void Method_47679(Class_39158 class_39158, Class_22553 class_22553, List list) {
        if (Class_45286.Method_45293(this.Field_47676)) {
            int n = this.actualReadableBytes();
            if (n == 0) {
                return;
            }
            list.add(class_22553.Method_22601(n));
        } else {
            int n = list.size();
            super.decode(class_39158, class_22553, list);
            if (Class_45286.Method_45294(this.Field_47676)) {
                int n2 = list.size();
                for (int i = n; i < n2; ++i) {
                    this.Method_47681(list.get(i));
                }
            }
        }
    }

    private void Method_47680() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_47681(Object object) {
        if (object == null) {
            return;
        }
        if (object instanceof Class_44416) {
            Class_45286.Method_45295(this.Field_47676).decrementAndGet();
        }
    }

    Class_47675(Class_45286 class_45286, int n, int n2, int n3, boolean bl) {
        this.Field_47676 = class_45286;
        super(n, n2, n3, bl);
    }
}

