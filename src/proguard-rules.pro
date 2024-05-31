# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.switchbuttonenable.SwitchButtonEnable {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/switchbuttonenable/repack'
-flattenpackagehierarchy
-dontpreverify
