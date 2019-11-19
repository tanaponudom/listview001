package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("SET"
                            ,"A"
                            ,"AAV"
                            ,"ABPIF","ACC","ACE","ADVANC","AEC","AEONTS","AFC","AH","AHC","AI"
        ,"AIMCG","AIMIRT","AIT","AJ","AJA","AKR","ALLA")
    val stocknameArr = arrayOf("ตลาดหลักทรัพย์ไทย","บริษัท อารียา พรอพเพอร์ตี้ จำกัด (มหาชน)"
        ,"บริษัท เอเชีย เอวิเอชั่น จำกัด (มหาชน)"
        ,"กองทุนรวมโครงสร้างพื้นฐานโรงไฟฟ้า อมตะ บี.กริม เพาเวอร์"
        ,"บริษัท แอดวานซ์ คอนเนคชั่น คอร์ปอเรชั่น จำกัด (มหาชน)"
        ,"บริษัท แอ๊บโซลูท คลีน เอ็นเนอร์จี้ จำกัด (มหาชน)"
        ,"บริษัท แอดวานซ์ อินโฟร์ เซอร์วิส จำกัด (มหาชน)"
        ,"บริษัทหลักทรัพย์ เออีซี จำกัด (มหาชน)"
        ,"บริษัท อิออน ธนสินทรัพย์ (ไทยแลนด์) จำกัด (มหาชน)"
        ,"บริษัท เอเซียไฟเบอร์ จำกัด (มหาชน)"
        ,"บริษัท อาปิโก ไฮเทค จำกัด (มหาชน)"
        ,"บริษัท โรงพยาบาลเอกชล จำกัด (มหาชน)"
        ,"บริษัท เอเชียน อินซูเลเตอร์ จำกัด (มหาชน)"
        ,"ทรัสต์เพื่อการลงทุนในสิทธิการเช่าอสังหาริมทรัพย์ เอไอเอ็ม คอมเมอร์เชียล โกรท"
        ,"ทรัสต์เพื่อการลงทุนในอสังหาริมทรัพย์และสิทธิการเช่าอสังหาริมทรัพย์ เอไอเอ็ม อินดัสเทรียล โกรท"
        ,"บริษัท แอ็ดวานซ์ อินฟอร์เมชั่น เทคโนโลยี จำกัด (มหาชน)"
        ,"บริษัท เอ.เจ.พลาสท์ จำกัด (มหาชน)"
        ,"บริษัท เอเจ แอดวานซ์ เทคโนโลยี จำกัด (มหาชน)"
        ,"บริษัท เอกรัฐวิศวกรรม จำกัด (มหาชน)"
        ,"บริษัท ออลล่า จำกัด (มหาชน)")

    val context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Thai Stock")

        val mAdp = ArrayAdapter(context,android.R.layout.simple_list_item_1,titleArr)

        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(context,
                "${titleArr[position]} ,หุ้น ${stocknameArr[position]}"
                ,Toast.LENGTH_LONG).show()

        }
    }
}
