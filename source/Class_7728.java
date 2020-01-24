/*
 * Decompiled with CFR 0.145.
 */
public interface Class_7728 {
    public long Method_7729();

    @Deprecated
    default public int Method_7730() {
        return (int)Math.min(Integer.MAX_VALUE & Integer.MAX_VALUE, this.Method_7729());
    }
}

