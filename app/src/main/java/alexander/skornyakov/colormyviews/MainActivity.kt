package alexander.skornyakov.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    fun setListeners(){
        val clickableViews: List<View> = listOf(
            layout,first_box,second_box,third_box,fourth_box,fifth_box,
            red_button,yellow_button,blue_button)
        for (view in clickableViews){
            view.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(box: View){
        when (box.id) {

            // Boxes using Color class colors for background
            R.id.first_box -> box.setBackgroundColor(Color.DKGRAY)
            R.id.second_box -> box.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.third_box -> box.setBackgroundResource(android.R.color.holo_green_light)
            R.id.fourth_box -> box.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.fifth_box -> box.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> fifth_box.setBackgroundColor(Color.RED)
            R.id.yellow_button -> fourth_box.setBackgroundColor(Color.YELLOW)
            R.id.blue_button -> second_box.setBackgroundColor(Color.BLUE)

            else -> box.setBackgroundColor(Color.LTGRAY)
        }
    }
}
