package org.sopt.gitlab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // feature1 기능 구현
        // main에서 변경사항 발생 -> 다른브랜치에서 rebase 할거임
    }
}
