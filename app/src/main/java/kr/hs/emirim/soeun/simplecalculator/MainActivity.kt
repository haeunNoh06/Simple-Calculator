package kr.hs.emirim.soeun.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.sql.RowId

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;
    lateinit var edit2 : EditText;
    lateinit var btnAdd : Button;
    lateinit var btnSub : Button;
    lateinit var btnMul : Button;
    lateinit var btnDiv : Button;
    lateinit var btnInit : Button;
    lateinit var textResult : TextView;
    lateinit var num1 : String;
    lateinit var num2 : String;
    var result : Int? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        textResult = findViewById(R.id.text_result)
        btnAdd = findViewById(R.id.btn_plus)
        btnSub = findViewById(R.id.btn_minus)
        btnMul = findViewById(R.id.btn_multiply)
        btnDiv = findViewById(R.id.btn_divide)
        btnInit = findViewById(R.id.btn_init)

        btnAdd.setOnClickListener {
            num1 = edit1.text.toString();
            num2 = edit2.text.toString();
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
            textResult.text = "계산 결과 : "+result;
        }
        btnSub.setOnClickListener {
            num1 = edit1.text.toString();
            num2 = edit2.text.toString();
            result = Integer.parseInt(num1) - Integer.parseInt(num2);
            textResult.text = "계산 결과 : "+result;
        }
        btnMul.setOnClickListener {
            num1 = edit1.text.toString();
            num2 = edit2.text.toString();
            result = Integer.parseInt(num1) * Integer.parseInt(num2);
            textResult.text = "계산 결과 : "+result;
        }
        btnDiv.setOnClickListener {
            num1 = edit1.text.toString();
            num2 = edit2.text.toString();
            result = Integer.parseInt(num1) / Integer.parseInt(num2);
            textResult.text = "계산 결과 : "+result;
        }
        btnInit.setOnClickListener {
            textResult.text = "계산 결과 : ";
        }
    }
}