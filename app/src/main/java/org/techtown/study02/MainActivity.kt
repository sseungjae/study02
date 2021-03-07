package org.techtown.study02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var nS:Int = 0
    var nS2:Int = 0
    var nS3:Int = 0
    var nS4:Int = 0
    var nS5:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            var nSStr = numberSigned.text.toString()
            var nS2Str = numberSigned2.text.toString()
            var nS3Str = numberSigned3.text.toString()
            var nS4Str = numberSigned4.text.toString()
            var nS5Str = numberSigned5.text.toString()

            nS = nSStr.toInt()
            nS2 = nS2Str.toInt()
            nS3 = nS3Str.toInt()
            nS4 = nS4Str.toInt()
            nS5 = nS5Str.toInt()

            var result = nS + nS2 + nS3 + nS4 + nS5
            textView.setText("결과 : ${result}")

        }
    }
}