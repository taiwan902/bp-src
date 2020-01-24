/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000try break ! char ` do switch 3 ] 
 *  \u0000try break ! char ` do switch 3 ] $ 4 
 *  \u0000try break ! char ` do switch 3 ] $ 4 $ byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Class_23232
implements Class_16547 {
    private Class_2190 Field_23233;
    private final Class_22368 Field_23234;
    private final HashMap Field_23235 = Maps.newHashMap();
    private boolean Field_23236 = 197 & 4113;
    private final \u0000try break ! char ` do switch 3 ] . 4 . byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected Field_23237;
    private final HashMap Field_23238 = Maps.newHashMap();
    private final HashMap Field_23239 = Maps.newHashMap();
    private Class_2190 Field_23240 = new Class_2190(0.0, Class_2205.Field_2234);

    private double Method_23241() {
        double d = this.Method_23245();
        for (Class_10375 class_10375 : this.Method_23247(388 & 9)) {
            d += class_10375.Method_10382();
        }
        double d2 = d;
        for (Class_10375 class_10375 : this.Method_23247(18433 & 41)) {
            d2 += d * class_10375.Method_10382();
        }
        for (Class_10375 class_10375 : this.Method_23247(14378 & 1414)) {
            d2 *= 1.0 + class_10375.Method_10382();
        }
        return this.Field_23234.Method_22372(d2);
    }

    protected void Method_23242() {
        this.Field_23236 = 24577 & -29919;
        this.Field_23237.\u0000strictfp((Class_16547)this);
    }

    public Class_23232(\u0000try break ! char ` do switch 3 ] . 4 . byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected  byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected2, Class_22368 class_22368) {
        this.Field_23237 =  byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected2;
        this.Field_23234 = class_22368;
        this.Field_23233 = new Class_2190(class_22368.Method_22371(), Class_2205.Field_2234);
        for (int i = 259 & 8328; i < (17667 & 4107); ++i) {
            this.Field_23239.put(i, Sets.newHashSet());
        }
    }

    public void Method_23243(Class_10375 class_10375) {
        if (this.Method_23252(class_10375.Method_10381()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        Set set = (Set)this.Field_23235.get(class_10375.Method_10388());
        if (set == null) {
            set = Sets.newHashSet();
            this.Field_23235.put(class_10375.Method_10388(), set);
        }
        ((Set)this.Field_23239.get(class_10375.Method_10389())).add(class_10375);
        set.add(class_10375);
        this.Field_23238.put(class_10375.Method_10381(), class_10375);
        this.Method_23242();
    }

    public void Method_23244() {
        Collection collection = this.Method_23253();
        if (collection != null) {
            for (Class_10375 class_10375 : Lists.newArrayList((Iterable)collection)) {
                this.Method_23248(class_10375);
            }
        }
    }

    public double Method_23245() {
        return this.Field_23233.Method_2199();
    }

    public void Method_23246(double d) {
        if (d != this.Method_23245()) {
            this.Field_23233.Method_2202(d);
            this.Method_23242();
        }
    }

    private Collection Method_23247(int n) {
        HashSet hashSet = Sets.newHashSet((Iterable)this.Method_23255(n));
        for (Class_22368 class_22368 = this.Field_23234.Method_22370(); class_22368 != null; class_22368 = class_22368.Method_22370()) {
            Class_16547 class_16547 = this.Field_23237.\u0000, `(class_22368);
            if (class_16547 == null) continue;
            hashSet.addAll(class_16547.Method_16553(n));
        }
        return hashSet;
    }

    public void Method_23248(Class_10375 class_10375) {
        for (int i = 258 & 24576; i < (9223 & 6147); ++i) {
            HashSet hashSet = (HashSet)this.Field_23239.get(i);
            hashSet.remove(class_10375);
        }
        Set set = (Set)this.Field_23235.get(class_10375.Method_10388());
        if (set != null) {
            set.remove(class_10375);
            if (set.isEmpty()) {
                this.Field_23235.remove(class_10375.Method_10388());
            }
        }
        this.Field_23238.remove(class_10375.Method_10381());
        this.Method_23242();
    }

    public double Method_23249() {
        if (this.Field_23236) {
            this.Field_23240.Method_2202(this.Method_23241());
            this.Field_23236 = -24572 & 19600;
        }
        return this.Field_23240.Method_2199();
    }

    private void Method_23250() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_23251(Class_10375 class_10375) {
        return (this.Field_23238.get(class_10375.Method_10381()) != null ? 1291 & -32767 : 792 & -11264) != 0;
    }

    public Class_10375 Method_23252(UUID uUID) {
        return (Class_10375)this.Field_23238.get(uUID);
    }

    public Collection Method_23253() {
        HashSet hashSet = Sets.newHashSet();
        for (int i = 6944 & 17484; i < (8787 & 2347); ++i) {
            hashSet.addAll(this.Method_23255(i));
        }
        return hashSet;
    }

    public Class_22368 Method_23254() {
        return this.Field_23234;
    }

    public Collection Method_23255(int n) {
        return (Collection)this.Field_23239.get(n);
    }
}

