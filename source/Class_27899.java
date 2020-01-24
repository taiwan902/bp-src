/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Class_27899
extends Class_23171
implements Closeable {
    private ZipFile Field_27900;
    public static final Splitter Field_27901 = Splitter.on((char)(20975 & -31169)).omitEmptyStrings().limit(4995 & 15);

    public Set Method_27902() {
        ZipFile zipFile;
        try {
            zipFile = this.Method_27903();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        HashSet hashSet = Sets.newHashSet();
        while (enumeration.hasMoreElements()) {
            ArrayList arrayList;
            ZipEntry zipEntry = enumeration.nextElement();
            String string = zipEntry.getName();
            if (!string.startsWith("assets/") || (arrayList = Lists.newArrayList((Iterable)Field_27901.split((CharSequence)string))).size() <= (17473 & 2321)) continue;
            String string2 = (String)arrayList.get(10525 & 4225);
            if (!string2.equals(string2.toLowerCase())) {
                this.\u0000strictfp(string2);
                continue;
            }
            hashSet.add(string2);
        }
        return hashSet;
    }

    private ZipFile Method_27903() {
        if (this.Field_27900 == null) {
            this.Field_27900 = new ZipFile(this.\u0000strictfp);
        }
        return this.Field_27900;
    }

    public void Method_27904() {
        if (this.Field_27900 != null) {
            this.Field_27900.close();
            this.Field_27900 = null;
        }
    }

    private void Method_27905() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_27906(String string) {
        try {
            return (this.Method_27903().getEntry(string) != null ? 257 & 28915 : 17156 & 12296) != 0;
        }
        catch (IOException iOException) {
            return (4200 & 17153) != 0;
        }
    }

    public Class_27899(File file) {
        super(file);
    }

    protected void Method_27907() {
        this.Method_27904();
        Object.super.finalize();
    }

    protected InputStream Method_27908(String string) {
        ZipFile zipFile = this.Method_27903();
        ZipEntry zipEntry = zipFile.getEntry(string);
        if (zipEntry == null) {
            throw new Class_12143(this.\u0000strictfp, string);
        }
        return zipFile.getInputStream(zipEntry);
    }
}

