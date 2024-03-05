package me.rei1mu.bingcopilot
import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.permissionx.guolindev.PermissionX
import com.permissionx.guolindev.callback.RequestCallback

class MainActivity : TauriActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 请求所有需要的权限
        PermissionX.init(this)
            .permissions(
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.CAMERA,
                Manifest.permission.READ_CONTACTS,
                Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS,
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.WRITE_SETTINGS,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.MODIFY_AUDIO_SETTINGS,
                // 添加其他需要的权限...
            )
            .request(object : RequestCallback {
                override fun onResult(allGranted: Boolean, grantedList: List<String>, deniedList: List<String>) {
                    if (allGranted) {
                        // 所有权限已授予
                        // 在这里执行您的操作
                    } else {
                        // 有权限被拒绝
                        // 在这里处理拒绝权限的情况
                    }
                }
            })
    }
}
