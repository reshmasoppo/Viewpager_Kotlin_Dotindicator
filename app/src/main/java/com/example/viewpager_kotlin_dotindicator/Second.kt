package com.example.viewpager_kotlin_dotindicator

/*package com.example.demoecommerce_kotlin
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.viewpagerindicator.CirclePageIndicator
import kotlinx.android.synthetic.main.fragment_splash_screen.*
import java.nio.file.Files.size
import android.widget.ImageView as ImageView1

class Splash_screen : AppCompatActivity()
{
    private var dotscount: Int = 0
    private var viewPgIndex: Int = 0

    lateinit var pager1:ViewPager
    private var imageModelArrayList: ArrayList<ImageModel>? = null

    lateinit var Buttn_Signup:Button
    lateinit var m_indi:TextView
    private var adapter: PagerAdapter? = null
    private var sliderDotspanel: LinearLayout? = null

    private var dots= ArrayList<ImageView1>()


    private val myImageList = intArrayOf(R.drawable.img_1,
        R.drawable.img_2, R.drawable.img_3)

    val myTextList= arrayOf("Travel to the top of the Space Needle's 520 ft",
        "Range of the Pacific Northwest and the highest mountain",
        "The Museum of Flight is a private non-profit air")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash_screen)
        Buttn_Signup = findViewById(R.id.butn_signup)
        supportActionBar?.hide()
        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()

        pager1 = findViewById<ViewPager>(R.id.Pager)
        sliderDotspanel=findViewById<LinearLayout>(R.id.indicator)

        adapter=SlidingImage_Adapter(this@Splash_screen, this.imageModelArrayList!!)

        pager1.setAdapter(adapter)

        dotscount=adapter!!.getCount()




        Log.e("oppo","dotscount size"+dotscount)


        for (i in 0 until dotscount)
        {

            val img = android.widget.ImageView(this)

            img.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.nonactivedot)
            )
            dots.add(img)

            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
            params.setMargins(8, 0, 8, 0)
            sliderDotspanel!!.addView(dots!![i], params) }

        pager1.setCurrentItem(0, false)

        Pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener
        {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int)
            {

            }
            override fun onPageSelected(position: Int)
            {

                Log.e("oppo","onPageSelected position" +position)
                viewPgIndex= position
                for (i in 0 until dotscount)
                {
                    dots.get(i).setImageDrawable(ContextCompat.getDrawable(this@Splash_screen, R.drawable.nonactivedot))
                }

                if(position== dotscount)
                    dots.get(position-1).setImageDrawable(ContextCompat.getDrawable(this@Splash_screen, R.drawable.activedot))

                else
                    dots.get(position).setImageDrawable(ContextCompat.getDrawable(this@Splash_screen, R.drawable.activedot))
            }
            override fun onPageScrollStateChanged(state: Int)
            {

                if ( state == ViewPager.SCROLL_STATE_DRAGGING)
                {
                    val index =  pager1.getCurrentItem()
                    Log.e("oppo","onPageScrollStateChanged index"+index)

                    if (index == (adapter as SlidingImage_Adapter).getCount() - 1)
                    {
                        pager1.setCurrentItem(0, false)
                        Log.e("oppo","onPageScrollStateChanged setCurrentItem")
                    }
                }

            }
        })





    }












//        Buttn_Signup.setOnClickListener {
//
//            var intent: Intent = Intent(applicationContext, SigunUp_Activity::class.java)
//            startActivity(intent)
//        }



    private fun populateList():ArrayList<ImageModel>
    {
        val list = ArrayList<ImageModel>()

        for (i in 0..2)
        {
            val imageModel = ImageModel()

            imageModel.image_drawable = myImageList.get(i)
            imageModel.text_image=myTextList.get(i)
            list.add(imageModel)
        }
        return list
    }


    companion object
    {
        // private var mPager: ViewPager? = null
        private var currentPage = 0
        private var NUM_PAGES = 0
    }
}*/













