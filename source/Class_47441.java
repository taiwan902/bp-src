/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Ordering
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Class_47441
implements Class_14683,
Class_40184 {
    private final List Field_47442 = Lists.newArrayList();
    private static final Ordering Field_47443 = Ordering.from((Comparator)new Class_12131());

    public List Method_47444() {
        return this.Field_47442;
    }

    public boolean Method_47445() {
        return (!this.Field_47442.isEmpty() ? 4227 & -23735 : 18241 & 4100) != 0;
    }

    public Class_1782 Method_47446() {
        return new Class_2840("Teleport to player");
    }

    public Class_47441(Collection collection) {
        for (Class_9738 class_9738 : Field_47443.sortedCopy((Iterable)collection)) {
            if (class_9738.Method_9754() == Class_35650.Field_35654) continue;
            this.Field_47442.add(new Class_37196(class_9738.Method_9758()));
        }
    }

    private void Method_47447() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_47441() {
        this(Field_47443.sortedCopy((Iterable)Class_18.Field_89.Method_271().Method_20246()));
    }

    public Class_1782 Method_47448() {
        return new Class_2840("Select a player to teleport to");
    }

    public void Method_47449(Class_10233 class_10233) {
        class_10233.Method_10246(this);
    }

    public void Method_47450(float f, int n) {
        Class_18.Field_89.Method_253().Method_34707(Class_37026.Field_37030);
        Class_1551.Method_1566(22792 & -31679, -16368 & 8193, 0.0f, 0.0f, 85 & 8498, 11572 & 20624, 94.315796f * 2.7142856f, 1280.0f * 0.2f);
    }
}

