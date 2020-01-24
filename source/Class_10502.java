/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.SettableFuture
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.comparator.LastModifiedFileComparator
 *  org.apache.commons.io.filefilter.IOFileFilter
 *  org.apache.commons.io.filefilter.TrueFileFilter
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_10502 {
    private static final FileFilter Field_10503;
    private List Field_10504 = Lists.newArrayList();
    private final ReentrantLock Field_10505 = new ReentrantLock();
    private Class_2035 Field_10506;
    public final Class_2793 Field_10507;
    private final File Field_10508;
    public final Class_2035 Field_10509;
    private static final Logger Field_10510;
    private ListenableFuture Field_10511;
    private final File Field_10512;
    private List Field_10513 = Lists.newArrayList();

    public void Method_10514(List list) {
        this.Field_10513.clear();
        this.Field_10513.addAll(list);
    }

    public List Method_10515() {
        return ImmutableList.copyOf((Collection)this.Field_10504);
    }

    public void Method_10516() {
        this.Field_10505.lock();
        try {
            if (this.Field_10511 != null) {
                this.Field_10511.cancel((22545 & -30839) != 0);
            }
            this.Field_10511 = null;
            if (this.Field_10506 != null) {
                this.Field_10506 = null;
                Class_18.Field_89.Method_235();
            }
        }
        finally {
            this.Field_10505.unlock();
        }
    }

    static {
        Field_10510 = LogManager.getLogger();
        Field_10503 = new Class_14373();
    }

    public void Method_10517() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.Method_10518()) {
            Class_10400 class_10400 = new Class_10400(this, (File)object, null);
            if (!this.Field_10504.contains(class_10400)) {
                try {
                    class_10400.Method_10412();
                    arrayList.add(class_10400);
                }
                catch (Exception exception) {
                    arrayList.remove(class_10400);
                }
                continue;
            }
            int n = this.Field_10504.indexOf(class_10400);
            if (n <= (-1 & -1) || n >= this.Field_10504.size()) continue;
            arrayList.add(this.Field_10504.get(n));
        }
        this.Field_10504.removeAll(arrayList);
        for (Object object : this.Field_10504) {
            ((Class_10400)object).Method_10416();
        }
        this.Field_10504 = arrayList;
    }

    private List Method_10518() {
        return this.Field_10512.isDirectory() ? Arrays.asList(this.Field_10512.listFiles(Field_10503)) : Collections.emptyList();
    }

    public File Method_10519() {
        return this.Field_10512;
    }

    public List Method_10520() {
        return ImmutableList.copyOf((Collection)this.Field_10513);
    }

    public Class_2035 Method_10521() {
        return this.Field_10506;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture Method_10522(String string, String string2) {
        String string3 = string2.matches("^[a-f0-9]{40}$") ? string2 : "legacy";
        File file = new File(this.Field_10508, string3);
        this.Field_10505.lock();
        try {
            ListenableFuture listenableFuture;
            Object object;
            this.Method_10516();
            if (file.exists() && string2.length() == (4136 & -32456)) {
                block8 : {
                    ListenableFuture listenableFuture2;
                    object = Hashing.sha1().hashBytes(Files.toByteArray((File)file)).toString();
                    if (!((String)object).equals(string2)) break block8;
                    ListenableFuture listenableFuture3 = listenableFuture2 = this.Method_10524(file);
                    return listenableFuture3;
                }
                try {
                    Field_10510.warn("File " + file + " had wrong hash (expected " + string2 + ", found " + (String)object + "). Deleting it.");
                    FileUtils.deleteQuietly((File)file);
                }
                catch (IOException iOException) {
                    Field_10510.warn("File " + file + " couldn't be hashed. Deleting it.", (Throwable)iOException);
                    FileUtils.deleteQuietly((File)file);
                }
            }
            this.Method_10523();
            object = new Class_46470();
            Map map = Class_18.Method_212();
            Class_18 class_18 = Class_18.Field_89;
            Futures.getUnchecked((Future)class_18.Method_229(new Class_33332(this, class_18, (Class_46470)object)));
            SettableFuture settableFuture = SettableFuture.create();
            this.Field_10511 = Class_32476.Method_32483(file, string, map, 589308021 & 1136169352, (Class_2748)object, class_18.Method_236());
            Futures.addCallback((ListenableFuture)this.Field_10511, (FutureCallback)new Class_17890(this, file, settableFuture));
            ListenableFuture listenableFuture4 = listenableFuture = this.Field_10511;
            return listenableFuture4;
        }
        finally {
            this.Field_10505.unlock();
        }
    }

    public Class_10502(File file, File file2, Class_2035 class_2035, Class_2793 class_2793, Class_39702 class_39702) {
        this.Field_10512 = file;
        this.Field_10508 = file2;
        this.Field_10509 = class_2035;
        this.Field_10507 = class_2793;
        this.Method_10525();
        this.Method_10517();
        Iterator iterator = class_39702.Field_39875.iterator();
        block0 : while (iterator.hasNext()) {
            String string = (String)iterator.next();
            for (Class_10400 class_10400 : this.Field_10504) {
                if (!class_10400.Method_10411().equals(string)) continue;
                if (class_10400.Method_10415() == (13457 & -32179) || class_39702.Field_39737.contains(class_10400.Method_10411())) {
                    this.Field_10513.add(class_10400);
                    continue block0;
                }
                iterator.remove();
                Object[] arrobject = new Object[1 & 4295];
                arrobject[-29615 & 8454] = class_10400.Method_10411();
                Field_10510.warn("Removed selected resource pack {} because it's no longer compatible", arrobject);
            }
        }
    }

    private void Method_10523() {
        if (!this.Field_10508.isDirectory()) {
            this.Field_10508.mkdirs();
        }
        ArrayList arrayList = Lists.newArrayList((Iterable)FileUtils.listFiles((File)this.Field_10508, (IOFileFilter)TrueFileFilter.TRUE, (IOFileFilter)null));
        Collections.sort(arrayList, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int n = 336 & 21636;
        for (File file : arrayList) {
            if (n++ < (18651 & 12334)) continue;
            Field_10510.info("Deleting old server resource pack " + file.getName());
            FileUtils.deleteQuietly((File)file);
        }
    }

    public ListenableFuture Method_10524(File file) {
        if (Class_11612.Method_11625(file) != null) {
            return Class_11612.Method_11630(file);
        }
        this.Field_10506 = new Class_27899(file);
        return Class_18.Field_89.Method_235();
    }

    private void Method_10525() {
        if (this.Field_10512.exists()) {
            if (!(this.Field_10512.isDirectory() || this.Field_10512.delete() && this.Field_10512.mkdirs())) {
                Field_10510.warn("Unable to recreate resourcepack folder, it exists but is not a directory: " + this.Field_10512);
            }
        } else if (!this.Field_10512.mkdirs()) {
            Field_10510.warn("Unable to create resourcepack folder: " + this.Field_10512);
        }
    }

    private void Method_10526() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

