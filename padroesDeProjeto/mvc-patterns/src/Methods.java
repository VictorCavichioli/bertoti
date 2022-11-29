import java.io.File;
import java.lang.management.ManagementFactory;
import java.text.NumberFormat;
import java.util.Locale;

public class Methods {
    private static final long KB = 1024;
    private static final long MB = 1024 * KB;
    private static final long GB = 1024 * MB;
    private static final long TB = 1024 * GB;
    public static final com.sun.management.OperatingSystemMXBean OS_BEAN =
        (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

    private static String formatDouble(double d) {
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("PT", "BR"));
        nf.setMaximumFractionDigits(2);
        return nf.format(d);
    }

    private static String formatBytes(long b) {
        return b >= TB ? formatDouble(b / (double) TB) + " TB"
                : b >= GB ? formatDouble(b / (double) GB) + " GB"
                : b >= MB ? formatDouble(b / (double) MB) + " MB"
                : b >= KB ? formatDouble(b / (double) KB) + " KB"
                : b + " bytes";
    }

    public static String printMemoryUsage() {
        //Runtime r = Runtime.getRuntime();
        //long jvmTotal = r.totalMemory();
        //long jvmFree = r.freeMemory();
        //long jvmUsed = jvmTotal - jvmFree;
        long total = OS_BEAN.getTotalPhysicalMemorySize();
        long free = OS_BEAN.getFreePhysicalMemorySize();
        long used = total - free;
        System.out.println("Total Memory: " + formatBytes(total));
        System.out.println("Memory Used: " + formatBytes(used));
        System.out.println("Memory Free: " + formatBytes(free));
        System.out.println("Percent Used: " + formatDouble(100 * used / (double) total) + "%");
        System.out.println("Percent Free: " + formatDouble(100 * free / (double) total) + "%");
        return (formatDouble(100 * used / (double) total) + "%").toString();
    }

    public static String printDiskUsage(String disk) {
        File diskPartition = new File(disk + ":");
        long total = diskPartition.getTotalSpace();
        long free = diskPartition.getFreeSpace();
        long usable = diskPartition.getUsableSpace();
        System.out.println("Total space in drive " + disk + ": " + formatBytes(total));
        System.out.println("Free space in drive " + disk + ": " + formatBytes(free));
        System.out.println("Usable space in drive " + disk + ": " + formatBytes(usable));

        return formatBytes(usable).toString();
    }

    public static void printDiskUsage(String... disks) {
        for (String disk : disks) {
            printDiskUsage(disk);
        }
    }

    public String printCpuUsage(){
        Double cpu = OS_BEAN.getSystemCpuLoad() * 100;

        return cpu.toString();
    }

}
