package example.igorek.homeworkforlessonfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Я Вас люблю,")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Вы мне поверьте!")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Вот шлю я Вам")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Блоху в конверте.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"А Вы пишите мне ответ:")
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Блоха кусает или нет?")
    }
}