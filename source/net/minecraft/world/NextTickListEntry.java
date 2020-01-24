/*
 * Decompiled with CFR 0.145.
 */
package net.minecraft.world;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NextTickListEntry
implements Comparable {
    private long tickEntryID;
    public final Class_4751 position;
    public long scheduledTime;
    private final Class_3238 block;
    public int priority;
    private static long nextTickEntryID;

    private void \u0000break short " char boolean catch , 9 { package short const native int byte static short { false do ' char 7 catch 2 3 long interface synchronized ] public new static transient const byte static private throw ^ ' float continue static ~ ^ double , short long() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int compareTo(NextTickListEntry nextTickListEntry) {
        return this.scheduledTime < nextTickListEntry.scheduledTime ? -1 & -1 : (this.scheduledTime > nextTickListEntry.scheduledTime ? 16387 & -21103 : (this.priority != nextTickListEntry.priority ? this.priority - nextTickListEntry.priority : (this.tickEntryID < nextTickListEntry.tickEntryID ? -1 & -1 : (this.tickEntryID > nextTickListEntry.tickEntryID ? 13205 & 18465 : 9648 & 1))));
    }

    public int compareTo(Object object) {
        return this.compareTo((NextTickListEntry)object);
    }

    public String toString() {
        return Class_3238.Method_3435(this.block) + ": " + this.position + ", " + this.scheduledTime + ", " + this.priority + ", " + this.tickEntryID;
    }

    public boolean equals(Object object) {
        if (!(object instanceof NextTickListEntry)) {
            return (-18362 & 33) != 0;
        }
        NextTickListEntry nextTickListEntry = (NextTickListEntry)object;
        return (this.position.equals(nextTickListEntry.position) && Class_3238.Method_3335(this.block, nextTickListEntry.block) ? -32613 & 4161 : 9280 & -14192) != 0;
    }

    public Class_3238 getBlock() {
        return this.block;
    }

    public void setPriority(int n) {
        this.priority = n;
    }

    public NextTickListEntry(Class_4751 class_4751, Class_3238 class_3238) {
        if (class_4751 instanceof Class_4810) {
            throw new RuntimeException("can't create tick entry out of mutable block pos");
        }
        long l = nextTickEntryID;
        nextTickEntryID = l + (472140201L & 554731013L);
        this.tickEntryID = l;
        this.position = class_4751;
        this.block = class_3238;
    }

    public NextTickListEntry setScheduledTime(long l) {
        this.scheduledTime = l;
        return this;
    }

    public int hashCode() {
        return this.position.hashCode() ^ this.block.hashCode();
    }
}

