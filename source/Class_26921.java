/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 *  org.apache.commons.io.filefilter.IOFileFilter
 */
import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;

public class Class_26921
extends Class_23171 {
    public Set Method_26922() {
        HashSet hashSet = Sets.newHashSet();
        File file = new File(this.\u0000strictfp, "assets/");
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY);
            int n = arrfile.length;
            for (int i = -8152 & 3089; i < n; ++i) {
                File file2 = arrfile[i];
                String string = Class_26921.\u0000strictfp((File)file, (File)file2);
                if (!string.equals(string.toLowerCase())) {
                    this.\u0000strictfp(string);
                    continue;
                }
                hashSet.add(string.substring(7754 & -15968, string.length() - (16401 & 583)));
            }
        }
        return hashSet;
    }

    public Class_26921(File file) {
        super(file);
    }

    protected boolean Method_26923(String string) {
        return new File(this.\u0000strictfp, string).isFile();
    }

    protected InputStream Method_26924(String string) {
        return new BufferedInputStream(new FileInputStream(new File(this.\u0000strictfp, string)));
    }

    private void Method_26925() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

