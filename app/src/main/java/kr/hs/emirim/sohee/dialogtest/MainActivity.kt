package kr.hs.emirim.sohee.dialogtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnItem:Button
    lateinit var textResult: TextView
    lateinit var img : ImageView
    var versionArray = arrayOf("하프라이프 시리즈","포탈 시리즈","라스트 오브 어스 : 파트1")
    var gameImgRes = arrayOf(R.drawable.halflife,R.drawable.aperture,R.drawable.lastofus)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnItem = findViewById(R.id.btn_item)
        textResult = findViewById(R.id.text_result)
        img = findViewById(R.id.img)
        
        btnItem.setOnClickListener{
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 게임은?")
            dlg.setIcon(R.drawable.chat)
            dlg.setItems(versionArray){dialog,index ->
                textResult.text = versionArray[index]
                img.setImageResource(gameImgRes[index])
            }
            dlg.setNegativeButton("닫기",null)
            dlg.show()
        }
    }
}