package pdp.uz.a8_3androidlessons

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_dialog_view.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_btn.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val create = builder.create()
            val inflate = layoutInflater.inflate(R.layout.custom_dialog_view, null, false)
            create.setView(inflate)
            create.setCancelable(false)

            inflate.ok_btn.setOnClickListener {
                Toast.makeText(this, "Okay", Toast.LENGTH_SHORT).show()
                create.dismiss()
            }
            inflate.cancel_btn.setOnClickListener {
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
                create.dismiss()
            }
            create.show()
        }

    }
}